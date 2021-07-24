public class Triangle extends Shape implements Itriangle{

    int a;
    int b;
    int c;

    @Override
    public void Chuvi() {
        System.out.println("Chu vi của tam giác là " + (a+b+c));
        
    }

    @Override
    public void Square() {
        
        System.out.println("Dien tich " + (Height()*a));
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Height() {
        double height =(double)(a+b+c)/2;  
        return height;
        
    }

    
    
    
}
