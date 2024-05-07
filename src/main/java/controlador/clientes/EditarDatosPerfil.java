package controlador.clientes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.cliente.Cliente;
import modelo.cliente.ModeloCliente;

/**
 * Servlet implementation class EditarDatosPerfil
 */
@WebServlet("/EditarPerfil")
public class EditarDatosPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarDatosPerfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
		//lalam al modelo para inser
		ModeloCliente modelo_cliente = new ModeloCliente();
		Cliente cliente = modelo_cliente.getClientelByID(id_cliente);

		//volvera el /plantas y gfuardar sus atributos
		request.setAttribute("nombre", cliente.getNombre());
		request.setAttribute("apellido", cliente.getApellido());
		request.setAttribute("usuario", cliente.getUsuario());
		request.setAttribute("contrasena", cliente.getContrasena());
		request.setAttribute("id_cliente", cliente.getId_cliente());
		request.setAttribute("rol", cliente.getRol());

		request.getRequestDispatcher("Paneles_control/Admin/Edit_perfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
