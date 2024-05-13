package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.material.Material;
import modelo.plantas.Planta;

class PlantaTest {

    @Test
    void testGetSetId() {
        Planta planta = new Planta();
        int id = 1;
        planta.setId(id);
        assertEquals(id, planta.getId());
    }

    @Test
    void testGetSetNombre() {
        Planta planta = new Planta();
        String nombre = "PlantaTest";
        planta.setNombre(nombre);
        assertEquals(nombre, planta.getNombre());
    }

    @Test
    void testGetSetDireccion() {
        Planta planta = new Planta();
        String direccion = "Dirección de la planta";
        planta.setDireccion(direccion);
        assertEquals(direccion, planta.getDireccion());
    }
    

    @Test
    void testGetSetTelefono() {
        Planta planta = new Planta();
        String telefono = "123456789";
        planta.setTelefono(telefono);
        assertEquals(telefono, planta.getTelefono());
    }

    @Test
    void testGetSetMaterialesSuministrados() {
        Planta planta = new Planta();
        ArrayList<Material> materiales = new ArrayList<>();
        // Agregar algunos materiales para pruebas
        materiales.add(new Material());
        materiales.add(new Material());
        planta.setMaterialesSuministrados(materiales);
        assertEquals(materiales, planta.getMaterialesSuministrados());
    }

    @Test
    void testToString() {
        Planta planta = new Planta();
        planta.setId(1);
        planta.setNombre("PlantaTest");
        planta.setDireccion("Dirección de la planta");
        planta.setTelefono("123456789");
        String expectedString = "Planta [id=1, nombre=PlantaTest, direccion=Dirección de la planta, telefono=123456789, materialesSuministrados=[]]";
        assertEquals(expectedString, planta.toString());
    }
}
