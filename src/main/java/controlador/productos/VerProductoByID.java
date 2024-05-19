package controlador.productos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

/*
 *Este servlet sive los productos cuyo ID de producto coincida con la id de producto recibido como parametro en la URl, y con el google Object Notatio (Gson) convierte el objeto de java a un objeto para el lenjuage 
 * de javaScript (JSON) ya que es de donde se estan haciendo las peticiones asincronas usando AJAX. 
 * */

/**
 * Servlet implementation class VerProductoByID
 */
@WebServlet("/getProductoByID")
public class VerProductoByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerProductoByID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idProducto = Integer.parseInt(request.getParameter("id_producto"));
        
        ModeloProducto modeloProducto = new ModeloProducto();
        Producto producto = modeloProducto.getProductoByID(idProducto);

        Gson gson = new Gson();
        String jsonProducto = gson.toJson(producto);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonProducto);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
