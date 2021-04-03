package com.company;

import javax.xml.namespace.QName;

public class Tree extends Plant implements Printable {
    private int age;
    private int type;

    public Tree(String name, int age, int type) {
        super(name);
        this.age = age;
        this.type = type;
    }

    public Tree(String name) {
        super(name);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void print() {
        super.print();
        System.out.println(" \nType: " + type+ " \nAge: "+ age + " \n ");
    }

}
