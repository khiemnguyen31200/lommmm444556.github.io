public abstract class Employee {
    int id;
    String name;
    int age;
    String phoneNumber;
    String email;
    long salary;

    public Employee(int id, String name, int age, String phoneNumber, String email, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public abstract long SalaryofEmployee();

    public Employee() {
    }

    public int getId() {
        return id;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
       
        return id+"-"+name+"-"+age+"-"+phoneNumber+"-"+email+"-"+salary;
    }

}