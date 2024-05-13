package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.material.Material;
import modelo.plantas.Planta;
import modelo.proveedor.Proveedor;
import modelo.suministro.Suministro;

class SuministroTest {

	@Test
	void testSuministro() {
		Suministro suministro = new Suministro();
		assertNotNull(suministro);
	}

	@Test
	void testGetId_suministro() {
		Suministro suministro = new Suministro();
		suministro.setId_suministro(123);
		assertEquals(123, suministro.getId_suministro());
	}

	@Test
	void testSetId_suministro() {
		Suministro suministro = new Suministro();
		suministro.setId_suministro(123);
		assertEquals(123, suministro.getId_suministro());
	}

	@Test
	void testGetId_proveedor() {
		Suministro suministro = new Suministro();
		suministro.setId_proveedor(456);
		assertEquals(456, suministro.getId_proveedor());
	}

	@Test
	void testSetId_proveedor() {
		Suministro suministro = new Suministro();
		suministro.setId_proveedor(456);
		assertEquals(456, suministro.getId_proveedor());
	}

	@Test
	void testGetId_planta() {
		Suministro suministro = new Suministro();
		suministro.setId_planta(789);
		assertEquals(789, suministro.getId_planta());
	}

	@Test
	void testSetId_planta() {
		Suministro suministro = new Suministro();
		suministro.setId_planta(789);
		assertEquals(789, suministro.getId_planta());
	}

	@Test
	void testGetId_material() {
		Suministro suministro = new Suministro();
		suministro.setId_material(101);
		assertEquals(101, suministro.getId_material());
	}

	@Test
	void testSetId_material() {
		Suministro suministro = new Suministro();
		suministro.setId_material(101);
		assertEquals(101, suministro.getId_material());
	}

	@Test
	void testGetMes() {
		Suministro suministro = new Suministro();
		suministro.setMes("Mayo");
		assertEquals("Mayo", suministro.getMes());
	}

	@Test
	void testSetMes() {
		Suministro suministro = new Suministro();
		suministro.setMes("Mayo");
		assertEquals("Mayo", suministro.getMes());
	}

	@Test
	void testGetCantidad_kg() {
		Suministro suministro = new Suministro();
		suministro.setCantidad_kg(100.0);
		assertEquals(100.0, suministro.getCantidad_kg());
	}

	@Test
	void testSetCantidad_kg() {
		Suministro suministro = new Suministro();
		suministro.setCantidad_kg(100.0);
		assertEquals(100.0, suministro.getCantidad_kg());
	}

	@Test
	void testGetEmisiones_proyectadas() {
		Suministro suministro = new Suministro();
		suministro.setEmisiones_proyectadas(50.0);
		assertEquals(50.0, suministro.getEmisiones_proyectadas());
	}

	@Test
	void testSetEmisiones_proyectadas() {
		Suministro suministro = new Suministro();
		suministro.setEmisiones_proyectadas(50.0);
		assertEquals(50.0, suministro.getEmisiones_proyectadas());
	}

	@Test
	void testGetPlanta() {
		Suministro suministro = new Suministro();
		Planta planta = new Planta();
		suministro.setPlanta(planta);
		assertEquals(planta, suministro.getPlanta());
	}

	@Test
	void testSetPlanta() {
		Suministro suministro = new Suministro();
		Planta planta = new Planta();
		suministro.setPlanta(planta);
		assertEquals(planta, suministro.getPlanta());
	}

	@Test
	void testGetProveedor() {
		Suministro suministro = new Suministro();
		Proveedor proveedor = new Proveedor();
		suministro.setProveedor(proveedor);
		assertEquals(proveedor, suministro.getProveedor());
	}

	@Test
	void testSetProveedor() {
		Suministro suministro = new Suministro();
		Proveedor proveedor = new Proveedor();
		suministro.setProveedor(proveedor);
		assertEquals(proveedor, suministro.getProveedor());
	}

	@Test
	void testGetMaterial() {
		Suministro suministro = new Suministro();
		Material material = new Material();
		suministro.setMaterial(material);
		assertEquals(material, suministro.getMaterial());
	}

	@Test
	void testSetMaterial() {
		Suministro suministro = new Suministro();
		Material material = new Material();
		suministro.setMaterial(material);
		assertEquals(material, suministro.getMaterial());
	}

	@Test
	void testToString() {
		Suministro suministro = new Suministro();
		suministro.setId_suministro(123);
		suministro.setId_proveedor(456);
		suministro.setId_planta(789);
		suministro.setId_material(101);
		suministro.setMes("Mayo");
		suministro.setCantidad_kg(100.0);
		suministro.setEmisiones_proyectadas(50.0);
		
		String expected = "Suministro [id_suministro=123, id_proveedor=456, id_planta=789, id_material=101, mes=Mayo, cantidad_kg=100.0, emisiones_proyectadas=50.0, planta=null, proveedor=null, material=null]";
		assertEquals(expected, suministro.toString());
	}

}
