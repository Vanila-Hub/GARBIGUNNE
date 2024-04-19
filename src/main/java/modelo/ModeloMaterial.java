package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

public class ModeloMaterial {
public ArrayList<Material> getMateriales() {
		
		ArrayList<Material> materiales = new ArrayList<Material>();
		String sql = "SELECT * FROM MATERIALES";
		try {
			Connection con = Conector.getConexion();
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while(rst.next()) {
				Material material = new Material();
				material.setId_material(rst.getInt("ID_MATERIAL"));
				material.setTipo(rst.getString("TIPO"));
				material.setEmision_kg(rst.getInt("EMISION_KG"));
				materiales.add(material);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return materiales;
	}
public void crearMaterial(String tipo, int emision_kg) {
	String sql = "INSERT INTO MATERIALES (ID_MATERIAL,TIPO,EMISION_KG) VALUES (?,?,?)";
	try {
		PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
		prst.setInt(1,2);
		prst.setString(2, tipo);
		prst.setInt(3, emision_kg);
		Conector.getConexion().close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public void borrarMaterialByID(int id_material) {
	String sql = "DELETE FROM MATERIALES WHERE ID_MATERIAL = ?";
	try {
		PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
		prst.setInt(1, id_material);
		prst.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
	
}
