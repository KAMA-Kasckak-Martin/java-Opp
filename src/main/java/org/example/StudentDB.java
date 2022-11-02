package org.example;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    List<Student> studentList = new ArrayList<>();


    public  void addStudent(Student student ){
        studentList.add(student);

    };

    public StudentDB(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }

    public Student randomStudent(){
      //  return studentList.get((int) Math.round(Math.random()*studentList.size()) );
        int random = (int) Math.round(Math.random()*(studentList.size()-1));
        return studentList.get(random);
    }

}
