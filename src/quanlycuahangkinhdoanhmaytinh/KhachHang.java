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
public class KhachHang extends Person implements Serializable{
    private String DiaChi;
    private String maKH;
    public KhachHang()
    {
        super();
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public void nhap()
    {
       super.nhap();
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap Ma Khach Hang: ");
       maKH = sc.nextLine();
       System.out.print("Nhap Dia Chi Khach Hang: ");
       DiaChi = sc.nextLine();
    }
    @Override
     public void xuat()
   {
       System.out.println("\t====KHACH HANG====");
       System.out.println("Ma Khach Khach Hang: "+ maKH);
       super.xuat();
       System.out.println("Dia Chi Khach Hang: "+ DiaChi);    
   }
}
