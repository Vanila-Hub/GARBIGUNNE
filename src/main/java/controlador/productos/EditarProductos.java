package controlador.productos;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;
import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

/**
 * Servlet implementation class EditarProductos
 */
@WebServlet("/editarProducto")
public class EditarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProducto = Integer.parseInt(request.getParameter("id_producto"));
	    // Llamada al modelo para obtener el producto por su ID
	    ModeloProducto modeloProducto = new ModeloProducto();
	    Producto producto = modeloProducto.getProductoByID(idProducto);

	    /* TRAEMOS LAS PLANTAS */
	    ModeloPlanta modelo_Planta = new ModeloPlanta();
	    ArrayList<Planta> Plantas = modelo_Planta.getPlantas();

	    request.setAttribute("plantas", Plantas);
	    request.setAttribute("producto", producto);
	    request.getRequestDispatcher("Paneles_control/Admin/Edit_producto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
