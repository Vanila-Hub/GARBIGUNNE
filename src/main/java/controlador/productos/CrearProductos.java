package controlador.productos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.productos.ModeloProducto;


/**
 * Servlet implementation class CrearProductos
 */
@WebServlet("/crearProducto")
public class CrearProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String carpetaHome = "http://localhost:8080/Garbigune_reto/ProductosIMG/";
		
	    String nombreProducto = request.getParameter("nombre");
	    nombreProducto = nombreProducto.contains("+")? nombreProducto.replaceAll("+", " "):nombreProducto;
	    
	    String descripcion = request.getParameter("descripcion");
	    descripcion = descripcion.contains("+")? descripcion.replaceAll("+", " "): descripcion;
	    
	    String rutaImagen = request.getParameter("imagen");
	    carpetaHome= carpetaHome + rutaImagen;
	    
	    double peso = Double.parseDouble(request.getParameter("peso_producto"));
	    double precio = Double.parseDouble(request.getParameter("precio"));
	    
	    
	    int stock = Integer.parseInt(request.getParameter("stock"));
	    int idPlanta = Integer.parseInt(request.getParameter("planta"));
	    int id_material = Integer.parseInt(request.getParameter("material"));
	    
	    ModeloProducto modeloProducto = new ModeloProducto();
	    modeloProducto.crearProducto(nombreProducto, peso, precio, descripcion, stock, idPlanta, carpetaHome,id_material);

	    response.sendRedirect("http://localhost:8080/Garbigune_reto/VerProductos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}