package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddAppTest {
    @Test
    public void testAddPositive() {
        assertEquals(5, AddApp.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, AddApp.add(2, -3));
    }
}
