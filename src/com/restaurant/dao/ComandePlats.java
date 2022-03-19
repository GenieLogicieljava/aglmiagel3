package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;


public class ComandePlats implements IComandePlats{
	// save ComandePlats
    // get All ComandePlats
    // get ComandePlats By Id
    // Update ComandePlats
    // Delete ComandePlats

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveComandePlats(ComandePlats comandePlats) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(comandePlats);

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
    public void updateComandePlats(ComandePlats comandePlats) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(comandePlats);

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
    public ComandePlats getComandePlatsById(int id) {
        Transaction transaction = null;
        ComandePlats comandePlats = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    comandePlats= session.byId(ComandePlats.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return comandePlats;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.ComandePlats> getAllComandePlats() {
        Transaction transaction = null;
        List<com.groupe9.model.ComandePlats> comandePlats = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            comandePlats = session.createQuery("from ComandePlats").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return comandePlats;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteComandePlats(int id) {
        Transaction transaction = null;
       ComandePlats comandePlats = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            comandePlats = session.get(ComandePlats.class, id);
            // get student object
            session.delete(comandePlats);
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
