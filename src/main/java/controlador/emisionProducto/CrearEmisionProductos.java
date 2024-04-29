package controlador.emisionProducto;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.emisionproducto.ModeloEmisionProducto;



/**
 * Servlet implementation class CrearEmisionProducto
 */
@WebServlet("/crearEmisionProducto")
public class CrearEmisionProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearEmisionProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProducto = Integer.parseInt(request.getParameter("id_producto"));
	    Date fecha = Date.valueOf(request.getParameter("fecha"));
	   
	    
	    ModeloEmisionProducto modeloEmisionProducto = new ModeloEmisionProducto();
	    
	    modeloEmisionProducto.crearEmisionProducto(idProducto,fecha);
	    
	    response.sendRedirect("/Garbigune_reto/VerEmisiones");
	}

}
