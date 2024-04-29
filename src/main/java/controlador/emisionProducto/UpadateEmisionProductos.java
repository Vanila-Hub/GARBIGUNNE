package controlador.emisionProducto;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.emisionproducto.ModeloEmisionProducto;



/**
 * Servlet implementation class UpadateEmisionProductos
 */
@WebServlet("/updateEmisionProducto")
public class UpadateEmisionProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpadateEmisionProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idEmision = Integer.parseInt(request.getParameter("id_emision"));
        int idProducto = Integer.parseInt(request.getParameter("id_producto"));
        int idMaterial = Integer.parseInt(request.getParameter("id_material"));
        Date fecha = Date.valueOf(request.getParameter("fecha"));
        
        ModeloEmisionProducto modelo_emision_producto = new ModeloEmisionProducto();
        modelo_emision_producto.actualizarEmisionProducto(idEmision, idProducto, idMaterial, idEmision, fecha);
        
        response.sendRedirect("/Garbigune_reto/VerEmisiones");
	}

}
