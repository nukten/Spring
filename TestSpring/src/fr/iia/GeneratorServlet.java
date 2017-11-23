package fr.iia;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@WebServlet("/generator")
public class GeneratorServlet extends HttpServlet {

	@Autowired
	private IDAO<Produit> daoProduit;
	private IDAO<Personne> daoPersonne;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		// TODO Auto-generated method stub
		super.init();
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException{
		Produit myProduit=new Produit();
		myProduit.setNom("GoPRO HERO 5");
		myProduit.setPrix(499.0);
		daoProduit.save(myProduit);
		
		Personne myPersonne=new Personne();
		myPersonne.setNom("TT");
		myPersonne.setPrenom("thomas");
		daoPersonne.save(myPersonne);
	}
}
