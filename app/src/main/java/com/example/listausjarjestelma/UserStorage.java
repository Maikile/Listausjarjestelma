package com.example.listausjarjestelma;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage userStorage = null;
    public static UserStorage getInstance(){
        if(userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }
    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }
}
