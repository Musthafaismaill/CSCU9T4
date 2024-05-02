// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;

public class TrainingRecord {
    private List<Entry> tr;

    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } // constructor

    // add a record to the list
    public void addEntry(Entry e) {
        // Check if there's already an entry with the same name and date
        for (Entry existingEntry : tr) {
            if (existingEntry.getName().equals(e.getName()) &&
                    existingEntry.getDay() == e.getDay() &&
                    existingEntry.getMonth() == e.getMonth() &&
                    existingEntry.getYear() == e.getYear()) {
                // Entry with the same name and date found, reject the new entry
                System.out.println("Entry already exists for " + e.getName() + " on " + e.getDay() + "/" + e.getMonth()
                        + "/" + e.getYear());
                return;
            }
        }
        // No existing entry found, add the new entry to the list
        tr.add(e);
    }

    // look up the entry of a given day and month
    // Look up all entries for a given name
    public String lookupEntries(String name) {
        StringBuilder result = new StringBuilder();
        for (Entry entry : tr) {
            if (entry.getName().equalsIgnoreCase(name)) { // Check if the name matches ignoring case
                result.append(entry.getEntry()).append("\n"); // Append the entry to the result
            }
        }
        if (result.length() == 0) {
            return "No entries found for the specified name.";
        } else {
            return result.toString().trim(); // Return the result as a string, removing trailing whitespace
        }
    }

    // Find all entries for a given date
    public String findAllEntriesByDate(int d, int m, int y) {
        StringBuilder result = new StringBuilder();
        for (Entry entry : tr) {
            if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
                result.append(entry.getEntry()).append("\n"); // Append each entry to the result
            }
        }
        if (result.length() == 0) {
            return "No entries found for the specified date.";
        } else {
            return result.toString(); // Return the result as a string
        }
    }

    // Add a new method to TrainingRecord class
    public String lookupEntries(int d, int m, int y) {
        StringBuilder result = new StringBuilder();
        boolean found = false;
        for (Entry entry : tr) {
            if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
                result.append(entry.getEntry()).append("\n"); // Append each entry to the result
                found = true;
            }
        }
        if (!found) {
            return "Sorry couldn't find anything for this date.";
        } else {
            return result.toString(); // Return the result as a string
        }
    }

    public int getNumberOfEntries() {
        return tr.size();
    } // getNumberOfEntries
}// TrainingRecord
