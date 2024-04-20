package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import modelo.Material;
import modelo.ModeloCliente;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProveedor;
import modelo.Planta;
import modelo.Proveedor;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = (String) request.getParameter("opcion");
		System.out.println(opcion);
		switch (opcion) {
		case "planta":
			int id_planta = Integer.parseInt(request.getParameter("id"));
			//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			Planta planta = modelo_planta.getPlantaByID(id_planta);
			//volvera el /plantas
			request.setAttribute("nombre", planta.getNombre());
			request.setAttribute("direccion", planta.getDireccion());
			request.setAttribute("telefono", planta.getTelefono());
			request.setAttribute("id", planta.getId());
			
			request.getRequestDispatcher("Paneles_control/Admin/Edit_planta.jsp").forward(request, response);
			break;
		case "material":
			int id_material = Integer.parseInt(request.getParameter("id_material"));
			//lalam al modelo para inser
			ModeloMaterial modeloMaterial = new ModeloMaterial();
			Material material = modeloMaterial.getMaterialByID(id_material);
			//volvera el /plantas y gfuardar sus atributos
			request.setAttribute("tipo_material", material.getTipo());
			request.setAttribute("emision_kg", material.getEmision_kg());
			request.setAttribute("id", material.getId_material());
			
			request.getRequestDispatcher("Paneles_control/Admin/Edit_material.jsp").forward(request, response);
			break;

		case "cliente":
			int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
			//lalam al modelo para inser
			ModeloCliente modelo_cliente = new ModeloCliente();
			
			Cliente cliente = modelo_cliente.getClientelByID(id_cliente);
			//volvera el /plantas y gfuardar sus atributos
			request.setAttribute("nombre", cliente.getNombre());
			request.setAttribute("apellido", cliente.getApellido());
			request.setAttribute("usuario", cliente.getUsuario());
			request.setAttribute("contrasena", cliente.getContrasena());
			request.setAttribute("id_cliente", cliente.getId_cliente());
	
			request.getRequestDispatcher("Paneles_control/Admin/Edit_cliente.jsp").forward(request, response);
			break;
		case "rol":
			int id_usuario = Integer.parseInt(request.getParameter("id_cliente"));
			//lalam al modelo para inser
			ModeloCliente modeloCliente = new ModeloCliente();
			
			Cliente usuarioRol = modeloCliente.getClientelByID(id_usuario);
			//volvera el /plantas y gfuardar sus atributos
			request.setAttribute("nombre", usuarioRol.getNombre());
			request.setAttribute("apellido", usuarioRol.getApellido());
			request.setAttribute("usuario", usuarioRol.getUsuario());
			request.setAttribute("contrasena", usuarioRol.getContrasena());
			request.setAttribute("id_cliente", usuarioRol.getId_cliente());
			
			request.getRequestDispatcher("Paneles_control/Admin/Edit_cliente.jsp").forward(request, response);
			break;
			
		case "proveedor":
			int id_proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
			//lalam al modelo para insert
			ModeloProveedor modelo_proveedor = new ModeloProveedor();
			Proveedor proveedor =  modelo_proveedor.getProveedorByID(id_proveedor);
			
			request.setAttribute("id_proveedor", proveedor.getId_proveedor());
			request.setAttribute("nombre", proveedor.getNombre());
			request.setAttribute("correo", proveedor.getCorreo());
			request.setAttribute("contrasena", proveedor.getContraseña());
			
			request.getRequestDispatcher("Paneles_control/Admin/Edit_proveedor.jsp").forward(request, response);
			break;
			
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String opcion = (String) request.getParameter("opcion");
		System.out.println(opcion);
		switch (opcion) {
		case "planta":
			String nombre = (String) request.getParameter("nombre");
			String dirrecion = (String) request.getParameter("direccion");
			String telefono = (String) request.getParameter("telefono");
			int id_planta = Integer.parseInt(request.getParameter("id_planta"));
			System.out.println(nombre+dirrecion+telefono+id_planta);
			//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			modelo_planta.actualizar(nombre,dirrecion,telefono,id_planta);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=planta");
			break;
			
			
		case "material":
			int id_material = Integer.parseInt(request.getParameter("id_material"));
			String tipo_material = (String) request.getParameter("material");
			int emison_kg = Integer.parseInt(request.getParameter("emision_kg"));
			
			System.out.println(id_material+"nhhhoi"+tipo_material+emison_kg);
			//lalam al modelo para inser
			ModeloMaterial modelo_material = new ModeloMaterial();
			modelo_material.actualizarMaterial(emison_kg,tipo_material,id_material);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
			break;

		case "cliente":
			int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
			String nombreCliente = (String) request.getParameter("nombre");
			nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;
			
			String apellido = (String) request.getParameter("apellido");
			apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;
			
			String usuario = (String) request.getParameter("usuario");
			usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
			
			
			String contrasena = (String) request.getParameter("contrasena");
			contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
			
			ModeloCliente modelo_cliente = new ModeloCliente();
			modelo_cliente.actualizarCliente(nombreCliente,apellido,usuario,contrasena,id_cliente);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=cliente");
			break;

			
		case "proveedor":
			
			int id_proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
			
			String nombreProveedor = (String) request.getParameter("nombre");
			nombreProveedor = nombreProveedor.contains("+") ? nombreProveedor.replaceAll("+", " "):nombreProveedor;
			
			String correo = (String) request.getParameter("correo");
			correo = correo.contains("%40") ? correo.replaceAll("%40", "@"):correo;
			
			String contraseña = (String) request.getParameter("contrasena");
			contraseña = contraseña.contains("+")? contraseña.replaceAll("+", " "):contraseña;
			
			ModeloProveedor modelo_proveedor = new ModeloProveedor();
			
			modelo_proveedor.actualizarProveedor(id_proveedor,nombreProveedor,correo,contraseña);
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=proveedores");
			break;
			
		default:
			break;
		}		
	}

}
