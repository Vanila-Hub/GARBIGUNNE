package controlador.suministros;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.material.Material;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;
import modelo.proveedor.ModeloProveedor;
import modelo.proveedor.Proveedor;
import modelo.suministro.ModeloSuministro;

/**
 * Servlet implementation class CrearSuministros
 */
@WebServlet("/crearSuministro")
public class CrearSuministros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearSuministros() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
		int id_Planta = Integer.parseInt(request.getParameter("id_planta"));
		int id_Material = Integer.parseInt(request.getParameter("id_material"));
		double cantidad = Double.parseDouble(request.getParameter("cantidad"));
		String mes = (String) request.getParameter("mes");
		
		
		ModeloSuministro modelo_suministro = new ModeloSuministro();
		modelo_suministro.crearSuministro(id_Material,id_Proveedor,id_Planta,mes,cantidad);
		
		response.sendRedirect("/Garbigune_reto/VerSuministros");
	}

}
