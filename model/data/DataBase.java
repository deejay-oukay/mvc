package model.data;

import java.util.ArrayList;

public class DataBase {
    ArrayList<User> db = new ArrayList<>();

    public void addUser(User user) {
        db.add(user);
    }

    public ArrayList<User> getDb() {
        return db;
    }

}
