package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import modelo.ModeloCliente;
import modelo.ModeloProducto;
import modelo.ModeloVenta;
import modelo.Producto;
import modelo.Venta;

/**
 * Servlet implementation class Garbigunne_Admin_Ventas_View
 */
@WebServlet("/venta")
public class Garbigunne_Admin_Ventas_View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Admin_Ventas_View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloVenta modelo_venta = new ModeloVenta();
		ArrayList<Venta> ventas = modelo_venta.getVentas();
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		ArrayList<Cliente> clientes = modelo_cliente.getClientes();
		
		ModeloProducto modelo_productos = new ModeloProducto();
		ArrayList<Producto> productos = modelo_productos.getProductos();
		
		request.setAttribute("ventas", ventas);
		request.setAttribute("clientes", clientes);
		request.setAttribute("productos", productos);

		request.getRequestDispatcher("Paneles_control/Admin/venta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
