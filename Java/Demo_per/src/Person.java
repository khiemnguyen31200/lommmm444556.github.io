class Person implements Comparable<Person> {
    int id;
    String name;
    int age;
    String address;
    public int getId() {
        return id;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Person o1) {
        return this.getName().compareTo(o1.getName());
    }
}