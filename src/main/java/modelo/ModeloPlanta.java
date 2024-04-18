package modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloPlanta extends Conector{

	public ArrayList<Planta> getPlantas() {
		ArrayList<Planta> plantas = new ArrayList<Planta>();
		String sql = "SELECT * FROM PLANTAS";
		try {
			Statement st = conexion.createStatement();
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
