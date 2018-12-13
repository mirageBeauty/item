package com.base.pojo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: XieFei
 * @Date: 2018/12/8
 * @Time: 15:31
 **/
public class Students implements Comparable<Students>{
    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }


    public Students() {
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        int compare = 1;
        return compare;
    }
}
