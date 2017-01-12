package Mypack;

import java.util.*;

public class Test 
{

	public static void main(String[] args) 
	{
		//tạo menu:
		
		
		int luachon;
		Scanner sc = new Scanner(System.in);
		do
		{
			do
			{
				
				
				
				System.out.println("----------------   DANH SACH SINH VIEN --------------");
				Hienthithongtin.Display();
				
				
				System.out.println("Các lựa chọn: 1. Thêm sinh viên    2. Xóa sinh viên");
				
				System.out.print("Nhap lua chon cua ban: ");
				luachon = sc.nextInt();
				
				if (luachon < 1 || luachon > 2)
				{
					System.out.println("=>Khong co lua cho nay, yeu cau nhap lai!");
				}
				else
				{
					if (luachon == 1)
					{
						Themsinhvien.Insertstudent();
					}
					else
					{
						if (luachon == 2)
						{
							Xoasinhvien.Deletestudent();
						}
					}
				}	
				
			}
			while(luachon < 1 || luachon >2);	
			
			
			
		}
		while(luachon == 1 || luachon == 2);
			
		
	}

}
