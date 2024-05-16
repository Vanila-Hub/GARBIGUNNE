package modelo.ventas;

import java.sql.Date;
import java.util.ArrayList;

import modelo.cliente.Cliente;
import modelo.productos.Producto;

public class Venta {
	private int id_venta;
	private int id_cliente;
	private int id_producto;
	private int cantidad;
	private Date fecha;
	
	private Cliente cliente;
	private Producto producto;
	private ArrayList<Producto> productos;
	private int ComprasTotal;
	
	
	public int getComprasTotal() {
		return ComprasTotal;
	}
	public void setComprasTotal(int setComprasTotal) {
		this.ComprasTotal = setComprasTotal;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", id_cliente=" + id_cliente + ", id_producto=" + id_producto
				+ ", cantidad=" + cantidad + ", fecha=" + fecha + ", cliente=" + cliente + ", producto=" + producto
				+ ", productos=" + productos + ", setComprasTotal=" + ComprasTotal + "]";
	}
}