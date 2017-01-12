package Mypack;

import java.sql.*;
import java.util.*;

public class Xoasinhvien 
{
		public static void Deletestudent()
		{
			Connection conn = DBConnection.Ketnoi();
			Scanner sc = new Scanner(System.in);
			
			int studentid;
			
			System.out.print("Nhap studentid can xoa anh oi: ");
			studentid = sc.nextInt();
			
			
			String sql = "delete from student where studentid = ?";
			
			try 
			{
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ptmt.setInt(1,studentid);
				
				int kt = ptmt.executeUpdate();
				
				if (kt!= 0)
				{
					System.out.println("=>Xoa thanh cong");
				}
						
				
				ptmt.close();
				conn.close();
			} 
			catch (SQLException e) 
			{			
				System.out.println("Loi: "+e.getMessage());
			}
		}
}
