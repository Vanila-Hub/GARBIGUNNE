package controlador.materiales;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.material.ModeloMaterial;

/**
 * Servlet implementation class EliminarMateriales
 */
@WebServlet("/borrarMaterial")
public class EliminarMateriales extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EliminarMateriales() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_material = Integer.parseInt(request.getParameter("id"));
		
		ModeloMaterial modelo_material = new ModeloMaterial();
		Boolean borradoMaterial = modelo_material.borrarMaterialByID (id_material);
		
		if (borradoMaterial==true) {
			request.setAttribute("msg", "deleted");
			request.getRequestDispatcher("VerMateriales").forward(request, response);
//		response.sendRedirect("/Garbigune_reto/VerMateriales");		
			
		} else {
			request.setAttribute("msg", "integrity_error");
			request.getRequestDispatcher("VerMateriales").forward(request, response);
		}
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
