package controlador.ventas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ventas.ModeloVenta;


/**
 * Servlet implementation class EliminarVentas
 */
@WebServlet("/borrarVenta")
public class EliminarVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarVentas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_venta = Integer.parseInt(request.getParameter("id"));
		
		ModeloVenta modelo_venta = new ModeloVenta();
		
		modelo_venta.borrarVentaByID(id_venta);
		
		request.setAttribute("msg", "deleted");
	    request.getRequestDispatcher("VerVentas").forward(request, response);
//		response.sendRedirect("/Garbigune_reto/VerVentas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
