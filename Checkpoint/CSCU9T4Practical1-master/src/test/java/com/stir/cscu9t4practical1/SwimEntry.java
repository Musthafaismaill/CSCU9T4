package com.stir.cscu9t4practical1;
public class SwimEntry extends Entry {
    private String where;

    public SwimEntry(String name, int day, int month, int year, int hour, int min, int sec, float distance, String where) {
        super(name, day, month, year, hour, min, sec, distance);
        this.where = where;
    }

    public String getWhere() {
        return where.equals("pool") ? "in a pool" : where;
    }

    @Override
    public String getEntry() {
        return getName() + " swam " + getDistance() + " km " + getWhere() + " in " + getHour() + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}