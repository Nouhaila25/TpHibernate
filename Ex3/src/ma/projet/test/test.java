/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ma.projet.entities.Employe;
import ma.projet.entities.Projet;
import ma.projet.entities.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;
import ma.projet.util.HibernateUtil;


public class test {


    public static void main(String[] args) {
        EmployeService es= new EmployeService();
        ProjetService ps= new ProjetService();
        TacheService ts= new TacheService();
        EmployeTacheService ets = new EmployeTacheService();
         
        Employe e1= new Employe("nnn","gggg","098765433");
        es.create(e1);
        Employe e2= new Employe("hhh","fff","0864322334");
        es.create(e2);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date0 = null;
        Date date1 = null;
        
        try {
            date0 = dateFormat.parse("11/01/2023");
            date1 = dateFormat.parse("05/09/2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Projet p1 = new Projet("projet1", date0, new Date());
        //ps.create(p1);
        Projet p2 = new Projet("projet2", date1, new Date());
       // ps.create(p2);
        
        Tache t1= new Tache("projet1",date0, new Date(), 2000);
        //ts.create(t1);
        Tache t2= new Tache("projet2",date0, new Date(), 3000);
        //ts.create(t2);
        
         
         
         
    }
    
}
