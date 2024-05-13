package modelo.emisionproducto;

import java.sql.Date;

import modelo.productos.Producto;

public class EmisionProducto {
	private int id_emision;
	private int id_producto;
	private double emision_generada;
	private Date fecha;

	private Producto producto;

	public EmisionProducto() {
	}

	public EmisionProducto(int id_producto, int id_material, double emision_generada, Date fecha) {
		this.producto = producto;
		this.id_producto = id_producto;
		this.fecha = fecha;
		this.emision_generada = emision_generada;
		this.id_emision = id_emision;
	}

	public int getId_emision() {
		return id_emision;
	}

	public void setId_emision(int id_emision) {
		this.id_emision = id_emision;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public double getEmision_generada() {
		return emision_generada;
	}

	public void setEmision_generada(double emision_generada) {
		this.emision_generada = emision_generada;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "EmisionProducto [id_emision=" + id_emision + ", id_producto=" + id_producto + ", emision_generada="
				+ emision_generada + ", fecha=" + fecha + ", producto=" + producto + "]";
	}

}
