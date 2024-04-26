package controlador.planta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.plantas.ModeloPlanta;



/**
 * Servlet implementation class CrearPlantas
 */
@WebServlet("/crearPlanta")
public class CrearPlantas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearPlantas() {
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
		String nombre = (String) request.getParameter("nombre");
		String dirrecion = (String) request.getParameter("direccion");
		String telefono = (String) request.getParameter("telefono");
		//lalam al modelo para inser
		ModeloPlanta modelo_planta = new ModeloPlanta();
		modelo_planta.crearPlanta(nombre,dirrecion,telefono);
		//volvera el /plantas
		response.sendRedirect("/Garbigune_reto/VerPlantas");
	}

}
