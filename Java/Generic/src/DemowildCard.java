import java.util.ArrayList;
import java.util.List;

public class DemowildCard {
    List<String> name ;
    List<Integer> numbers ;
    public void createListName(){
        name = new ArrayList<>();
        name.add("Hung");
        name.add("Sơn");
        name.add("Manh");
        print(name);

    }
    public void print(List<?> list){
        for (Object object : list) {
            System.out.println(object);  
        }
    }  
    public void CreateListNumber(){
        numbers= new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(0);  
        print(numbers);
    }
}
