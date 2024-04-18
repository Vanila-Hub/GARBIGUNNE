package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conector {
	protected Connection conexion;

    Conector(){
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            String url = "jdbc:oracle:thin:@" + Config.HOST + ":" + Config.PORT + ":" + Config.SID;
//            this.conexion = DriverManager.getConnection(url, Config.USERNAME, Config.PASSWORD);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
      	//URL of Oracle database server
        String url = "jdbc:oracle:thin:@" + Config.HOST + ":" + Config.PORT + ":xe";       
        Properties props = new Properties();
        props.setProperty("user", Config.USERNAME);
        props.setProperty("password", Config.USERNAME);
      
        //creating connection to Oracle database 
      
        try {
			this.conexion = DriverManager.getConnection(url,props);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			Statement st = conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Se ha conectado a la BBDD-Oracle satisfactoriamente");

    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
