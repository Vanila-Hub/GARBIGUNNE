package controlador.planta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;



/**
 * Servlet implementation class EditarPlantas
 */
@WebServlet("/editarPlanta")
public class EditarPlantas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarPlantas() {
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
		Planta planta = modelo_planta.getPlantaByID(id_planta);
		//volvera el /plantas
		request.setAttribute("nombre", planta.getNombre());
		request.setAttribute("direccion", planta.getDireccion());
		request.setAttribute("telefono", planta.getTelefono());
		request.setAttribute("id", planta.getId());
		
		request.getRequestDispatcher("Paneles_control/Admin/Edit_planta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
