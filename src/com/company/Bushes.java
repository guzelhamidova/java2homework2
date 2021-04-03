package com.company;

public class Bushes extends Plant implements Printable{
    private static String blooming;
    private static String wild;
    private static String berry;

    public Bushes() {
        super();
    }


    public Bushes(String name, String blooming, String wild, String berry) {
        super(name);
        this.blooming = blooming;
        this.wild = wild;
        this.berry = berry;
    }

    public Bushes(String blooming, String wild, String berry) {
        this.blooming = blooming;
        this.wild = wild;
        this.berry = berry;
    }

    public static String getBlooming() {
        return blooming;
    }

    public void setBlooming(String blooming) {
        this.blooming = blooming;
    }

    public String getWild() {
        return wild;
    }

    public void setWild(String wild) {
        this.wild = wild;
    }

    public String getBerry() {
        return berry;
    }

    public void setBerry(String berry) {
        this.berry = berry;
    }
    public Bushes(String name, int type, int age, String blooming, String wild, String berry){
        super(name);
    }

    public void print(){
        super.print();
        System.out.println(" \nBerry: " + berry + " \nWild: " + wild + " \nBlooming: " + blooming+ " \n ");
    }
}
