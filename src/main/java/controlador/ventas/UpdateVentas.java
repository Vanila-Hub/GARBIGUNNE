package controlador.ventas;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ventas.ModeloVenta;


/**
 * Servlet implementation class UpdateVentas
 */
@WebServlet("/updateVenta")
public class UpdateVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateVentas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_venta = Integer.parseInt(request.getParameter("id_venta"));
		int idCliente = Integer.parseInt(request.getParameter("id_cliente"));
		int id_Producto = Integer.parseInt(request.getParameter("id_producto"));
		int Cantidad = Integer.parseInt(request.getParameter("cantidad"));
		Date fecha = Date.valueOf(request.getParameter("fecha"));

		ModeloVenta modelo_venta = new ModeloVenta();
		modelo_venta.actualizar(id_venta,idCliente, id_Producto, Cantidad, fecha);
		
		response.sendRedirect("/Garbigune_reto/VerVentas");
	}

}
