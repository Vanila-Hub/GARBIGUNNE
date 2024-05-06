package controlador.formValidador;

import modelo.cliente.Cliente;

public class FormValidador {
	
	public FormValidador() {
		// TODO Auto-generated constructor stub
	}

	public boolean usuarioEsValido(Cliente cliente) {
		if (cliente.getNombre() == null || cliente.getNombre().isBlank()) {
			return true;
		} else {
			return false;
		}
	}	
}
