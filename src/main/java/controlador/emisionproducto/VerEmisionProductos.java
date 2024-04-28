package controlador.emisionproducto;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.emisionproducto.EmisionProducto;
import modelo.emisionproducto.ModeloEmisionProducto;
import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

/**
 * Servlet implementation class VerEmisionProductos
 */
@WebServlet("/VerEmisiones")
public class VerEmisionProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerEmisionProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloEmisionProducto modelo_emisiones = new ModeloEmisionProducto();
		ArrayList<EmisionProducto> EmisionProductos = modelo_emisiones.getEmisionesProductos();
	
		ModeloProducto modelo_productos = new ModeloProducto();
		ArrayList<Producto> productos = modelo_productos.getProductos();

		// mandarlo al jsp de emisines plantas
		request.setAttribute("productos", productos);
		request.setAttribute("emisionesProductos", EmisionProductos);
		request.getRequestDispatcher("Paneles_control/Admin/emisionProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
