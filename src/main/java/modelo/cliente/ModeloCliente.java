package modelo.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;

public class ModeloCliente {

	public ArrayList<Cliente> getClientes() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "SELECT * FROM CLIENTES";
		try {
			Connection con = Conector.getConexion();
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while (rst.next()) {
				Cliente cliente = new Cliente();
				cliente.setId_cliente(rst.getInt("ID_CLIENTE"));
				cliente.setNombre(rst.getString("NOMBRE"));
				cliente.setApellido(rst.getString("APELLIDO"));
				cliente.setUsuario(rst.getString("USUARIO"));
				cliente.setContrasena(rst.getString("CONTRASENA"));
				clientes.add(cliente);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return clientes;
	}
	public void crearCliente(String nombre, String apellido, String usuario, String contrasena) {
		String sql = "INSERT INTO CLIENTES (NOMBRE,APELLIDO,USUARIO,CONTRASENA) VALUES (?,?,?,?)";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, nombre);
			prst.setString(2, apellido);
			prst.setString(3, usuario);
			prst.setString(4, contrasena);
			prst.executeUpdate();
			Conector.getConexion().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void borrarClienteByID(int id_cliente) {
		String sql = "DELETE FROM CLIENTES WHERE ID_CLIENTE=?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_cliente);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public Cliente getClientelByID(int id_cliente) {
		Cliente cliente = new Cliente();
		String sql = "SELECT * FROM CLIENTES WHERE ID_CLIENTE = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_cliente);
			ResultSet rst = prst.executeQuery();
			if (rst.next()) {
				cliente.setId_cliente(rst.getInt("ID_CLIENTE"));
				cliente.setNombre(rst.getString("NOMBRE"));
				cliente.setApellido(rst.getString("APELLIDO"));
				cliente.setUsuario(rst.getString("USUARIO"));
				cliente.setContrasena(rst.getString("CONTRASENA"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	public void actualizarCliente(String nombreCliente, String apellido, String usuario, String contrasena,
			int id_cliente) {
		String sql = "UPDATE CLIENTES SET NOMBRE=?, APELLIDO=?, USUARIO=?, CONTRASENA=? WHERE ID_CLIENTE = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, nombreCliente);
			prst.setString(2, apellido);
			prst.setString(3, usuario);
			prst.setString(4, contrasena);
			prst.setInt(5, id_cliente);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
