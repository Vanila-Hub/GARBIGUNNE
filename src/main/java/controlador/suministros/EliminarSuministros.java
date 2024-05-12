package controlador.suministros;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.suministro.ModeloSuministro;


/**
 * Servlet implementation class EliminarSuministros
 */
@WebServlet("/borrarSuministro")
public class EliminarSuministros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarSuministros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_suminitro = Integer.parseInt(request.getParameter("id_suministro"));
		
		ModeloSuministro modelo_suministro = new ModeloSuministro();
		
		boolean borradoMaterial = modelo_suministro.borrarSuministroByID(id_suminitro);
		
		if (borradoMaterial == true) {
			request.setAttribute("msg", "deleted");
			request.getRequestDispatcher("VerSuministros").forward(request, response);			
		} else {
			request.setAttribute("msg", "integrity_error");
			request.getRequestDispatcher("VerSuministros").forward(request, response);	
		}
//		response.sendRedirect("/Garbigune_reto/VerSuministros");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
