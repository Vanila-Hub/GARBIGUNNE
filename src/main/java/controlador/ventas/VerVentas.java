package controlador.ventas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.cliente.Cliente;
import modelo.cliente.ModeloCliente;
import modelo.productos.ModeloProducto;
import modelo.productos.Producto;
import modelo.ventas.ModeloVenta;
import modelo.ventas.Venta;



/**
 * Servlet implementation class VerVentas
 */
@WebServlet("/VerVentas")
public class VerVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerVentas() {
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
