package controlador.proveedores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.proveedor.ModeloProveedor;



/**
 * Servlet implementation class EliminarProveedores
 */
@WebServlet("/borrarProveedor")
public class EliminarProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarProveedores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
		
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		
		modelo_proveedor.borrarProveedorByID(id_proveedor);
		
		request.setAttribute("msg", "deleted");
	    request.getRequestDispatcher("VerProveedores").forward(request, response);
//		response.sendRedirect("/Garbigune_reto/VerProveedores");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
