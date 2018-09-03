import org.junit.Test;

import static org.junit.Assert.*;

public class HelloClassTest {

    @Test
    public void toTest(){
        assertEquals(new HelloClass().getHello(),"Hello World!");
    }
}