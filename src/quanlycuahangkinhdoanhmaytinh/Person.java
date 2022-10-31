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
public class Person implements Serializable  {
    private String Hoten;
    private String GioiTinh;
    private String SoDienThoai;  
    public Person()
    {
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public Person(String Hoten, String GioiTinh, String SoDienThoai) {
        this.Hoten = Hoten;
        this.GioiTinh = GioiTinh;
        this.SoDienThoai = SoDienThoai;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho Ten: ");
        Hoten = sc.nextLine();
        System.out.print("Nhap Gioi Tinh: ");
        GioiTinh = sc.nextLine();
        System.out.print("Nhap Sdt: ");
        SoDienThoai = sc.nextLine(); 
    }
    public void xuat()
    {
        System.out.println("Ho Ten: "+ Hoten);
        System.out.println("Ho Ten: "+ GioiTinh);
        System.out.println("So Dien Thoai: "+ SoDienThoai);
        
    }

    
    
}
