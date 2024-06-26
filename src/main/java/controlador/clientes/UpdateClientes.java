package controlador.clientes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.cliente.ModeloCliente;
 /*
  * Este servlet se encarga de validar los datos del formulario, si son correctos Actualiza al cliente con los nuevos valopres sino devuelve un error indicandoque hay campos sin rellenar
  * */

/**
 * Servlet implementation class UpdateClientes
 */
@WebServlet("/UpdateClientes")
public class UpdateClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateClientes() {
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
		String tipo_usuario ="";
		
		int id_CLiente = Integer.parseInt(request.getParameter("id_cliente"));
		String nombreCliente = (String) request.getParameter("nombre");
		nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;
		
		String apellido = (String) request.getParameter("apellido");
		apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;
		
		String usuario = (String) request.getParameter("usuario");
		usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
		
		
		String contrasena = (String) request.getParameter("contrasena");
		contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
		
		String rol = request.getParameter("rol");
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		
		FormValidador valitator = new FormValidador();

		if (valitator.rolEsValido(rol)) {
			tipo_usuario="admin";
		} else {
			tipo_usuario="usuario";
		}
		modelo_cliente.actualizarCliente(nombreCliente,apellido,usuario,contrasena,id_CLiente,tipo_usuario);

		if (request.getParameter("peticion")==null || request.getParameter("peticion") == "") {
			request.setAttribute("msg", "updated");
			request.getRequestDispatcher("/VerClientes").forward(request, response);
		} else {
			request.setAttribute("id_cliente", id_CLiente);
			request.setAttribute("msg", "updated");
			request.getRequestDispatcher("/VerPaginaProductos").forward(request, response);
		}
		
	}

}
