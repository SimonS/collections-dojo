package dojo.collections;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HashMapTest {

    private HashMap<Object, Object> map;
    private String key;
    private String value;

    @Before
    public void setup() {
        map = new HashMap<Object, Object>();
        key = "a";
        value = "value1";
        map.put(key, value);
    }

    @Test
    public void putValueToMapUsingKey() throws Exception {
        assertThat((String) map.get(key), is(equalTo(value)));
    }

//    @Test
//    public void putValueLargerThanMapResizesMap() throws Exception {
//        Object largerKey = "largerKey";
//        Object value = "value2";
//        map.put(largerKey, value);
//        assertThat(map.get(largerKey), is(equalTo(value)));
//    }
}
