package com.aa.Joins;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Inner_Join_MainApp {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/aa/Joins/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		/*
		 * Department d1 =new Department(10,"Devops", "Alok"); Department d2 =new
		 * Department(11,"QA", "Shyam"); Department d3 =new Department(12,"Testing",
		 * "RAm");
		 * 
		 * Employee e1 = new Employee(21,"SAhil", 222.23, d1); Employee e2 = new
		 * Employee(22,"Abhi", 444.25, d2); Employee e3 = new Employee(23,"Navin",
		 * 5012.24, d3); Employee e4 = new Employee(24,"Abhaa", 6102.28, null);
		 * 
		 * session.save(d1); session.save(d2); session.save(d3); session.save(e4);
		 * session.save(e3); session.save(e2); session.save(e1);
		 * 
		 * tx.commit(); session.close();
		 */

		String hql = "SELECT e.empName, d.deptName FROM Employee e INNER JOIN e.dept d";

		Query query = session.createQuery(hql);

		List<Object[]> list = query.list();

		for (Object[] obj : list) {
			System.out.println(obj[0] + "- " + obj[1]);
		}

	}
}
