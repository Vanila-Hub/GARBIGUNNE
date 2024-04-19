package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Create
 */
@WebServlet("/create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
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
		String opcion = (String) request.getParameter("opcion");
		switch (opcion) {
		case "planta":
			String nombre = (String) request.getParameter("opcion");
			String dirrecion = (String) request.getParameter("opcion");
			String telefono = (String) request.getParameter("opcion");
//lalam al modelo para inser
			//volvera el /plantas
			break;
		case "material":	
			String id_material = (String) request.getParameter("opcion");
			String tipo = (String) request.getParameter("opcion");
			String emision_kg = (String) request.getParameter("opcion");
			
		default:
			break;
		}
		
	}

}
