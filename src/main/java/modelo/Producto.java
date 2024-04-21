package modelo;

public class Producto {
    private int id_producto;
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private double peso_producto;
    private int id_planta;
    private String ruta_imagen;
    
    public Producto() {
		// TODO Auto-generated constructor stub
	}
    
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
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

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + ", stock=" + stock + ", peso_producto=" + peso_producto + ", id_planta=" + id_planta
				+ ", ruta_imagen=" + ruta_imagen + "]";
	}
}
