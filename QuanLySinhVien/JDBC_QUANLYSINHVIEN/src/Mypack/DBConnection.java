package Mypack;

import java.sql.*;

public class DBConnection 
{	
		/*1.import thu vien có tên là java.sql
		 * 2.load jdbc driver 
		 * 3.kết nối với mysql sử dụng getconection(thuộc lớp drivermanager)
		 * - khởi tạo 1 đối tượng có tên là: Connection
		 * - khởi tạo url, username, password
		 * 4. đóng connection lại
		 * */
	
	
		
		
		public static Connection Ketnoi()
		{
			Connection conn = null;
			String url = "jdbc:mysql://localhost:3306/quanlysinhvien";
			String username = "root";
			String password = "1234";
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection(url,username,password);
				
				/*if (conn != null)
				{
					System.out.println("ket noi thanh cong");
				}*/
				
				//conn.close();
				
			} 
			catch (ClassNotFoundException e) 
			{
				System.out.println("load driver khong thanh cong");	
			}
			catch (SQLException e) 
			{
				System.out.println("Loi: "+e.getMessage());
				
			}
			return conn;
		}
}
