package model.service;

import java.util.ArrayList;
import java.util.Calendar;

import model.data.Student;
import model.data.Teacher;
import model.data.User;

public interface DataService<T extends User> {
    T createUser(int id, String name, String lastName, Calendar birthday);

    ArrayList<T> readData();

    public ArrayList<Teacher> getTeachersList();

    public ArrayList<Student> getStudentsList();
}
