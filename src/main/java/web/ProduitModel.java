package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

public class ProduitModel {
    private String motCle;
    private List<Produit> produits = new ArrayList<>();

    public List<Produit> getProduits() {
        return produits;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
