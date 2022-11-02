package org.example;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @org.junit.jupiter.api.Test
    void addStudent() {
        //given
        Student julia = new Student();
        Student sergej = new Student();
        List<Student> nennDieAnders = new ArrayList<>();
        StudentDB studentsDb = new StudentDB(nennDieAnders);

        //when
        studentsDb.addStudent(julia);
        studentsDb.addStudent(sergej);

        //todo vergleiche ob die liste julia und sergej enhelt hat
        //then
        assertEquals(studentsDb.studentList.size(),2);

    }
}