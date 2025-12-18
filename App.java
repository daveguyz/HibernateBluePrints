package com.example;

import com.example.model.User;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User("JohnDoe", "john@example.com");
        session.save(user);

        transaction.commit();
        session.close();

        System.out.println("User saved successfully!");
    }
}
