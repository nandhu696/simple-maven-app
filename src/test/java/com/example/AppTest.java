package com.example;
 
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class AppTest {
    @Test
    public void testSevenTerms() {
        assertEquals("0 1 1 2 3 5 8", App.fibonacci(7));
    }
 
    @Test
    public void testOneTerm() {
        assertEquals("0", App.fibonacci(1));
    }
 
    @Test
    public void testZeroTerms() {
        assertEquals("", App.fibonacci(0));
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeTerms() {
        App.fibonacci(-1);
    }
}

