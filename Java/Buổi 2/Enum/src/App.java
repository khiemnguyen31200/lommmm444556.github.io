public class App {
    // Định nghĩa hằng số - nên định nghĩa ở 1 file riêng biệt
    enum Season{
        SPRING, SUMMER, FALL, WINTER;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Season season = Season.FALL;
        System.out.println(season);
        System.out.println(Weekday.MONDAY);

        Weekday tuesday = Weekday.MONDAY;
        System.out.println(tuesday.getvalue());
    }

    
    
}
