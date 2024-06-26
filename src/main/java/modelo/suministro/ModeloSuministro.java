package modelo.suministro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;
import modelo.proveedor.ModeloProveedor;

public class ModeloSuministro {

	public ArrayList<Suministro> getSuministros() {
		ArrayList<Suministro> suminitros = new ArrayList<Suministro>();
		String sql = "SELECT * FROM SUMINISTROS ORDER BY ID_MATERIAL;";
		ModeloMaterial mmat = new ModeloMaterial();
		ModeloPlanta modpla = new ModeloPlanta();
		ModeloProveedor modpro = new ModeloProveedor();
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			ResultSet rst = prst.executeQuery();

			while (rst.next()) {
				Suministro suministro = new Suministro();
				ModeloMaterial mod_mat = new ModeloMaterial();
				suministro.setCantidad_kg(rst.getDouble("CANTIDAD_KG"));
				suministro.setEmisiones_proyectadas(rst.getDouble("EMISIONES_GENERADAS"));
				suministro.setId_material(rst.getInt("ID_MATERIAL"));
				suministro.setId_planta(rst.getInt("ID_PLANTA"));
				suministro.setId_proveedor(rst.getInt("ID_PROVEEDOR"));
				suministro.setMes(rst.getString("MES"));
				suministro.setId_suministro(rst.getInt("ID_SUMINISTRO"));
				
				//setterar atributos relacionados
				suministro.setMaterial(mmat.getMaterialByID(suministro.getId_material()));
				suministro.setPlanta(modpla.getPlantaByID(suministro.getId_planta()));
				suministro.setProveedor(modpro.getProveedorByID(suministro.getId_proveedor()));
				suminitros.add(suministro);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return suminitros;
	}

	public boolean borrarSuministroByID(int id_suminitro) {
		String sql = "DELETE FROM SUMINISTROS WHERE ID_SUMINISTRO = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_suminitro);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			if (e.getMessage().equals("No se puede eliminar este suministro porque hay productos asociados.")) {
				return false;
			}
		}
		return true;

	}

	public void crearSuministro(int id_Material, int id_Proveedor, int id_Planta, String mes, double cantidad) {
		String sql = "INSERT INTO SUMINISTROS(ID_PROVEEDOR, ID_PLANTA, ID_MATERIAL, MES, CANTIDAD_KG) VALUES(?,?,?,?,?)";
		String sql_regitrar_emision = "call Garbigunne.Emision_Suministro()";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_Proveedor);
			prst.setInt(2, id_Planta);
			prst.setInt(3, id_Material);
			prst.setString(4, mes);
			prst.setDouble(5, cantidad);
			
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
			finally {
				try {
					PreparedStatement prst = Conector.getConexion().prepareStatement(sql_regitrar_emision);
					prst.executeUpdate();
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
	}

	public Suministro getSuministroByID(int id_suministro) {
		String sql = "SELECT * FROM SUMINISTROS WHERE ID_SUMINISTRO = ?";
		Suministro suministro = new Suministro();
		ModeloMaterial mmat = new ModeloMaterial();
		ModeloPlanta modpla = new ModeloPlanta();
		ModeloProveedor modpro = new ModeloProveedor();
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_suministro);
			ResultSet rst = prst.executeQuery();
			
			if (rst.next()) {
				suministro.setCantidad_kg(rst.getDouble("CANTIDAD_KG"));
				suministro.setEmisiones_proyectadas(rst.getDouble("EMISIONES_GENERADAS"));
				suministro.setId_material(rst.getInt("ID_MATERIAL"));
				suministro.setId_planta(rst.getInt("ID_PLANTA"));
				suministro.setId_proveedor(rst.getInt("ID_PROVEEDOR"));
				suministro.setMes(rst.getString("MES"));
				suministro.setId_suministro(rst.getInt("ID_SUMINISTRO"));
				
				//setterar atributos relacionados
				suministro.setMaterial(mmat.getMaterialByID(suministro.getId_material()));
				suministro.setPlanta(modpla.getPlantaByID(suministro.getId_planta()));
				suministro.setProveedor(modpro.getProveedorByID(suministro.getId_proveedor()));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return suministro;
	}
 
	public void actualizarSuministroByID(int id_Material, int id_Proveedor, int id_Planta, int id_suministro, String mes, double cantidad) {
		String sql = "UPDATE SUMINISTROS SET ID_PROVEEDOR = ?, ID_PLANTA = ?, ID_MATERIAL = ?, MES= ?, CANTIDAD_KG = ? WHERE ID_SUMINISTRO = ?";
		String sql_regitrar_emision = "call Garbigunne.Emision_Suministro()";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_Proveedor);
			prst.setInt(2, id_Planta);
			prst.setInt(3, id_Material);
			prst.setString(4, mes);
			prst.setDouble(5, cantidad);
			prst.setInt(6, id_suministro);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				PreparedStatement prst = Conector.getConexion().prepareStatement(sql_regitrar_emision);
				prst.executeUpdate();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
