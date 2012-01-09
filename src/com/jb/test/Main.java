package com.jb.test;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import com.jb.entity.Dept;
import com.jb.entity.User;

public class Main {
	
	private static Configuration cfg = new AnnotationConfiguration();
	
	
	public static void main(String[] args) {
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle9iDialect");
		cfg.setProperty("hibernate.show_sql", "true");
		cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@127.0.0.1:1521:ioss");
		cfg.setProperty("hibernate.connection.username", "ioss");
		cfg.setProperty("hibernate.connection.password", "ioss");
		cfg.setProperty("hibernate.hbm2ddl.auto", "update");
		
		cfg.addAnnotatedClass(User.class);
		cfg.addAnnotatedClass(Dept.class);
		
//		cfg.buildSettings();
//		User u = new User();
//		u.setId("2");
//		u.setName("dd");
//		u.setAge(20);
//		Session session = cfg.buildSessionFactory().openSession();
//		session.beginTransaction();
//		session.save(u);
//		session.getTransaction().commit();
//		SchemaExport sce = new SchemaExport(cfg);
//		sce.create(true, true);
		SchemaUpdate scu = new SchemaUpdate(cfg);
		scu.execute(true, true); 
		
	}
}
