package modelo.cliente;

import java.util.ArrayList;

import modelo.productos.Producto;

public class Cliente {
	private int id_cliente;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private String rol;
	private ArrayList<Producto> productosCliente;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ArrayList<Producto> getProductosCliente() {
		return productosCliente;
	}


	public void setProductosCliente(ArrayList<Producto> productosCliente) {
		this.productosCliente = productosCliente;
	}


	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario="
				+ usuario + ", contrasena=" + contrasena + ", rol=" + rol + "]";
	}
	
}
