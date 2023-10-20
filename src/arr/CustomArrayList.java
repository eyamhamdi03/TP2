package arr;

public class CustomArrayList {
    private int[] array;
    private int size;
    private int capacity;

    public CustomArrayList() {
        this(10); 
    }

    public CustomArrayList(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("Initial size must be greater than 0");
        }
        array = new int[initialSize];
        capacity = initialSize;
        size = 0;
    }

    public void add(int obj) {
        if (size == capacity) {
            capacity *= 2;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = obj;
        size++;
    }

    public void add(int index, int x) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (size == capacity) {
            capacity *= 2;
           int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = x;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isIn(int x) {
        return find(x) != -1;
    }

    public int find(int x) {
        for (int i = 0; i < size; i++) {
            if (array[i]==x) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int x) {
        int index = find(x);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }


}
