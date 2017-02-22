import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 2/22/17.
 */
public class MyArrayListTest {

    MyArrayList<Integer> list;

    @Before
    public void setUp(){

        list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
    }

    @Test
    public void addTest(){



        int expected = 2;
        int actual = list.size();
        Assert.assertEquals("Testing size of array", expected, actual);

    }

    @Test
    public void addAtTest(){

        list.add(0,4);
        int expected = 4;
        int actual = list.get(0);
        Assert.assertEquals("Testing placing item at certain index", expected, actual);
        expected = 3;
        actual = list.size();
        Assert.assertEquals("Testing size after add", expected, actual);
    }

    @Test
    public void getTest(){

        int expected = 1;
        int actual = list.get(0);
        Assert.assertEquals("Checking position 0",expected,actual);
        expected = 2;
        actual = list.get(1);
        Assert.assertEquals("Checking position 1", expected, actual);

    }

    @Test
    public void removeTest(){

        list.remove(0);
        int expected = 1;
        int actual = list.size();
        Assert.assertEquals("Checking to make sure it removes one", expected, actual);
        expected = 2;
        actual = list.get(0);
        Assert.assertEquals("Checking it positions correctly", expected, actual);
    }

    @Test
    public void setTest(){

        list.set(1,4);
        int expected = 4;
        int actual = list.get(1);
        Assert.assertEquals("Checking set method", expected, actual);
        expected = 2;
        actual = list.size();
        Assert.assertEquals("Checking size after set", expected, actual);

    }

    @Test
    public void clearTest(){

        list.clear();
        int expected = 0;
        int actual = list.size();
        Assert.assertEquals("Testing clear method", expected, actual);
    }

    @Test
    public void isEmptyTest(){

        boolean expected = false;
        boolean acutal = list.isEmpty();
        Assert.assertEquals("Testing isEmpty method", expected, acutal);
    }

    @Test
    public void containsTest(){

        boolean expected = true;
        boolean actual = list.contains(2);
        Assert.assertEquals("Testing contains method", expected, actual);
    }

    @Before
    public void constructorSizeSetUp(){

        list = new MyArrayList<Integer>(3);

    }

    @Test
    public void initialSizeTest(){

        int expected = 3;
        int actual = list.size();
        Assert.assertEquals("Testing constructor size", expected, actual);
    }

}
