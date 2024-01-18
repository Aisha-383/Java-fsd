package com.operations;

import com.connection.HibernateConfig;
import com.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductOperations {

	public static int addProduct(String productName, double price) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = null;
        int productId = 0;

        try {
            transaction = session.beginTransaction();

            Product product = new Product();
            product.setProductName(productName);
            product.setPrice(price);

            // Save the product and retrieve the generated productId
            productId = (int) session.save(product);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return productId;
    }

    public static Product getProductById(int productId) {
        Session session = HibernateConfig.getSessionFactory().openSession();
        try {
            return session.get(Product.class, productId);
        } finally {
            session.close();
        }
    }
}