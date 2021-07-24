import java.util.Scanner;

public class Library{
    private String maSach;
    private String tenSach;
    private String Nxb;
    private int namXuatBan;
    private int soluong;
    private Local vitri;

    
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getNxb() {
        return Nxb;
    }
    public void setNxb(String nxb) {
        Nxb = nxb;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public Library(String maSach, String tenSach, String nxb, int namXuatBan, int soluong, Local vitri) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        Nxb = nxb;
        this.namXuatBan = namXuatBan;
        this.soluong = soluong;
        this.vitri = vitri;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public Local getVitri() {
        return vitri;
    }
    public void setVitri(Local vitri) {
        this.vitri = vitri;
    }

    public void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ma sach");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach");
        
    }

    



}