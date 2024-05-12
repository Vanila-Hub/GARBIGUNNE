package controlador.ventas;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.ventas.ModeloVenta;


/**
 * Servlet implementation class CrearVentas
 */
@WebServlet("/crearVenta")
public class CrearVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearVentas() {
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
		FormValidador valitator = new FormValidador();
		int id_producto = Integer.parseInt(request.getParameter("id_producto"));
		int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
		double cantidad2 = Double.parseDouble(request.getParameter("cantidad"));
		Date fecha2 = Date.valueOf(request.getParameter("fecha"));
		
		if (valitator.VentaValida(id_producto,id_cliente,cantidad2,fecha2)) {
			ModeloVenta modelo_venta = new ModeloVenta();
			modelo_venta.crearVenta(id_cliente, id_producto, cantidad2, fecha2);
			
			request.setAttribute("msg", "created");
			request.getRequestDispatcher("VerVentas").forward(request, response);
			
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("VerVentas").forward(request, response);
		}
		
//		response.sendRedirect("/Garbigune_reto/VerVentas");
	}

}
