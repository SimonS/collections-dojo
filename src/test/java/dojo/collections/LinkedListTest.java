package dojo.collections;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    private LinkedList list;
    private Object first;

    @Before
    public void setup() {
        list = new LinkedList();
        first = "1st";
        list.add(first);
    }

    @Test
    public void addElementToList() throws Exception {
        assertThat(list.get(0), is(equalTo(first)));
        assertThat(list.length(), is(equalTo(1)));
    }

    @Test
    public void firstElementIsBothHeadAndTail() throws Exception {
        assertThat(list.head(), is(equalTo(list.tail())));
    }

    @Test
    public void addSecondElementToList() throws Exception {
        Object second = "2nd";
        list.add(second);
        assertThat(list.get(1), is(equalTo(second)));
        assertThat(list.length(), is(equalTo(2)));
    }

    @Test
    public void elementAddedIsHead() throws Exception {
        Object second = "2nd";
        list.add(second);
        assertThat(list.head().object, is(equalTo(second)));
    }

    @Test
    public void firstElementAddedIsTail() throws Exception {
        list.add("1st");
        assertThat(list.tail().object, is(equalTo(first)));
    }

    @Test
    public void insertElementAtX() throws Exception {
        list.add("2nd");
        Object objectToInsert = "3rd inserted";
        list.insert(objectToInsert, 1);
        assertThat(list.get(1), is(equalTo(objectToInsert)));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void insertElementBeyondSizeOfListFailsWithOutOfBoundsException() throws Exception {
        list.insert("should fail", 1);
    }

    @Test
    public void replaceElementAtX() throws Exception {
        list.add("2nd");
        list.add("3rd");

        Object fourth = "4th";
        list.add(fourth);
        Object replacementObject = "replacement";

        list.replace(replacementObject, 2);

        assertThat(list.get(2), is(equalTo(replacementObject)));
        assertThat(list.get(3), is(equalTo(fourth)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void replaceElementAtXBeyondLengthFailsWithOutOfBoundsException() throws Exception {
        list.replace("replacement", 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementAtXBeyondLengthFailsWithOutOfBoundsException() throws Exception {
        list.get(1);
    }
}