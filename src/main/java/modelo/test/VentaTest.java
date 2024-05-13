package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import modelo.cliente.Cliente;
import modelo.productos.Producto;
import modelo.ventas.Venta;

class VentaTest {

	@Test
	void testGetId_venta() {
		Venta venta = new Venta();
		venta.setId_venta(123);
		assertEquals(123, venta.getId_venta());
	}

	@Test
	void testSetId_venta() {
		Venta venta = new Venta();
		venta.setId_venta(123);
		assertEquals(123, venta.getId_venta());
	}

	@Test
	void testGetId_cliente() {
		Venta venta = new Venta();
		venta.setId_cliente(456);
		assertEquals(456, venta.getId_cliente());
	}

	@Test
	void testSetId_cliente() {
		Venta venta = new Venta();
		venta.setId_cliente(456);
		assertEquals(456, venta.getId_cliente());
	}

	@Test
	void testGetId_producto() {
		Venta venta = new Venta();
		venta.setId_producto(789);
		assertEquals(789, venta.getId_producto());
	}

	@Test
	void testSetId_producto() {
		Venta venta = new Venta();
		venta.setId_producto(789);
		assertEquals(789, venta.getId_producto());
	}

	@Test
	void testGetCantidad() {
		Venta venta = new Venta();
		venta.setCantidad(10);
		assertEquals(10, venta.getCantidad());
	}

	@Test
	void testSetCantidad() {
		Venta venta = new Venta();
		venta.setCantidad(10);
		assertEquals(10, venta.getCantidad());
	}

	@Test
	void testGetFecha() {
		Venta venta = new Venta();
		Date fecha = Date.valueOf("2024-05-13");
		venta.setFecha(fecha);
		assertEquals(fecha, venta.getFecha());
	}

	@Test
	void testSetFecha() {
		Venta venta = new Venta();
		Date fecha = Date.valueOf("2024-05-13");
		venta.setFecha(fecha);
		assertEquals(fecha, venta.getFecha());
	}

	@Test
	void testGetCliente() {
		Venta venta = new Venta();
		Cliente cliente = new Cliente();
		venta.setCliente(cliente);
		assertEquals(cliente, venta.getCliente());
	}

	@Test
	void testSetCliente() {
		Venta venta = new Venta();
		Cliente cliente = new Cliente();
		venta.setCliente(cliente);
		assertEquals(cliente, venta.getCliente());
	}

	@Test
	void testGetProducto() {
		Venta venta = new Venta();
		Producto producto = new Producto();
		venta.setProducto(producto);
		assertEquals(producto, venta.getProducto());
	}

	@Test
	void testSetProducto() {
		Venta venta = new Venta();
		Producto producto = new Producto();
		venta.setProducto(producto);
		assertEquals(producto, venta.getProducto());
	}

	@Test
	void testToString() {
		Venta venta = new Venta();
		venta.setId_venta(123);
		venta.setId_cliente(456);
		venta.setId_producto(789);
		venta.setCantidad(10);
		Date fecha = Date.valueOf("2024-05-13");
		venta.setFecha(fecha);
		Cliente cliente = new Cliente();
		venta.setCliente(cliente);
		Producto producto = new Producto();
		venta.setProducto(producto);
		
		String expected = "Venta [id_venta=123, id_cliente=456, id_producto=789, cantidad=10, fecha=2024-05-13, cliente=" + cliente.toString() + ", producto=" + producto.toString() + "]";
		assertEquals(expected, venta.toString());
	}

}
