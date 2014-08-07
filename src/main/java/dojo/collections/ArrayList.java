package dojo.collections;

public class ArrayList implements List {

    private static final int DEFAULT_SIZE = 10;
    private static int CURRENT_SIZE = DEFAULT_SIZE;

    private Object[] elements;
    private int length = 0;

    public ArrayList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public Object get(int index) {
        throwIndexOutOfBoundsExceptionIfBeyondLength(index);

        return elements[index];
    }

    public int length() {
        return length;
    }

    public void add(Object element) {
        if (length == elements.length) {
            CURRENT_SIZE = CURRENT_SIZE * 2;
            elements = new Object[CURRENT_SIZE];
        }
        elements[length] = element;
        length++;
    }

    public void insert(Object element, int index) {
        for (int currentIndex = length; currentIndex >= index; currentIndex--) {
            elements[currentIndex + 1] = elements[currentIndex];
        }
        elements[index] = element;
        length++;
    }

    public void replace(Object element, int index) {
        throwIndexOutOfBoundsExceptionIfBeyondLength(index);

        elements[index] = element;
    }

    private void throwIndexOutOfBoundsExceptionIfBeyondLength(int index) {
        if (index > length - 1) {
            throw new IndexOutOfBoundsException("Array only has a length of " + length);
        }
    }
}
