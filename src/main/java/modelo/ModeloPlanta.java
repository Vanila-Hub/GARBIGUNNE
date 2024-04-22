package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloPlanta{

	public ArrayList<Planta> getPlantas() {		
		
		String sql = "SELECT * FROM PLANTAS";
		ArrayList<Planta> plantas = new ArrayList<Planta>();
		try {
			Connection con = Conector.getConexion();
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while(rst.next()) {
				Planta planta = new Planta();
				planta.setId(rst.getInt("ID_PLANTA"));
				planta.setNombre(rst.getString("NOMBRE"));
				planta.setTelefono(rst.getInt("TELEFONO"));
				planta.setDireccion(rst.getString("DIRECCION"));
				plantas.add(planta);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return plantas;
	}

	public void crearPlanta(String nombre, String dirrecion, String telefono) {
		String sql = "INSERT INTO PLANTAS(PLANTAS.DIRECCION,PLANTAS.NOMBRE,PLANTAS.TELEFONO) values(?,?,?)";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, dirrecion);
			prst.setString(2, nombre);
			prst.setString(3, telefono);
			prst.executeUpdate();
			Conector.getConexion().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void borrarPlantaByID(int id_planta) {
		String sql = "DELETE FROM PLANTAS WHERE ID_PLANTA = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_planta);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public Planta getPlantaByID(int id_planta) {
		String sql = "SELECT * FROM PLANTAS WHERE ID_PLANTA = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_planta);
			
			ResultSet rst = prst.executeQuery();
			if (rst.next()) {
				Planta planta = new Planta();
				planta.setId(rst.getInt("ID_PLANTA"));
				planta.setNombre(rst.getString("NOMBRE"));
				planta.setTelefono(rst.getInt("TELEFONO"));
				planta.setDireccion(rst.getString("DIRECCION"));
				return planta;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void actualizar(String nombre, String dirrecion, String telefono, int id_planta) {
		String sql = "UPDATE PLANTAS SET NOMBRE =?, DIRECCION =? ,TELEFONO=? WHERE ID_PLANTA = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, nombre);
			prst.setString(2, dirrecion);
			prst.setString(3, telefono);
			prst.setInt(4, id_planta);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
