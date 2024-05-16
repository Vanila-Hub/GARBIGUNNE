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
 * Servlet implementation class EditarVentas
 */
@WebServlet("/editarVenta")
public class EditarVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarVentas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_venta = Integer.parseInt(request.getParameter("id_venta"));
		
		ModeloVenta modelo_venta = new ModeloVenta();
		Venta venta =  modelo_venta.getVentaByID(id_venta);
		
		ModeloCliente modelo_cliente = new ModeloCliente();
		ArrayList<Cliente> clientes = modelo_cliente.getClientes();
		
		ModeloProducto modelo_productos = new ModeloProducto();
		ArrayList<Producto> productos = modelo_productos.getProductos();
		
		request.setAttribute("clientes", clientes);
		request.setAttribute("productos", productos);
		
		request.setAttribute("id_venta", venta.getId_venta());
		request.setAttribute("id_Cliente", venta.getId_cliente());
		request.setAttribute("id_Producto", venta.getId_producto());
		request.setAttribute("Cantidad", venta.getCantidad());
		request.setAttribute("fecha", venta.getFecha());
		
		request.getRequestDispatcher("Paneles_control/Admin/Edit_venta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
