package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @BeforeAll
    public static void setUp() {
        System.out.println("=== Bat dau chay MathUtilsTest ===");
    }

    @AfterAll
    public static void end() {
        System.out.println("=== Ket thuc ===");
    }

    @Test
    public void checkMax_AGreaterThanB() {
        assertEquals(5, MathUtils.max(5,3));
    }

    @Test
    public void checkMax_AEqualsB() {
        assertEquals(4, MathUtils.max(4,4));
    }

    @Test
    public void checkMax_ALessThanB() {
        assertEquals(7, MathUtils.max(2,7));
    }

    @Test
    public void checkMax_MaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 8));
    }

    @Test
    public void checkMax_MinValue() {
        assertEquals(-2, MathUtils.max(Integer.MIN_VALUE, -2));
    }

    @Test
    public void checkDivide_BGreaterThanZero() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    public void checkDivide_BLessThanZero() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    public void checkDivide_BEqualsZero() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(10,0));

        assertEquals("Divider must not be zero", e.getMessage());
    }
}
