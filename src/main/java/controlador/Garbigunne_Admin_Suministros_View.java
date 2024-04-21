package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Material;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.ModeloProveedor;
import modelo.ModeloSuministro;
import modelo.Planta;
import modelo.Proveedor;
import modelo.Suministro;

/**
 * Servlet implementation class Garbigunne_Admin_Suministros
 */
@WebServlet("/suministros")
public class Garbigunne_Admin_Suministros_View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Garbigunne_Admin_Suministros_View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*TRAEMOS LOS SUMINISTRSOS*/
		
		ModeloSuministro modelo_suministro = new ModeloSuministro();
		ArrayList<Suministro> suministros = modelo_suministro.getSuministros();
		
		request.setAttribute("suministros", suministros);
		
		/*TRAEMOS LOS LAS PLANTAS  */
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ArrayList<Planta> plantas = modelo_planta.getPlantas();
		request.setAttribute("plantas", plantas);
		
		/*TRAEMOS LOS LAS PROVEEDORES */
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		
		ArrayList<Proveedor> proveedores = modelo_proveedor.getProveedores(); 
		request.setAttribute("proveedores", proveedores);
		
		/*TRAEMOS LOS LOS MATERIALES*/
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
