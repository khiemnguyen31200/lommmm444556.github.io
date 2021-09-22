import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static List<Person> init() throws FileNotFoundException {
        String source = "person.json";
        BufferedReader br = new BufferedReader(new FileReader(source));
        Type type = new TypeToken<List<Person>>(){}.getType();
        List<Person> myList = new Gson().fromJson(br, type);
        return myList;
    }

    public static void main(String[] args) throws FileNotFoundException {

        List<Person> list = init();
        List<Person> filterAge = list.stream()
                .filter(person -> person.getAge() >= 20 && person.getAge() <= 30)
                .collect(Collectors.toList());
        System.out.println(filterAge);
        double avg = list.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.printf("Average age all countries: %.2f \n", avg);
        System.out.println("Average age by Country: ");
        Set<String> countries = list.stream().map(Person::getNationality).collect(Collectors.toSet());
        for (String country : countries) {
            double avgByCountry = list.stream()
                    .filter(person -> person.getNationality().equals(country))
                    .mapToInt(Person::getAge)
                    .average()
                    .getAsDouble();
            System.out.printf("%s = %.1f \n", country, avgByCountry);
        }
    }

}