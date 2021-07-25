import java.util.ArrayList;
import java.util.Scanner;

public class DigitalDocument extends Book implements IDownload {
    private double size;
    private int downloadCount;
    private long price;
    
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng tài liệu cần thêm cần thêm: ");
        int numberQ= scanner.nextInt();
        ArrayList<DigitalDocument> book = new ArrayList<DigitalDocument>();
        for (int i = 0; i <numberQ; i++) {
            DigitalDocument project  = new DigitalDocument();
            project.input();
            book.add(project);
        }
        System.out.println("Danh sách đã thêm: ");
        book.forEach(System.out::println);
    }

    public DigitalDocument(int id, String bookName, int publishingYear, String publisherName, double size,
            int downloadCount, long price) {
        super(id, bookName, publishingYear, publisherName);
        this.size = size;
        this.downloadCount = downloadCount;
        this.price = price;
    }
    public DigitalDocument() {
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap kich thuoc tai lieu ");
        size = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap luot tai ");
        downloadCount = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gia thanh : ");
        price = sc.nextLong();
    }

    @Override
    public long totalMoney() {
        return getPrice();
    }
    @Override
    public String toString() {
        return super.toString()+" - " + size+ "MB" + " - " + downloadCount + " - " + price;
    }

}
