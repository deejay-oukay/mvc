package controller;

import java.util.ArrayList;
import java.util.Calendar;

import model.data.Student;
import model.data.Teacher;
import model.service.DataService;
import model.service.UserService;

public class Controller {
    private static DataService service = new UserService<>();

    public static void createTeacher(String name, String lastName, Calendar birthday, ArrayList<String> disciplines,
            double rating, String department) {
        Teacher teacher = (Teacher) service.createUser(Teacher.getNextId(), name, lastName, birthday);
        teacher.setDisciplines(disciplines);
        teacher.setRating(rating);
        teacher.setDepartment(department);
    }

    public static void createStudent(String name, String lastName, Calendar birthday, String group, String speciality,
            double averageMark) {
        Student student = (Student) service.createUser(Student.getNextId(), name, lastName, birthday);
        student.setGroup(group);
        student.setSpeciality(speciality);
        student.setAverageMark(averageMark);
    }
}
