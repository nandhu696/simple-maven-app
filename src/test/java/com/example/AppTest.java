

package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testEvenNumber() {
        assertEquals("Even", App.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", App.checkEvenOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", App.checkEvenOdd(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertEquals("Even", App.checkEvenOdd(-4));
    }
}

