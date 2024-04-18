package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
//import oracle.jdbc.driver.OracleDriver;

public class Conector {
	
	public static Connection getConexion() throws SQLException, ClassNotFoundException {
		final String URL = "jdbc:mysql://192.168.2.20:2007/Garbigunne";
		final String USERNAME = "root";
		final String PASSWORD = "oracle";
		
        	Connection conexion;
            Class.forName("com.mysql.cj.jdbc.Driver");
           conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD);
      
		return conexion;
	}
}
