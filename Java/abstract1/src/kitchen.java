public class kitchen extends Employee {
    
      long serviceCharge ;

    public kitchen() {
    }

    public kitchen(int id, String name, int age, long salary, long serviceCharge) {
        super(id, name, age, salary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculateSalary() {
        return (serviceCharge+salary);
        
    }

    @Override
    public String toString() {
        return super.toString()+", "+"serviceCharge=" + serviceCharge+"VNĐ" + " Total :"+ calculateSalary()+"VNĐ"+"]";
    }

    
}
