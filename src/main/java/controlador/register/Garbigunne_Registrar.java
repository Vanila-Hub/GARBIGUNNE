package controlador.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
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
		request.getRequestDispatcher("Registrar/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormValidador valitator = new FormValidador();
		
		String nombreCliente = (String) request.getParameter("nombre");
		nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;

		String apellido = (String) request.getParameter("apellido");
		apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;

		String usuario = (String) request.getParameter("usuario");
		usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;


		String contrasena = (String) request.getParameter("contrasena");
		contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
		
		String rol = "usuario";
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		
//		Validamos los datos recibidos por el formulario si esque son correctos

		if (valitator.newUsuarioEsValido(nombreCliente,apellido,usuario,contrasena,rol)) {
			modelo_cliente.crearCliente(nombreCliente,apellido,usuario,contrasena,rol);
			request.setAttribute("msg", "created");
			request.getRequestDispatcher("Login/index.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("Registrar/index.jsp").forward(request, response);
		}
	}

}
