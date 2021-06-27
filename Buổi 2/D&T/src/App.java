import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App {
    // khai báo hằng số
    final double PI =3.14;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // lấy ngày tháng
        LocalDate today = LocalDate.now();
        System.out.println("Hôm nay là : "+today);
        LocalDate crrdate = LocalDate.of(2000, Month.DECEMBER,3);
        System.out.println(crrdate);
        System.out.println(today.getDayOfYear());

        System.out.println((today.plusDays(1)));

        // lấy thời gian
        LocalTime crrTime = LocalTime.now();
        System.out.println(crrTime);

        LocalTime lctime = LocalTime.of(12,30);
        System.out.println(lctime);
        System.out.println(lctime.getHour());
        System.out.println(lctime.plusHours(5));

        LocalDateTime hn = LocalDateTime.now();
        System.out.println(hn);
        LocalDateTime lcDT = LocalDateTime.of(2021, 6, 23, 12, 30, 00);
        System.out.println(lcDT);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-YYYY , HH:mm");
        String date = hn.format(myFormat);
        System.out.println(date);

        // Lưu ý d-ngày M-Tháng y-Năm H-giờ m-Phút s-giây 

        // Ép kiểu

        int a =5;
        double b = a;
        System.out.println(b);

        double d =10.1;
        int i = (int)d;
        System.out.println(i);

        String S ="5";
        int n = Integer.valueOf(S);
        double dnum = Double.valueOf(S);



    
    }
}
