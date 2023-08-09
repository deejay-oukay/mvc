package model.service;

import java.util.ArrayList;
import java.util.Calendar;

import model.data.DataBase;
import model.data.Student;
import model.data.Teacher;
import model.data.User;

public class UserService<T extends User> implements DataService<T> {
    private static final DataBase db = new DataBase();

    @Override
    public T createUser(int id, String name, String lastName, Calendar birthday) {
        // вычисляем класс и метод, из которого вызван этот метод
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        // String className = element.getClassName();
        String methodName = element.getMethodName();

        if (methodName.equals("createTeacher")) {
            Teacher teacher = new Teacher(name, lastName, birthday);
            db.addUser(teacher);
            return (T) teacher;
        }
        if (methodName.equals("createStudent")) {
            Student student = new Student(name, lastName, birthday);
            db.addUser(student);
            return (T) student;
        }
        System.out.println("Ни один из конструкторов не был выполнен: " + methodName);
        return null;
    }

    @Override
    public ArrayList<T> readData() {
        return null;
    }

    public ArrayList<Teacher> getTeachersList() {
        ArrayList<User> users = db.getDb();
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher)
                teachers.add((Teacher) user);
        }
        return teachers;
    }

    public ArrayList<Student> getStudentsList() {
        ArrayList<User> users = db.getDb();
        ArrayList<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                students.add((Student) user);
        }
        return students;
    }

}
