
import java.util.ArrayList;
import java.util.List;


public class Repository {
    public List<User> users;
    public List<User> getData(){
        users = new ArrayList<>();
        users.add(new User(1,"user1","abc@gmail.com","ABCD"));
        users.add(new User(2,"user2","abc2@gmail.com","ABCDf"));
        users.add(new User(3,"user3","abc3@gmail.com","ABCDg"));
        return users;
    }
}
