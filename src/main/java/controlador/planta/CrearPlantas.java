package controlador.planta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormValidador valitator = new FormValidador();
		String nombre = (String) request.getParameter("nombre");
		String dirrecion = (String) request.getParameter("direccion");
		String telefono = (String) request.getParameter("telefono");
		
		if (valitator.plantaValida(nombre,dirrecion,telefono)) {
			//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			modelo_planta.crearPlanta(nombre,dirrecion,telefono);
			
			request.setAttribute("msg", "created");
			request.getRequestDispatcher("VerPlantas").forward(request, response);
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("VerPlantas").forward(request, response);
		}
//		response.sendRedirect("/Garbigune_reto/VerPlantas");
	}

}
