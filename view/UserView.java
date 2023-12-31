package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import controller.Controller;

public class UserView {
    private static final Scanner scan = new Scanner(System.in);

    // private Controller controller = new Controller();

    public static void addUser(int userType) {
        System.out.print("Введите имя: ");
        String name = scan.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = scan.nextLine();
        System.out.print("Введите дату рождения (ДД.ММ.ГГГГ): ");
        String[] tempDate = scan.nextLine().split("\\.");
        Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
                Integer.parseInt(tempDate[0]));
        if (userType == 1) {
            System.out.print("Введите дисциплины (через пробел): ");
            String[] tempDis = scan.nextLine().split(" ");
            ArrayList<String> disciplines = new ArrayList<>();
            for (String item : tempDis) {
                // System.out.println(item);
                disciplines.add(item);
            }
            System.out.print("Введите рейтинг: ");
            double rating = scan.nextDouble();
            scan.nextLine();// во избежании возникновения ошибки после получения числа из консоли
            System.out.print("Введите департамент: ");
            String department = scan.nextLine();
            Controller.createTeacher(name, lastName, birthday, disciplines, rating, department);
        } else {
            System.out.print("Введите группу: ");
            String group = scan.nextLine();
            System.out.print("Введите специализацию: ");
            String speciality = scan.nextLine();
            System.out.print("Введите средний бал: ");
            double averageMark = scan.nextDouble();
            Controller.createStudent(name, lastName, birthday, group, speciality, averageMark);
        }
    }

    public static void mainMenu() {
        boolean noExit = true;
        int inCommand;
        while (noExit) {
            System.out.println("===============================");
            System.out.println("Что нужно сделать?:");
            System.out.println("1 - Добавить учителя");
            System.out.println("2 - Добавить студента");
            System.out.println("3 - Показать список учителей");
            System.out.println("4 - Показать список студентов");
            System.out.println("0 - Выйти");
            inCommand = scan.nextInt();
            scan.nextLine();
            if ((inCommand == 1) || (inCommand == 2)) {
                addUser(inCommand);
            } else if (inCommand == 3) {
                System.out.println(Controller.showTeachers());
            } else if (inCommand == 4) {
                System.out.println(Controller.showStudents());
            } else if (inCommand == 0)
                noExit = false;
        }
    }
}
