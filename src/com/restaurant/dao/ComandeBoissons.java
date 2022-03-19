package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;


public class ComandeBoissons implements IComandeBoissons{
	// save ComandeBoissons
    // get All ComandeBoissons
    // get ComandeBoissons By Id
    // Update ComandeBoissons
    // Delete ComandeBoissons

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveComandeBoissons(ComandeBoissons comandeBoissons) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(comandeBoissons);

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
    public void updateComandeBoissons(ComandeBoissons comandeBoissons) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(comandeBoissons);

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
    public ComandeBoissons getComandeBoissonsById(int id) {
        Transaction transaction = null;
        ComandeBoissons comandeBoissons = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    comandeBoissons= session.byId(ComandeBoissons.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return comandeBoissons;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<com.groupe9.model.ComandeBoissons> getAllComandeBoissons() {
        Transaction transaction = null;
        List<com.groupe9.model.ComandeBoissons> comandeBoissons = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            comandeBoissons = session.createQuery("from ComandeBoissons").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return comandeBoissons;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteComandeBoissons(int id) {
        Transaction transaction = null;
        ComandeBoissons comandeBoissons = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            comandeBoissons = session.get(ComandeBoissons.class, id);
            // get student object
            session.delete(comandeBoissons);
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
