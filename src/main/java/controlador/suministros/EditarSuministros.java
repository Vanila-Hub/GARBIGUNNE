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
 * Servlet implementation class EditarSuministros
 */
@WebServlet("/editarSuministro")
public class EditarSuministros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarSuministros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
