package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;

public class Boissons implements IBoissons{
	 // save Boissons
    // get All Boissons
    // get Boissons By Id
    // Update Boissons
    // Delete Boissons

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveBoisson(Boissons boissons) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(boissons);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#updateStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void updateBoissons(Boissons boissons) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(boissons);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getStudentById(long)
     */
    @Override
    public Boissons getBoissonById(int id) {
        Transaction transaction = null;
        Boissons boissons = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    boissons= session.byId(Boissons.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return boissons;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.Boissons> getAllBoissons() {
        Transaction transaction = null;
        List<com.groupe9.model.Boissons> boissons = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            boissons = session.createQuery("from Boissons").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return boissons;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteBoissons(int id) {
        Transaction transaction = null;
        Boissons boissons = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            boissons = session.get(Boissons.class, id);
            // get student object
            session.delete(boissons);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

	

}
