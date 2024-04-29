package controlador.planta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.plantas.ModeloPlanta;


/**
 * Servlet implementation class UpdatePlantas
 */
@WebServlet("/updatePlanta")
public class UpdatePlantas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlantas() {
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
		String nombre = (String) request.getParameter("nombre");
		String dirrecion = (String) request.getParameter("direccion");
		String telefono = (String) request.getParameter("telefono");
		int id_planta = Integer.parseInt(request.getParameter("id_planta"));
		
		//lalam al modelo para inser
		ModeloPlanta modelo_planta = new ModeloPlanta();
		modelo_planta.actualizar(nombre,dirrecion,telefono,id_planta);
		//volvera el /plantas
		response.sendRedirect("/Garbigune_reto/VerPlantas");
	}

}
