import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Person> list;
    public Repository(){
        list = new ArrayList<Person>();
        list.add(new Person(1, "John",24,"California"));
        list.add(new Person(2, "Anthony",26,"Sanfrancisco"));
        list.add(new Person(3, "Jack",24,"New York"));
        list.add(new Person(4, "Tony",24,"Ohio"));
        list.add(new Person(5, "Linda",24,"Sealtor"));
        list.add(new Person(6, "Jeyshe",24,"Vancouver"));
        list.add(new Person(7, "Johnson",24,"BeiJing"));
        list.add(new Person(8, "Loan",24,"Shenzhen"));
    }
    
}
