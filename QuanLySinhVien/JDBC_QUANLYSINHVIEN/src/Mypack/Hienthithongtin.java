package Mypack;

import java.sql.*;

public class Hienthithongtin 
{
		
		
		public static void Display()
		{
			Connection conn = null;
			PreparedStatement ptmt = null;
			
			
			conn = DBConnection.Ketnoi();
			
			String sql = "select * from student";
			
			try 
			{
				ptmt = conn.prepareStatement(sql);
				
				//khởi tạp resultset
				ResultSet rs = ptmt.executeQuery();
				
				
				System.out.println("studentid    ||    username     ||      mssv");
				while(rs.next())
				{
					int studentid = rs.getInt("studentid");
					String username = rs.getString("username");
					int mssv = rs.getInt("mssv");
					
					System.out.print(studentid);
					System.out.print("               "+username);
					System.out.println("                  "+mssv);
				}
				
			} 
			catch (SQLException e) 
			{
				System.out.println("Loi: "+e.getMessage());
			}
			
			
		}
}
