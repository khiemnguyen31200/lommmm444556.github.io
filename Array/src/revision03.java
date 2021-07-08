import java.time.LocalDate;
import java.util.Random;

public class revision03 {
    
        LocalDate date;
        int number;
        int Pre;

        Random rd = new Random();

        public revision03() {
            this.date = LocalDate.now();
            this.number = rd.nextInt(100);
        }

        @Override
        public String toString() {
            return date + " : " + number;
        }
        
    
}
