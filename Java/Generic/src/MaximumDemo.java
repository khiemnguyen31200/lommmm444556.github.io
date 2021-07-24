public class MaximumDemo {
    public <T extends Comparable <T>> T findMax(T a , T b) {
        T max = a;

        if(b.compareTo(max)>0){
            max = b;
        }
        return max;


    }
    public static void main(String[] args){
        MaximumDemo demo = new MaximumDemo();
        System.out.println("Giá trị lớn nhất" +demo.findMax(4, 7));
        System.out.println("Giá trị lớn nhất" +demo.findMax(5.4, 6.7));
        System.out.println("Giá trị lớn nhất" +demo.findMax("Java", "Python"));
    }
}
