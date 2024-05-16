package controlador.planta;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

/**
 * Servlet implementation class PlantaProductos
 */
@WebServlet("/PlantaProductos")
public class PlantaProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlantaProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_planta = Integer.parseInt(request.getParameter("id_planta"));
		
		ModeloProducto modelo_producto = new ModeloProducto();
		
		ArrayList<Producto> plantaProductos =  modelo_producto.getProductoByPlanta(id_planta);
	
		
		Gson gson = new Gson();
		String jsonPlantasYsusProductos = gson.toJson(plantaProductos);

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonPlantasYsusProductos);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
