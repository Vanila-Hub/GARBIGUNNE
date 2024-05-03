package controlador.formValidador;

import modelo.cliente.Cliente;

public class FormValidador {
	
	public static boolean usuarioValido(Cliente cliente){
		if (cliente.getNombre().isBlank()||cliente.getNombre() == null &&
				cliente.getApellido().isBlank()||cliente.getApellido() == null &&
				cliente.getUsuario().isBlank()||cliente.getUsuario()== null &&
				cliente.getContrasena().isBlank()||cliente.getContrasena() == null
				) {
			
			return false;
			
		}
		return true;
	}
	
	
}
