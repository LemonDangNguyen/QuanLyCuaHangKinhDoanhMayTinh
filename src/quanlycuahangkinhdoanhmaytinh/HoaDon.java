/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycuahangkinhdoanhmaytinh;

import java.util.*;
import java.io.*;


/**
 *
 * @author nguye
 */
public class HoaDon implements Serializable{
    private String MaHD;
    ArrayList<MayTinh> lstMT = new ArrayList();
    ArrayList<KhachHang> lstKH = new ArrayList();
    NhanVien nv = new  NhanVien();
    KhachHang kh = new KhachHang();
    
    private int ngay, thang, nam, soluongMT;
    
    public HoaDon()
    {
        
    }
    public HoaDon(String MaHD, NhanVien nv, int ngay, int thang, int nam, int soluongMT) {
        this.MaHD = MaHD;
      //  this.nv = nv;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.soluongMT = soluongMT;
    }

    

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public ArrayList<MayTinh> getLstMT() {
        return lstMT;
    }

    public void setLstMT(ArrayList<MayTinh> lstMT) {
        this.lstMT = lstMT;
    }

    

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void nhaphd()
    {
        System.out.println("\t==Nhap Thong Tin Hoa Don==");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma HD: ");
        MaHD = sc.nextLine();
        
        System.out.print("Nhap Ngay/ Thang/ Nam Xuat Hoa Don: ");
        ngay= sc.nextInt(); thang = sc.nextInt(); nam = sc.nextInt();
        
        System.out.print("\t Nhap Nhan Vien\n");
        nv.nhap();
        System.out.print("\t Nhap Khach Hang\n");
        kh.nhap();
        lstKH.add(kh);
        System.out.print("Nhap So Luong may tinh: ");
        soluongMT = sc.nextInt();
        lstMT = new ArrayList<>();
        for( int i=0; i<soluongMT; i++)
        {
            MayTinh mt = new MayTinh();
            mt.nhap();
            lstMT.add(mt);
        } 
    }

    public void hienhd()
    {
        System.out.println("\n");
        System.out.println("Ma Hoa Don: "+MaHD);
        System.out.println("So Luong May Tinh: "+soluongMT);
        System.out.println("Thoi Gian Lap Hoa Don: "+ngay+"/ "+thang+"/ "+nam);
        nv.xuat();
        kh.xuat();
        System.out.print("Danh Sach May Tinh");
        for(MayTinh mt: lstMT)
        {
            mt.xuat();  
        }
       
       
    }
    public float tongTien()
    {
        
        float tongtien =0;
        for(MayTinh mt: lstMT)
        {
            tongtien+=mt.tinhTien();
        }
        System.out.println("");
        System.out.println("Tong Tien Hoa Don la: "+tongtien);
        return tongtien;
    }
    public static void ghiHoaDonFile (HoaDon hd) throws FileNotFoundException, IOException
    {
        File fhd = new File ("hoadon.dat");
        FileOutputStream fout = new FileOutputStream(fhd);
        ObjectOutputStream out = new ObjectOutputStream (fout);
        out.writeObject(hd);
        out.close();
        fout.close();
    }
    public static HoaDon docHoaDonFile() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        HoaDon hd = new HoaDon();
        File fhd = new File ("hoadon.dat");
        FileInputStream fin = new FileInputStream(fhd);
        ObjectInputStream in = new ObjectInputStream(fin);
        hd= (HoaDon)in.readObject();
        fin.close();
        in.close();
        return hd;

    }
  
}
