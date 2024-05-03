package controlador.logIn;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.cliente.Cliente;
import modelo.cliente.ModeloCliente;

/**
 * Servlet implementation class Garbigunne_ControlAcesso
 */
@WebServlet("/acces")
public class Garbigunne_Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Validacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String contrasena = request.getParameter("contrasena");
		
		//pedir correo a la BBDD
		ModeloCliente modelo_cliente = new ModeloCliente();
		Cliente cliente =  modelo_cliente.getClientelByUsuario(usuario);
		
		//si el password del usuario es el mismo que el password recibido por form	
		if(usuario != null && cliente.getContrasena().equals(contrasena)) {
			//enviar al index de productos
			response.sendRedirect("http://localhost:8080/Garbigune_reto/Paneles_control/clienteProducto/indexProductos.jsp");
			
		}else {
			//si no al home
			response.sendRedirect("http://localhost:8080/Garbigune_reto/home");
		}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
