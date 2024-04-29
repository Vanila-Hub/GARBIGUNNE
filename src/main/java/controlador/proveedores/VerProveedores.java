package controlador.proveedores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.proveedor.ModeloProveedor;
import modelo.proveedor.Proveedor;



/**
 * Servlet implementation class VerProveedores
 */
@WebServlet("/VerProveedores")
public class VerProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerProveedores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		
		ArrayList<Proveedor> proveedores = modelo_proveedor.getProveedores(); 
		request.setAttribute("proveedores", proveedores);

		request.getRequestDispatcher("Paneles_control/Admin/proveedores.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
