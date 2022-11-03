package org.example.model;

public class ComputerScienceStudent extends Student {

    private String course;

    public ComputerScienceStudent(String course) {
        this.course = course;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public int getScore() {
        return 100;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                " course=' " + course + '\'' +
                ", laune=' " + getLaune() + '\'' +
                ", name=' " + getName() + '\'' +
                ", class size= " + getId()+
                '}';
    }
}
