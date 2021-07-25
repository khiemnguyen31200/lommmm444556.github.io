import java.util.ArrayList;
import java.util.Scanner;

public class TextBook extends Book implements IRent,IBookLocal {
    private int pageNumber;
    private String status;
    private int TotalQuantity;
    private int rentQuantity;
    private String ke;
    private String tang;

    public TextBook(int id, String bookName, int publishingYear, String publisherName, int pageNumber,
            String status, int totalQuantity, int rentQuantity) {
        super(id, bookName, publishingYear, publisherName);
        this.pageNumber = pageNumber;
        this.status = status;
        TotalQuantity = totalQuantity;
        this.rentQuantity = rentQuantity;
    }

    public String getKe() {
        return ke;
    }

    public void setKe(String ke) {
        this.ke = ke;
    }

    public String getTang() {
        return tang;
    }

    public void setTang(String tang) {
        this.tang = tang;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalQuantity() {
        return TotalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        TotalQuantity = totalQuantity;
    }

    public int getRentQuantity() {
        return rentQuantity;
    }

    public void setRentQuantity(int rentQuantity) {
        this.rentQuantity = rentQuantity;
    }
    public void insert(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách giáo khoa cần thêm: ");
        int numberQ= scanner.nextInt();
        ArrayList<TextBook> book = new ArrayList<TextBook>();
        for (int i = 0; i <numberQ; i++) {
            TextBook project  = new TextBook();
            project.input();
            book.add(project);
        }
        System.out.println("Danh sách đã thêm: ");
        book.forEach(System.out::println);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap so trang: ");
        pageNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tinh trang: ");
        status = sc.nextLine();
        sc.nextLine();
        System.out.println("Tong so luong: ");
        TotalQuantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so luong muon: ");
        rentQuantity = sc.nextInt();
        System.out.println("Nhap vi tri: ");
        sc.nextLine();
        System.out.println("Nhap ke: ");
        ke = sc.nextLine();
        System.out.println("Nhap so tang: ");
        tang = sc.nextLine();
    }

    @Override
    public int tonKho() {
        return getTotalQuantity() - rentQuantity;
    }

    @Override
    public String Local() { 
        return   ke+","+tang;
    }
    @Override
    public String toString() {
        return super.toString()+" - "+ Local() + " - " + pageNumber + " - " + status + " - " + rentQuantity + " - " + tonKho();
    }

    public TextBook() {
    }

    
}
