public class library {
    int maSach;
    String tenSach;
    String Nxb;
    int namXB;
    int soLuong;
    address address;
    
    public library() {
    }
    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
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
    public int getNamXB() {
        return namXB;
    }
    public library(int maSach, String tenSach, String nxb, int namXB, int soLuong, address address) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.Nxb = nxb;
        this.namXB = namXB;
        this.soLuong = soLuong;
        this.address = address;
    }
    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public address getAddress() {
        return address;
    }
    public void setAddress(address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return maSach+" "+tenSach+" "+Nxb+" "+namXB+" "+soLuong+" "+address;
    }

    
}
