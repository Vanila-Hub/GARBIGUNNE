package modelo.material;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

import modelo.Conector;

public class ModeloMaterial {
	public ArrayList<Material> getMateriales() {

		String sql = "SELECT * FROM MATERIALES";
		ArrayList<Material> materiales = new ArrayList<Material>();
		try {
			Connection con = Conector.getConexion();
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while (rst.next()) {
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

	public void crearMaterial(String tipo, double emision_kg) {
		String sql = "INSERT INTO MATERIALES (TIPO,EMISION_KG) VALUES (?,?)";
		System.out.println(tipo);
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, tipo);
			prst.setDouble(2, emision_kg);
			prst.executeUpdate();
			Conector.getConexion().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Boolean borrarMaterialByID(int id_material) {
		String sql = "DELETE FROM MATERIALES WHERE ID_MATERIAL = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_material);
			prst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			if (e.getMessage().equals("No se puede eliminar este material porque hay suministros asociados.")) {
				return false;
			}
		}
		return true;

	}

	public Material getMaterialByID(int id_material) {
		String sql = "SELECT * FROM MATERIALES WHERE ID_MATERIAL=?";
		Material material = new Material();
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_material);
			ResultSet rst = prst.executeQuery();
			if (rst.next()) {
				material.setId_material(rst.getInt("ID_MATERIAL"));
				material.setTipo(rst.getString("TIPO"));
				material.setEmision_kg(rst.getInt("EMISION_KG"));
				return material;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void actualizarMaterial(int emison_kg, String tipo_material, int id_material) {
		String sql = "UPDATE MATERIALES SET TIPO = ?, EMISION_KG = ? WHERE ID_MATERIAL = ?";		
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, tipo_material);
			prst.setInt(2, emison_kg);
			prst.setInt(3, id_material);

			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Material> getMaterialByPlanta(int id) {
		String sql = "SELECT M.ID_MATERIAL,M.TIPO,SUM(S.CANTIDAD_KG) AS CANTIDAD_KG FROM MATERIALES M JOIN SUMINISTROS S ON S.ID_MATERIAL = M.ID_MATERIAL WHERE S.ID_PLANTA = ? GROUP BY(M.ID_MATERIAL)";
		ArrayList<Material> materialesSuministrados = new ArrayList<Material>();
		
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id);
			ResultSet rst = prst.executeQuery();
			while (rst.next()) {
				Material material = new Material();
				material.setId_material(rst.getInt("ID_MATERIAL"));
				material.setTipo(rst.getString("TIPO"));
				material.setEmision_kg(rst.getInt("CANTIDAD_KG"));
				materialesSuministrados.add(material);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return materialesSuministrados;
	}

}
