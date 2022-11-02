package org.example;

public class Student {
    String laune;
    String name;
    int size;

    public String getLaune(){
        return laune;
    }

    public String setLaune(String newLaune){
        this.laune=newLaune;
        return newLaune;
    }

    public String getName(){
        return name;
    }

    public String setName(String newName){
        this.name=newName;
        return newName;
    }

    public int getSize(){
        return size;
    }

    public int setSize(int newSize){
        this.size=newSize;
        return newSize;
    }


    public Student(int size, String name){     //Konstruktor
        this.size= size;
        this.name= name;
    }



}
