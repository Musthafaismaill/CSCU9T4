package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainingRecordTest {

    @Test
    public void testAddEntry() {
        System.out.println("addEntry");
        TrainingRecord instance = new TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        instance.addEntry(a);
        assertEquals(1, instance.getNumberOfEntries());
    }

    @Test
    public void testAddEntryUnique() {
        System.out.println("addEntry -- fail");
        TrainingRecord instance = new TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        instance.addEntry(a);
        instance.addEntry(b);
        assertEquals(1, instance.getNumberOfEntries());
    }

    @Test
    public void testLookupEntriesByName() {
        System.out.println("lookupEntries by name");
        TrainingRecord instance = new TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        instance.addEntry(a);
        instance.addEntry(b);
        String result = instance.lookupEntries("Alice");
        assertTrue(result.contains("Alice"), "Expecting to find Alice's entry");
        assertTrue(result.contains("1/2/2003"), "Expecting the date in Alice's entry");
        assertFalse(result.contains("Bob"), "Not expecting to find Bob's entry");
    }

    @Test
    public void testLookupEntriesByDate() {
        System.out.println("lookupEntries by date");
        TrainingRecord instance = new TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        instance.addEntry(a);
        instance.addEntry(b);
        String result = instance.lookupEntries(1, 2, 2003);
        assertTrue(result.contains("Alice"), "Expecting to find Alice's entry");
        assertTrue(result.contains("Bob"), "Expecting to find Bob's entry");
        assertFalse(result.contains("Claire"), "Not expecting to find Claire's entry");
    }

    @Test
    public void testGetNumberOfEntries() {
        System.out.println("GetNumberOfEntries");
        TrainingRecord instance = new TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        Entry c1 = new Entry("Claire", 7, 3, 2010, 0, 26, 20, 7);
        Entry c2 = new Entry("Claire", 11, 3, 2010, 0, 24, 55, 7);
        assertEquals(0, instance.getNumberOfEntries());
        instance.addEntry(a);
        assertEquals(1, instance.getNumberOfEntries());
        instance.addEntry(b);
        assertEquals(2, instance.getNumberOfEntries());
        instance.addEntry(c1);
        assertEquals(3, instance.getNumberOfEntries());
        instance.addEntry(c2);
        assertEquals(4, instance.getNumberOfEntries());
    }
}
