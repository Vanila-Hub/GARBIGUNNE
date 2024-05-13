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
	void testGetContrase�a() {
		Proveedor proveedor = new Proveedor();
		proveedor.setContrase�a("contrase�a");
		assertEquals("contrase�a", proveedor.getContrase�a());
	}

	@Test
	void testSetContrase�a() {
		Proveedor proveedor = new Proveedor();
		proveedor.setContrase�a("contrase�a");
		assertEquals("contrase�a", proveedor.getContrase�a());
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
		proveedor.setContrase�a("contrase�a");
		proveedor.setHabilitado(true);
		
		String expected = "Proveedor [id_proveedor=123, nombre=ProveedorTest, correo=correo@proveedor.com, contrase�a=contrase�a, habilitado=true]";
		assertEquals(expected, proveedor.toString());
	}

}
