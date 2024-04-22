package modelo;

public class Rol extends Cliente{
	private String rol;
	
	public Rol() {
		
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Rol [rol=" + rol + ", getId_cliente()=" + getId_cliente() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getUsuario()=" + getUsuario() + ", getContrasena()="
				+ getContrasena() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
