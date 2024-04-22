package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloPlanta;
import modelo.Planta;

/**
 * Servlet implementation class Garbigunne_Admin_ViewAll
 */
@WebServlet("/plantas")
public class Garbigunne_Admin_ViewAll_plantas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Admin_ViewAll_plantas() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//pedir Plantas
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ArrayList<Planta> plantas = modelo_planta.getPlantas();
		
		//pedir arrayñlisy
		//mandarlo al jsp de plantas
		request.setAttribute("plantas", plantas);
		request.getRequestDispatcher("Paneles_control/Admin/planta.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
