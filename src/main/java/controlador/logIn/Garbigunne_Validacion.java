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

/*
 * 	Este servlet se encarga de Validar los campos del formulario para cuando hay un intento de de inicio de sesion y si son corectos compra el email y la contraseña recibidos del formulario con 
 * Los clientes de la base de datos sin no exisate el ciente el Serlet devuelve un error "no_data_found" indicando que no existe el usuario, si el correo es correcro pero la ontraseña no
 * devielve un error indicando que la contraseña es incorrecta.
 * */

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
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuario = (String) request.getParameter("correo");
		usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
		
		
		String contrasena = (String) request.getParameter("contrasena");
		contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		
		Cliente cliente = modelo_cliente.getClientelByUsuario(usuario);
		
		FormValidador valitator = new FormValidador();
		boolean usuarioValido = valitator.usuarioEsValido(cliente);
		
		if (usuarioValido == true) {
			if (cliente.getUsuario().equals(usuario) && cliente.getContrasena().equalsIgnoreCase(contrasena) &&cliente.getRol().equals("admin")) {
				response.sendRedirect("/Garbigune_reto/VerProveedores?msg=logged");
				
			} else if (cliente.getUsuario().equals(usuario) && cliente.getContrasena().equalsIgnoreCase(contrasena) &&cliente.getRol().equals("usuario")){
				response.sendRedirect("/Garbigune_reto/VerPaginaProductos?id_cliente="+ cliente.getId_cliente());
			} else {
				request.setAttribute("msg", "wrong_passwd");
				request.getRequestDispatcher("/Login/").forward(request, response);
			}		
		} else {
			request.setAttribute("msg", "no_data_found");
			request.getRequestDispatcher("/Login/").forward(request, response);
		}
	}
}
