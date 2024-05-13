package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Conector;
import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;

class ModeloPlantaTest {

    private ModeloPlanta modeloPlanta;

    @BeforeEach
    void setUp() {
        modeloPlanta = new ModeloPlanta();
    }

    @Test
    void testGetPlantas() {
        ArrayList<Planta> plantas = modeloPlanta.getPlantas();
        assertNotNull(plantas);
        assertFalse(plantas.isEmpty());
        // Aquí podrías realizar más aserciones según lo que esperas de la lista de plantas obtenida
    }

    @Test
    void testCrearPlanta() {
        // Crea una planta de prueba
        String nombre = "Planta de prueba";
        String direccion = "Dirección de prueba";
        String telefono = "123456789";
        modeloPlanta.crearPlanta(nombre, direccion, telefono);

        // Verifica que la planta fue creada correctamente
        Planta planta = modeloPlanta.getPlantaByID(obtenerIdUltimaPlantaCreada());
        assertNotNull(planta);
        assertEquals(nombre, planta.getNombre());
        assertEquals(direccion, planta.getDireccion());
        assertEquals(telefono, planta.getTelefono());
    }

    @Test
    void testBorrarPlantaByID() {
        // Asegúrate de tener una planta existente con un ID válido para borrar
        int idPlantaABorrar = 1; // Ejemplo: ID de la planta a borrar

        // Borra la planta por ID
        modeloPlanta.borrarPlantaByID(idPlantaABorrar);

        // Verifica que la planta fue borrada correctamente
        Planta plantaBorrada = modeloPlanta.getPlantaByID(idPlantaABorrar);
        assertNull(plantaBorrada);
    }

    @Test
    void testGetPlantaByID() {
        // Asegúrate de tener una planta existente con un ID válido para buscar
        int idPlantaABuscar = obtenerIdUltimaPlantaCreada(); // Ejemplo: ID de la planta a buscar

        // Obtiene la planta por ID
        Planta planta = modeloPlanta.getPlantaByID(idPlantaABuscar);

        // Verifica que la planta fue encontrada correctamente
        assertNotNull(planta);
        // Aquí podrías realizar más aserciones según lo que esperas de la planta obtenida
    }

    @Test
    void testActualizar() {
        // Asegúrate de tener una planta existente con un ID válido para actualizar
        int idPlantaAActualizar = obtenerIdUltimaPlantaCreada(); // Ejemplo: ID de la planta a actualizar

        // Nuevos valores para la planta
        String nuevoNombre = "Nuevo nombre";
        String nuevaDireccion = "Nueva dirección";
        String nuevoTelefono = "987654321";

        // Actualiza la planta
        modeloPlanta.actualizar(nuevoNombre, nuevaDireccion, nuevoTelefono, idPlantaAActualizar);

        // Verifica que la planta fue actualizada correctamente
        Planta plantaActualizada = modeloPlanta.getPlantaByID(idPlantaAActualizar);
        assertNotNull(plantaActualizada);
        assertEquals(nuevoNombre, plantaActualizada.getNombre());
        assertEquals(nuevaDireccion, plantaActualizada.getDireccion());
        assertEquals(nuevoTelefono, plantaActualizada.getTelefono());
    }
    
    private int obtenerIdUltimaPlantaCreada() {
        int idPlanta = 0;
        try {
            // Realiza una consulta para obtener el ID de la última planta creada
            String sql = "SELECT MAX(ID_PLANTA) FROM PLANTAS";
            Connection con = Conector.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                idPlanta = rs.getInt(1);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idPlanta;
    }

}
