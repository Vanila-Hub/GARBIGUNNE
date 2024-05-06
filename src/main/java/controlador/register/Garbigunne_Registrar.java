package controlador.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Conector;
import modelo.cliente.ModeloCliente;

/**
 * Servlet implementation class Garbigunne_Register
 */
@WebServlet("/registrarse")
public class Garbigunne_Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Registrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Registrar/").forward(request, response);
		
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
		
		response.sendRedirect("Garbigune_reto/VerPaginaProductos");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
