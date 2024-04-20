package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Garbigunne_Admin
 */
@WebServlet("/admin")
public class Garbigunne_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String peticion = (String) request.getParameter("peticion");
		
		switch (peticion) {
		case "materiales":
			response.sendRedirect("http://localhost:8080/Garbigune_reto/materiales");
			break;
		case "planta":
			response.sendRedirect("http://localhost:8080/Garbigune_reto/plantas");
			break;
		case "cliente":
			response.sendRedirect("http://localhost:8080/Garbigune_reto/clientes");
			break;

		case "proveedores":
			response.sendRedirect("http://localhost:8080/Garbigune_reto/proveedores");
			break;
			
		case "roles":
			response.sendRedirect("http://localhost:8080/Garbigune_reto/rol");
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
