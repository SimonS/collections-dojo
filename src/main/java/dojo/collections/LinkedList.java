package dojo.collections;

public class LinkedList {
    private int length = 0;
    private Element head;
    private Element tail;

    public int length() {
        return this.length;
    }

    public Element head() {
        return head;
    }

    public Element tail() {
        return tail;
    }

    public void add(Object o) {
        Element element = new Element(o);
        Element oldHead = null;

        if (length > 0) {
            oldHead = head;
            oldHead.addNextElement(element);
        }

        head = element;
        length++;

        if (length == 1) {
            tail = head;
        }

    }

    public Object get(int index) {
        throwExceptionIfBeyondLength(index);

        Element current = tail;
        for (int i = 0; i < index || i < length; i++) {
            if (index == i) {
                return current.object;
            } else {
                current = current.nextElement();
            }
        }
        return null;
    }

    public void insert(Object object, int index) throws IndexOutOfBoundsException {
        throwExceptionIfBeyondLength(index);

        Element nextElement = tail.nextElement();
        Element toInsert = new Element(object);
        tail.addNextElement(toInsert);
        toInsert.addNextElement(nextElement);
    }

    private void throwExceptionIfBeyondLength(int i) throws IndexOutOfBoundsException {
        if (i > length - 1) {
            throw new IndexOutOfBoundsException("Cannot insert at index " + i + ". Array is length " + length);
        }
    }

    public void replace(Object object, int index) {
        throwExceptionIfBeyondLength(index);

        int i = 0;
        Element current = tail;
        do {

            if (i == index) {
                current.replaceElement(object);
                break;
            }
            current = current.nextElement();
            i++;
        } while (i <= index);
    }
}
