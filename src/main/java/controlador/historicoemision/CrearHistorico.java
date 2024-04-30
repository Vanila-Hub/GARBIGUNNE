package controlador.historicoemision;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.historicocontaminacion.ModeloHistoricoContaminacion;

/**
 * Servlet implementation class CrearHistorico
 */
@WebServlet("/crearHistorico")
public class CrearHistorico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearHistorico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fecha_inicio = request.getParameter("mes");
		String fecha_fin = fecha_inicio + "-29";
		fecha_inicio = fecha_inicio + "-01";
		ModeloHistoricoContaminacion modelo_historico = new ModeloHistoricoContaminacion();
		modelo_historico.registrarHsitorico(fecha_inicio,fecha_fin);
		
		response.sendRedirect("/Garbigune_reto/VerHistorico");
	}

}
