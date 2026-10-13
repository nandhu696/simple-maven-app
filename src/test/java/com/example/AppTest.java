
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    public void testAdditionWithNegativeNumber() {
        assertEquals(5, App.add(10, -5));
    }

    @Test
    public void testAdditionWithZero() {
        assertEquals(10, App.add(10, 0));
    }
}
