package controlador.materiales;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloMaterial;

/**
 * Servlet implementation class EliminarMateriales
 */
@WebServlet("/borrar")
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
		String opcion = (String) request.getParameter("opcion");
		if (opcion.equalsIgnoreCase("material")) {
			
			int id_material = Integer.parseInt(request.getParameter("id"));
			
			ModeloMaterial modelo_material = new ModeloMaterial();
			modelo_material.borrarMaterialByID (id_material);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/VerMateriales/materiales");
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
