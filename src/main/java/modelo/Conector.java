package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conector {
	protected Connection conexion;

    Conector(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@" + Config.HOST + ":" + Config.PORT + ":" + Config.SID;
            this.conexion = DriverManager.getConnection(url, Config.USERNAME, Config.PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
