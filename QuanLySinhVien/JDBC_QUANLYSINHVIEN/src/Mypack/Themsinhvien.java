package Mypack;

import java.sql.*;
import java.util.*;

public class Themsinhvien 
{
		/*1. import thư viện
		 * 2. 
		 * 2.1: khởi tạo đối tượng conection, PreparedStatement
		 * 2.2: gán kết nối cho đối tượng connection vừa tạo
		 * 3. thêm dữ liệu: 
		 * 3.1: vào trong mysql, tạo 1 bàng có tên student chứ 2 thuộc tính: mssv, username trong csdl:quanlysinhvien
		 * 3.2: khai báo chuỗi sql thêm dữ liệu
		 * 3.3: khai báo 2 biên, username, mssv.
		 * 4. truyền chuỗi sql vào trong đối tương PreparedStatement
		 * 5. thực thi sql đó
		 * 6. đóng đối tượng PreparedStatement
		 * */
	
		
		
		public static void Insertstudent()
		{
			Connection conn = null;
			PreparedStatement ptmt = null;
			Scanner sc = new Scanner(System.in);
			
			conn = DBConnection.Ketnoi();
			
			//khai báo 2 biến username, mssv
			String username;
			int mssv;
			
			System.out.print("Nhap username: ");
			username = sc.nextLine();
			
			
			//thêm 1 hàm chuẩn hóa chuỗi
			username = Themsinhvien.Chuanhoachuoi(username);
			
			
			System.out.print("Nhap mssv: ");
			mssv = sc.nextInt();
			
			//kiểm tra mssv trùng
			
			if (Themsinhvien.Kiemtramssvtrung(mssv))
			{
				String sql = "insert into student(username,mssv)  values (?,?)";
				
				try 
				{
					ptmt = conn.prepareStatement(sql);
					
					ptmt.setString(1,username);
					ptmt.setInt(2,mssv);
					
					int kt = ptmt.executeUpdate();
					if (kt != 0)
					{
						System.out.println("=>Them thanh cong");
						
					}
					else
					{
						System.out.println("=>Them khong thanh cong");
					}
					
					ptmt.close();
					conn.close();
					
				} 
				catch (SQLException e) 
				{		
					System.out.println("Loi: "+e.getMessage());
				}	
			}
			else
			{
				System.out.println("mssv bi trung. Yeu cau nhap lai!");
			}
			
						
			
		}
		
		public static String Chuanhoachuoi(String chuoichuan)
		{
				//tách từ sử dụng split
			
				//" " -> \\s
				//\\s+
				String[] str = chuoichuan.split("\\s+");
				
				String chuoisaukhichuan = "";
				
				for (int i = 0; i< str.length;i++)
				{
	
						chuoisaukhichuan += String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1).toLowerCase();
						if (i < str.length)
						{
							chuoisaukhichuan += " ";
						}
				}
				
				return chuoisaukhichuan;
				
		}
		
		private static boolean Kiemtramssvtrung(int mssv)
		{
			boolean kiemtra = true;
			
			Connection conn = DBConnection.Ketnoi();
			
			String sql = "select mssv from student";
			
			try 
			{
				PreparedStatement ptmt = conn.prepareStatement(sql);
				
				
				ResultSet rs = ptmt.executeQuery();
				
				
				while(rs.next())
				{
					int mssvkiemtra = rs.getInt("mssv");
					
					if (mssvkiemtra == mssv)
					{
						kiemtra = false;
					}
				}
				
			} 
			catch (SQLException e) 
			{
				System.out.println("Loi: "+e.getMessage());
			}
			
			
			return kiemtra;
		}
		
		
}
