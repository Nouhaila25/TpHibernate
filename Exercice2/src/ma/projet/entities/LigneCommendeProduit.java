
package ma.projet.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class LigneCommendeProduit {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantite;
    
    @ManyToOne
    @JoinColumn(name ="produit_id")
    private Produit produit;
    
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    public LigneCommendeProduit() {
    }

    public LigneCommendeProduit(int quantite) {
        this.quantite = quantite;
    }



    public int getQuantite() {
        return quantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    public Produit getProduit() {
        return produit;
    }


    public void setProduit(Produit produit) {
        this.produit = produit;
    }


    public Commande getCommande() {
        return commande;
    }


    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public LigneCommendeProduit(int quantite, Produit produit, Commande commande) {
        this.quantite = quantite;
        this.produit = produit;
        this.commande = commande;
    }
    
    
}
