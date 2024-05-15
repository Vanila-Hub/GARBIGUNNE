package modelo.test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.mysql.cj.xdevapi.Statement;

import modelo.Conector;
import modelo.emisionproducto.EmisionProducto;
import modelo.emisionproducto.ModeloEmisionProducto;

class ModeloEmisionProductoTest {

    @Test
    void testGetEmisionesProductos() {
        ModeloEmisionProducto modelo = new ModeloEmisionProducto();
        ArrayList<EmisionProducto> emisiones = modelo.getEmisionesProductos();
        assertNotNull(emisiones);
        assertFalse(emisiones.isEmpty());
        // Aqu� podr�as realizar m�s aserciones seg�n lo que esperas de la lista de emisiones obtenida
    }

    @Test
    void testCrearEmisionProducto() throws ClassNotFoundException {
        ModeloEmisionProducto modelo = new ModeloEmisionProducto();
        int idProducto = obtenerUltimoIdProductoCreado(); // ID del producto (ajusta seg�n tu caso)
        Date fecha = null; // Fecha actual
        fecha = Date.valueOf(LocalDate.now());
        
        modelo.crearEmisionProducto(idProducto, fecha);
        
        EmisionProducto emisionCreada = modelo.getEmisionProductoByID(obtenerUltimoIdEmisionCreada());
        assertNotNull(emisionCreada);
        assertEquals(idProducto, emisionCreada.getId_producto());
        assertEquals(fecha.toString(), emisionCreada.getFecha().toString());
    }

    @Test
    void testGetEmisionProductoByID() throws ClassNotFoundException {
        ModeloEmisionProducto modelo = new ModeloEmisionProducto();
        int idEmisionABuscar = obtenerUltimoIdEmisionCreada(); // ID de la emisi�n a buscar (ajusta seg�n tu caso)
        
        EmisionProducto emision = modelo.getEmisionProductoByID(idEmisionABuscar);
        
        assertNotNull(emision);
        assertEquals(idEmisionABuscar, emision.getId_emision());
        // Aqu� podr�as realizar m�s aserciones seg�n lo que esperas de la emisi�n obtenida
    }

    @Test
    void testEliminarEmisionProducto() throws ClassNotFoundException {
        ModeloEmisionProducto modelo = new ModeloEmisionProducto();
        int idEmisionAEliminar = obtenerUltimoIdEmisionCreada(); // ID de la emisi�n a eliminar (ajusta seg�n tu caso)
        
        modelo.eliminarEmisionProducto(idEmisionAEliminar);
        
        EmisionProducto emisionEliminada = modelo.getEmisionProductoByID(idEmisionAEliminar);
        assertNull(emisionEliminada);
    }

    @Test
    void testActualizarEmisionProducto() throws ClassNotFoundException {
        ModeloEmisionProducto modelo = new ModeloEmisionProducto();
        int idEmisionAActualizar = obtenerUltimoIdEmisionCreada(); // ID de la emisi�n a actualizar (ajusta seg�n tu caso)
        int nuevoIdProducto = obtenerUltimoIdProductoCreado(); // Nuevo ID del producto
        Date nuevaFecha = new Date(System.currentTimeMillis()); // Nueva fecha
        
        modelo.actualizarEmisionProducto(idEmisionAActualizar, nuevoIdProducto, nuevaFecha, 22.2);
        
        EmisionProducto emisionActualizada = modelo.getEmisionProductoByID(idEmisionAActualizar);
        assertNotNull(emisionActualizada);
        assertEquals(nuevoIdProducto, emisionActualizada.getId_producto());
        assertEquals(nuevaFecha.toString(), emisionActualizada.getFecha().toString());
    }

    private int obtenerUltimoIdEmisionCreada() throws ClassNotFoundException {
        int ultimoId = 0;
        try {
            // Realiza una consulta para obtener el �ltimo ID insertado en la tabla de emisiones de productos
            String sql = "SELECT MAX(ID_EMISION) FROM EMISIONES_PRODUCTOS";
            
            java.sql.Statement st =  Conector.getConexion().createStatement();
            ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);
            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ultimoId;
    }
    
    private int obtenerUltimoIdProductoCreado() throws ClassNotFoundException {
        int ultimoId = 0;
        try {
            // Realiza una consulta para obtener el �ltimo ID insertado en la tabla de productos
            String sql = "SELECT MAX(ID_PRODUCTO) FROM PRODUCTOS";
            Connection con = Conector.getConexion();
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ultimoId;
    }

}
