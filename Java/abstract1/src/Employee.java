public abstract class Employee {

    int id;
    String name;
    int age;
    long salary;
    public abstract long calculateSalary();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary+"VND" ;
    }

    

    


   
}
