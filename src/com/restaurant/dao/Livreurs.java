package com.restaurant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;

public class Livreurs implements ILivreurs {

    // save Livreurs
    // get All Livreurss
    // get Livreurs By Id
    // Update Livreurs
    // Delete Livreurs

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ILivreursDao#saveLivreurs(net.javaguides.hibernate.model.Livreurs)
     */
    @Override
    public void saveLivreurs(Livreurs livreurs) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save livreurs object
            session.save(livreurs);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ILivreursDao#updateLivreurs(net.javaguides.hibernate.model.Livreurs)
     */
    @Override
    public void updateLivreurs(Livreurs livreurs) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save livreurs object
            session.saveOrUpdate(livreurs);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ILivreursDao#getLivreursById(long)
     */
    @Override
    public Livreurs getLivreursById(int id) {
        Transaction transaction = null;
        Livreurs livreurs = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get livreurs object
			    livreurs= session.byId(Livreurs.class).getReference(id);
			     // or livreurs = session.get(Livreurs.class, id);
			    //or livreurs = session.load(Livreurs.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return livreurs;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ILivreursDao#getAllLivreurss()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Livreurs> getAllLivreurs() {
        Transaction transaction = null;
        List<com.groupe9.model.Livreurs> livreurs = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get livreurs
            livreurs = session.createQuery("from Livreurs").list();
            //livreurs = session.load(Livreurs.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return livreurs;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ILivreursDao#deleteLivreurs(long)
     */
    @Override
    public void deleteLivreurs(int id) {
        Transaction transaction = null;
        Livreurs livreurs = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            livreurs = session.get(Livreurs.class, id);
            // get livreurs object
            session.delete(livreurs);
            //livreurs = session.load(Livreurs.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

	
}
