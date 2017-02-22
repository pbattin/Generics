import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by prestonbattin on 2/22/17.
 */
public class MySetTest {

    MySet<Integer> set;



    @Before
    public void setUp(){

        set = new MySet<Integer>();
        set.add(1);
        set.add(2);
    }

    @Test
    public void addTest(){

        set.add(1);
        int expected = 2;
        int actual = set.size();
        Assert.assertEquals("Tesint it does not add if element is present already", expected, actual);
    }

    @Test
    public void toArrayTest(){

        int expected = 1;
       Object[] data = set.toArray();
       int actual = (Integer) data[0];
        Assert.assertEquals("Testing toArray", expected, actual);
    }

    @Test
    public void addAllTest(){

        Set<Integer> demo = new HashSet<Integer>();
        demo.add(1);
        demo.add(3);
        demo.add(2);
        demo.add(4);

        set.addAll(demo);
        int expected = 4;
        int actual = set.size();
        Assert.assertEquals("Testing addAll", expected, actual);
    }
}
