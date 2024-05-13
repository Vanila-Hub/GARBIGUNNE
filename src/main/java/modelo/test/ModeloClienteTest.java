package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.cliente.ModeloCliente;
import modelo.Conector;
import modelo.cliente.Cliente;

class ModeloClienteTest {

    @Test
    void testGetClientes() {
        ModeloCliente modeloCliente = new ModeloCliente();
        ArrayList<Cliente> clientes = modeloCliente.getClientes();
        assertNotNull(clientes);
        // Aquí podrías realizar más aserciones según lo que esperas de la lista de clientes obtenida
    }

    @Test
    void testCrearCliente() {
        ModeloCliente modeloCliente = new ModeloCliente();
        String nombre = "NombreTest";
        String apellido = "ApellidoTest";
        String usuario = "UsuarioTest@usuario.com";
        String contrasena = "ContrasenaTest";
        String rol = "usuario";
        
        modeloCliente.crearCliente(nombre, apellido, usuario, contrasena, rol);
        
        Cliente clienteCreado = modeloCliente.getClientelByUsuario(obtenerUsuarioUltimoClienteCreado());
        assertNotNull(clienteCreado);
        assertEquals(nombre, clienteCreado.getNombre());
        assertEquals(apellido, clienteCreado.getApellido());
        assertEquals(usuario, clienteCreado.getUsuario());
        assertEquals(contrasena, clienteCreado.getContrasena());
        assertEquals(rol, clienteCreado.getRol());
    }

    @Test
    void testBorrarClienteByID() {
        ModeloCliente modeloCliente = new ModeloCliente();
        int idClienteABorrar = obtenerIdUltimoClienteCreado(); // ID del cliente a borrar (ajusta según tu caso)
        
        modeloCliente.borrarClienteByID(idClienteABorrar);
        
        Cliente clienteBorrado = modeloCliente.getClientelByID(idClienteABorrar);
        assertNull(clienteBorrado);
    }

    @Test
    void testGetClientelByID() {
        ModeloCliente modeloCliente = new ModeloCliente();
        int idClienteABuscar = obtenerIdUltimoClienteCreado(); // ID del cliente a buscar (ajusta según tu caso)
        
        Cliente cliente = modeloCliente.getClientelByID(idClienteABuscar);
        
        assertNotNull(cliente);
        // Aquí podrías realizar más aserciones según lo que esperas del cliente obtenido
    }

    @Test
    void testActualizarCliente() {
        ModeloCliente modeloCliente = new ModeloCliente();
        int idClienteAActualizar = obtenerIdUltimoClienteCreado(); // ID del cliente a actualizar (ajusta según tu caso)
        String nuevoNombre = "NuevoNombreTest";
        String nuevoApellido = "NuevoApellidoTest";
        String nuevoUsuario = "NuevoUsuarioTest";
        String nuevaContrasena = "NuevaContrasenaTest";
        String nuevoRol = "usuario";
        
        modeloCliente.actualizarCliente(nuevoNombre, nuevoApellido, nuevoUsuario, nuevaContrasena, idClienteAActualizar, nuevoRol);
        
        Cliente clienteActualizado = modeloCliente.getClientelByID(idClienteAActualizar);
        assertNotNull(clienteActualizado);
        assertEquals(nuevoNombre, clienteActualizado.getNombre());
        assertEquals(nuevoApellido, clienteActualizado.getApellido());
        assertEquals(nuevoUsuario, clienteActualizado.getUsuario());
        assertEquals(nuevaContrasena, clienteActualizado.getContrasena());
        assertEquals(nuevoRol, clienteActualizado.getRol());
    }

    @Test
    void testGetClientelByUsuario() {
        ModeloCliente modeloCliente = new ModeloCliente();
        String usuarioABuscar = "usuario@usuario"; // Usuario del cliente a buscar (ajusta según tu caso)
        
        Cliente cliente = modeloCliente.getClientelByUsuario(usuarioABuscar);
        
        assertNotNull(cliente);
        assertEquals(usuarioABuscar, cliente.getUsuario());
        // Aquí podrías realizar más aserciones según lo que esperas del cliente obtenido
    }

    private int obtenerIdUltimoClienteCreado() {
        int idCliente = 0;
        try {
            // Realiza una consulta para obtener el ID del último cliente creado
            String sql = "SELECT MAX(ID_CLIENTE) FROM CLIENTES";
            Connection con = Conector.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                idCliente = rs.getInt(1);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idCliente;
    }
    private String obtenerUsuarioUltimoClienteCreado() {
    	String ClienteUser = null;
    	try {
    		// Realiza una consulta para obtener el ID del último cliente creado
    		String sql = "SELECT USUARIO FROM CLIENTES WHERE ID_CLIENTE = (SELECT MAX(ID_CLIENTE) FROM CLIENTES)";
    		Connection con = Conector.getConexion();
    		Statement st = con.createStatement();
    		ResultSet rs = st.executeQuery(sql);
    		if (rs.next()) {
    			ClienteUser = rs.getString(1);
    		}
    		con.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return ClienteUser;
    }

}

