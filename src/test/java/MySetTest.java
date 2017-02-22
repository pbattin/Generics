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
        Assert.assertEquals("Testing it does not add if element is present already", expected, actual);
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

    @Test
    public void containsAllTest(){
        Set<Integer> demo = new HashSet<Integer>();
        demo.add(1);
        demo.add(3);
        demo.add(2);
        demo.add(4);

        boolean expected = false;
        boolean actual = set.containsAll(demo);
        Assert.assertEquals("Testing contains all method", expected, actual);

    }

    @Test
    public void equalsTest(){

        Set<Integer> demo = new HashSet<Integer>();
        demo.add(1);
        demo.add(2);


        boolean expected = true;
        boolean actual = set.equals(demo);
        Assert.assertEquals("Testing equals method", expected, actual);
    }

    @Test
    public void hashCodeTest(){

        int expected = 1642534850;
        int actual = set.hashCode();
        Assert.assertEquals("testing hashcode", expected, actual);
    }

    @Test
    public void iteratorTest(){

        int count = 0;
        Integer[] value = new Integer[set.size()];
        System.out.println(value.length);

        while (set.iterator().hasNext()) {
           value[count]  = set.iterator().next();
           count++;
        }

        int expected = 1;
        int actual = value[0];
        Assert.assertEquals("Testing iterator a index 0", expected, actual);
    }

    @Test
    public void removeTest(){

        set.remove(0);
        int expected = 1;
        int actual = set.size();
        Assert.assertEquals("Testing remove method", expected, actual);
    }

    @Test
    public void removeAllTest(){

        Set<Integer> demo = new HashSet<Integer>();
        demo.add(1);
        demo.add(2);
        set.removeAll(demo);

        int expected = 1;
        int actual = set.size();
        Assert.assertEquals("Testing remove all method", expected, actual);
    }
}
