package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmUp2Test {

    @Test
    public void countXXTest(){
        //given
        String sourse = "abcxx";
        //then
        //then
        int expected = 2;

        int actual = WarmUp2.countXX(sourse);
        System.out.println(actual);
        assertEquals(expected,actual);
    }
}
