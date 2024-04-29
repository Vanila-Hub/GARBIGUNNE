package controlador.materiales;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.material.Material;
import modelo.material.ModeloMaterial;



/**
 * Servlet implementation class EditarMateriales
 */
@WebServlet("/editarMaterial")
public class EditarMateriales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarMateriales() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_material = Integer.parseInt(request.getParameter("id_material"));
		//lalam al modelo para inser
		ModeloMaterial modeloMaterial = new ModeloMaterial();
		Material material = modeloMaterial.getMaterialByID(id_material);
		//volvera el /plantas y gfuardar sus atributos
		request.setAttribute("tipo_material", material.getTipo());
		request.setAttribute("emision_kg", material.getEmision_kg());
		request.setAttribute("id", material.getId_material());
		
		request.getRequestDispatcher("Paneles_control/Admin/Edit_material.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
