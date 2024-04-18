package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloPlanta{

	public ArrayList<Planta> getPlantas() {
		
		
		ArrayList<Planta> plantas = new ArrayList<Planta>();
		String sql = "SELECT * FROM PLANTAS";
		try {
			Connection con = Conector.getConexion();
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while(rst.next()) {
				Planta planta = new Planta();
				planta.setId(rst.getInt("ID_PLANTA"));
				planta.setNombre(rst.getString("NOMBRE"));
				planta.setTelefono(rst.getInt("TELEFONO"));
				planta.setDireccion("DIRRECION");
				plantas.add(planta);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return plantas;
	}

}
