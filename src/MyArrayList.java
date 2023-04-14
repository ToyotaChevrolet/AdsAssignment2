import java.util.List;

public class MyArrayList<T> implements List<T> {

    private Object[] arr;
    private int length;

    public MyArrayList() {
        this(5);
    }

    public MyArrayList(int initialCapacity) {
        arr = new Object[initialCapacity];
    }


}
