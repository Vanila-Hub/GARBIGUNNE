package controlador.historicoemision;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.cliente.ModeloCliente;
import modelo.historicocontaminacion.ModeloHistoricoContaminacion;

/**
 * Servlet implementation class EliminarHistorico
 */
@WebServlet("/borrarHistorico")
public class EliminarHistorico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarHistorico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_historico= Integer.parseInt(request.getParameter("id"));
		
		ModeloHistoricoContaminacion modelo_historico = new ModeloHistoricoContaminacion();
		
		modelo_historico.borrarHistorico(id_historico);
		request.setAttribute("msg", "deleted");
		request.getRequestDispatcher("/VerHistorico").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
