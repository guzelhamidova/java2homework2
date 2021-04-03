package com.company;

public class Flowers extends Plant implements Printable{
    private String homemade;
    private String perennial;

    public Flowers(String name, String homemade, String perennial) {
        super(name);
        this.homemade = homemade;
        this.perennial = perennial;
    }

    public Flowers(String homemade, String perennial) {
        this.homemade = homemade;
        this.perennial = perennial;
    }

    public String getHomemade() {
        return homemade;
    }

    public void setHomemade(String homemade) {
        this.homemade = homemade;
    }

    public String getPerennial() {
        return perennial;
    }

    public void setPerennial(String perennial) {
        this.perennial = perennial;
    }
    public Flowers (String name, int type, int age, String blooming, String wild, String berry, String homemade, String perennial){
        super(name);
    }
    public Flowers(){
        super();
        System.out.println(" \nPerennial: " + perennial + " \nHomemade: " + homemade + " \n ");

    }
}
