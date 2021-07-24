public class Schoolbook extends library {
    int  pageNumber;
    boolean Status;
    int  rentNumber;
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public Schoolbook(int maSach, String tenSach, String nxb, int namXB, int soLuong, address address, int pageNumber,
            boolean status, int rentNumber) {
        super(maSach, tenSach, nxb, namXB, soLuong, address);
        this.pageNumber = pageNumber;
        Status = status;
        this.rentNumber = rentNumber;
    }
    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
    public int getRentNumber() {
        return rentNumber;
    }
    public void setRentNumber(int rentNumber) {
        this.rentNumber = rentNumber;
    }
    public int tonKho(){
        return soLuong-rentNumber;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return maSach+" "+tenSach+" "+Nxb+" "+namXB+" "+soLuong+"pcs"+" "+pageNumber+"pages"+" "+Status+" "+rentNumber+"pcs"+" "+"Tồn kho"+ " "+tonKho()+"pcs"+" "+address;
    }

}
