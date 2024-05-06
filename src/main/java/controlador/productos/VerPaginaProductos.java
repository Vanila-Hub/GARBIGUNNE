package controlador.productos;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.cliente.Cliente;
import modelo.cliente.ModeloCliente;
import modelo.material.Material;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;
import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

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
		
		//lalam al modelo para inser
		ModeloCliente modelo_cliente = new ModeloCliente();
		Cliente cliente = modelo_cliente.getClientelByID(id_cliente);
		
		ModeloProducto modelo_productos = new ModeloProducto();
		
		ArrayList<Producto> productos = modelo_productos.getProductos();
		
		//Traer las plntas para 'poder crear poductos con plantas
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ArrayList<Planta> plantas = modelo_planta.getPlantas();
		
		// pedir materiales
		ModeloMaterial modelo_material = new ModeloMaterial();
		ArrayList<Material> materiales = modelo_material.getMateriales();
		
		//mandarlo al jsp de Productos
		request.setAttribute("materiales", materiales);
		request.setAttribute("plantas", plantas);
		request.setAttribute("productos", productos);
		//volvera el /productos  y guardar sus atributos
		request.setAttribute("nombre", cliente.getNombre());
		request.setAttribute("apellido", cliente.getApellido());
		request.setAttribute("usuario", cliente.getUsuario());
		request.setAttribute("contrasena", cliente.getContrasena());
		request.setAttribute("id_cliente", cliente.getId_cliente());
		request.setAttribute("rol", cliente.getRol());
		
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
