package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;

public class Tables implements ITables{
	// save Tables
    // get All Tabless
    // get Tables By Id
    // Update Tables
    // Delete Tables

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ITablesDao#saveTables(net.javaguides.hibernate.model.Tables)
     */
    @Override
    public void saveTables(Tables tables) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save tabless object
            session.save(tables);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ITablesDao#updateTables(net.javaguides.hibernate.model.Tables)
     */
    @Override
    public void updateTables(Tables tables) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save tabless object
            session.saveOrUpdate(tables);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ITablesDao#getTablesById(long)
     */
    @Override
    public Tables getTablesById(int id) {
        Transaction transaction = null;
        Tables tables = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get tabless object
			    tables= session.byId(Tables.class).getReference(id);
			     // or tabless = session.get(Tables.class, id);
			    //or tabless = session.load(Tables.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return tables;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ITablesDao#getAllTabless()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Tables> getAllTables() {
        Transaction transaction = null;
        List<com.groupe9.model.Tables> tables = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get tables
            tables = session.createQuery("from Tables").list();
            //tables = session.load(Tables.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return tables;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.ITablesDao#deleteTables(long)
     */
    @Override
    public void deleteTables(int id) {
        Transaction transaction = null;
        Tables tables = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            tables = session.get(Tables.class, id);
            // get tables object
            session.delete(tables);
            //tables = session.load(Tables.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
