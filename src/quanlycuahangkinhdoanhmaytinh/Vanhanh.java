/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahangkinhdoanhmaytinh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Vanhanh {
     public static void menu() {   
        System.out.println("==============MENU=============");
        System.out.println("1. Nhap Hoa Don ");
        System.out.println("2. Xuat Hoa Don ");
        System.out.println("3. Tong Tien Theo Ma Hoa Don ");
        System.out.println("4. Tim Kiem Hoa Don Theo Ma Khach Hang ");
        System.out.println("5. Tong Tien Toan Bo Hoa Don ");
        System.out.println("6. Thoat ");
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
       DSHoaDon dshd = new DSHoaDon();
       int chon;
       do
       {
           menu();
           System.out.print("Lua Chon Cua Ban: ");
           Scanner sc = new Scanner (System.in);
           chon = sc.nextInt();
           switch (chon)
           {
               case 1: 
               {
                   System.out.println("===Nhap Danh Sach Hoa Don===");
                   dshd.nhapDSHD();
                   DSHoaDon.ghiDSHoaDonFile(dshd);
                   break; 
               }
               case 2:
               {
                   System.out.println("===Danh Sach Hoa Don===");
                   dshd.hienDSHD();
                   DSHoaDon.docDSHoaDonFile();
                   break; 
               }
               case 3:
               {
                   System.out.println("");
                   dshd.tongTienMaHoaDon();
                   break; 
               }
               case 4:
               {
                   System.out.println("");
                   dshd.timKiemHoaDonTheoKhachHang();
                   break; 
               }
               case 5:
               {
                   System.out.println("");
                   dshd.TongCacHoaDon();
                   break; 
               }
           }
       } while(chon !=6);
    }
}
