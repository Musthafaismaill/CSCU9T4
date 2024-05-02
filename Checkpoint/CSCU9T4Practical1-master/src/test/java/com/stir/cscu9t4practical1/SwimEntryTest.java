package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Musthafa
 */
public class SwimEntryTest {

    public SwimEntryTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getWhere method, of class SwimEntry.
     */
    @Test
    public void testGetWhere() {
        System.out.println("getWhere");
        Entry instanceA = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors");
        String expResultA = "outdoors";
        String result = ((SwimEntry)instanceA).getWhere();
        assertEquals(expResultA, result);

        Entry instanceB = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
        String expResultB = "in a pool";
        result = ((SwimEntry)instanceB).getWhere();
        assertEquals(expResultB, result);
    }

    /**
     * Test of getEntry method, of class SwimEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors");
        String expResult = "Alice swam 3.0 km outdoors in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }
}