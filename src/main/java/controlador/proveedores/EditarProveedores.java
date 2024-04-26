package controlador.proveedores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.proveedor.ModeloProveedor;
import modelo.proveedor.Proveedor;


/**
 * Servlet implementation class EditarProveedores
 */
@WebServlet("/editarProveedor")
public class EditarProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProveedores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
		//lalam al modelo para insert
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		Proveedor proveedor =  modelo_proveedor.getProveedorByID(id_proveedor);
		
		request.setAttribute("id_proveedor", proveedor.getId_proveedor());
		request.setAttribute("nombre", proveedor.getNombre());
		request.setAttribute("correo", proveedor.getCorreo());
		request.setAttribute("contrasena", proveedor.getContraseña());
		
		request.getRequestDispatcher("Paneles_control/Admin/Edit_proveedor.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
