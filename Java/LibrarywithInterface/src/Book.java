import java.util.Scanner;

public class Book {
    int id;
    String bookName;
    int publishingYear;
    String publisherName;
    public Book(int id, String bookName, int publishingYear, String publisherName) {
        this.id = id;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.publisherName = publisherName;
    
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        id = sc.nextInt();
        System.out.println("Nhap ten sach: ");
        sc.nextLine();
        bookName = sc.nextLine();
        System.out.println("Nam xuat ban: ");
        publishingYear =sc.nextInt();
        System.out.println("Nha xuat ban: ");
        sc.nextLine();
        publisherName = sc.nextLine();
    }

    @Override
    public String toString() {
        return id + " - " +bookName+" - " +publisherName+" - " +publishingYear;
    }
    public Book() {
    }
}
