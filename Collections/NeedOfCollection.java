package com.java.collections;

public class NeedOfCollection {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        // limitation of array:
        // 1. Arrays are fix in size
        // 2. Holds on homogenous datatypes
        // 3. Array does not provide readymade methods/apis available

        Object[] objects = new Object[10];
        objects[0]=new Student();
        objects[1]=new Student();
        objects[2]=new Book();
    }
}
class Book {

}
class Student {

}
