package controlador;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.EmisionProducto;
import modelo.Material;
import modelo.ModeloEmisionProducto;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProducto;
import modelo.Planta;
import modelo.Producto;

@WebServlet("/emisionProducto")
public class Garbigunne_Admin_EmisionProducto_View extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Garbigunne_Admin_EmisionProducto_View() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ModeloEmisionProducto modelo_emisiones = new ModeloEmisionProducto();
		ArrayList<EmisionProducto> EmisionProductos = modelo_emisiones.getEmisionesProductos();
		System.out.println(EmisionProductos);
		ModeloProducto modelo_productos = new ModeloProducto();
		ArrayList<Producto> productos = modelo_productos.getProductos();

		// pedir materiales
		ModeloMaterial modelo_material = new ModeloMaterial();
		ArrayList<Material> materiales = modelo_material.getMateriales();

		// mandarlo al jsp de emisines plantas
		request.setAttribute("materiales", materiales);
		request.setAttribute("productos", productos);
		request.setAttribute("emisionesProductos", EmisionProductos);
		request.getRequestDispatcher("Paneles_control/Admin/emisionProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
