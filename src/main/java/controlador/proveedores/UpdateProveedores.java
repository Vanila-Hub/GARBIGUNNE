package controlador.proveedores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
import modelo.proveedor.ModeloProveedor;



/**
 * Servlet implementation class UpdateProveedores
 */
@WebServlet("/updateProveedor")
public class UpdateProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProveedores() {
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
		int activo = -1;
		int id_proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
		
		String nombreProveedor = (String) request.getParameter("nombre");
		nombreProveedor = nombreProveedor.contains("+") ? nombreProveedor.replaceAll("+", " "):nombreProveedor;
		
		String correo = (String) request.getParameter("correo");
		correo = correo.contains("%40") ? correo.replaceAll("%40", "@"):correo;
		
		String contraseña = (String) request.getParameter("contrasena");
		contraseña = contraseña.contains("+")? contraseña.replaceAll("+", " "):contraseña;
		
		String habilitado = (String) (request.getParameter("habilitado"));
		if (valitator.estadoValido(habilitado)) {
			activo = 1;
		} else {
			activo = 0;
		}
		
		if (valitator.proveedorValido(nombreProveedor, correo, contraseña)) {
			ModeloProveedor modelo_proveedor = new ModeloProveedor();
			modelo_proveedor.actualizarProveedor(id_proveedor,nombreProveedor,correo,contraseña,activo);
			
			request.setAttribute("msg", "updated");
			request.getRequestDispatcher("VerProveedores").forward(request, response);
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("VerProveedores").forward(request, response);
		}
//		response.sendRedirect("/Garbigune_reto/VerProveedores");
	}

}
