package org.example;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        Smartphone sams = new Smartphone();

        sams.color="weis";


        sams.setColor("pink");

        System.out.println(sams.getColor());

        */
        Student martin= new Student();


        martin.laune="gut";

        martin.name="Martin";

        martin.size=15;

        System.out.println(martin.getLaune());
        System.out.println(martin.getName());
        System.out.println(martin.getSize());
        System.out.println(martin.setName("Alfredo"));
        System.out.println(martin.setLaune("blee"));
        System.out.println(martin.setSize(19));



    }


}