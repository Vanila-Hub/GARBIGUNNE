package controlador;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloCliente;
import modelo.ModeloEmisionProducto;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProducto;
import modelo.ModeloProveedor;
import modelo.ModeloSuministro;
import modelo.ModeloVenta;

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
			
//		case "material":	
//			String tipo_material = (String) request.getParameter("material");
//			int emision_kg = Integer.parseInt(request.getParameter("emision_kg"));
//			
//			ModeloMaterial modelo_material = new ModeloMaterial();
//			modelo_material.crearMaterial(tipo_material, emision_kg);
//			
//			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
//				break;
//			
//		case "cliente":
//			//llemos los parametro nombre,apellido,usurio,contraseña y se verifica si tiene '+' en el valor del parametro si es asi se remplaza por un espacio
//			
//			String nombreCliente = (String) request.getParameter("nombre");
//			nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;
//			
//			String apellido = (String) request.getParameter("apellido");
//			apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;
//			
//			String usuario = (String) request.getParameter("usuario");
//			usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
//			
//			
//			String contrasena = (String) request.getParameter("contrasena");
//			contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
//			
//			ModeloCliente modelo_cliente = new ModeloCliente();
//			modelo_cliente.crearCliente(nombreCliente,apellido,usuario,contrasena);
//			
//			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=cliente");
//			break;
			
//		case "proveedor":
//			//llemos los parametro nombre,apellido,usurio,contraseña y se verifica si tiene '+' en el valor del parametro si es asi se remplaza por un espacio
//			
//			String nombreProveedor = (String) request.getParameter("nombre");
//			nombreProveedor = nombreProveedor.contains("+") ? nombreProveedor.replaceAll("+", " "):nombreProveedor;
//			
//			String correo = (String) request.getParameter("correo");
//			correo = correo.contains("%40") ? correo.replaceAll("%40", "@"):correo;
//			
//			String contraseña = (String) request.getParameter("contrasena");
//			contraseña = contraseña.contains("+")? contraseña.replaceAll("+", " "):contraseña;
//			
//			ModeloProveedor modelo_proveedor = new ModeloProveedor();
//			modelo_proveedor.crearProveedor(nombreProveedor,correo,contraseña);
//			
//			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=proveedores");
//			break;

//		case "suministro":
//			
//			int id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
//			int id_Planta = Integer.parseInt(request.getParameter("id_planta"));
//			int id_Material = Integer.parseInt(request.getParameter("id_material"));
//			double cantidad = Double.parseDouble(request.getParameter("cantidad"));
//			String mes = (String) request.getParameter("mes");
//			
//			System.out.println(cantidad);
//			ModeloSuministro modelo_suministro = new ModeloSuministro();
//			modelo_suministro.crearSuministro(id_Material,id_Proveedor,id_Planta,mes,cantidad);
//			
//			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=suministros");
//			break;
			
		case "producto":
			String carpetaHome = "http://localhost:8080/Garbigune_reto/ProductosIMG/";
			
		    String nombreProducto = request.getParameter("nombre");
		    nombreProducto = nombreProducto.contains("+")? nombreProducto.replaceAll("+", " "):nombreProducto;
		    
		    String descripcion = request.getParameter("descripcion");
		    descripcion = descripcion.contains("+")? descripcion.replaceAll("+", " "): descripcion;
		    
		    String rutaImagen = request.getParameter("imagen");
		    carpetaHome= carpetaHome + rutaImagen;
		    
		    double peso = Double.parseDouble(request.getParameter("peso_producto"));
		    double precio = Double.parseDouble(request.getParameter("precio"));
		    
		    
		    int stock = Integer.parseInt(request.getParameter("stock"));
		    int idPlanta = Integer.parseInt(request.getParameter("planta"));
		    int id_material = Integer.parseInt(request.getParameter("material"));
		    
		    
		    ModeloProducto modeloProducto = new ModeloProducto();
		    modeloProducto.crearProducto(nombreProducto, peso, precio, descripcion, stock, idPlanta, carpetaHome,id_material);
	
		    response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=productos");
		    break;
		    
		case "emision":
		    int idProducto = Integer.parseInt(request.getParameter("id_producto"));
		    Date fecha = Date.valueOf(request.getParameter("fecha"));
		   
		    
		    ModeloEmisionProducto modeloEmisionProducto = new ModeloEmisionProducto();
		    
		    modeloEmisionProducto.crearEmisionProducto(idProducto,fecha);
		    
		    response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=emisiones");
		    break;
		case "venta":
			int id_producto = Integer.parseInt(request.getParameter("id_producto"));
			int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
			int cantidad2 = Integer.parseInt(request.getParameter("cantidad"));
			Date fecha2 = Date.valueOf(request.getParameter("fecha"));
			

			
			ModeloVenta modelo_venta = new ModeloVenta();
			modelo_venta.crearVenta(id_cliente, id_producto, cantidad2, fecha2);
		
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=venta");
			break;
			
		default:
			break;
		}
		
	}

}
