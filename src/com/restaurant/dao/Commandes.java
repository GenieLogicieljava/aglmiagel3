package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;


public class Commandes implements ICommandes{
	// save Commandes
    // get All Commandess
    // get Commandes By Id
    // Update Commandes
    // Delete Commandes

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ICommandesDao#saveCommandes(net.javaguides.hibernate.model.Commandes)
     */
    @Override
    public void saveCommandes(Commandes commandes) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save commandess object
            session.save(commandes);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ICommandesDao#updateCommandes(net.javaguides.hibernate.model.Commandes)
     */
    @Override
    public void updateCommandes(Commandes commandes) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save commandess object
            session.saveOrUpdate(commandes);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ICommandesDao#getCommandesById(long)
     */
    @Override
    public Commandes getCommandesById(int id) {
        Transaction transaction = null;
        Commandes commandes = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get commandess object
			    commandes= session.byId(Commandes.class).getReference(id);
			     // or commandess = session.get(Commandes.class, id);
			    //or commandess = session.load(Commandes.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return commandes;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ICommandesDao#getAllCommandess()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Commandes> getAllCommandes() {
        Transaction transaction = null;
        List<com.groupe9.model.Commandes> commandes = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get commandes
            commandes = session.createQuery("from Commandes").list();
            //commandes = session.load(Commandes.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return commandes;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ICommandesDao#deleteCommandes(long)
     */
    @Override
    public void deleteCommandes(int id) {
        Transaction transaction = null;
        Commandes commandes = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            commandes = session.get(Commandes.class, id);
            // get commandes object
            session.delete(commandes);
            //commandes = session.load(Commandes.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
