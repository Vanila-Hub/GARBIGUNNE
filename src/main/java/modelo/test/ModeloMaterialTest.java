package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Conector;
import modelo.material.Material;
import modelo.material.ModeloMaterial;

class ModeloMaterialTest {

    @Test
    void testGetMateriales() {
        ModeloMaterial modelo = new ModeloMaterial();
        ArrayList<Material> materiales = modelo.getMateriales();
        assertNotNull(materiales);
        assertFalse(materiales.isEmpty());
        // Aquí podrías realizar más aserciones según lo que esperas de la lista de materiales obtenida
    }

    @Test
    void testCrearMaterial() {
        ModeloMaterial modelo = new ModeloMaterial();
        String tipo = "Madera";
        int emisionKg = 100; // Ajusta este valor según tus necesidades
        
        modelo.crearMaterial(tipo, emisionKg);
        
        Material materialCreado = modelo.getMaterialByID(obtenerUltimoIdMaterialCreado());
        assertNotNull(materialCreado);
        assertEquals(tipo, materialCreado.getTipo());
        assertEquals(emisionKg, materialCreado.getEmision_kg());
    }

    @Test
    void testBorrarMaterialByID() {
        ModeloMaterial modelo = new ModeloMaterial();
        int idMaterialABorrar = obtenerUltimoIdMaterialCreado(); // ID del material a borrar (ajusta según tu caso)
        
        modelo.borrarMaterialByID(idMaterialABorrar);
        
        Material materialBorrado = modelo.getMaterialByID(idMaterialABorrar);
        assertNull(materialBorrado);
    }

    @Test
    void testGetMaterialByID() {
        ModeloMaterial modelo = new ModeloMaterial();
        int idMaterialABuscar = obtenerUltimoIdMaterialCreado(); // ID del material a buscar (ajusta según tu caso)
        
        Material material = modelo.getMaterialByID(idMaterialABuscar);
        
        assertNotNull(material);
        assertEquals(idMaterialABuscar, material.getId_material());
        // Aquí podrías realizar más aserciones según lo que esperas del material obtenido
    }

    @Test
    void testActualizarMaterial() {
        ModeloMaterial modelo = new ModeloMaterial();
        int idMaterialAActualizar = obtenerUltimoIdMaterialCreado(); // ID del material a actualizar (ajusta según tu caso)
        String nuevoTipo = "Madera";
        int nuevaEmisionKg = 200; // Ajusta este valor según tus necesidades
        
        modelo.actualizarMaterial(nuevaEmisionKg, nuevoTipo, idMaterialAActualizar);
        
        Material materialActualizado = modelo.getMaterialByID(idMaterialAActualizar);
        assertNotNull(materialActualizado);
        assertEquals(nuevoTipo, materialActualizado.getTipo());
        assertEquals(nuevaEmisionKg, materialActualizado.getEmision_kg());
    }

    @Test
    void testGetMaterialByPlanta() {
        ModeloMaterial modelo = new ModeloMaterial();
        int idPlanta = obtenerIdUltimaPlantaCreada(); // ID de la planta (ajusta según tu caso)
        
        ArrayList<Material> materiales = modelo.getMaterialByPlanta(idPlanta);
        assertNotNull(materiales);
    }

    private int obtenerUltimoIdMaterialCreado() {
        int ultimoId = 0;
        try {
            // Realiza una consulta para obtener el último ID insertado en la tabla de materiales
            String sql = "SELECT MAX(ID_MATERIAL) FROM MATERIALES";
            Statement st = Conector.getConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ultimoId;
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
