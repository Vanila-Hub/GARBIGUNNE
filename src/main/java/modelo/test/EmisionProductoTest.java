package modelo.test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import modelo.emisionproducto.EmisionProducto;
import modelo.productos.Producto;

class EmisionProductoTest {

    @Test
    void testEmisionProducto() {
        EmisionProducto emisionProducto = new EmisionProducto();
        assertNotNull(emisionProducto);
        // Puedes agregar más aserciones aquí para verificar otras propiedades si es necesario
    }

    @Test
    void testEmisionProductoIntIntDoubleDate() {
        int idProducto = 1;
        int idMaterial = 1; 
        double emisionGenerada = 10.5;
        Date fecha = new Date(0);
        fecha = Date.valueOf(LocalDate.now());
        EmisionProducto emisionProducto = new EmisionProducto(idProducto, idMaterial, emisionGenerada, fecha);
        assertNotNull(emisionProducto);
        assertEquals(emisionGenerada, emisionProducto.getEmision_generada());
        assertEquals(fecha, emisionProducto.getFecha());
    }

    @Test
    void testGetSetId_emision() {
        EmisionProducto emisionProducto = new EmisionProducto();
        int idEmision = 1;
        emisionProducto.setId_emision(idEmision);
        assertEquals(idEmision, emisionProducto.getId_emision());
    }

    @Test
    void testGetSetId_producto() {
        EmisionProducto emisionProducto = new EmisionProducto();
        int idProducto = 1;
        emisionProducto.setId_producto(idProducto);
        assertEquals(idProducto, emisionProducto.getId_producto());
    }

    @Test
    void testGetSetEmision_generada() {
        EmisionProducto emisionProducto = new EmisionProducto();
        double emisionGenerada = 10.5;
        emisionProducto.setEmision_generada(emisionGenerada);
        assertEquals(emisionGenerada, emisionProducto.getEmision_generada());
    }

    @Test
    void testGetSetFecha() {
        EmisionProducto emisionProducto = new EmisionProducto();
        Date fecha = new Date(System.currentTimeMillis());
        emisionProducto.setFecha(fecha);
        assertEquals(fecha, emisionProducto.getFecha());
    }

    @Test
    void testGetSetProducto() {
        EmisionProducto emisionProducto = new EmisionProducto();
        Producto producto = new Producto(); // Asegúrate de que el objeto Producto esté correctamente implementado
        emisionProducto.setProducto(producto);
        assertEquals(producto, emisionProducto.getProducto());
    }

    @Test
    void testToString() {
        EmisionProducto emisionProducto = new EmisionProducto();
        emisionProducto.setId_emision(1);
        emisionProducto.setId_producto(2);
        emisionProducto.setEmision_generada(10.5);
        Date fecha = new Date(System.currentTimeMillis());
        emisionProducto.setFecha(fecha);
        String expectedString = "EmisionProducto [id_emision=1, id_producto=2, emision_generada=10.5, fecha=" + fecha.toString() + ", producto=null]"; // Asegúrate de tener una implementación adecuada de toString en la clase EmisionProducto
        assertEquals(expectedString, emisionProducto.toString());
    }
}
