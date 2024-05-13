package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.proveedor.ModeloProveedor;
import modelo.proveedor.Proveedor;

class ModeloProveedorTest {

	@Test
	void testGetProveedores() {
		ModeloProveedor modeloProveedor = new ModeloProveedor();
		
		assertNotNull(modeloProveedor.getProveedores());
		// Verifica si la lista de proveedores no es nula
	}

	@Test
	void testCrearProveedor() {
		ModeloProveedor modeloProveedor = new ModeloProveedor();
		String nombre = "Proveedor de prueba"; // Asigna un nombre válido para el proveedor
		
		String correo = "prueba@proveedor.com"; // Asigna un correo válido para el proveedor
		
		String contraseña = "contraseña123"; // Asigna una contraseña válida para el proveedor
		
		modeloProveedor.crearProveedor(nombre, correo, contraseña);
		// Verifica si el proveedor se ha creado correctamente en la base de datos
	}

	@Test
	void testBorrarProveedorByID() {
		ModeloProveedor modeloProveedor = new ModeloProveedor();
		
		int idProveedor = 1; // Asigna un valor válido para el ID del proveedor a borrar
		
		modeloProveedor.borrarProveedorByID(idProveedor);
		// Verifica si el proveedor con el ID dado se ha deshabilitado correctamente en la base de datos
	}

	@Test
	void testGetProveedorByID() {
		ModeloProveedor modeloProveedor = new ModeloProveedor();
		
		int idProveedor = 1; // Asigna un valor válido para el ID del proveedor
		
		Proveedor proveedor = modeloProveedor.getProveedorByID(idProveedor);
		
		assertNotNull(proveedor);
		// Verifica si el proveedor obtenido no es nulo
	}

	@Test
	void testActualizarProveedor() {
		ModeloProveedor modeloProveedor = new ModeloProveedor();
		
		int idProveedor = 1; // Asigna un valor válido para el ID del proveedor a actualizar
		
		String nombre = "Proveedor actualizado"; // Asigna un nombre válido para el proveedor actualizado
		
		String correo = "actualizado@proveedor.com"; // Asigna un correo válido para el proveedor actualizado
		
		String contraseña = "nuevacontraseña"; // Asigna una contraseña válida para el proveedor actualizado
		
		int activo = 1; // Asigna un valor válido para el estado de activo/deshabilitado del proveedor actualizado
		
		modeloProveedor.actualizarProveedor(idProveedor, nombre, correo, contraseña, activo);
		// Verifica si el proveedor se ha actualizado correctamente en la base de datos
	}

}
