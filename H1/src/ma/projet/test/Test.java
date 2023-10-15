/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;

import ma.projet.entities.Produit;

import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author Lachgar
 */
public class Test {
    
    public static void main(String[] args) {
       
       
        ProduitService cs = new ProduitService();
        
        
        //cs.create(new Produit("JX21",200, new Date(), "nike","kjhgf"));
        //cs.create(new Produit("JX22",100, new Date(), "nike","kjhgf"));
        //cs.create(new Produit("JX23",300, new Date(), "nike","kjhgf"));
        //cs.create(new Produit("JX24",150, new Date(), "nike","kjhgf"));
      
        for (Produit e : cs.findAll()) {
            System.out.println(e.getMarque());
        }
        //Les informations du produit dont id = 8
        for (Produit p : cs.findAll()) {
            if (p.getId() == 8) {
                System.out.println(p.getId() + " , " + p.getMarque() + " , " + p.getRef() + " , " + p.getDateAchat() + " , " + p.getPrix() + " , " + p.getDesignation());
            }
        }
        //Supprimer le produit dont id = 7
        cs.delete(cs.findById(7));
        
        //Modifier les informations du produit dont id = 9,
        Produit p = cs.findById(9);
        if (p != null) {
            p.setMarque("Puma");
            p.setRef("MMMPPP");
            p.setDateAchat(new Date("2023/09/05"));
            p.setPrix(5000);
            p.setDesignation("Puma");
            cs.update(p);
        }
        //Afficher la liste des produits dont le prix est supérieur à 100 DH
        for (Produit pp : cs.findAll()) {
            if (pp.getPrix() > 100) {
                System.out.println("" + pp.getMarque());
            }



        
        //css.create(new Commande("c23", new Date(), cs.findById(1)));
        //css.create(new Commande("c22", new Date(), cs.findById(1)));
        
        
        
        
        
        }  
    }
    
}
