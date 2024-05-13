package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.proveedor.Proveedor;

class ProveedorTest {

	@Test
	void testProveedor() {
		Proveedor proveedor = new Proveedor();
		assertNotNull(proveedor);
	}

	@Test
	void testGetId_proveedor() {
		Proveedor proveedor = new Proveedor();
		proveedor.setId_proveedor(123);
		assertEquals(123, proveedor.getId_proveedor());
	}

	@Test
	void testSetId_proveedor() {
		Proveedor proveedor = new Proveedor();
		proveedor.setId_proveedor(123);
		assertEquals(123, proveedor.getId_proveedor());
	}

	@Test
	void testGetNombre() {
		Proveedor proveedor = new Proveedor();
		proveedor.setNombre("ProveedorTest");
		assertEquals("ProveedorTest", proveedor.getNombre());
	}

	@Test
	void testSetNombre() {
		Proveedor proveedor = new Proveedor();
		proveedor.setNombre("ProveedorTest");
		assertEquals("ProveedorTest", proveedor.getNombre());
	}

	@Test
	void testGetCorreo() {
		Proveedor proveedor = new Proveedor();
		proveedor.setCorreo("correo@proveedor.com");
		assertEquals("correo@proveedor.com", proveedor.getCorreo());
	}

	@Test
	void testSetCorreo() {
		Proveedor proveedor = new Proveedor();
		proveedor.setCorreo("correo@proveedor.com");
		assertEquals("correo@proveedor.com", proveedor.getCorreo());
	}

	@Test
	void testGetContraseña() {
		Proveedor proveedor = new Proveedor();
		proveedor.setContraseña("contraseña");
		assertEquals("contraseña", proveedor.getContraseña());
	}

	@Test
	void testSetContraseña() {
		Proveedor proveedor = new Proveedor();
		proveedor.setContraseña("contraseña");
		assertEquals("contraseña", proveedor.getContraseña());
	}

	@Test
	void testGetHabilitado() {
		Proveedor proveedor = new Proveedor();
		proveedor.setHabilitado(true);
		assertTrue(proveedor.getHabilitado());
	}

	@Test
	void testSetHabilitado() {
		Proveedor proveedor = new Proveedor();
		proveedor.setHabilitado(true);
		assertTrue(proveedor.getHabilitado());
	}

	@Test
	void testToString() {
		Proveedor proveedor = new Proveedor();
		proveedor.setId_proveedor(123);
		proveedor.setNombre("ProveedorTest");
		proveedor.setCorreo("correo@proveedor.com");
		proveedor.setContraseña("contraseña");
		proveedor.setHabilitado(true);
		
		String expected = "Proveedor [id_proveedor=123, nombre=ProveedorTest, correo=correo@proveedor.com, contraseña=contraseña, habilitado=true]";
		assertEquals(expected, proveedor.toString());
	}

}
