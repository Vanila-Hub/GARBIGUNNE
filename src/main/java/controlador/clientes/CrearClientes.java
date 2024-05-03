package controlador.clientes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.cliente.ModeloCliente;


/**
 * Servlet implementation class CrearClientes
 */
@WebServlet("/crearCliente")
public class CrearClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreCliente = (String) request.getParameter("nombre");
		nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;
		
		String apellido = (String) request.getParameter("apellido");
		apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;
		
		String usuario = (String) request.getParameter("usuario");
		usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
		
		
		String contrasena = (String) request.getParameter("contrasena");
		contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		modelo_cliente.crearCliente(nombreCliente,apellido,usuario,contrasena);
		
		response.sendRedirect("/Garbigune_reto/VerClientes");
	}

}
