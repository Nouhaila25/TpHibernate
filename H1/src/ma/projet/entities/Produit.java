/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Lachgar
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;
    private int prix;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAchat;
    private String marque;
     private String designation;

    public Produit(String ref, int prix, Date dateAchat, String marque, String designation) {
        this.ref = ref;
        this.prix = prix;
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.designation = designation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
   

    public Produit() {
    }

    public String getMarque() {
        return marque;
    }

    public String getDesignation() {
        return designation;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

   
    
    
    
}
