package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

	
}
