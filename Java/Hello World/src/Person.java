public class Person {
    
    int age = 20;
    public void getAge(){
        System.out.println(age);
    }

    public void increaseAge(){
        System.out.println(age +10);
    }

    public static void introduceMyself2(String name, int age , String address){
        System.out.println("Tên :" +name);
        System.out.println("Tuổi :"+age);
        System.out.println("Địa chỉ : "+address);

    }
}
