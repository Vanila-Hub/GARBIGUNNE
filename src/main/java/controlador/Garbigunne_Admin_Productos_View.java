package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Material;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProducto;
import modelo.Planta;
import modelo.Producto;

/**
 * Servlet implementation class Garbigunne_Admin_Productos_View
 */
@WebServlet("/productos")
public class Garbigunne_Admin_Productos_View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Admin_Productos_View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		request.getRequestDispatcher("Paneles_control/Admin/productos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
