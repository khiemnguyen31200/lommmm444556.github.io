

public class Student {
    String name;
    String email;
    String phone;
    boolean Status;
    int date;
    int month;
    int year;
    String address="HN";

    public Student(String name, String email, String phone, boolean status, int date, int month, int year) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        Status = status;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " +phone+" "+email+" "+Status+" "+date+" "+month+" "+year+" "+address;
    }
    

    
    
   
    
    



}
