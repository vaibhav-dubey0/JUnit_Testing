package unittesr.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CsTest {
    List<String> tb=Arrays.asList("Vaibhav","Dubey","Test");
    
    @Test
    void test1(){
        boolean actual=tb.contains("Vaibhav");
        assertEquals(true,actual);
    }
   
    @Test
    void test2(){
        boolean actual=tb.contains("Dubey");
        assertEquals(true,actual);
    }

    @Test
    void test3(){
        boolean actual=tb.contains("Vai");
        assertEquals(false,actual);
    }

}
