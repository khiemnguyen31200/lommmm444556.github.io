public class App {
    public static void main(String[] args) throws Exception {
        address address = new address("Hai ba Trung","Ha Noi","Viet Nam");
        Schoolbook schb = new Schoolbook(01,"A","HN",2013,500,address,300,true,30);

        System.out.println(schb);
        // chồng phương thức 
        Cal calculator = new Cal();
        calculator.sum(5, 7);
        calculator.sum(5, 8,10);
        calculator.sum(5.5,7.7);
        

    }
}
