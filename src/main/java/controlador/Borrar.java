package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.IDebugRequestor;

import modelo.ModeloCliente;
import modelo.ModeloEmisionProducto;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProducto;
import modelo.ModeloProveedor;
import modelo.ModeloSuministro;
import modelo.ModeloVenta;

/**
 * Servlet implementation class Borrar
 */
@WebServlet("/Borrar")
public class Borrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Borrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = (String) request.getParameter("opcion");
		
		switch (opcion) {
		case "planta":	
			int id_planta = Integer.parseInt(request.getParameter("id"));
			
			//lalam al modelo para inser
			ModeloPlanta modelo_planta = new ModeloPlanta();
			modelo_planta.borrarPlantaByID(id_planta);
			//volvera el /plantas
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=planta");
			break;
//		case "material":
//			int id_material = Integer.parseInt(request.getParameter("id"));
//			
//			ModeloMaterial modelo_material = new ModeloMaterial();
//			modelo_material.borrarMaterialByID (id_material);
//			
//			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=materiales");
//			break;
			
		case "cliente":
			int id_cliente = Integer.parseInt(request.getParameter("id"));
			
			ModeloCliente modelo_cliente = new ModeloCliente();
			
			modelo_cliente.borrarClienteByID(id_cliente);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=cliente");
			break;
			
		case "proveedor":
			int id_proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
			
			ModeloProveedor modelo_proveedor = new ModeloProveedor();
			
			modelo_proveedor.borrarProveedorByID(id_proveedor);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=proveedores");
			break;

		case "suministro":
			int id_suminitro = Integer.parseInt(request.getParameter("id_suministro"));
			
			ModeloSuministro modelo_suministro = new ModeloSuministro();
			
			modelo_suministro.borrarSuministroByID(id_suminitro);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=suministros");
			break;
			
		case "producto":
		    int id_producto = Integer.parseInt(request.getParameter("id_producto"));
		    
		    ModeloProducto modelo_producto = new ModeloProducto();
		    
		    modelo_producto.borrarProductoByID(id_producto);
		    
		    response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=productos");
		    break;
		  
		case "emision":
		    int idEmision = Integer.parseInt(request.getParameter("id_emision"));
		    
		    ModeloEmisionProducto modeloEmisionProducto = new ModeloEmisionProducto();
		    
		    modeloEmisionProducto.eliminarEmisionProducto(idEmision);
		    
		    response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=emisiones");
		    break;
		case "venta":
			int id_venta = Integer.parseInt(request.getParameter("id"));
			
			ModeloVenta modelo_venta = new ModeloVenta();
			
			modelo_venta.borrarVentaByID(id_venta);
			
			response.sendRedirect("http://localhost:8080/Garbigune_reto/admin?peticion=venta");
			
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
