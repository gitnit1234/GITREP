package com.nt.service;

import com.nt.dao.EmpDAO;

public class EmpMgmtService {
	
	public  int  getEmpsCount() throws Exception{
		EmpDAO dao=null;
		int count=0;
		//use DAO
		dao=new EmpDAO();
		count=dao.getEmpsCount();
		return  count+10;
	}

}