package controlador.productos;

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
import modelo.material.Material;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;
import modelo.productos.ModeloProducto;
import modelo.productos.Producto;
import modelo.ventas.ModeloVenta;
import modelo.ventas.Venta;


/**
 * Servlet implementation class VerPaginaProductos
 */
@WebServlet("/VerPaginaProductos")
public class VerPaginaProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerPaginaProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
		//si esque se envia un menjase de Compra hecha el serlet lo recibe como valor y lo envia al JSp de inicio para ver la pagiande prodtctos
		String msg = (String) request.getParameter("msg");

		ModeloCliente modelo_cliente = new ModeloCliente();
		ModeloProducto modelo_productos = new ModeloProducto();
		ModeloMaterial modelo_material = new ModeloMaterial();
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ModeloVenta modelo_venta = new ModeloVenta();
		FormValidador valitator = new FormValidador();

		
		
		Cliente cliente = modelo_cliente.getClientelByID(id_cliente);
		ArrayList<Producto> productos = modelo_productos.getProductos();
		ArrayList<Producto> productosCliente = modelo_productos.getProductosByVenta(id_cliente);
		ArrayList<Planta> plantas = modelo_planta.getPlantas();
		ArrayList<Venta> ComprasCliente = modelo_venta.getVentasByCliente(id_cliente);
		ArrayList<Material> materiales = modelo_material.getMateriales();
		
		//Validamos que tenga productos comprados, para no enviar un ArrayList vacio
		if (valitator.ComprasClienteValido(productosCliente)) {
			request.setAttribute("productosCliente", productosCliente);			
		}
		//mandarlo al jsp de Productos
		request.setAttribute("compras", ComprasCliente);
		request.setAttribute("materiales", materiales);
		request.setAttribute("plantas", plantas);
		request.setAttribute("productos", productos);
		request.setAttribute("nombre", cliente.getNombre());
		request.setAttribute("apellido", cliente.getApellido());
		request.setAttribute("usuario", cliente.getUsuario());
		request.setAttribute("contrasena", cliente.getContrasena());
		request.setAttribute("id_cliente", cliente.getId_cliente());
		request.setAttribute("rol", cliente.getRol());
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("Paneles_control/clienteProducto/indexProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
