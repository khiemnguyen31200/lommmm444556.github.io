import java.util.ArrayList;
import java.util.Scanner;

public class Project extends Book implements IBookLocal {
    private int pageNumber;
    private String Status;
    private int defYear;
    private String ke;
    private String tang;
    
    public Project(int id, String bookName, int publishingYear, String publisherName, int pageNumber, String status,
            int defYear) {
        super(id, bookName, publishingYear, publisherName);
        this.pageNumber = pageNumber;
        Status = status;
        this.defYear = defYear;
    }
    public Project() {
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public int getDefYear() {
        return defYear;
    }
    public void setDefYear(int defYear) {
        this.defYear = defYear;
    }

    public void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng đồ án cần thêm: ");
        int numberQ= scanner.nextInt();
        ArrayList<Project> book = new ArrayList<Project>();
        for (int i = 0; i <numberQ; i++) {
            Project project  = new Project();
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
        Status = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap nam bao ve ");
        defYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vi tri: ");
        System.out.println("Nhap ke: ");
        ke = sc.nextLine();
        System.out.println("Nhap so tang: ");
        tang = sc.nextLine();
    }
    @Override
    public String Local() {   
         return   ke+","+tang;
    }
    @Override
    public String toString() {
        return super.toString()+" - "+ Local() + " - " + pageNumber + " - " + Status + " - " + defYear ;
    }

}
