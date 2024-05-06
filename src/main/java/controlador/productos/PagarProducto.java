package controlador.productos;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.productos.ModeloProducto;
import modelo.ventas.ModeloVenta;

/**
 * Servlet implementation class PagarProducto
 */
@WebServlet("/Pagar")
public class PagarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PagarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
		int idProducto = Integer.parseInt(request.getParameter("id_producto"));
		int cantidad = 1;

		FormValidador valitator = new FormValidador();
		ModeloVenta modelo_venta = new ModeloVenta();
		
		if (valitator.CompraValida(id_cliente,idProducto)) {
			modelo_venta.registrarCompra(id_cliente,idProducto,cantidad);
		} else {
			response.sendRedirect("Garbigune_reto/Comprar?id_producto=" + idProducto + "&&" + "id_cliente=" + id_cliente);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
