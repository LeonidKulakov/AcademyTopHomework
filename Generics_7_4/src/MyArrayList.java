import java.util.Random;

/**
 * @author Kulakov Leeonid
 * @version 1.0
 */
public class MyArrayList<T> {
    private T[] data;
    private int size;
    private int capacity;

    //    private Class <T> aClass;
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public MyArrayList() {
        this(10);
    }

    /**
     * This function return int size
     */
    public int getSize() {
        return size;
    }

    /**
     * This function converts array data in String
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            builder.append(" ");
        }
        return builder.toString();
    }

    /**
     * This function check size and convert the array data to a larger array
     **/
    private void ensureCapacity() {
        if (size >= capacity) {
            T[] newArray = (T[]) new Object[(int) (capacity * 1.5 + 1)];
            System.arraycopy(data, 0, newArray, 0, data.length);
            data = newArray;
            capacity = (int) (capacity * 1.5 + 1);
        }
    }

    /**
     * This function push one element at the end of the array
     *
     * @param element element for push
     */
    public void pushBack(T element) {
        size++;
        ensureCapacity();
        data[size - 1] = element;
    }

    /**
     * This function delete the first element
     */
    public void popFront() {
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size - 1; i++) {
            newArray[i] = data[i + 1];
        }
        size--;
        data = newArray;
    }

    /**
     * This function push one element at the beginning of the array
     *
     * @param element element for push
     */
    public void pushFront(T element) {
        size++;
        ensureCapacity();
        T[] newArray = (T[]) new Object[capacity];
        newArray[0] = element;
        for (int i = 0; i < size - 1; i++) {
            newArray[i + 1] = data[i];
        }
        data = newArray;
    }

    /**
     * This function puts one element into the slot at the specified index
     *
     * @param element element for push
     * @param index   index of slot
     */
    public void insert(T element, int index) {
        if (checkIndex(index)) {
            size++;
            ensureCapacity();
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                newArray[i] = data[i];
            }
            newArray[index] = element;
            for (int i = index + 1; i < size; i++) {
                newArray[i] = data[i - 1];
            }
            data = newArray;
        }
    }

    private boolean checkIndex(int index) {
        if (index < size) {
            return true;
        } else {
            System.out.println("Index out of range");
            return false;
        }
    }

    /**
     * This function delete one element into the slot at the specified index
     *
     * @param index index of slot
     */
    public void removeAt(int index) {
        if (checkIndex(index)) {
            size--;
            ensureCapacity();
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                newArray[i] = data[i];
            }
            for (int i = (index); i < size; i++) {
                newArray[i] = data[i + 1];
            }
            data = newArray;
        }
    }

    /**
     * This function finds and delete one element
     *
     * @param element element to search
     */
    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                removeAt(i);
                break;
            }
        }
    }

    /**
     * This function finds and delete all element
     *
     * @param element element to search
     */
    public void removeAll(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                removeAt(i);
                i--;
            }
        }
    }

    /**
     * This function delete the end element
     */
    public void popBack() {
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size - 1; i++) {
            newArray[i] = data[i];
        }
        size--;
        data = newArray;
    }

    /**
     * This function delete all element
     */
    public void clear() {
        T[] newArray = (T[]) new Object[capacity];
        size = 0;
        data = newArray;
    }

    /**
     * This function check the size
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This function cuts the capacitance to size
     */
    public void trimToSize() {
        capacity = size;
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < capacity; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    /**
     * This function checks the element and returns the index or -1 if the element is not found
     *
     * @param element element to search
     */
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This function checks the element and returns the index or -1 if the element is not found
     *
     * @param element element to search
     */
    public int lastIndexOf(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This function changing the order of elements in an array to the opposite
     */
    public void reverse() {
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = data[size - 1 - i];
        }
        data = newArray;
    }

    /**
     * @deprecated This is an old method for internal use, please use getElementAt()
     */
    private <T> T getElement(int index) {
        return (T) data[index];
    }

    /**
     * This function shuffles all elements
     */
    public void shuffle() {
        MyArrayList<Integer> arr = new MyArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arr.pushBack(i);
        }
        int ind;
        Random random = new Random();
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < data.length; i++) {
            if (arr.getSize() != 0) {
                ind = random.nextInt(arr.getSize());
                newArray[i] = data[(int) arr.getElement(ind)];
                arr.removeAt(ind);
            }
        }
        data = newArray;
    }
/**
 * This function compares MyArrayList
 * @param myArrayList object to compare
 * */
    public boolean equals(MyArrayList myArrayList) {
        if (size == myArrayList.getSize()) {
            for (int i = 0; i < size; i++) {
                if (!data[i].equals(myArrayList.getElement(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    /**
     *
     * This function gets the element from the slot at the specified index
     * */
    public <T> T getElementAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index + 1 <= size) {
            return (T) data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
/**
 * This function return clone MyArrayList
 * */
    public MyArrayList clone(){
        MyArrayList myArrayList1 = new MyArrayList();
        for (int i = 0; i < size; i++) {
            myArrayList1.pushBack(data[i]);
        }
        return myArrayList1;
    }
}
