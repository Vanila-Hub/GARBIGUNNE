package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import modelo.material.Material;
import modelo.plantas.Planta;
import modelo.productos.Producto;

class ProductoTest {

	@Test
	void testProducto() {
		Producto producto = new Producto();
		assertNotNull(producto);
	}

	@Test
	void testGetId_producto() {
		Producto producto = new Producto();
		producto.setId_producto(123);
		assertEquals(123, producto.getId_producto());
	}

	@Test
	void testSetId_producto() {
		Producto producto = new Producto();
		producto.setId_producto(123);
		assertEquals(123, producto.getId_producto());
	}

	@Test
	void testGetId_material() {
		Producto producto = new Producto();
		producto.setId_material(456);
		assertEquals(456, producto.getId_material());
	}

	@Test
	void testSetId_material() {
		Producto producto = new Producto();
		producto.setId_material(456);
		assertEquals(456, producto.getId_material());
	}

	@Test
	void testGetNombre() {
		Producto producto = new Producto();
		producto.setNombre("ProductoTest");
		assertEquals("ProductoTest", producto.getNombre());
	}

	@Test
	void testSetNombre() {
		Producto producto = new Producto();
		producto.setNombre("ProductoTest");
		assertEquals("ProductoTest", producto.getNombre());
	}

	@Test
	void testGetPrecio() {
		Producto producto = new Producto();
		producto.setPrecio(10.5);
		assertEquals(10.5, producto.getPrecio());
	}

	@Test
	void testSetPrecio() {
		Producto producto = new Producto();
		producto.setPrecio(10.5);
		assertEquals(10.5, producto.getPrecio());
	}

	@Test
	void testGetDescripcion() {
		Producto producto = new Producto();
		producto.setDescripcion("Descripción del producto");
		assertEquals("Descripción del producto", producto.getDescripcion());
	}

	@Test
	void testSetDescripcion() {
		Producto producto = new Producto();
		producto.setDescripcion("Descripción del producto");
		assertEquals("Descripción del producto", producto.getDescripcion());
	}

	@Test
	void testGetStock() {
		Producto producto = new Producto();
		producto.setStock(50);
		assertEquals(50, producto.getStock());
	}

	@Test
	void testSetStock() {
		Producto producto = new Producto();
		producto.setStock(50);
		assertEquals(50, producto.getStock());
	}

	@Test
	void testGetPeso_producto() {
		Producto producto = new Producto();
		producto.setPeso_producto(0.75);
		assertEquals(0.75, producto.getPeso_producto());
	}

	@Test
	void testSetPeso_producto() {
		Producto producto = new Producto();
		producto.setPeso_producto(0.75);
		assertEquals(0.75, producto.getPeso_producto());
	}

	@Test
	void testGetId_planta() {
		Producto producto = new Producto();
		producto.setId_planta(789);
		assertEquals(789, producto.getId_planta());
	}

	@Test
	void testSetId_planta() {
		Producto producto = new Producto();
		producto.setId_planta(789);
		assertEquals(789, producto.getId_planta());
	}

	@Test
	void testGetRuta_imagen() {
		Producto producto = new Producto();
		producto.setRuta_imagen("ruta/imagen");
		assertEquals("ruta/imagen", producto.getRuta_imagen());
	}

	@Test
	void testSetRuta_imagen() {
		Producto producto = new Producto();
		producto.setRuta_imagen("ruta/imagen");
		assertEquals("ruta/imagen", producto.getRuta_imagen());
	}

	@Test
	void testGetFecha() {
		Producto producto = new Producto();
		Date fecha = Date.valueOf("2024-05-13");
		producto.setFecha(fecha);
		assertEquals(fecha, producto.getFecha());
	}

	@Test
	void testSetFecha() {
		Producto producto = new Producto();
		Date fecha = Date.valueOf("2024-05-13");
		producto.setFecha(fecha);
		assertEquals(fecha, producto.getFecha());
	}

	@Test
	void testGetPlanta() {
		Producto producto = new Producto();
		Planta planta = new Planta();
		producto.setPlanta(planta);
		assertEquals(planta, producto.getPlanta());
	}

	@Test
	void testSetPlanta() {
		Producto producto = new Producto();
		Planta planta = new Planta();
		producto.setPlanta(planta);
		assertEquals(planta, producto.getPlanta());
	}

	@Test
	void testGetMaterial() {
		Producto producto = new Producto();
		Material material = new Material();
		producto.setMaterial(material);
		assertEquals(material, producto.getMaterial());
	}

	@Test
	void testSetMaterial() {
		Producto producto = new Producto();
		Material material = new Material();
		producto.setMaterial(material);
		assertEquals(material, producto.getMaterial());
	}

	@Test
	void testToString() {
		Producto producto = new Producto();
		producto.setId_producto(123);
		producto.setId_material(456);
		producto.setNombre("ProductoTest");
		producto.setPrecio(10.5);
		producto.setDescripcion("Descripción del producto");
		producto.setStock(50);
		producto.setPeso_producto(0.75);
		producto.setId_planta(789);
		producto.setRuta_imagen("ruta/imagen");
		Date fecha = Date.valueOf("2024-05-13");
		producto.setFecha(fecha);
		Planta planta = new Planta();
		producto.setPlanta(planta);
		Material material = new Material();
		producto.setMaterial(material);
		
		String expected = "Producto [id_producto=123, id_material=456, nombre=ProductoTest, precio=10.5, descripcion=Descripción del producto, stock=50, peso_producto=0.75, id_planta=789, ruta_imagen=ruta/imagen, fecha=2024-05-13, planta=" + planta.toString() + ", material=" + material.toString() + "]";
		assertEquals(expected, producto.toString());
	}

}
