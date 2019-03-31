package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nt.util.JdbcUtil;

public class EmpDAO {
	
	public   int getEmpsCount()throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//get Connection 
		con=JdbcUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		ps=con.prepareStatement("SELECT COUNT(*) FROM EMP");
		rs=ps.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

}
