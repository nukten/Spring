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
	
	
	@ManyToMany(mappedBy="produit")
	private List<Client> clients;
	
	
	
	

}
