package controlador.emisionProducto;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.emisionproducto.ModeloEmisionProducto;



/**
 * Servlet implementation class CrearEmisionProducto
 */
@WebServlet("/crearEmisionProducto")
public class CrearEmisionProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearEmisionProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormValidador valitator = new FormValidador();
		ModeloEmisionProducto modeloEmisionProducto = new ModeloEmisionProducto();
		
		int idProducto = Integer.parseInt(request.getParameter("id_producto"));
	    Date fecha = Date.valueOf(request.getParameter("fecha"));
	    Double emision_generada = Double.parseDouble(request.getParameter("emision_generada"));
	   
	    if (valitator.emisionProductoValido(idProducto,fecha)) {
	    	modeloEmisionProducto.crearEmisionProducto(idProducto,fecha);
	    	
	    	request.setAttribute("msg", "created");
	    	request.getRequestDispatcher("VerEmisiones").forward(request, response);			
		} else {
	    	request.setAttribute("msg", "no_valid_data");
	    	request.getRequestDispatcher("VerEmisiones").forward(request, response);
		}
	    
//	    response.sendRedirect("/Garbigune_reto/VerEmisiones");
	}

}
