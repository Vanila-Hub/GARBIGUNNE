package modelo.productos;

import java.sql.Date;

import modelo.material.Material;
import modelo.plantas.Planta;

public class Producto {
	private int id_producto;
	private int id_material;
	private String nombre;
	private double precio;
	private String descripcion;
	private int stock;
	private double peso_producto;
	private int id_planta;
	private String ruta_imagen;
	private Date fecha;

	private int comprasTotal;
	private Planta planta;
	private Material material;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public int getComprasTotal() {
		return comprasTotal;
	}

	public void setComprasTotal(int comprasTotal) {
		this.comprasTotal = comprasTotal;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_material() {
		return id_material;
	}

	public void setId_material(int id_material) {
		this.id_material = id_material;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPeso_producto() {
		return peso_producto;
	}

	public void setPeso_producto(double peso_producto) {
		this.peso_producto = peso_producto;
	}

	public int getId_planta() {
		return id_planta;
	}

	public void setId_planta(int id_planta) {
		this.id_planta = id_planta;
	}

	public String getRuta_imagen() {
		return ruta_imagen;
	}

	public void setRuta_imagen(String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", id_material=" + id_material + ", nombre=" + nombre
				+ ", precio=" + precio + ", descripcion=" + descripcion + ", stock=" + stock + ", peso_producto="
				+ peso_producto + ", id_planta=" + id_planta + ", ruta_imagen=" + ruta_imagen + ", fecha=" + fecha
				+ ", comprasTotal=" + comprasTotal + ", planta=" + planta + ", material=" + material + "]";
	}

}
