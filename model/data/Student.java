package model.data;

import java.util.Calendar;

public class Student extends User {
    private static int nextId = 1;
    private int id;
    private String group;
    private String speciality;
    private double averageMark;

    public Student(String name, String lastName, Calendar birthday/*
                                                                   * , String group, String speciality, double
                                                                   * averageMark
                                                                   */) {
        super(name, lastName, birthday);
        System.out.println("Студент создан :-)");
        this.id = nextId;
        nextId++;
        // this.group = group;
        // this.speciality = speciality;
        // this.averageMark = averageMark;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getSpeciality() {
        return speciality;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return super.toString() + " id=" + id + ", group=" + group + ", speciality=" + speciality + ", averageMark="
                + averageMark;
    }

}
