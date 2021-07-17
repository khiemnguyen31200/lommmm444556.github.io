public class Player {
    String fullName;
    int number;
    position position;
    
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public position getPosition() {
        return position;
    }
    public void setPosition(position position) {
        this.position = position;
    }
    public Player(int number,String fullName, position position) {
        this.fullName = fullName;
        this.number = number;
        this.position = position;
    }
    
@Override
public String toString() { 
    return fullName + "-" +number + "-" +position;
}
    
}
