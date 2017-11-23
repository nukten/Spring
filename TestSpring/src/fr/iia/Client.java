package fr.iia;

import javax.persistence.Column;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
@DiscriminatorValue("1")
public class Client extends Personne{
	@Column(name="CLI_CA")
	private Double ca; 
	
	@ManyToMany
	@JoinTable(
			name="achat",
			joinColumns=@JoinColumn(name="ACH_ClIENT_ID",referencedColumnName="PER_ID"),
			inverseJoinColumns=@JoinColumn(name="ACH_PRODUIT_ID",referencedColumnName="PRO_ID")
			)
	private List<Produit> produits;

}
