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
public class MayTinh implements Serializable{
    private String TenSP;
    private String MaSP;
    private String XuatSuSP;
    private int maytinh = 1;
    private float GiaSP;
    
    public MayTinh()
    {
        
    }
    public MayTinh(String TenSP, String MaSP, String XuatSuSP, float GiaSP) {
        this.TenSP = TenSP;
        this.MaSP = MaSP;
        this.XuatSuSP = XuatSuSP;
        this.GiaSP = GiaSP;
    }

    

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getXuatSuSP() {
        return XuatSuSP;
    }

    public void setXuatSuSP(String XuatSuSP) {
        this.XuatSuSP = XuatSuSP;
    }

    public float getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(float GiaSP) {
        this.GiaSP = GiaSP;
    }
    public void nhap()
    {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap Ten May Tinh: ");
          TenSP = sc.nextLine();
          System.out.print("Nhap Ma May Tinh: ");
          MaSP = sc.nextLine();
          System.out.print("Nhap Xuat Su May Tinh: ");
          XuatSuSP = sc.nextLine();
          System.out.print("Nhap Gia May Tinh(VND): ");
          GiaSP = sc.nextFloat();
          System.out.println("\n");
    }
    public void xuat ()
    {
       System.out.print(toString());
    }

    @Override
    public String toString() {
        
        return "\nMayTinh{" + "TenSP=" + TenSP + ", MaSP=" + MaSP + ", XuatSuSP=" + XuatSuSP + ", GiaSP=" + GiaSP +"VND"+ "}"+"\n";
    }
    public float tinhTien()
    {
        return GiaSP;
    }
    
    
}
