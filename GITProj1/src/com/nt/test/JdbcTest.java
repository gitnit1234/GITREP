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
		}
		catch(SQLException se) {
			se.printStackTrace();
		}

	}//main
}//class
