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
public class SprintEntryTest {
    
    public SprintEntryTest() {
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
     * Test of getRepetitions method, of class SprintEntry.
     */
    @Test
    public void testGetRepetitions() {
        System.out.println("getRepetitions");
        Entry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResults = 4;
        int result = ((SprintEntry)instance).getRepetitions();
        assertEquals(expResults, result);
    }

    /**
     * Test of getRecovery method, of class SprintEntry.
     */
    @Test
    public void testGetRecovery() {
        System.out.println("getRecovery");
        Entry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResults = 2;
        int result = ((SprintEntry)instance).getRecovery();
        assertEquals(expResults, result);
    }

    /**
     * Test of getEntry method, of class SprintEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        Entry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        String expResult = "Alice sprinted 4x300m in 0:16:7 with 2 minutes recovery on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }
}
