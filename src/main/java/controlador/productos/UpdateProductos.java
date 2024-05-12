package controlador.productos;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.productos.ModeloProducto;



/**
 * Servlet implementation class UpdateProductos
 */
@WebServlet("/updateProducto")
public class UpdateProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormValidador valitator = new FormValidador();
		String carpetaHome = "/Garbigune_reto/ProductosIMG/";
		String nombreProducto = request.getParameter("nombre");
	    nombreProducto = nombreProducto.contains("+")? nombreProducto.replaceAll("+", " "):nombreProducto;
	    
	    double peso = Double.parseDouble(request.getParameter("peso_producto"));
	    double precio = Double.parseDouble(request.getParameter("precio"));
	    
	    String descripcion = request.getParameter("descripcion");
	    descripcion = descripcion.contains("+")? descripcion.replaceAll("+", " "): descripcion;
	    
	    int stock = Integer.parseInt(request.getParameter("stock"));
	    int idPlanta = Integer.parseInt(request.getParameter("planta"));
	    int id_producto = Integer.parseInt(request.getParameter("id_producto"));
	    
	    String rutaImagen = request.getParameter("imagen");
	    carpetaHome= carpetaHome + rutaImagen;

	    if (valitator.productoValido(nombreProducto, descripcion, carpetaHome, Date.valueOf(LocalDate.now()), idPlanta, id_producto)) {
	    	ModeloProducto modeloProducto = new ModeloProducto();
	    	modeloProducto.actualizarProductoByID(id_producto, nombreProducto, peso, precio, descripcion, stock, idPlanta, carpetaHome);
	    	
	    	request.setAttribute("msg", "updated");
	    	request.getRequestDispatcher("VerProductos").forward(request, response);
			
		} else {
	    	request.setAttribute("msg", "no_valid_data");
	    	request.getRequestDispatcher("VerProductos").forward(request, response);
		}
//	    response.sendRedirect("/Garbigune_reto/VerProductos");
	}

}
