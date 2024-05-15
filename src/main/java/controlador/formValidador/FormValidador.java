package controlador.formValidador;

import java.sql.Date;

import modelo.cliente.Cliente;

public class FormValidador {

	public FormValidador() {
		// TODO Auto-generated constructor stub
	}

	public boolean usuarioEsValido(Cliente cliente) {
		if (cliente.getNombre() == null || cliente.getNombre().isBlank()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean rolEsValido(String rol) {
		if (rol == null || rol.isEmpty()) {
			return false;

		} else {
			return true;
		}
	}

	public boolean CompraValida(int id_cliente, int idProducto) {
		if (id_cliente >= 0 && idProducto >= 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean estadoValido(String habilitado) {
		if (habilitado == null || habilitado.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean mensajeValido(String msg) {
		if (msg == null || msg.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean newUsuarioEsValido(String nombreCliente, String apellido, String usuario, String contrasena,
			String rol) {
		if (nombreCliente == null || apellido == null || usuario == null || contrasena == null || apellido.isEmpty()
				|| usuario.isEmpty() || contrasena.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean VentaValida(int id_producto, int id_cliente, double cantidad2, Date fecha2) {
		if (id_producto < 0 || id_cliente < 0 || cantidad2 < 0 || fecha2 == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean suministroValido(int id_Proveedor, int id_Planta, int id_Material, double cantidad, String mes) {
		if (id_Proveedor < 0 || id_Planta < 0 || id_Material < 0 || cantidad < 0 || mes == null || mes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean proveedorValido(String nombreProveedor, String correo, String contraseña) {
		if (nombreProveedor == null || correo == null || contraseña == null || correo.isEmpty()  || contraseña.isEmpty()
				|| nombreProveedor.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean productoValido(String nombreProducto, String descripcion, String carpetaHome, Date fecha,
			int idPlanta, int id_material) {
		if (nombreProducto == null || descripcion == null || carpetaHome.equalsIgnoreCase("/Garbigune_reto/ProductosIMG/") || fecha == null ||idPlanta<0  || id_material<0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean plantaValida(String nombre, String dirrecion, String telefono) {
		if (nombre == null || dirrecion == null || telefono == null || telefono.isEmpty()
				|| dirrecion.isEmpty() || nombre.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean materialValido(String tipo_material, double emision_kg) {
		if (tipo_material.isEmpty() || emision_kg<0 || tipo_material == null || tipo_material.equalsIgnoreCase("Tipo de material")) {
			return false;
			
		} else {
			return true;
		}
	}

	public boolean emisionProductoValido(int idProducto, Date fecha) {
		if (idProducto<0 || fecha == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean camposSuministroValido(String[] id_Plantas, String[] id_Materiales) {
		if (id_Plantas == null || id_Materiales == null) {
			return false;
		} else {
			return true;
		}
	}
}
