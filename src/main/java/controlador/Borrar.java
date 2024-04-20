package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloCliente;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;

/**
 * Servlet implementation class Borrar
 */
@WebServlet("/borrar")
public class Borrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Borrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = (String) request.getParameter("opcion");
		
		switch (opcion) {
		case "planta":	
			
			int id_planta = Integer.parseInt(request.getParameter("id"));
			
			//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			modelo_planta.borrarPlantaByID(id_planta);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=planta");
			break;
		case "material":
			int id_material = Integer.parseInt(request.getParameter("id"));
			
			ModeloMaterial modelo_material = new ModeloMaterial();
			modelo_material.borrarMaterialByID (id_material);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
			break;
		case "cliente":
			int id_cliente = Integer.parseInt(request.getParameter("id"));
			
			ModeloCliente modelo_cliente = new ModeloCliente();
			
			modelo_cliente.borrarClienteByID(id_cliente);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=cliente");
			break;
			
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
