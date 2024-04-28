package controlador.emisionproducto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.emisionproducto.ModeloEmisionProducto;



/**
 * Servlet implementation class EliminarEmisionProducto
 */
@WebServlet("/borrarEmisionProducto")
public class EliminarEmisionProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarEmisionProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idEmision = Integer.parseInt(request.getParameter("id_emision"));
	    
	    ModeloEmisionProducto modeloEmisionProducto = new ModeloEmisionProducto();
	    
	    modeloEmisionProducto.eliminarEmisionProducto(idEmision);
	    
	    response.sendRedirect("/Garbigune_reto/VerEmisiones");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
