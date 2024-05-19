package controlador.planta;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelo.material.Material;
import modelo.material.ModeloMaterial;

/*
 *Este serlvel sive los Materiales cuyo ID_Planta coincida con la id de planta recibido como parametro en la URl, y con el google Object Notatio (Gson) convierte el objeto de java a un objeto para el lenjuage 
 * de javaScript (JSON) ya que es de donde se estan haciendo las peticiones asincronas usando AJAX. 
 * */

/**
 * Servlet implementation class PlantaMateriales
 */
@WebServlet("/PlantaMateriales")
public class PlantaMateriales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlantaMateriales() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_planta = Integer.parseInt(request.getParameter("id_planta"));
		ModeloMaterial modelo_material = new ModeloMaterial();
		ArrayList<Material> materiles_planta =  modelo_material.getMaterialByPlanta(id_planta);
		Gson gson = new Gson();
		String jsonPlantasYsusMateriales = gson.toJson(materiles_planta);

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonPlantasYsusMateriales);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
