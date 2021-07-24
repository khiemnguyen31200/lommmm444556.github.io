import java.util.ArrayList;

public class DemoArraylist<T> {
    ArrayList<T> arrayList = new ArrayList<T>();
    
    public ArrayList<T> getArrayList() {
        return arrayList;
    }
    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    // thêm phần tử
    public void add(T value) {
        arrayList.add(value);
    }
    // sửa phần tử
    public void edit(int index, T element) {
        arrayList.set(index, element);
    }
    public void delete(T element) {
        arrayList.remove(element);
    }
    public void print(T ArrayList){
        System.out.println(ArrayList);
    }


}
