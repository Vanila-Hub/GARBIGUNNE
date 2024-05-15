package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.ventas.ModeloVenta;
import modelo.ventas.Venta;

class ModeloVentaTest {

	@Test
	void testGetVentas() {
		
		ModeloVenta modeloVenta = new ModeloVenta();
		ArrayList<Venta> ventas = modeloVenta.getVentas();
		assertNotNull(ventas);
	}

	@Test
	void testCrearVenta() {
		
		ModeloVenta modeloVenta = new ModeloVenta();
		int idCliente = 1; 
		int idProducto = 1; 
		double cantidad = 10.5; 
		Date fecha = new Date(System.currentTimeMillis()); 
		modeloVenta.crearVenta(idCliente, idProducto, cantidad, fecha);
	}

	@Test
	void testBorrarVentaByID() {
		ModeloVenta modeloVenta = new ModeloVenta();
		int idVenta = 1; // 
		modeloVenta.borrarVentaByID(idVenta);
	}

	@Test
	void testGetVentaByID() {
		
		ModeloVenta modeloVenta = new ModeloVenta();
		int idVenta = 66; 
		Venta venta = modeloVenta.getVentaByID(idVenta);
		assertNotNull(venta);
	}

	@Test
	void testActualizar() {
		
		ModeloVenta modeloVenta = new ModeloVenta();
		int idVenta = 1; 
		int idCliente = 1;
		int idProducto = 1; 
		int cantidad = 10; 
		Date fecha = new Date(System.currentTimeMillis()); 
		modeloVenta.actualizar(idVenta, idCliente, idProducto, cantidad, fecha);
	}

	@Test
	void testRegistrarCompra() {
		
		ModeloVenta modeloVenta = new ModeloVenta();
		int idCliente = 1; 
		int idProducto = 1; 
		int cantidad = 10; 
		modeloVenta.registrarCompra(idCliente, idProducto, cantidad);
	}

}
