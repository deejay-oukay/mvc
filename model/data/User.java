package model.data;

import java.util.Calendar;

public abstract class User {
    private String name;
    private String lastName;
    private Calendar birthday;

    public User(String name, String lastName, Calendar birthday) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return getClass().getName() + ", name=" + name + ", lastName=" + lastName + ", birthday="
                + birthday.get(Calendar.DAY_OF_MONTH) + "." + birthday.get(Calendar.MONTH) + "."
                + birthday.get(Calendar.YEAR);
    }

}
