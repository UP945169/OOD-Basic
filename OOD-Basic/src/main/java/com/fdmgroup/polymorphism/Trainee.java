package com.fdmgroup.polymorphism;

import java.util.Objects;

public class Trainee {
    private String name;
    private  String stream;
    private int week;

    public Trainee(String name, String stream, int week) {
        super();
        this.name = name;
        this.stream = stream;
        this.week = week;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return week == trainee.week && name.equals(trainee.name) && stream.equals(trainee.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stream, week);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
