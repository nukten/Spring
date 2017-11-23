package fr.iia;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="produit")
public class Produit {
	
	@Id
	@Column(name="PRO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="PRO_NOM")
	private String nom;
	
	@Column(name="PRO_PRIX")
	private Double prix;
	
	@ManyToOne
	@JoinColumn(name="PRO_FOURNISSEUR_ID")
	private Fournisseur fournisseur;
	
	
	@ManyToMany(mappedBy="produits")
	private List<Client> clients;


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
	
	

}
