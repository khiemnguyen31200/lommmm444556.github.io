public class Waiter extends Employee{

    long tip;

    public Waiter() {
        
    }

    public Waiter(int id, String name, int age, long salary, long tip) {
        super(id, name, age, salary);
        this.tip = tip;
    }

    public long getTip() {
        return tip;
    }

    public void setTip(long tip) {
        this.tip = tip;
    }

    @Override
    public long calculateSalary() {
        return (tip+salary);
        
    }

    @Override
    public String toString() {
        return "Waiter [tip=" + tip + "]"+ " "+ calculateSalary()+"VNĐ";
    }


    
}
