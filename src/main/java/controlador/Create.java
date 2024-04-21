package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloCliente;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProveedor;
import modelo.ModeloSuministro;

/**
 * Servlet implementation class Create
 */
@WebServlet("/create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
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
		String opcion = (String) request.getParameter("opcion");
		switch (opcion) {
		
		case "planta":
			String nombre = (String) request.getParameter("nombre");
			String dirrecion = (String) request.getParameter("direccion");
			String telefono = (String) request.getParameter("telefono");
			System.out.println(nombre+dirrecion+telefono);
			//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			modelo_planta.crearPlanta(nombre,dirrecion,telefono);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=planta");
			break;
			
		case "material":	
			String tipo_material = (String) request.getParameter("material");
			int emision_kg = Integer.parseInt(request.getParameter("emision_kg"));
			
			ModeloMaterial modelo_material = new ModeloMaterial();
			modelo_material.crearMaterial(tipo_material, emision_kg);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
			break;
			
		case "cliente":
			//llemos los parametro nombre,apellido,usurio,contraseņa y se verifica si tiene '+' en el valor del parametro si es asi se remplaza por un espacio
			
			String nombreCliente = (String) request.getParameter("nombre");
			nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;
			
			String apellido = (String) request.getParameter("apellido");
			apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;
			
			String usuario = (String) request.getParameter("usuario");
			usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
			
			
			String contrasena = (String) request.getParameter("contrasena");
			contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
			
			ModeloCliente modelo_cliente = new ModeloCliente();
			modelo_cliente.crearCliente(nombreCliente,apellido,usuario,contrasena);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=cliente");
			break;
			
		case "proveedor":
			//llemos los parametro nombre,apellido,usurio,contraseņa y se verifica si tiene '+' en el valor del parametro si es asi se remplaza por un espacio
			
			String nombreProveedor = (String) request.getParameter("nombre");
			nombreProveedor = nombreProveedor.contains("+") ? nombreProveedor.replaceAll("+", " "):nombreProveedor;
			
			String correo = (String) request.getParameter("correo");
			correo = correo.contains("%40") ? correo.replaceAll("%40", "@"):correo;
			
			String contraseņa = (String) request.getParameter("contrasena");
			contraseņa = contraseņa.contains("+")? contraseņa.replaceAll("+", " "):contraseņa;
			
			ModeloProveedor modelo_proveedor = new ModeloProveedor();
			modelo_proveedor.crearProveedor(nombreProveedor,correo,contraseņa);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=proveedores");
			break;

		case "suministro":
			
			int id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
			int id_Planta = Integer.parseInt(request.getParameter("id_planta"));
			int id_Material = Integer.parseInt(request.getParameter("id_material"));
			double cantidad = Double.parseDouble(request.getParameter("cantidad"));
			String mes = (String) request.getParameter("mes");
			
			System.out.println(cantidad);
			ModeloSuministro modelo_suministro = new ModeloSuministro();
			modelo_suministro.crearSuministro(id_Material,id_Proveedor,id_Planta,mes,cantidad);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=suministros");
			break;
			
		default:
			break;
		}
		
	}

}
