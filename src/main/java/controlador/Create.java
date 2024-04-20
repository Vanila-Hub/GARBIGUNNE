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
 * Servlet implementation class Create
 */
@WebServlet("/create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
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
		String opcion = (String) request.getParameter("opcion");
		switch (opcion) {
		case "planta":
			String nombre = (String) request.getParameter("nombre");
			String dirrecion = (String) request.getParameter("direccion");
			String telefono = (String) request.getParameter("telefono");
			System.out.println(nombre+dirrecion+telefono);
//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			modelo_planta.crearPlanta(nombre,dirrecion,telefono);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=planta");
			break;
		case "material":	
			String tipo_material = (String) request.getParameter("material");
			int emision_kg = Integer.parseInt(request.getParameter("emision_kg"));
			
			ModeloMaterial modelo_material = new ModeloMaterial();
			modelo_material.crearMaterial(tipo_material, emision_kg);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
			break;
		case "cliente":
			String nombreCliente = (String) request.getParameter("nombre");
			String apellido = (String) request.getParameter("apellido");
			String usuario = (String) request.getParameter("usuario");
			String contrasena = (String) request.getParameter("contrasena");
			
			
			ModeloCliente modelo_cliente = new ModeloCliente();
			//modelo_cliente.crearCliente(nombreCliente,apellido,usuario,contrasena);
			response.sendRedirect("http://localhost:8080/Garbigune_reto/Cliente?peticion=clientes");
			
			break;
		default:
			break;
		}
		
	}

}
