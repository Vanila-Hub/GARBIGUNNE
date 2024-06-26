package modelo.emisionproducto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.productos.ModeloProducto;

public class ModeloEmisionProducto {
	
    public ArrayList<EmisionProducto> getEmisionesProductos() {
        ArrayList<EmisionProducto> listaEmisiones = new ArrayList<EmisionProducto>();
        ModeloProducto modelo_produ = new ModeloProducto();
        String sql = "SELECT * FROM EMISIONES_PRODUCTOS";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                EmisionProducto emisionProducto = new EmisionProducto();
                emisionProducto.setId_emision(rs.getInt("ID_EMISION"));
                emisionProducto.setId_producto(rs.getInt("ID_PRODUCTO"));
                emisionProducto.setEmision_generada((rs.getDouble("EMISION_GENERADA")));
                emisionProducto.setFecha(rs.getDate("FECHA"));
                
                //setteamos complementos relacionados
                emisionProducto.setProducto(modelo_produ.getProductoByID(emisionProducto.getId_producto()));
                listaEmisiones.add(emisionProducto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaEmisiones;
    }
    
	
    public void crearEmisionProducto(int id_producto, Date fecha) {
        String sql = "INSERT INTO EMISIONES_PRODUCTOS(ID_PRODUCTO, EMISION_GENERADA, FECHA) VALUES(?,?,?)";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, id_producto);
            prst.setDouble(2, 0);
            prst.setDate(3, fecha);
            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public EmisionProducto getEmisionProductoByID(int id_producto) {

    	EmisionProducto emision_producto = new EmisionProducto();
    	ModeloProducto modelo_produ = new ModeloProducto();
        String sql = "SELECT * FROM EMISIONES_PRODUCTOS WHERE ID_EMISION = ?";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, id_producto);
            ResultSet rs = prst.executeQuery();
            if(rs.next()) {
                emision_producto.setId_emision(rs.getInt("ID_EMISION"));
                emision_producto.setId_producto(rs.getInt("ID_PRODUCTO"));
                emision_producto.setEmision_generada(rs.getDouble("EMISION_GENERADA"));
                emision_producto.setFecha(rs.getDate("FECHA"));
                
                //setteamos complementos relacionados
                emision_producto.setProducto(modelo_produ.getProductoByID(emision_producto.getId_producto()));
                return emision_producto;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }

    public void eliminarEmisionProducto(int id_emision) {
        String sql = "DELETE FROM EMISIONES_PRODUCTOS WHERE ID_EMISION = ?";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, id_emision);
            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarEmisionProducto(int id_emision, int id_producto, Date fecha, Double emision_generada) {
        String sql = "UPDATE EMISIONES_PRODUCTOS SET ID_PRODUCTO = ?, FECHA = ?, SET EMISION_GENERADA = ? WHERE ID_EMISION = ?";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, id_producto);
            prst.setDate(2, fecha);
            prst.setDouble(3, emision_generada);
            prst.setInt(4, id_emision);
            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
