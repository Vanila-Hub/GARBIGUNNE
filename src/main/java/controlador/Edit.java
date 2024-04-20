package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Material;
import modelo.ModeloMaterial;
import modelo.ModeloPlanta;
import modelo.Planta;

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

		default:
			break;
		}		
	}

}
