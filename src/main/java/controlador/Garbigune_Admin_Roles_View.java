package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Material;
import modelo.ModeloMaterial;
import modelo.ModeloRoles;
import modelo.Rol;

/**
 * Servlet implementation class Garbigune_Admin_Roles_View
 */
@WebServlet("/rol")
public class Garbigune_Admin_Roles_View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigune_Admin_Roles_View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// pedir materiale
		ModeloRoles modelo_roles = new ModeloRoles();
		
		ArrayList<Rol> rolesUsuarios = modelo_roles.getUsuariosConRol();

		request.setAttribute("usuarios", rolesUsuarios);
		
		request.getRequestDispatcher("Paneles_control/Admin/Roles.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
