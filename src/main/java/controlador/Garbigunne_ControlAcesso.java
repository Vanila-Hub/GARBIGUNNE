package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Garbigunne_ControlAcesso
 */
@WebServlet("/acces")
public class Garbigunne_ControlAcesso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_ControlAcesso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = (String) request.getParameter("correo");
		//recibir password del form
		
		//con el modelo recibir el usuario
		
		//si el password del usuario es el mismo que el password recibido por form
			//enviar al index de proveedores
		//si no al home
		
		System.out.println(correo);
		if (correo.equalsIgnoreCase("admin@ee")) {
			response.sendRedirect("admin?peticion=proveedores");
		} else {
			response.sendRedirect("productos");
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
