import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial() {
    }
    @Test
    public void factorialTest(){
        //given
        Factorial factorial = new Factorial();
        Long expected = 5040L;

        //when
        Long actual = factorial.factorial(7);

        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void factorialTest2(){
        //given
        Factorial factorial = new Factorial();
        Long expected = 3400198294675128320L;

        //when
        Long actual = factorial.factorial(33);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest3(){
        //given
        Factorial factorial = new Factorial();
        Long expected = 87178291200L;

        //when
        Long actual = factorial.factorial(14);

        //then
        Assert.assertEquals(expected, actual);
    }

}