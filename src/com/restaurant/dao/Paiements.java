package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;

public class Paiements implements IPaiements{
	// save Paiements
    // get All Paiementss
    // get Paiements By Id
    // Update Paiements
    // Delete Paiements

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPaiementsDao#savePaiements(net.javaguides.hibernate.model.Paiements)
     */
    @Override
    public void savePaiements(Paiements paiements) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save paiementss object
            session.save(paiements);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPaiementsDao#updatePaiements(net.javaguides.hibernate.model.Paiements)
     */
    @Override
    public void updatePaiements(Paiements paiements) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save paiementss object
            session.saveOrUpdate(paiements);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPaiementsDao#getPaiementsById(long)
     */
    @Override
    public Paiements getPaiementsById(int id) {
        Transaction transaction = null;
        Paiements paiements = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get paiementss object
			    paiements= session.byId(Paiements.class).getReference(id);
			     // or paiementss = session.get(Paiements.class, id);
			    //or paiementss = session.load(Paiements.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return paiements;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPaiementsDao#getAllPaiementss()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Paiements> getAllPaiements() {
        Transaction transaction = null;
        List<com.groupe9.model.Paiements> paiements = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get paiements
            paiements = session.createQuery("from Paiements").list();
            //paiements = session.load(Paiements.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return paiements;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPaiementsDao#deletePaiements(long)
     */
    @Override
    public void deletePaiements(int id) {
        Transaction transaction = null;
        Paiements paiements = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            paiements = session.get(Paiements.class, id);
            // get paiements object
            session.delete(paiements);
            //paiements = session.load(Paiements.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
