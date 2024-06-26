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
		FormValidador valitator = new FormValidador();
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		
		String nombreProveedor = (String) request.getParameter("nombre");
		nombreProveedor = nombreProveedor.contains("+") ? nombreProveedor.replaceAll("+", " "):nombreProveedor;
		String correo = (String) request.getParameter("correo");
		correo = correo.contains("%40") ? correo.replaceAll("%40", "@"):correo;
		String contraseņa = (String) request.getParameter("contrasena");
		contraseņa = contraseņa.contains("+")? contraseņa.replaceAll("+", " "):contraseņa;
		
		if (valitator.proveedorValido(nombreProveedor,correo,contraseņa)) {
			modelo_proveedor.crearProveedor(nombreProveedor,correo,contraseņa);
			request.setAttribute("msg", "created");
			request.getRequestDispatcher("VerProveedores").forward(request, response);
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("VerProveedores").forward(request, response);
		}		
//		response.sendRedirect("/Garbigune_reto/VerProveedores");
	}

}
