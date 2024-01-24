package com.edu;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmployeeData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/Downloads";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int empid = 0;
		String ename = null;
		float esal = 0;
		int deptId = 0;
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url,username,password);
		
		stmt = conn.createStatement();
		
		String s = "select * from employee1";
		
		rs = stmt.executeQuery(s);
		
		System.out.println("ID\tEmp.Name\tSalary\tDept.ID");
		
		while(rs.next()) {
			empid = rs.getInt(1);
			ename = rs.getString(2);
			esal = rs.getFloat(3);
			deptId = rs.getInt(4);
			
			System.out.println(empid+"\t"+ename+"\t"+esal+"\t"+deptId);
		}
	}
}

