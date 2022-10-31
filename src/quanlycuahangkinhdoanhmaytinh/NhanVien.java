/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahangkinhdoanhmaytinh;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class NhanVien extends Person implements Serializable{
    private  String MaNV;
    public NhanVien(){}
    public NhanVien(String MaNV) {
        this.MaNV = MaNV;
    }
   

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    public void nhap()
   {   
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap Ma Nhan Vien: ");
       MaNV = sc.nextLine();
       super.nhap();
   }
   public void xuat()
   {      
       System.out.println("\t====NHAN VIEN====");
       System.out.println("Ma Nhan Vien: "+ MaNV);   
       super.xuat();
   }

   
   
    
  

    public String getMaNV() {
        return MaNV;
    }
}
