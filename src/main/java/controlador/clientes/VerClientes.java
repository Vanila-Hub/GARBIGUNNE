package controlador.clientes;

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
 * Servlet implementation class VerClientes
 */
@WebServlet("/VerClientes")
public class VerClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerClientes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormValidador valitato = new FormValidador();
		String msg = (String) request.getParameter("msg");
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		ArrayList<Cliente> clientes = modelo_cliente.getClientes();
		
		request.setAttribute("clientes", clientes);
		request.getRequestDispatcher("Paneles_control/Admin/cliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
