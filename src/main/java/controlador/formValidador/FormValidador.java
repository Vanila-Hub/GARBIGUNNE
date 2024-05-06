package controlador.formValidador;

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
		if (rol==null || rol.isEmpty()) {
			return false;
			
		} else {
			return true;
		}
	}	
}
