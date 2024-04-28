package controlador.emisionproducto;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.emisionproducto.EmisionProducto;
import modelo.emisionproducto.ModeloEmisionProducto;
import modelo.material.Material;
import modelo.material.ModeloMaterial;
import modelo.productos.ModeloProducto;
import modelo.productos.Producto;

/**
 * Servlet implementation class EditarEmisionProducto
 */
@WebServlet("/editarEmisionProducto")
public class EditarEmisionProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarEmisionProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
