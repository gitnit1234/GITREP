package com.nt.test;

import java.sql.SQLException;
import java.util.Date;

import com.nt.dao.EmpDAO;
import com.nt.service.EmpMgmtService;

public class JdbcTest {

	public static void main(String[] args) {
		EmpDAO dao=null;
		dao=new EmpDAO();
		EmpMgmtService service=null;
		int count=0;
		try {
			service=new EmpMgmtService();
			count=service.getEmpsCount();
			System.out.println("Emps count::"+count);
			int maxSal=dao.getMaxSal();
			System.out.println("Emps Max Sal::"+maxSal);
			System.out.println("date and time"+new Date());
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//12345

	}//main
}//class
