package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloRoles {

	public ArrayList<Rol> getUsuariosConRol() {
		ArrayList<Rol> rolesUsers = new ArrayList<Rol>();
		String sql = "SELECT * FROM ROLES";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			ResultSet rst = prst.executeQuery();
			while(rst.next()) {
				Rol usuarioRol = new Rol();
				usuarioRol.setUsuario(rst.getString("CORREO"));
				usuarioRol.setContrasena(rst.getString("CONTRASENA"));
				usuarioRol.setId_cliente(rst.getInt("ID_CLIENTE"));
				usuarioRol.setRol(rst.getString("ROL"));
				rolesUsers.add(usuarioRol);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(rolesUsers);
		return rolesUsers;
	}

}
