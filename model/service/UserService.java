package model.service;

import java.util.ArrayList;
import java.util.Calendar;

import model.data.Student;
import model.data.Teacher;
import model.data.User;

public class UserService<T extends User> implements DataService<T> {

    @Override
    public T createUser(int id, String name, String lastName, Calendar birthday) {
        // вычисляем класс и метод, из которого вызван этот метод
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        // String className = element.getClassName();
        String methodName = element.getMethodName();

        if (methodName.equals("createTeacher"))
            return (T) new Teacher(name, lastName, birthday);
        if (methodName.equals("createStudent"))
            return (T) new Student(name, lastName, birthday);
        System.out.println("Ни один из конструкторов не был выполнен: " + methodName);
        return null;
    }

    @Override
    public ArrayList<T> readData() {
        return null;
    }

}
