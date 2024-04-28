package modelo.historicocontaminacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;

public class ModeloHistoricoContaminacion {

	// Métodos anteriores

	public HistoricoContaminacion getHistoricoContaminacionById(int idHistorico) {
		HistoricoContaminacion historico = null;
		String sql = "SELECT * FROM HISTORICO_CONTAMINACION WHERE ID_HISTORICO = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, idHistorico);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				historico = new HistoricoContaminacion();
				historico.setIdHistorico(rs.getInt("ID_HISTORICO"));
				historico.setFecha(rs.getString("FECHA"));
				historico.setIdPlanta(rs.getInt("ID_PLANTA"));
				historico.setIdMaterial(rs.getInt("ID_MATERIAL"));
				historico.setPorcentajeContaminacion(rs.getDouble("PORCENTAJE_CONTAMINACION"));
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
		
		String sql = "SELECT * FROM HISTORICO_CONTAMINACION";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			ResultSet rs = prst.executeQuery();
			if (rs.next()) {
				HistoricoContaminacion historico = new HistoricoContaminacion();
				historico.setIdHistorico(rs.getInt("ID_HISTORICO"));
				historico.setFecha(rs.getString("FECHA"));
				historico.setIdPlanta(rs.getInt("ID_PLANTA"));
				historico.setIdMaterial(rs.getInt("ID_MATERIAL"));
				historico.setPorcentajeContaminacion(rs.getDouble("PORCENTAJE_CONTAMINACION"));
				historicos.add(historico);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return historicos;
	}
}
