package controlador.materiales;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.material.ModeloMaterial;



/**
 * Servlet implementation class UpdateMateriales
 */
@WebServlet("/UpdateMaterial")
public class UpdateMateriales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMateriales() {
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
		FormValidador valitator = new FormValidador();
		ModeloMaterial modelo_material = new ModeloMaterial();
		
		int id_material = Integer.parseInt(request.getParameter("id_material"));
		String tipo_material = (String) request.getParameter("material");
		int emison_kg = Integer.parseInt(request.getParameter("emision_kg"));

		if (valitator.materialValido(tipo_material, emison_kg)) {
			//lalam al modelo para inser
			modelo_material.actualizarMaterial(emison_kg,tipo_material,id_material);
			//volvera el /plantas
			request.setAttribute("msg", "updated");
			request.getRequestDispatcher("VerMateriales").forward(request, response);
//		response.sendRedirect("/Garbigune_reto/VerMateriales");
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("VerMateriales").forward(request, response);
		}
	}

}
