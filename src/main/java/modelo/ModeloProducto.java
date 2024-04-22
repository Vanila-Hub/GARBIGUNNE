package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloProducto {

    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTOS;";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            ResultSet rst = prst.executeQuery();

            while (rst.next()) {
                Producto producto = new Producto();

                producto.setId_producto(rst.getInt("ID_PRODUCTO"));
                producto.setNombre(rst.getString("NOMBRE"));
                producto.setPeso_producto(rst.getDouble("PESO"));
                producto.setPrecio(rst.getDouble("PRECIO"));
                producto.setDescripcion(rst.getString("DESCRIPCION"));
                producto.setStock(rst.getInt("STOCK"));
                producto.setId_planta(rst.getInt("ID_PLANTA"));
                producto.setRuta_imagen(rst.getString("RUTA_IMAGEN"));

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

    public void crearProducto(String nombre, double peso, double precio, String descripcion, int stock, int idPlanta, String rutaImagen) {
        String sql = "INSERT INTO PRODUCTOS(NOMBRE, PESO, PRECIO, DESCRIPCION, STOCK, ID_PLANTA, RUTA_IMAGEN) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setString(1, nombre);
            prst.setDouble(2, peso);
            prst.setDouble(3, precio);
            prst.setString(4, descripcion);
            prst.setInt(5, stock);
            prst.setInt(6, idPlanta);
            prst.setString(7, rutaImagen);

            prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Producto getProductoByID(int idProducto) {
        String sql = "SELECT * FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
        Producto producto = new Producto();
        try {
            PreparedStatement prst = Conector.getConexion().prepareStatement(sql);
            prst.setInt(1, idProducto);
            ResultSet rst = prst.executeQuery();

            if (rst.next()) {
                producto.setId_producto(rst.getInt("ID_PRODUCTO"));
                producto.setNombre(rst.getString("NOMBRE"));
                producto.setPeso_producto(rst.getDouble("PESO"));
                producto.setPrecio(rst.getDouble("PRECIO"));
                producto.setDescripcion(rst.getString("DESCRIPCION"));
                producto.setStock(rst.getInt("STOCK"));
                producto.setId_planta(rst.getInt("ID_PLANTA"));
                producto.setRuta_imagen(rst.getString("RUTA_IMAGEN"));
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