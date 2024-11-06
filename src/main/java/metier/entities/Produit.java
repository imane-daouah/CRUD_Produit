package metier.entities;

import java.io.Serializable;

public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String designation;
	private double prix;
	private int quantite; // Modifié ici pour retirer l'accent

	public Produit() {
		super();
	}

	public Produit(Long id, String designation, double prix, int quantite) {
		super();
		this.id = id;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Produit(String designation, double prix, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prix=" + prix + ", quantite=" + quantite + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() { // Modifié ici pour retirer l'accent
		return quantite;
	}

	public void setQuantite(int quantite) { // Modifié ici pour retirer l'accent
		this.quantite = quantite;
	}
}
