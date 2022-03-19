package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;


public class Plats implements IPlats {
	// save Plats
    // get All Platss
    // get Plats By Id
    // Update Plats
    // Delete Plats

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPlatsDao#savePlats(net.javaguides.hibernate.model.Plats)
     */
    @Override
    public void savePlats(Plats commandes) {
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
     * @see net.javaguides.hibernate.dao.IPlatsDao#updatePlats(net.javaguides.hibernate.model.Plats)
     */
    @Override
    public void updatePlats(Plats commandes) {
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
     * @see net.javaguides.hibernate.dao.IPlatsDao#getPlatsById(long)
     */
    @Override
    public Plats getPlatsById(int id) {
        Transaction transaction = null;
        Plats plats= null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get commandess object
			    plats= session.byId(Plats.class).getReference(id);
			     // or commandess = session.get(Plats.class, id);
			    //or commandess = session.load(Plats.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return plats;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPlatsDao#getAllPlatss()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Plats> getAllPlats() {
        Transaction transaction = null;
        List<com.groupe9.model.Plats> plats= null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get commandes
            plats= session.createQuery("from Plats").list();
            //plats= session.load(Plats.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return plats;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPlatsDao#deletePlats(long)
     */
    @Override
    public void deletePlats(int id) {
        Transaction transaction = null;
        Plats plats= null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            plats= session.get(Plats.class, id);
            // get platsobject
            session.delete(plats);
            //plats= session.load(Plats.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
