package com.company;

public class Plant implements Printable{
    private String name;
    public Plant(String name){
        this.name = name;

    }

    public Plant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(" \nName: " + name + " \n ");

    }
}

