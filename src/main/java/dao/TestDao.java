package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {
    public static void main(String[] args) {
        ProduitDaoImp dao = new ProduitDaoImp();

        // Créer et enregistrer des produits
        //Produit p1 = dao.save(new Produit("HP 6578", 900, 45));
        //Produit p2 = dao.save(new Produit("Imprimante 6578", 1000, 15));
        Produit p3 = dao.save(new Produit("PC 24", 900, 45));
        Produit p4 = dao.save(new Produit("lenovo 20 ", 1000, 15));
        Produit p5 = dao.save(new Produit("iPhone pro", 400, 45000));
        Produit p7 = dao.save(new Produit("Samsung A55", 90, 5000));
        

        // Afficher les informations des produits enregistrés
        //System.out.println("Produit 1 : " + p1);
        //System.out.println("Produit 2 : " + p2);
        //System.out.println("Chercher des Produits");
        //List<Produit> prods = dao.produitsParMC("%H%");
        //for(Produit p :prods) {
          //  System.out.println(p.toString());

        }

    }

