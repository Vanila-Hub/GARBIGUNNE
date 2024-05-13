package controlador.planta;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;

/**
 * Servlet implementation class VerPlantas
 */
@WebServlet("/VerPlantas")
public class VerPlantas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VerPlantas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// pedir Plantas
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ArrayList<Planta> plantas = modelo_planta.getPlantas();


		request.setAttribute("plantas", plantas);
		request.getRequestDispatcher("Paneles_control/Admin/planta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
