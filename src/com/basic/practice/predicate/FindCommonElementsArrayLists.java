package com.basic.practice.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindCommonElementsArrayLists {

    static class User{
        String name;
        User(String name){
            this.name = name;
        }

        String getName(){
            return this.name;
        }

        @Override
        public boolean equals(Object o){
            if (o == this) return true;
            if (o == null || o.getClass() != this.getClass()) return false;
            User user = (User)o;
            return Objects.equals(this.name, user.name);
        }

        @Override
        public int hashCode(){
            return Objects.hash(this.name);
        }

        @Override
        public String toString(){
            return "User Name:" + getName();
        }
    }

    public static void main(String a[]){

        List<User> first = new ArrayList<>();
        List<User> second = new ArrayList<>();

        first.add(new User("Ramesh"));
        first.add(new User("Cherry"));
        first.add(new User("Sril"));
        first.add(new User("Sril"));
        first.add(null);

        second.add(new User("Sril"));
        second.add(new User("Others"));
        second.add(null);

        List<User> commonUsers = first.stream().filter(second::contains).collect(Collectors.toList());
        System.out.println(commonUsers);
    }
}
