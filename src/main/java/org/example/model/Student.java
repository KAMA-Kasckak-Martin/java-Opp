package org.example.model;

public class Student {
    public String laune;
    public String name;
    public int size;

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


    public Student( String name,int size,String laune){     //Konstruktor
        this.size= size;
        this.name= name;
    }

    public String toString(String name, int size, String laune) {
        System.out.println();
        return toString();
    }



}
