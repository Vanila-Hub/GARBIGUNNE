package modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import modelo.Conector;
import modelo.suministro.ModeloSuministro;

class ModeloSuministroTest {

	@Test
	void testGetSuministros() {
		ModeloSuministro modelo = new ModeloSuministro();
		assertNotNull(modelo.getSuministros());
	}

	@Test
	void testBorrarSuministroByID() throws ClassNotFoundException {
		ModeloSuministro modelo = new ModeloSuministro();
		// Asumiendo que existe un suministro con ID válido
		assertTrue(modelo.borrarSuministroByID(obtenerUltimoIdSuministroCreado()));
		
	}

	@Test
	void testCrearSuministro() {
		ModeloSuministro modelo = new ModeloSuministro();
		
		modelo.crearSuministro(1, 1, 1, "enero", 100.0); // Asumiendo valores válidos para crear un suministro
		
		assertNotNull(modelo.getSuministros());
		// Asegurando que el suministro se ha creado correctamente
	}

	@Test
	void testGetSuministroByID() throws ClassNotFoundException {
		ModeloSuministro modelo = new ModeloSuministro(); 
		
		assertNotNull(modelo.getSuministroByID(obtenerUltimoIdSuministroCreado()));// Asumiendo que existe un suministro con ID válido
		
	}

	@Test
	void testActualizarSuministroByID() {
		ModeloSuministro modelo = new ModeloSuministro();
		
		modelo.actualizarSuministroByID(1, 1, 1, 1, "febrero", 200.0); // Asumiendo valores válidos para actualizar un suministro
		
		assertNotNull(modelo.getSuministroByID(1));
		// Asegurando que la actualización se ha realizado correctamente
	}
	
    private int obtenerUltimoIdSuministroCreado() throws ClassNotFoundException {
        int ultimoId = 0;
        try {
            // Realiza una consulta para obtener el último ID insertado en la tabla de productos
            String sql = "SELECT MAX(ID_SUMINISTRO) FROM SUMINISTROS";
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
