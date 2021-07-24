import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Readfile {
    public void getData() {
        List<Movie> list;
        try {
            FileReader reader = new FileReader("MOCK_DATA.json");
            Type objectType = new TypeToken<List<Movie>>() {}.getType();
            list = new Gson().fromJson(reader, objectType);

            for (Movie movie : list) {
                System.out.println(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
