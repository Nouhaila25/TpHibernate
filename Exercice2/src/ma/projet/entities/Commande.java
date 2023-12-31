/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Lachgar
 */
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @ManyToMany
    @JoinTable(
     name = "LigneCommandeProduit",
        joinColumns = @JoinColumn(name = "commande_id"),
        inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits;
    
    @OneToMany(mappedBy = "commande")
    private List<LigneCommendeProduit> lignesCommandeProduits;

    public Commande() {
    }

    public Commande(Date date) {
        this.date = date;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public List<Produit> getProduits() {
        return produits;
    }


    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<LigneCommendeProduit> getLignesCommandeProduits() {
        return lignesCommandeProduits;
    }

    public void setLignesCommandeProduits(List<LigneCommendeProduit> lignesCommandeProduits) {
        this.lignesCommandeProduits = lignesCommandeProduits;
    }
    
    
    
    
    
    
    
}
