package com.connection;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Product;
public class ProductDAO {
	    public static void addProduct(Product product) {
	        Session session = HibernateUtility.getSessionFactory().openSession();
	        Transaction transaction = null;

	        try {
	            transaction = session.beginTransaction();
	            session.save(product);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }
}
