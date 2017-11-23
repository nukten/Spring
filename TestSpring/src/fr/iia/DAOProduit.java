package fr.iia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class DAOProduit implements IDAO<Produit>
{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Produit find (int id) {
		return em.find(Produit.class, id);
	}
	
	@Override
	public List<Produit> finAll(){
		return null;
	}
	
	@Override
	public Produit save(Produit object) {
		return em.merge(object);
	}

	@Override
	public boolean delete(Produit object) {
		// TODO Auto-generated method stub
		try{
			em.remove(em.merge(object));
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	

}
