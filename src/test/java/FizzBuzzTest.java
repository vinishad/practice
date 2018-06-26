import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void returnoneforone(){
        String result = new FizzBuzz().checkFizzBuzz(1);
        assertEquals("1",result);
    }
    @Test
    public void return2for2(){
        String result = new FizzBuzz().checkFizzBuzz(2);
        assertEquals("2",result);
    }
    @Test
    public void returnFizzfor3(){
        String result = new FizzBuzz().checkFizzBuzz(3);
        assertEquals("Fizz",result);
    }
    @Test
    public void returnBuzzfor5(){
        String result = new FizzBuzz().checkFizzBuzz(5);
        assertEquals("Buzz",result);
    }
}
