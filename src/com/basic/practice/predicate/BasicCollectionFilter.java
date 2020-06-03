package com.basic.practice.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicCollectionFilter {

    static class User {
        String name, role;

        User(String name, String role){
            this.name = name;
            this.role = role;
        }

        String getRole(){
            return this.role;
        }

        String getName(){
            return this.name;
        }

        @Override
        public String toString(){
            return "User Name : " + getName() + ", Role :" + getRole();
        }
    }

    public static void main(String a[]){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Ramesh", "Admin"));
        userList.add(new User("Cherry", "Admin"));
        userList.add(new User("Sril", "User"));

        List<User> adminsList = userList.stream()
                .filter(user -> user.getRole().equals("Admin"))
                .collect(Collectors.toList());
        System.out.println(adminsList);
    }
}
