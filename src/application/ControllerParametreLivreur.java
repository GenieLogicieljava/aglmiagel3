package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.groupe9.model.Livreurs;

public class ControllerParametreLivreur{

    @FXML
    private MenuItem ChoiceLivreur;

    @FXML
    private MenuItem ChoiceMenu;

    @FXML
    private MenuItem ChoiceTable;

    @FXML
    private TextField setAdresse;

    @FXML
    private TextField setCni;

    @FXML
    private TextField setContact;

    @FXML
    private TextField setNom;

    @FXML
    void saveLivreurs(ActionEvent event) {
    	SessionFactory sessionFactory = com.groupe9.util.HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        
        try {
        	tx = session.beginTransaction(); 
            Livreurs livreur = new Livreurs();
        	livreur.setNom(setNom.getText());
        	livreur.setCni(setCni.getText());
        	livreur.setAdresse(setAdresse.getText());
        	livreur.setContact(setContact.getText());
            session.save(livreur);
            session.flush() ;
            tx.commit();
        } catch ( HibernateException e) {
        	if (tx != null) {
        		tx.rollback();
        	}
        	e.printStackTrace();
        } finally {
        	session.close();
        }
        sessionFactory.close();
    }
}

