package modelo.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.material.Material;

class MaterialTest {

    @Test
    void testGetSetId_material() {
        Material material = new Material();
        int idMaterial = 1;
        material.setId_material(idMaterial);
        assertEquals(idMaterial, material.getId_material());
    }

    @Test
    void testGetSetTipo() {
        Material material = new Material();
        String tipo = "TipoMaterial";
        material.setTipo(tipo);
        assertEquals(tipo, material.getTipo());
    }

    @Test
    void testGetSetEmision_kg() {
        Material material = new Material();
        int emisionKg = 100;
        material.setEmision_kg(emisionKg);
        assertEquals(emisionKg, material.getEmision_kg());
    }

    @Test
    void testToString() {
        Material material = new Material();
        material.setId_material(1);
        material.setTipo("TipoMaterial");
        material.setEmision_kg(100);
        String expectedString = "Material [id_material=1, tipo=TipoMaterial, emision_kg=100]";
        assertEquals(expectedString, material.toString());
    }
}
