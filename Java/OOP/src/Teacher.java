public class Teacher extends Person{
    private long salary;
    address address;

    public Teacher() {
    }

    public Teacher(String name, int age, String address,long salary) {
        super(name, age, address);
        this.salary = salary;
    }
    @Override
    public String toString() {
        
        return name + " " + age + " " + address+" "+salary+" "+address;
    }

    public void sleep(){
        System.out.println(" 8 Hrs per day");
    }
    



    
    
}
