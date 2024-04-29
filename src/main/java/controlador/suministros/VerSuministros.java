package controlador.suministros;

import java.io.IOException;
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
import modelo.suministro.Suministro;

/**
 * Servlet implementation class VerSuministros
 */
@WebServlet("/VerSuministros")
public class VerSuministros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerSuministros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloSuministro modelo_suministro = new ModeloSuministro();
		ArrayList<Suministro> suministros = modelo_suministro.getSuministros();

		request.setAttribute("suministros", suministros);

		/* TRAEMOS LOS LAS PLANTAS */
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ArrayList<Planta> plantas = modelo_planta.getPlantas();
		request.setAttribute("plantas", plantas);

		/* TRAEMOS LOS LAS PROVEEDORES */
		ModeloProveedor modelo_proveedor = new ModeloProveedor();

		ArrayList<Proveedor> proveedores = modelo_proveedor.getProveedores();
		request.setAttribute("proveedores", proveedores);

		/* TRAEMOS LOS LOS MATERIALES */
		ModeloMaterial modelo_material = new ModeloMaterial();
		ArrayList<Material> materiales = modelo_material.getMateriales();

		request.setAttribute("materiales", materiales);

//		System.out.println(proveedores);
		request.getRequestDispatcher("Paneles_control/Admin/suministros.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
