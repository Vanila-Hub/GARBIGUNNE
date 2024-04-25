package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import modelo.Material;
import modelo.ModeloCliente;
import modelo.ModeloMaterial;

/**
 * Servlet implementation class Garbigunne_Admin_Clientes_View
 */
@WebServlet("/clientes")
public class Garbigunne_Admin_Clientes_View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Admin_Clientes_View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// pedir Clientes
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
