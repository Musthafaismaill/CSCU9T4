package com.stir.cscu9t4practical1;
public class SprintEntry extends Entry {
    private int repetitions;
    private int recovery;

    public SprintEntry(String name, int day, int month, int year, int hour, int min, int sec, float distance, int repetitions, int recovery) {
        super(name, day, month, year, hour, min, sec, distance);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

    @Override
    public String getEntry() {
        return getName() + " sprinted " + repetitions + "x" + getDistance() + "m in " + getHour() + ":" + getMin() + ":" + getSec() + " with " + recovery + " minutes recovery on " + getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}