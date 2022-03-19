package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;

public class Periodes implements IPeriodes{
	// save Periodes
    // get All Periodess
    // get Periodes By Id
    // Update Periodes
    // Delete Periodes

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPeriodesDao#savePeriodes(net.javaguides.hibernate.model.Periodes)
     */
    @Override
    public void savePeriodes(Periodes periodes) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save periodess object
            session.save(periodes);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPeriodesDao#updatePeriodes(net.javaguides.hibernate.model.Periodes)
     */
    @Override
    public void updatePeriodes(Periodes periodes) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save periodess object
            session.saveOrUpdate(periodes);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPeriodesDao#getPeriodesById(long)
     */
    @Override
    public Periodes getPeriodesById(int id) {
        Transaction transaction = null;
        Periodes periodes = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get periodess object
			    periodes= session.byId(Periodes.class).getReference(id);
			     // or periodess = session.get(Periodes.class, id);
			    //or periodess = session.load(Periodes.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return periodes;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPeriodesDao#getAllPeriodess()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Periodes> getAllPeriodes() {
        Transaction transaction = null;
        List<com.groupe9.model.Periodes> periodes = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get periodes
            periodes = session.createQuery("from Periodes").list();
            //periodes = session.load(Periodes.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return periodes;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IPeriodesDao#deletePeriodes(long)
     */
    @Override
    public void deletePeriodes(int id) {
        Transaction transaction = null;
        Periodes periodes = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            periodes = session.get(Periodes.class, id);
            // get periodes object
            session.delete(periodes);
            //periodes = session.load(Periodes.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
