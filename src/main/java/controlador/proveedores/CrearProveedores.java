package controlador.proveedores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.proveedor.ModeloProveedor;



/**
 * Servlet implementation class CrearProveedores
 */
@WebServlet("/crearProveedor")
public class CrearProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProveedores() {
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
		String nombreProveedor = (String) request.getParameter("nombre");
		nombreProveedor = nombreProveedor.contains("+") ? nombreProveedor.replaceAll("+", " "):nombreProveedor;
		
		String correo = (String) request.getParameter("correo");
		correo = correo.contains("%40") ? correo.replaceAll("%40", "@"):correo;
		
		String contraseña = (String) request.getParameter("contrasena");
		contraseña = contraseña.contains("+")? contraseña.replaceAll("+", " "):contraseña;
		
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		modelo_proveedor.crearProveedor(nombreProveedor,correo,contraseña);
		
		response.sendRedirect("/Garbigune_reto/VerProveedores");
	}

}
