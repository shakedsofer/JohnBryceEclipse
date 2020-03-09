import java.util.Arrays;

public class DynamicStringsArray {
    /*A strategy by which the array will grow double its current space, when no room is available*/
    public static final int STRATEGY_DOUBLE = 0;
    /*A strategy by which the array will grow by 50% of its current space, when no room is available*/
    public static final int STRATEGY_50 = 1;
    /*Default capacity of 'data'*/
    private static final int CAPACITY_DEFAULT = 4;

    /*The array containing all strings.*/
    private String[] data;
    /*Current amount of elements in 'data'*/
    private int size;
    /*The grow strategy*/
    private final int strategy;

    public DynamicStringsArray(int capacity, int strategy) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity can not be equal or less than 0.");
        }

        this.data = new String[capacity];
        /*TODO: Check that strategy is valid. i.e. ( STRATEGY_DOUBLE or STRATEGY_50 )*/
        this.strategy = strategy;
        this.size = 0;
    }

    public DynamicStringsArray() {
        this(CAPACITY_DEFAULT, STRATEGY_DOUBLE);
    }

    public synchronized int indexOf(String element) {
        for (int index = 0; index < size; index++) {
            if (data[index].equals(element)) {
                return index;
            }
        }
        return -1;
    }

    private String[] copy(String[] dest, int count) {
        if (count >= 0) {
            System.arraycopy(data, 0, dest, 0, count);
        }
        /*TODO: Do I really need to return dest?*/
        return dest;
    }

    private void changeCapacity(int capacity) {
        String[] newData = new String[capacity];
        boolean growing = capacity > data.length;

        data = copy(newData, growing ? data.length : capacity);
    }

    private int getGrowCapacity() {
        /*STRATEGY_50*/
        return strategy == STRATEGY_DOUBLE ?
                data.length * 2
                :
                (int) (data.length * 1.5);
    }

    public synchronized void add(String element) {
        if (data.length == size) {
            grow();
        }

        data[size++] = element;
    }

    private void grow() {
        changeCapacity(getGrowCapacity());
    }

    public synchronized void clip() {
        if (size < data.length) {
            changeCapacity(size == 0 ? 1 : size);
        }
    }

    public synchronized boolean contains(String element) {
        return indexOf(element) != -1;
    }

    public synchronized boolean isEmpty() {
        return size == 0;
    }

    public synchronized void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index " + index + " is out of bounds!");
        }

        for (int i = index; i + 1 < size; i++) {
            data[i] = data[i + 1];
        }

        data[--size] = null;
    }

    public synchronized void clear() {
        data = new String[data.length];
        size = 0;
    }

    public synchronized void clear(boolean clip) {
        clear();

        if (clip) {
            clip();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
