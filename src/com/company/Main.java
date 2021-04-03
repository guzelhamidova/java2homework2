package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Тree");
        createObject("Bushes");
        createObject("Flowers");
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Tree":
                Tree tree = new Tree("Sosna", 12, 35);
                tree.print();
                return tree;

            case "Bushes":
                Bushes bushes = new Bushes("Lilac", "Rose Hips", "Barberry");
                bushes.print();
                return bushes;

            case "Flowers":
                Flowers flowers = new Flowers("Violet", "Snowdrops");
                flowers.print();
                return flowers;
        }
        return null;
    }

}
