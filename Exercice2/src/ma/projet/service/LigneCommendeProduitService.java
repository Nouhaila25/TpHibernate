/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.ArrayList;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.LigneCommendeProduit;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LigneCommendeProduitService implements IDao<LigneCommendeProduit>{
    @Override
    public boolean create(LigneCommendeProduit o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean delete(LigneCommendeProduit o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean update(LigneCommendeProduit o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<LigneCommendeProduit> findAll(LigneCommendeProduit o) {
        List<LigneCommendeProduit> ligneCommendeProduits = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            ligneCommendeProduits = session.createQuery("from LigneCommendeProduit").list();
            tx.commit();
            return ligneCommendeProduits;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return ligneCommendeProduits;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public LigneCommendeProduit findById(int id) {
        LigneCommendeProduit ligneCommendeProduit = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            ligneCommendeProduit = (LigneCommendeProduit) session.get(LigneCommendeProduit.class, id);
            tx.commit();
            return ligneCommendeProduit;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return ligneCommendeProduit;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
}
