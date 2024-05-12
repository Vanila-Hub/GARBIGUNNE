package modelo.proveedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.Conector;

public class ModeloProveedor {

	public ArrayList<Proveedor> getProveedores() {
		String sql = "SELECT * FROM PROVEEDORES";
		ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();

		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			ResultSet rst = prst.executeQuery();
			while (rst.next()) {
				Proveedor proveedor = new Proveedor();
				proveedor.setId_proveedor(rst.getInt("ID_PROVEEDOR"));
				proveedor.setNombre(rst.getString("NOMBRE"));
				proveedor.setCorreo(rst.getString("CORREO"));
				proveedor.setContrase�a(rst.getString("CONTRASENA"));
				proveedor.setHabilitado(rst.getBoolean("HABILITADO"));
				proveedores.add(proveedor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(proveedores);
		return proveedores;
	}

	public void crearProveedor(String nombreProveedor, String correo, String contrase�a) {
		String sql = "INSERT INTO PROVEEDORES(NOMBRE,CORREO,CONTRASENA,HABILITADO) VALUES(?,?,?,?)";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, nombreProveedor);
			prst.setString(2, correo);
			prst.setString(3, contrase�a);
			prst.setInt(4, 1);
			prst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void borrarProveedorByID(int id_proveedor) {
		String sql = "UPDATE PROVEEDORES SET HABILITADO = 0  WHERE ID_PROVEEDOR = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_proveedor);
			prst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Proveedor getProveedorByID(int id_proveedor) {
		Proveedor proveedor = new Proveedor();
		String sql = "SELECT * FROM PROVEEDORES WHERE ID_PROVEEDOR = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_proveedor);
			ResultSet rst = prst.executeQuery();
			
			if(rst.next()) {
				proveedor.setId_proveedor(rst.getInt("ID_PROVEEDOR"));
				proveedor.setNombre(rst.getString("NOMBRE"));
				proveedor.setCorreo(rst.getString("CORREO"));
				proveedor.setContrase�a(rst.getString("CONTRASENA"));
				proveedor.setHabilitado(rst.getBoolean("HABILITADO"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proveedor;
	}

	public void actualizarProveedor(int id_proveedor, String nombreProveedor, String correo, String contrase�a, int activo) {
		String sql = "UPDATE PROVEEDORES SET NOMBRE = ?, CORREO=?, CONTRASENA=?, HABILITADO = ? WHERE ID_PROVEEDOR = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, nombreProveedor);
			prst.setString(2, correo);
			prst.setString(3, contrase�a);
			prst.setInt(4, activo);
			prst.setInt(5, id_proveedor);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


