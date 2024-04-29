package controlador.historicoemision;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.historicocontaminacion.HistoricoContaminacion;
import modelo.historicocontaminacion.ModeloHistoricoContaminacion;

/**
 * Servlet implementation class VerHistoricos
 */
@WebServlet("/VerHistorico")
public class VerHistoricos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerHistoricos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloHistoricoContaminacion modelo_historico = new ModeloHistoricoContaminacion();
		ArrayList<HistoricoContaminacion> historico_contaminacion = modelo_historico.getHistoricos();
		request.setAttribute("historicoEmisiones", historico_contaminacion);
		request.getRequestDispatcher("Paneles_control/Admin/historicoContaminacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
