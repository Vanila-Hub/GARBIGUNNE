package modelo.productos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;

public class ModeloProducto {

    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
		ModeloMaterial mmat = new ModeloMaterial();
		ModeloPlanta modpla = new ModeloPlanta();
		
        String sql = "SELECT * FROM PRODUCTOS;";
        
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            ResultSet rst = prst.executeQuery();

            while (rst.next()) {
                Producto producto = new Producto();

                producto.setId_producto(rst.getInt("ID_PRODUCTO"));
                producto.setId_material(rst.getInt("ID_MATERIAL"));
                producto.setNombre(rst.getString("NOMBRE"));
                producto.setPeso_producto(rst.getDouble("PESO"));
                producto.setPrecio(rst.getDouble("PRECIO"));
                producto.setDescripcion(rst.getString("DESCRIPCION"));
                producto.setStock(rst.getInt("STOCK"));
                producto.setId_planta(rst.getInt("ID_PLANTA"));
                producto.setRuta_imagen(rst.getString("RUTA_IMAGEN"));
                producto.setFecha(rst.getDate("FECHA"));
              
                //setterar atributos relacionados
                producto.setMaterial(mmat.getMaterialByID(producto.getId_material()));
                producto.setPlanta(modpla.getPlantaByID(producto.getId_planta()));
                productos.add(producto);
            }
        } catch (Exception e) {
            e.printStackTrace();
		}
        return productos;
    }

    public void borrarProductoByID(int idProducto) {
        String sql = "DELETE FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, idProducto);
            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void crearProducto(String nombre, double peso, double precio, String descripcion, int stock, int idPlanta, String rutaImagen,int idMaterial,Date fecha) {
        String sql = "INSERT INTO PRODUCTOS(NOMBRE, PESO, PRECIO, DESCRIPCION, STOCK, ID_PLANTA, RUTA_IMAGEN,ID_MATERIAL,FECHA) VALUES(?,?,?,?,?,?,?,?,?)";
        String sql_procedure = "call Garbigunne.AutoRegistrar_Emision_producto();";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setString(1, nombre);
            prst.setDouble(2, peso);
            prst.setDouble(3, precio);
            prst.setString(4, descripcion);
            prst.setInt(5, stock);
            prst.setInt(6, idPlanta);
            prst.setString(7, rutaImagen);
            prst.setInt(8, idMaterial);
            prst.setDate(9, fecha);
            
            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
			try {
				PreparedStatement prst = Conector.getConexion().prepareStatement(sql_procedure);
				prst.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }

    public Producto getProductoByID(int idProducto) {
        String sql = "SELECT * FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
		ModeloMaterial mmat = new ModeloMaterial();
		ModeloPlanta modpla = new ModeloPlanta();
		
        Producto producto = new Producto();
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, idProducto);
            ResultSet rst = prst.executeQuery();

            if (rst.next()) {
                producto.setId_producto(rst.getInt("ID_PRODUCTO"));
                producto.setId_material((rst.getInt("ID_MATERIAL")));
                producto.setNombre(rst.getString("NOMBRE"));
                producto.setPeso_producto(rst.getDouble("PESO"));
                producto.setPrecio(rst.getDouble("PRECIO"));
                producto.setDescripcion(rst.getString("DESCRIPCION"));
                producto.setStock(rst.getInt("STOCK"));
                producto.setId_planta(rst.getInt("ID_PLANTA"));
                producto.setRuta_imagen(rst.getString("RUTA_IMAGEN"));
                producto.setFecha(rst.getDate("FECHA"));
                
                //setterar atributos relacionados
                producto.setMaterial(mmat.getMaterialByID(producto.getId_material()));
                producto.setPlanta(modpla.getPlantaByID(producto.getId_planta()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return producto;
    }

    public void actualizarProductoByID(int idProducto, String nombre, double peso, double precio, String descripcion, int stock, int idPlanta, String rutaImagen) {
        String sql = "UPDATE PRODUCTOS SET NOMBRE = ?, PESO = ?, PRECIO = ?, DESCRIPCION = ?, STOCK = ?, ID_PLANTA = ?, RUTA_IMAGEN = ? WHERE ID_PRODUCTO = ?";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setString(1, nombre);
            prst.setDouble(2, peso);
            prst.setDouble(3, precio);
            prst.setString(4, descripcion);
            prst.setInt(5, stock);
            prst.setInt(6, idPlanta);
            prst.setString(7, rutaImagen);
            prst.setInt(8, idProducto);
            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
