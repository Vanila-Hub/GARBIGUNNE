package modelo.historicocontaminacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.cliente.ModeloCliente;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;
import modelo.productos.ModeloProducto;

public class ModeloHistoricoContaminacion {

	// Métodos anteriores

	public HistoricoContaminacion getHistoricoContaminacionById(int idHistorico) {
		HistoricoContaminacion historico = null;
		ModeloMaterial md_mat = new ModeloMaterial();
		ModeloPlanta md_plan = new ModeloPlanta();
		
		String sql = "SELECT * FROM HISTORICO_CONTAMINACION WHERE ID_HISTORICO = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, idHistorico);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				historico = new HistoricoContaminacion();
				historico.setId_Historico(rs.getInt("ID_HISTORICO"));
				historico.setFecha(rs.getString("FECHA"));
				historico.setId_Material(rs.getInt("ID_MATERIAL"));
				historico.setId_Planta(rs.getInt("ID_PLANTA"));
				historico.setPorcentajeContaminacion(rs.getDouble("PORCENTAJE_CONTAMINACION"));
				historico.setId_Material(rs.getInt("ID_MATERIAL"));
				
				//Asignamos tablas relacionadas
				historico.setPlanta(md_plan.getPlantaByID(historico.getId_Planta()));
				historico.setMaterial(md_mat.getMaterialByID(historico.getId_Material()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return historico;
	}

	public void actualizarHistoricoContaminacion(int idHistorico, String fecha, int idPlanta, int idMaterial,
			double porcentajeContaminacion) {
		String sql = "UPDATE HISTORICO_CONTAMINACION SET FECHA = ?, ID_PLANTA = ?, ID_MATERIAL = ?, PORCENTAJE_CONTAMINACION = ? WHERE ID_HISTORICO = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, fecha);
			prst.setInt(2, idPlanta);
			prst.setInt(3, idMaterial);
			prst.setDouble(4, porcentajeContaminacion);
			prst.setInt(5, idHistorico);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HistoricoContaminacion> getHistoricos() {
		
		ArrayList<HistoricoContaminacion> historicos = new ArrayList<HistoricoContaminacion>();
		ModeloMaterial md_mat = new ModeloMaterial();
		ModeloPlanta md_plan = new ModeloPlanta();
		
		String sql_procedure = "call Garbigunne.getMaterialesYEmisones();";
		
		String sql = "SELECT * FROM HISTORICO_CONTAMINACION";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			while (rs.next()) {
				HistoricoContaminacion historico = new HistoricoContaminacion();
				historico.setId_Historico(rs.getInt("ID_HISTORICO"));
				historico.setFecha(rs.getString("FECHA"));
				historico.setId_Planta(rs.getInt("ID_PLANTA"));
				historico.setId_Material(rs.getInt("ID_MATERIAL"));
				historico.setPorcentajeContaminacion(rs.getDouble("PORCENTAJE_CONTAMINACION"));
				
				//Asignamos tablas relacionadas
				historico.setPlanta(md_plan.getPlantaByID(historico.getId_Planta()));
				historico.setMaterial(md_mat.getMaterialByID(historico.getId_Material()));
				
				historicos.add(historico);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return historicos;
	}
	

	public void registrarHsitorico(String fecha_inicio, String fecha_fin, String mes) {
		String sql = "call Garbigunne.Registrar_Historico(?, ?, ?);";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setString(1, fecha_inicio);
			prst.setString(2, fecha_fin);
			prst.setString(3, mes);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void borrarHistorico(int id_historico) {
		String sql = "DELETE FROM HISTORICO_CONTAMINACION WHERE ID_HISTORICO = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_historico);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
