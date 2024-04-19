package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
			}
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		return clientes;
	}
	public void crearCliente(String nombre, String apellido, String usuario, String contrasena) {
		String sql = "INSERT INTO CLIENTES (ID_CLIENTE,NOMBRE,APELLIDO,USUARIO,CONTRASENA) VALUES (?,?,?,?,?)";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1,2);
			prst.setString(2, nombre);
			prst.setString(3, apellido);
			prst.setString(4, usuario);
			prst.setString(5, contrasena);
			Conector.getConexion().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void borrarMaterialByID(int id_cliente) {
		String sql = "DELETE FROM CLIENTES WHERE ID_CLIENTE = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_cliente);
			prst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
