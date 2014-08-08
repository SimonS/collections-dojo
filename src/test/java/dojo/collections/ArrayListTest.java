package dojo.collections;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayListTest {

    private static final int DEFAULT_SIZE = 10;

    private List list;
    private Object first;

    @Before
    public void setup() {
        list = new ArrayList();
        first = "1st";
        list.add(first);
    }
    
    @Test
    public void answerToQuestion() throws Exception {
        ArrayList wimbledonQueue = new ArrayList();
        for (int i = 0; i < 100; i++) {
            wimbledonQueue.add("Person " + (i + 1));
        }
        printQueue(wimbledonQueue);

        for (int i = 0; i < 4; i++) {
            wimbledonQueue.add("Person Back " + (i + 1));
        }
        printQueue(wimbledonQueue);

        for (int i = 0; i < 6; i++) {
            wimbledonQueue.insert("Person Pushing " + (i + 1), 75);
        }
        printQueue(wimbledonQueue);

        wimbledonQueue.replace("New couple 1", 100);
        wimbledonQueue.replace("New couple 2", 101);

        int secondsTilLastTicketPurchase = wimbledonQueue.length() * 45;

        DateTime now = DateTime.now();
        DateTime timeActuallyPurchasedTicket = now.plusSeconds(secondsTilLastTicketPurchase);

        DateTime expectedTimeToPurchaseTicket = now.plusSeconds(4950);
        assertThat(timeActuallyPurchasedTicket, is(equalTo(expectedTimeToPurchaseTicket)));

        printQueue(wimbledonQueue);
    }

    private void printQueue(ArrayList queue) {
        System.out.println("Printing contents of queue...");
        for (int i = 0; i < queue.length(); i++) {
            System.out.println("Queue no #" + (i + 1) + "=> " + queue.get(i));
        }
        System.out.println("");
    }

    @Test
    public void addElementToList() throws Exception {
        assertThat(list.get(0), is(equalTo(first)));
        assertThat(list.length(), is(equalTo(1)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementBeyondSizeOfListFailsWithOutOfBoundsException() throws Exception {
        list.get(1);
    }

    @Test
    public void addingSecondElementToList() throws Exception {
        Object second = "2nd";

        list.add(second);

        assertThat(list.get(1), is(equalTo(second)));
        assertThat(list.length(), is(equalTo(2)));
    }

    @Test
    public void insertingElement() throws Exception {
        Object second = "2nd";
        Object last = "last";
        Object inserted = "insert";

        list.add(second);
        list.add(last);
        list.insert(inserted, 1);

        assertThat(list.get(1), is(equalTo(inserted)));
        assertThat(list.get(2), is(equalTo(second)));
        assertThat(list.get(3), is(equalTo(last)));
    }

    @Test
    public void addElementResizesArray() throws Exception {
        ArrayList list = new ArrayList();

        for (int elementNo = 0; elementNo < DEFAULT_SIZE + 1; elementNo++) {
            list.add(elementNo);
        }

        assertThat(list.length(), is(equalTo(DEFAULT_SIZE + 1)));
    }

    @Test
    public void addingMoreThanTwentyElementsResizesArrayAgain() throws Exception {
        List list = new ArrayList();

        for (int elementNo = 0; elementNo < (DEFAULT_SIZE * 2) + 1; elementNo++) {
            list.add(elementNo);
        }

        assertThat(list.length(), is(equalTo((DEFAULT_SIZE * 2) + 1)));
    }

    @Test
    public void replaceElement() throws Exception {
        list.add("2nd");
        list.add("last");

        Object replacement = "replacement";
        list.replace(replacement, 1);

        assertThat(list.get(1), is(equalTo(replacement)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void replaceElementBeyondLengthThrowsOutOfBoundsException() throws Exception {
        list.replace("replace", 2);
    }

    @Test
    public void resizingOfArrayListTransfersAllExistingElements() {
        ArrayList resizedList = new ArrayList();
        for (int i = 0; i < 16; i++) {
            resizedList.add("" + (i + 1));
        }

        resizedList.add("caused resize");
        assertThat(resizedList.get(15).toString(), is(equalTo("16")));
        assertThat(resizedList.get(0).toString(), is(equalTo("1")));
        assertThat(resizedList.get(16).toString(), is(equalTo("caused resize")));
    }
}
