package com.javaguru.lesson8;

import java.util.HashMap;

class UserKeyTest {

    public static void main(String[] args) {
        HashMap<UserKey, String> users = new HashMap<>();
        UserKey firstUser = new UserKey("Ruslan", 25);
        UserKey secondUser = new UserKey("Dima", 20);
        UserKey thirdUser = new UserKey("Alex", 30);

        users.put(firstUser, "yoyoyo");
        users.put(secondUser, "hello");
        users.put(thirdUser, "Hello world!");


        UserKey firstUserKey = new UserKey("Ruslan", 25);

        System.out.println("Map: " + users);
        System.out.println("First user: " + users.get(firstUserKey));

    }
}
