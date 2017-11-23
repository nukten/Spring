package fr.iia;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class OrchestreServlet
 */
@WebServlet(name = "orchestreServlet", urlPatterns = { "/orchestreServlet" })
public class OrchestreServlet extends HttpServlet {
	@Autowired
	private Guitariste guitariste;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrchestreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(guitariste);
		System.out.println("[Prend un piano]");
		guitariste.setInstrument(new Piano());
		System.out.println(guitariste);
		System.out.println("[Prend une guitare]");
		guitariste.setInstrument(new Guitare());
		System.out.println(guitariste);
	}
	
	public void init(ServletConfig config) {
		try {
			super.init(config);
		}
		catch (ServletException e) {
			e.printStackTrace();
		}
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
}
