package com.restaurant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.groupe9.util.HibernateUtil;

public class ClientExternes implements IClientExternes {
	// save ClientExternes
    // get All ClientExterness
    // get ClientExternes By Id
    // Update ClientExternes
    // Delete ClientExternes

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IClientExternesDao#saveClientExternes(net.javaguides.hibernate.model.ClientExternes)
     */
    @Override
    public void saveClientExternes(ClientExternes clientExternes) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save clientExterness object
            session.save(clientExternes);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IClientExternesDao#updateClientExternes(net.javaguides.hibernate.model.ClientExternes)
     */
    @Override
    public void updateClientExternes(ClientExternes clientExternes) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save clientExterness object
            session.saveOrUpdate(clientExternes);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IClientExternesDao#getClientExternesById(long)
     */
    @Override
    public ClientExternes getClientExternesById(int id) {
        Transaction transaction = null;
        ClientExternes clientExternes = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get clientExterness object
			    clientExternes= session.byId(ClientExternes.class).getReference(id);
			     // or clientExterness = session.get(ClientExternes.class, id);
			    //or clientExterness = session.load(ClientExternes.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return clientExternes;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IClientExternesDao#getAllClientExterness()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.ClientExternes> getAllClientExternes() {
        Transaction transaction = null;
        List<com.groupe9.model.ClientExternes> clientExternes = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get clientExternes
            clientExternes = session.createQuery("from ClientExternes").list();
            //clientExternes = session.load(ClientExternes.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return clientExternes;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IClientExternesDao#deleteClientExternes(long)
     */
    @Override
    public void deleteClientExternes(int id) {
        Transaction transaction = null;
        ClientExternes clientExternes = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            clientExternes = session.get(ClientExternes.class, id);
            // get clientExternes object
            session.delete(clientExternes);
            //clientExternes = session.load(ClientExternes.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
	
}
