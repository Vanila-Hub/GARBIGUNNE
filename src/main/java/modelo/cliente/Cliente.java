package modelo.cliente;

public class Cliente {
	private int id_cliente;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	
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
		return "Clientes [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario="
				+ usuario + ", contrasena=" + contrasena + "]";
	}
	
}
