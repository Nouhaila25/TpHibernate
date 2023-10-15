/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import java.util.List;
import ma.projet.entities.Categorie;
import ma.projet.entities.Commande;
import ma.projet.entities.LigneCommendeProduit;

import ma.projet.entities.Produit;
import ma.projet.service.CategorieService;
import ma.projet.service.CommandeService;
import ma.projet.service.LigneCommendeProduitService;

import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;


public class Test {
    
   public static void main(String[] args) {
        

        ProduitService p = new ProduitService();
        CategorieService c = new CategorieService();
        CommandeService cm = new CommandeService();
        LigneCommendeProduitService lcp = new LigneCommendeProduitService();

//        Categorie c1 = new Categorie("J2346", "MMMM");
//        cs.create(c1);
        //Categorie c2 = new Categorie("J2345", "LLLL");
//        cs.create(c1);

        
        
//        Produit produit1 = new Produit("J567889", 2000, categorie1);
//        Produit produit2 = new Produit("PROD002", 30000,categorie2);

        //Categorie c2 = new Categorie("c1", "l1");
        //c.create(c2);
        
        //Produit produit3 = new Produit("ref3", 200, c2);
        //Produit produit4 = new Produit("ref4", 300, c2);
        //p.create(produit3);
        //p.create(produit4);
         
        Categorie c0 = c.findById(6);
        Categorie c1 = c.findById(7);
        Produit p0 = p.findById(13);
        Produit p1 = p.findById(15);
        
        Commande co1 =new Commande(new Date());
        Commande co2 =new Commande(new Date());
       // cm.create(co1);
       // cm.create(co2);
        LigneCommendeProduit lcp0 = new LigneCommendeProduit(100, p0, co2);
        LigneCommendeProduit lcp1 = new LigneCommendeProduit(200, p1, co2);
       // lcp.create(new LigneCommendeProduit(100, p0, co2));
        //lcp.create(new LigneCommendeProduit(200, p1, co2));
        
        
        List<Produit> produitsDeLaCategorie = p.getProduitsByCategorie(c0);
        
        if (produitsDeLaCategorie != null) {
            System.out.println("Liste des produits de la catégorie : " + c0.getCode());
            for (Produit produit : produitsDeLaCategorie) {
                System.out.println("Référence : " + produit.getReference());
                System.out.println("Prix : " + produit.getPrix() + " DH");
               
            }
        } else {
            System.out.println("ERR");
        }

        cm.getproduitCommendes(2);
    }
}
