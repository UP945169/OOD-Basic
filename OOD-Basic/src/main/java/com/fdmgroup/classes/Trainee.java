package com.fdmgroup.classes;

public class Trainee {
    private final String name;
    private String stream;
    private int week;

    public Trainee(String name, String stream, int week) {
        this.name = name;
        setStream(stream);
        setWeek(week);
    }

    public void learn(){
        System.out.println(name + "Is learning " + stream + "on " + week);
    }

    public int takeExam(String topic){
        System.out.println(name + "taking the " + topic + " exam.");
        return (int) (Math.random() *100);
    }

    public int getWeek() {
        return week;
    }

    public String getName() {
        return name;
    }

    public String getStream() {
        return stream;
    }


    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setWeek(int week) {
        if(week >= 1 && week <= 15){
            this.week = week;
        }
        this.week = 1;
    }
}
