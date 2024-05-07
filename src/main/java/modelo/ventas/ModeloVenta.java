package modelo.ventas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;

public class ModeloVenta {

	public ArrayList<Venta> getVentas() {
		
		String sql = "SELECT * FROM VENTAS";
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		try {
			Connection con = Conector.getConexion();
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while(rst.next()) {
				Venta venta = new Venta();
				venta.setId_venta(rst.getInt("ID_VENTA"));
				venta.setId_cliente(rst.getInt("ID_CLIENTE"));
				venta.setId_producto(rst.getInt("ID_PRODUCTO"));
				venta.setCantidad(rst.getInt("CANTIDAD"));
				venta.setFecha(rst.getDate("FECHA"));	
				ventas.add(venta);
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
		return ventas;
	}
	public void crearVenta(int id_cliente, int id_producto, double cantidad2, Date fecha) {
		String sql = "INSERT INTO VENTAS(ID_CLIENTE,ID_PRODUCTO,CANTIDAD,FECHA) values(?,?,?,?)";
		System.out.println(id_cliente);
		System.out.println(cantidad2);
		System.out.println(fecha);
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_cliente);
			prst.setInt(2, id_producto);
			prst.setDouble(3, cantidad2);
			prst.setDate(4, fecha);
			
			prst.executeUpdate();
			Conector.getConexion().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void borrarVentaByID(int id_venta) {
		String sql = "DELETE FROM VENTAS WHERE ID_VENTA = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_venta);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public Venta getVentaByID(int id_venta) {
		String sql = "SELECT * FROM VENTAS WHERE ID_VENTA = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_venta);
			
			ResultSet rst = prst.executeQuery();
			if (rst.next()) {
				Venta venta = new Venta();
				venta.setId_venta(rst.getInt("ID_VENTA"));
				venta.setId_cliente(rst.getInt("ID_CLIENTE"));
				venta.setId_producto(rst.getInt("ID_PRODUCTO"));
				venta.setCantidad(rst.getInt("CANTIDAD"));
				venta.setFecha(rst.getDate("FECHA"));
				return venta;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void actualizar(int id_venta,int id_Cliente, int id_Producto,int Cantidad,  Date fecha) {
		String sql = "UPDATE VENTAS SET ID_CLIENTE =?, ID_PRODUCTO =? , CANTIDAD=?, FECHA=? WHERE ID_VENTA = ?";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_Cliente);
			prst.setInt(2, id_Producto);
			prst.setInt(3, Cantidad);
			prst.setDate(4, fecha);
			prst.setInt(5, id_venta);
			
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void registrarCompra(int id_cliente, int idProducto, int cantidad) {
		//llamamos al procedure el cual va a registrar una venta con los parametros del cliente el producto y la cantidad
		String sql = "call Garbigunne.AutoRegistrar_Ventas(?,?,?);";
		try {
			PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
			prst.setInt(1, id_cliente);
			prst.setInt(2, idProducto);
			prst.setInt(3, cantidad);
			prst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
