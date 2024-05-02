package com.stir.cscu9t4practical1;
public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    public CycleEntry(String name, int day, int month, int year, int hour, int min, int sec, float distance, String terrain, String tempo) {
        super(name, day, month, year, hour, min, sec, distance);
        this.terrain = terrain;
        this.tempo = tempo;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getTempo() {
        return tempo;
    }

    @Override
    public String getEntry() {
        return getName() + " cycled " + getDistance() + " km in " + getHour() + ":" + getMin() + ":" + getSec() + " on " + getDay() + "/" + getMonth() + "/" + getYear() + " on " + terrain + " at " + tempo + " tempo\n";
    }
}