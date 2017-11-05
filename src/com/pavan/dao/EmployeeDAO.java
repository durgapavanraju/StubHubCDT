package com.pavan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pavan.bean.Employee;


public class EmployeeDAO {


	public List<Employee> getEmployeeDetails(){
		List<Employee> empList = null;
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from emp");
			empList = new ArrayList<>();
			while(rs.next()){
				Employee emp = new Employee();
				emp.setEmpNo(rs.getInt(1));
				emp.seteName(rs.getString(2));
				emp.setJob(rs.getString(3));
				empList.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}


	private Connection getConnection(){
		Connection connection=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}

/*	public List<Employee> getEmployeeByUsingHibernate(){
		SessionFactory sessionFactory;
		List<Employee> empList = null;
		try {
			sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		Session session = sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery("select * from emp");
		List<Object[]> rows = query.list();
		if(rows != null){
			empList = new ArrayList<>();
			for(Object[] row : rows){
				Employee emp = new Employee();
				emp.setEmpNo(Integer.parseInt(row[0].toString()));
				emp.seteName(row[1].toString());
				emp.setJob(row[1].toString());
				empList.add(emp);
			}
		}
		return empList;
	}*/
	
	public List<Employee> getEmployeeByUsingHibernate(){
		SessionFactory sessionFactory;
		List<Employee> empList = null;
		try {
			sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee");
		List<Employee> rows = query.list();
		if(rows != null){
			empList = new ArrayList<>();
			for(Employee row : rows){
				Employee emp = new Employee();
				emp.setEmpNo(row.getEmpNo());
				emp.seteName(row.geteName());
				emp.setJob(row.getJob());
				empList.add(emp);
			}
		}
		return empList;
	}



}
