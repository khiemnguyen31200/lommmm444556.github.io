public class CIrcle extends Shape {
    int r ;

    public CIrcle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void Chuvi() {
       System.out.printf("Chu vi hinh tron nay la%.2f\n",(r*2* Math.PI));
        
    }

    @Override
    public void Square() {
        System.out.printf("Dien tich hinh tron nay là %.2f",(Math.pow(r,2)*Math.PI));
        
    }
    
    
    
    
}
