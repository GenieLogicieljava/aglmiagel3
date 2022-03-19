package com.restaurant.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupe9.util.HibernateUtil;


public class Menus implements IMenus {
	// save Menus
    // get All Menus
    // get Menus By Id
    // Update Menus
    // Delete Menus

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
     */
    @Override
    public void saveMenus(Menus menus) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(menus);

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
    public void updateMenus(Menus menus) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(menus);

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
    public Menus getMenusById(int id) {
        Transaction transaction = null;
        Menus menus = null;
        try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			    // start the transaction
			    transaction = session.beginTransaction();

			    // get student object
			    menus= session.byId(Menus.class).getReference(id);
			     // or student = session.get(Student.class, id);
			    //or student = session.load(Student.class, id);
			   //or commit the transaction
			    transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
		}
			
		}
        
        
        return menus;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
     */
    @Override
    @SuppressWarnings("unchecked")
    public List < Menus > getAllMenus() {
        Transaction transaction = null;
        List < Menus > menus = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            menus = session.createQuery("from Menus").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return menus;
    }

    /* (non-Javadoc)
     * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
     */
    @Override
    public void deleteMenus(int id) {
        Transaction transaction = null;
        Menus menus = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            menus = session.get(Menus.class, id);
            // get student object
            session.delete(menus);
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
