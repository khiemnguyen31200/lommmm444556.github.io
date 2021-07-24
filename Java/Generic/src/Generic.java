import java.util.Arrays;

public class Generic<T> {
    public T[] array;

    

    public T[] getArray() {
        return array;
    }



    public void setArray(T[] array) {
        this.array = array;
    }



    @Override
    public String toString() {
        return "Generic [array=" + Arrays.toString(array) + "]";
    }

    public T getlast(String[] languages) {
        return array[array.length - 1];
    }
    public void print(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

   

}
