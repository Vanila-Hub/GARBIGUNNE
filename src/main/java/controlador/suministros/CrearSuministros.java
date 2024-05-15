package controlador.suministros;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formValidador.FormValidador;
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
	private static final String UPLOAD_DIRECTORY = "/ProductosIMG/"; // Carpeta donde se guardarán las imágenes

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
		
		FormValidador valitator = new FormValidador();
		ModeloSuministro modelo_suministro = new ModeloSuministro();
		
		int id_Proveedor = Integer.parseInt(request.getParameter("id_proveedor"));
		double cantidad = Double.parseDouble(request.getParameter("cantidad"));
		String mes = (String) request.getParameter("mes");

		String[] id_Plantas = request.getParameterValues("plantas");
		String[] id_Materiales = request.getParameterValues("materiales");

		if (valitator.camposSuministroValido(id_Plantas, id_Materiales)) {
			for (String id_Material : id_Materiales) {
				for (String id_Planta : id_Plantas) {
					if (valitator.suministroValido(id_Proveedor, Integer.parseInt(id_Planta),
							Integer.parseInt(id_Material), cantidad, mes)) {
						modelo_suministro.crearSuministro(Integer.parseInt(id_Material), id_Proveedor,
								Integer.parseInt(id_Planta), mes, cantidad);
					}
				}
			}
			request.setAttribute("msg", "created");
			request.getRequestDispatcher("VerSuministros").forward(request, response);
		} else {
			request.setAttribute("msg", "no_valid_data");
			request.getRequestDispatcher("VerSuministros").forward(request, response);
		}
		
	}

}
