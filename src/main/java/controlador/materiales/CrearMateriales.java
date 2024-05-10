package controlador.materiales;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.material.ModeloMaterial;


/**
 * Servlet implementation class CrearMateriales
 */
@WebServlet("/crearMaterial")
public class CrearMateriales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearMateriales() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo_material = (String) request.getParameter("material");
		int emision_kg = Integer.parseInt(request.getParameter("emision_kg"));
		
		ModeloMaterial modelo_material = new ModeloMaterial();
		modelo_material.crearMaterial(tipo_material, emision_kg);
		
		response.sendRedirect("/Garbigune_reto/VerMateriales");
	}

	 
}
