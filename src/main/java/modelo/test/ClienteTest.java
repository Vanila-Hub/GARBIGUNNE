package modelo.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.cliente.Cliente;

class ClienteTest {

    @Test
    void testCliente() {
        Cliente cliente = new Cliente();
        assertNotNull(cliente);
        // Aquí podrías realizar más aserciones para verificar la inicialización de otras propiedades si fuera necesario
    }

    @Test
    void testGetSetRol() {
        Cliente cliente = new Cliente();
        String rol = "admin";
        cliente.setRol(rol);
        assertEquals(rol, cliente.getRol());
    }

    @Test
    void testGetSetIdCliente() {
        Cliente cliente = new Cliente();
        int idCliente = 1;
        cliente.setId_cliente(idCliente);
        assertEquals(idCliente, cliente.getId_cliente());
    }
    

    @Test
    void testGetSetNombre() {
        Cliente cliente = new Cliente();
        String nombre = "John";
        cliente.setNombre(nombre);
        assertEquals(nombre, cliente.getNombre());
    }

    @Test
    void testGetSetApellido() {
        Cliente cliente = new Cliente();
        String apellido = "Doe";
        cliente.setApellido(apellido);
        assertEquals(apellido, cliente.getApellido());
    }

    @Test
    void testGetSetUsuario() {
        Cliente cliente = new Cliente();
        String usuario = "johndoe";
        cliente.setUsuario(usuario);
        assertEquals(usuario, cliente.getUsuario());
    }

    @Test
    void testGetSetContrasena() {
        Cliente cliente = new Cliente();
        String contrasena = "password123";
        cliente.setContrasena(contrasena);
        assertEquals(contrasena, cliente.getContrasena());
    }

    @Test
    void testToString() {
        Cliente cliente = new Cliente();
        cliente.setId_cliente(1);
        cliente.setNombre("John");
        cliente.setApellido("Doe");
        cliente.setUsuario("johndoe");
        cliente.setContrasena("password123");
        cliente.setRol("admin");
        
        String expectedString = "Cliente [id_cliente=1, nombre=John, apellido=Doe, usuario=johndoe, contrasena=password123, rol=admin]";
        assertEquals(expectedString, cliente.toString());
    }
}
