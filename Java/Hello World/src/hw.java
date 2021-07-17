public class hw {
    int num1 = 10;
    int num2 =20;
    // nếu trả về cái gì đó phải có return

    public int add(){
    int s = num1+num2;
    return s;
    }
    public int minuss(){
    int d = num1- num2;
    return d;
    }
    public float div(){
        return  (float)num2/num1;
    }
    public int mul(){
        return  num2*num1;
    }

    public  void result(){
        System.out.println(" Ket qua theo thu tu cong tru nhan chia la " + add()+" , "+minuss()+" , "+mul()+" , "+div());
    }
    public static void main(String[] args) throws Exception{
        String fname = "Nguyen";
        String lname = "Hoa Khiem";
        int tuoi = 20;
        String add;
        int hnumber = 51;
        String str = "Nguyen Khoai";
        String dis = "Hai Ba Trung";
        String ct = "Ha Noi";
        

add = "Number"+" "+hnumber+" , "+str+" "+"Street"+" , "+dis+" "+"district"+" , "+ct+" "+"city";
// Gioi thieu ban than
     System.out.println("Hello! My full name is "+fname+" "+lname+". I am "+tuoi+" years old. My address is "+add);
// Bai cong tru nhan chia
     hw hw = new  hw();
     hw.result();
    }

}
