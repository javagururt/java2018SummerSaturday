package com.javaguru.lesson8;

import java.util.Objects;

class UserKey {

    private String name;
    private Integer age;

    public UserKey(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserKey userKey = (UserKey) o;
        return Objects.equals(name, userKey.name) &&
                Objects.equals(age, userKey.age);
    }

//    @Override
//    public int hashCode() {
//        return 1;
//    }

//    @Override
////    public int hashCode() {
////        Random random = new Random();
////        return random.nextInt(101);
////    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "UserKey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
