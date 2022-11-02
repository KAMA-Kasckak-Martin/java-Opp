package org.example.model;

import java.util.Objects;

public class Student {
    private String laune;
    private String name;
    private int id;

    public Student() {

    }

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

    public int getId(){
        return id;
    }

    public int setId(int newId){
        this.id=newId;
        return newId;
    }


    public Student( String name,int id,String laune){     //Konstruktor
        this.id= id;
        this.name= name;
    }

    public String toString(String name, int size, String laune) {
        System.out.println();
        return toString();
    }

    @Override
    public String toString() {
        return
                "laune='" + laune + '\'' +
                ", name='" + name + '\'' +
                ", class size=" + id
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (!Objects.equals(laune, student.laune)) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = laune != null ? laune.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
