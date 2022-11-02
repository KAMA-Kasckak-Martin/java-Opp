package org.example;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        Smartphone sams = new Smartphone();

        sams.color="weis";


        sams.setColor("pink");

        System.out.println(sams.getColor());

        */
        Student martin= new Student();
        //System.out.println(martin.size);
        //System.out.println(martin.name);
        Student marcus = new Student();

        //martin.laune="gut";

        //martin.name="Martin";

       // martin.size=15;

        System.out.println(martin.getLaune());
        System.out.println(martin.getName());
        System.out.println(martin.getId());
        System.out.println(martin.setName("Alfredo"));
        System.out.println(martin.setLaune("scheiße"));
        System.out.println(martin.setId(19));
        System.out.println(marcus.setName("Alejandro"));
        System.out.println(marcus.setLaune("prachtvoll"));
        System.out.println(marcus.setId(25));

        //System.out.println("Name:"+ martin.name+" "+"die laune ist:"+ martin.laune+"Die anzahl an szudenten in der klase ist:"+ martin.size);
        System.out.println(martin.toString());
        System.out.println(martin.equals(marcus));
        System.out.println(martin.hashCode());
        System.out.println(marcus.toString());

        List<Student> nennDieAnders = new ArrayList<>();
        StudentDB studentsDb = new StudentDB(nennDieAnders);
        studentsDb.addStudent(martin);
        studentsDb.addStudent(marcus);
        System.out.println(studentsDb);
        System.out.println(studentsDb.randomStudent());



    }


}