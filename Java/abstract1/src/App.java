import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       

        ArrayList<kitchen> kitEmp = new ArrayList<kitchen>();
        kitEmp.add(new kitchen(1,"Khiem",20,20000,50000));

        for (kitchen kit : kitEmp) {
            System.out.println(kit);
        }
    
    }
}
