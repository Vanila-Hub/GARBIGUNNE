package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

class ModeloProductosTest {

	@Test
	void testGetProductos() {
		ModeloProducto modeloProducto = new ModeloProducto();
		ArrayList<Producto> productos = modeloProducto.getProductos();
		assertNotNull(productos);
	}

	@Test
	void testBorrarProductoByID() {
		ModeloProducto modeloProducto = new ModeloProducto();
		int idProducto = 1;
		modeloProducto.borrarProductoByID(idProducto);
	}

	@Test
	void testCrearProducto() {
		ModeloProducto modeloProducto = new ModeloProducto();
		String nombre = "Producto de prueba";
		double peso = 10.5; 
		double precio = 50.0; 
		String descripcion = "Descripción del producto de prueba"; 
		int stock = 100; 
		int idPlanta = 1; 
		String rutaImagen = "ruta/a/imagen.jpg"; 
		int idMaterial = 1;
		Date fecha = new Date(System.currentTimeMillis()); 
		modeloProducto.crearProducto(nombre, peso, precio, descripcion, stock, idPlanta, rutaImagen, idMaterial, fecha);
	}

	@Test
	void testGetProductoByID() {
		ModeloProducto modeloProducto = new ModeloProducto();
		int idProducto = 1; 
		Producto producto = modeloProducto.getProductoByID(idProducto);
		assertNotNull(producto);
	}

	@Test
	void testActualizarProductoByID() {
		ModeloProducto modeloProducto = new ModeloProducto();
		int idProducto = 1; 
		String nombre = "Producto actualizado"; 
		double peso = 15.0; 
		double precio = 60.0; 
		String descripcion = "Descripción actualizada del producto"; 
		int stock = 150; 
		int idPlanta = 2; 
		String rutaImagen = "nueva/ruta/imagen.jpg";
		modeloProducto.actualizarProductoByID(idProducto, nombre, peso, precio, descripcion, stock, idPlanta, rutaImagen);
	}

	@Test
	void testRegistrarEmision() {
		ModeloProducto modeloProducto = new ModeloProducto();
		Date fecha = new Date(System.currentTimeMillis()); 
		modeloProducto.registrarEmision(fecha);
	}

	@Test
	void testGetProductoByPlanta() {
		ModeloProducto modeloProducto = new ModeloProducto();
		int idPlanta = 1; 
		ArrayList<Producto> productosPlanta = modeloProducto.getProductoByPlanta(idPlanta);
		assertNotNull(productosPlanta);
	}

}
