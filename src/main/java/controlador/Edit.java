package controlador;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import modelo.EmisionProducto;
import modelo.Material;
import modelo.ModeloCliente;
import modelo.ModeloEmisionProducto;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProducto;
import modelo.ModeloProveedor;
import modelo.ModeloSuministro;
import modelo.ModeloVenta;
import modelo.Planta;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Suministro;
import modelo.Venta;

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
//		System.out.println(opcion);
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
//		case "material":
//			int id_material = Integer.parseInt(request.getParameter("id_material"));
//			//lalam al modelo para inser
//			ModeloMaterial modeloMaterial = new ModeloMaterial();
//			Material material = modeloMaterial.getMaterialByID(id_material);
//			//volvera el /plantas y gfuardar sus atributos
//			request.setAttribute("tipo_material", material.getTipo());
//			request.setAttribute("emision_kg", material.getEmision_kg());
//			request.setAttribute("id", material.getId_material());
//			
//			request.getRequestDispatcher("Paneles_control/Admin/Edit_material.jsp").forward(request, response);
//			break;

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
			
		case "suministro":
			int id_suministro = Integer.parseInt(request.getParameter("id_suministro"));
			//lalam al modelo para insert
			ModeloSuministro modelo_suministro = new ModeloSuministro();
			Suministro suministro = modelo_suministro.getSuministroByID(id_suministro);

			
			/*TRAEMOS LOS LAS PLANTAS  */
			ModeloPlanta modeloPlanta = new ModeloPlanta();
			ArrayList<Planta> plantas = modeloPlanta.getPlantas();
			
			/*TRAEMOS LOS LAS PROVEEDORES */
			ModeloProveedor modeloProveedor = new ModeloProveedor();
			
			ArrayList<Proveedor> proveedores = modeloProveedor.getProveedores(); 
			
			/*TRAEMOS LOS LOS MATERIALES*/
			ModeloMaterial modelo_material = new ModeloMaterial();
			ArrayList<Material> materiales = modelo_material.getMateriales();
			
			
			request.setAttribute("plantas", plantas);
			request.setAttribute("proveedores", proveedores);
			request.setAttribute("materiales", materiales);
			request.setAttribute("id_suministro", suministro.getId_suministro());
			request.setAttribute("id_proveedor", suministro.getId_proveedor());
			request.setAttribute("id_planta", suministro.getId_planta());
			request.setAttribute("id_material", suministro.getId_material());
			request.setAttribute("cantidad", suministro.getCantidad_kg());
			request.setAttribute("mes", suministro.getMes());
			
			System.out.println(suministro.getId_planta());
			request.getRequestDispatcher("Paneles_control/Admin/Edit_suministro.jsp").forward(request, response);
			break;
			
		case "producto":
		    int idProducto = Integer.parseInt(request.getParameter("id_producto"));
		    // Llamada al modelo para obtener el producto por su ID
		    ModeloProducto modeloProducto = new ModeloProducto();
		    Producto producto = modeloProducto.getProductoByID(idProducto);

		    /* TRAEMOS LAS PLANTAS */
		    ModeloPlanta modelo_Planta = new ModeloPlanta();
		    ArrayList<Planta> Plantas = modelo_Planta.getPlantas();

		    request.setAttribute("plantas", Plantas);
		    request.setAttribute("producto", producto);
		    request.getRequestDispatcher("Paneles_control/Admin/Edit_producto.jsp").forward(request, response);
		    break;
		    
		case "emision":
			int idEmisionProducto = Integer.parseInt(request.getParameter("id_emision"));

			ModeloEmisionProducto modeloEmisionProducto = new ModeloEmisionProducto();
			EmisionProducto emisionProducto = modeloEmisionProducto.getEmisionProductoByID(idEmisionProducto);

			ModeloEmisionProducto modelo_emisiones = new ModeloEmisionProducto();
			ArrayList<EmisionProducto> EmisionProductos = modelo_emisiones.getEmisionesProductos();

			ModeloProducto modelo_productos = new ModeloProducto();
			ArrayList<Producto> productos = modelo_productos.getProductos();

			// pedir materiales
			ModeloMaterial modelo_Material = new ModeloMaterial();
			ArrayList<Material> materialEmision = modelo_Material.getMateriales();

			// mandarlo al jsp de emisines plantas
			request.setAttribute("id_emision", emisionProducto.getId_emision());
			request.setAttribute("id_producto", emisionProducto.getId_producto());
			request.setAttribute("emision_generada", emisionProducto.getEmision_generada());
			request.setAttribute("fecha", emisionProducto.getFecha());

			request.setAttribute("materiales", materialEmision);
			request.setAttribute("productos", productos);
			
			request.getRequestDispatcher("Paneles_control/Admin/Edit_emisionProducto.jsp").forward(request, response);
			break;
		case "venta":
			int id_venta = Integer.parseInt(request.getParameter("id_venta"));
			
			ModeloVenta modelo_venta = new ModeloVenta();
			Venta venta =  modelo_venta.getVentaByID(id_venta);
			
			request.setAttribute("id_venta", venta.getId_venta());
			request.setAttribute("id_Cliente", venta.getId_cliente());
			request.setAttribute("id_Producto", venta.getId_producto());
			request.setAttribute("Cantidad", venta.getCantidad());
			request.setAttribute("fecha", venta.getFecha());
			
			request.getRequestDispatcher("Paneles_control/Admin/Edit_venta.jsp").forward(request, response);
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
			UpdatePlanta(request, response);
			break;
			
			
		case "material":
			UpdateMaterial(request, response);
			break;

		case "cliente":
			
			int id_CLiente = Integer.parseInt(request.getParameter("id_cliente"));
			String nombreCliente = (String) request.getParameter("nombre");
			nombreCliente = nombreCliente.contains("+")?nombreCliente.replaceAll("+", " "):nombreCliente;
			
			String apellido = (String) request.getParameter("apellido");
			apellido = apellido.contains("+")?apellido.replaceAll("+", " "): apellido;
			
			String usuario = (String) request.getParameter("usuario");
			usuario = usuario.contains("%40")?usuario.replaceAll("%40", "@"):usuario;
			
			
			String contrasena = (String) request.getParameter("contrasena");
			contrasena = contrasena.contains("+")?contrasena.replaceAll("+", " "):contrasena;
			
			ModeloCliente modelo_cliente = new ModeloCliente();
			modelo_cliente.actualizarCliente(nombreCliente,apellido,usuario,contrasena,id_CLiente);
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

		case "suministro":
			
			int id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
			int id_Planta = Integer.parseInt(request.getParameter("id_planta"));
			int id_Material = Integer.parseInt(request.getParameter("id_material"));
			int id_suministro = Integer.parseInt(request.getParameter("id_suministro"));
			double cantidad = Double.parseDouble(request.getParameter("cantidad"));
			String mes = (String) request.getParameter("mes");
			
			ModeloSuministro modelo_suministro = new ModeloSuministro();
			
			modelo_suministro.actualizarSuministroByID(id_Material,id_Proveedor,id_Planta,id_suministro,mes,cantidad);
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=suministros");
			break;
			
		case "producto":
			String carpetaHome = "/Garbigune_reto/ProductosIMG/";
			String nombreProducto = request.getParameter("nombre");
		    nombreProducto = nombreProducto.contains("+")? nombreProducto.replaceAll("+", " "):nombreProducto;
		    
		    double peso = Double.parseDouble(request.getParameter("peso_producto"));
		    double precio = Double.parseDouble(request.getParameter("precio"));
		    
		    String descripcion = request.getParameter("descripcion");
		    descripcion = descripcion.contains("+")? descripcion.replaceAll("+", " "): descripcion;
		    
		    int stock = Integer.parseInt(request.getParameter("stock"));
		    int idPlanta = Integer.parseInt(request.getParameter("planta"));
		    int id_producto = Integer.parseInt(request.getParameter("id_producto"));
		    
		    String rutaImagen = request.getParameter("imagen");
		    carpetaHome= carpetaHome + rutaImagen;

		    ModeloProducto modeloProducto = new ModeloProducto();
		    modeloProducto.actualizarProductoByID(id_producto, nombreProducto, peso, precio, descripcion, stock, idPlanta, carpetaHome);

		    response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=productos");
		    break;
		case "venta":
			
			int id_venta = Integer.parseInt(request.getParameter("id_venta"));
			int idCliente = Integer.parseInt(request.getParameter("id_cliente"));
			int id_Producto = Integer.parseInt(request.getParameter("id_producto"));
			int Cantidad = Integer.parseInt(request.getParameter("cantidad"));
			Date fecha = Date.valueOf(request.getParameter("fecha"));
			System.out.println(idCliente);
			ModeloVenta modelo_venta = new ModeloVenta();
			modelo_venta.actualizar(id_venta,idCliente, id_Producto, Cantidad, fecha);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=venta");
			
			break;
			
		default:
			break;
		}		
	}

	private void UpdateMaterial(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id_material = Integer.parseInt(request.getParameter("id_material"));
		String tipo_material = (String) request.getParameter("material");
		int emison_kg = Integer.parseInt(request.getParameter("emision_kg"));
		
		System.out.println(id_material+"nhhhoi"+tipo_material+emison_kg);
		//lalam al modelo para inser
		ModeloMaterial modelo_material = new ModeloMaterial();
		modelo_material.actualizarMaterial(emison_kg,tipo_material,id_material);
		//volvera el /plantas
		response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
	}

	private void UpdatePlanta(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
	}

}
