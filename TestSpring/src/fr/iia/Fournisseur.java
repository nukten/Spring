package fr.iia;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("2")

public class Fournisseur extends Personne{
	@Column(name="FOU_SOCIETE")
	private String nomSociete;

	@OneToMany(mappedBy="fournisseur")
	private List<Produit> produits;
}
