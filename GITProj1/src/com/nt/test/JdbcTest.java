package com.nt.test;

import java.sql.SQLException;

import com.nt.dao.EmpDAO;

public class JdbcTest {

	public static void main(String[] args) {
		EmpDAO dao=null;
		dao=new EmpDAO();
		try {
			int count=dao.getEmpsCount();
			System.out.println("Emps count::"+count);
			int maxSal=dao.getMaxSal();
			System.out.println("Emps Max Sal::"+maxSal);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}//main
}//class
