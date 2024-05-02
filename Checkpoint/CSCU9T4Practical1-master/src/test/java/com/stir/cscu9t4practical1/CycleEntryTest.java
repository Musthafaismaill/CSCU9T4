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
public class CycleEntryTest {
    
    public CycleEntryTest() {
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
     * Test of getTerrain method, of class CycleEntry.
     */
    @Test
    public void testGetTerrain() {
        System.out.println("getTerrain");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "asphalt"; // Local variable for expected result
        String result = ((CycleEntry)instance).getTerrain();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTempo method, of class CycleEntry.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "moderate"; // Local variable for expected result
        String result = ((CycleEntry)instance).getTempo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class CycleEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice cycled 3.0 km in 0:16:7 on 1/2/2003 on asphalt at moderate tempo\n"; // Local variable for expected result
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }
}
