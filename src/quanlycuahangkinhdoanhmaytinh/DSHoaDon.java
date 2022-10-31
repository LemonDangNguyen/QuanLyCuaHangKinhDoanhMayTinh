package quanlycuahangkinhdoanhmaytinh;
import java.util.*;
import java.io.*;


/**
 *
 * @author nguye
 */
public class DSHoaDon implements Serializable {
    private ArrayList<HoaDon> lstHD = new ArrayList<>();
    private ArrayList<KhachHang> lstKH = new ArrayList();
    private int soLuongHD;
    private String maKHCanTim, maHDcanTim;
    
    public void nhapDSHD() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So Luong Hoa Don: ");
        soLuongHD = sc.nextInt();
        for (int i=0; i<soLuongHD; i++)
        {
            HoaDon hd = new HoaDon();
            hd.nhaphd();
            lstHD.add(hd);
           HoaDon.ghiHoaDonFile(hd);
        }
    }
    public void hienDSHD() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        
       for(HoaDon hd: lstHD)
        {
           hd.hienhd();
            HoaDon.docHoaDonFile();
        }
    }
    public void tongTienMaHoaDon()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Hoa Don Can Tim: ");
        maHDcanTim = sc.nextLine();
        for(HoaDon hd: lstHD)
        {
            if(hd.getMaHD().equalsIgnoreCase(maKHCanTim))
            {
                hd.tongTien();
                hd.hienhd();
            }
        }
    }
    public void timKiemHoaDonTheoKhachHang()
    {
       Scanner sc = new Scanner (System.in);
       System.out.print("Nhap Ma Khach Hang: ");
       maKHCanTim = sc.nextLine();
       for(HoaDon hd: lstHD)
       {
           for(KhachHang kh: lstKH)
                {
                    if( kh.getMaKH().equalsIgnoreCase(maKHCanTim))                   
                    {
                        kh.xuat();
                        hd.hienhd();
                    } 
                } 
           
       }
       
    }
    public void TongCacHoaDon()
    {
        float tongtatcaHoaDon =0;
        for(HoaDon hd: lstHD)
        {
            tongtatcaHoaDon += hd.tongTien();
        }
        System.out.println("Tong Tien Tat Ca Cac Hoa Don La: "+ tongtatcaHoaDon);
    }
    public static void ghiDSHoaDonFile (DSHoaDon x) throws FileNotFoundException, IOException
    {
        File fhd = new File ("DShoadon.dat");
        FileOutputStream fout = new FileOutputStream(fhd);
        ObjectOutputStream out = new ObjectOutputStream (fout);
        out.writeObject(x);
        out.close();
        fout.close();
    }
    public static DSHoaDon docDSHoaDonFile() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        DSHoaDon x = new DSHoaDon();
        File fhd = new File ("DShoadon.dat");
        FileInputStream fin = new FileInputStream(fhd);
        ObjectInputStream in = new ObjectInputStream(fin);
        x= (DSHoaDon)in.readObject();
        fin.close();
        in.close();
        return x;

    }
}
