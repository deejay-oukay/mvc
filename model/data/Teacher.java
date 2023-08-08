package model.data;

import java.util.ArrayList;
import java.util.Calendar;

public class Teacher extends User {
    private static int nextId = 1;
    private int id;
    private ArrayList<String> disciplines = new ArrayList<>();
    private double rating;
    private String department;

    public Teacher(String name, String lastName, Calendar birthday/*
                                                                   * , ArrayList<String> disciplines, double rating,
                                                                   * String department
                                                                   */) {
        super(name, lastName, birthday);
        System.out.println("Преподаватель создан :-)");
        this.id = nextId;
        nextId++;
        // this.disciplines = disciplines;
        // this.rating = rating;
        // this.department = department;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getDisciplines() {
        return disciplines;
    }

    public double getRating() {
        return rating;
    }

    public String getDepartment() {
        return department;
    }

    public void setDisciplines(ArrayList<String> disciplines) {
        this.disciplines = disciplines;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " id=" + id + ", disciplines=" + disciplines + ", rating=" + rating + ", department="
                + department;
    }

}
