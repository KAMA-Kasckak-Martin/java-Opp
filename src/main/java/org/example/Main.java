package org.example;

import org.example.model.Student;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        Smartphone sams = new Smartphone();

        sams.color="weis";


        sams.setColor("pink");

        System.out.println(sams.getColor());

        */
        Student martin= new Student("MArtin", 25, "gut");
        System.out.println(martin.size);
        System.out.println(martin.name);


        martin.laune="gut";

        martin.name="Martin";

        martin.size=15;

        System.out.println(martin.getLaune());
        System.out.println(martin.getName());
        System.out.println(martin.getSize());
        System.out.println(martin.setName("Alfredo"));
        System.out.println(martin.setLaune("blee"));
        System.out.println(martin.setSize(19));

        System.out.println("Name:"+ martin.name+" "+"die laune ist:"+ martin.laune+" " +"Die anzahl an szudenten in der klase ist:"+ martin.size);
        System.out.println(martin.toString());
    }


}