package controlador.planta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.plantas.ModeloPlanta;



/**
 * Servlet implementation class EliminarPlantas
 */
@WebServlet("/borrarPlanta")
public class EliminarPlantas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarPlantas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_planta = Integer.parseInt(request.getParameter("id"));
		//lalam al modelo para inser
		ModeloPlanta modelo_planta = new ModeloPlanta();
		modelo_planta.borrarPlantaByID(id_planta);
		//volvera el /plantas
		request.setAttribute("msg", "deleted");
		request.getRequestDispatcher("VerPlantas").forward(request, response);
//		response.sendRedirect("/Garbigune_reto/VerPlantas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
