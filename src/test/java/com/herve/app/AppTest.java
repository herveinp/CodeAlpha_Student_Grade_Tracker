package com.herve.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.herve.app.Object.Student;

public class AppTest {
    @Test
    void testStudent1(){
        Student student1 = new Student("Herve Iuliano Natama Purba", "Computer Science", "2025", 10);
        student1.setStudentId(App.generateStudentId("Herve Iuliano Natama Purba", "Computer Science", "2025"));
        student1.addGrade(100);
        student1.addGrade(99);
        student1.addGrade(88);
        student1.addGrade(77);
        student1.addGrade(75);
        student1.addGrade(98);
        student1.addGrade(87);
        student1.addGrade(65);
        student1.addGrade(85);
        student1.addGrade(96);
        student1.setAverageGrades(App.averageGrades(student1.getStudentGrades()));
        student1.setHighestGrade(App.lowestAndHighestGrades(student1.getStudentGrades()).get(1));
        student1.setLowestGrade(App.lowestAndHighestGrades(student1.getStudentGrades()).get(0));
        
        // Test all student's information.
        assertEquals("Herve Iuliano Natama Purba", student1.getName());
        assertEquals("Computer Science", student1.getMajor());
        assertEquals("2025", student1.getClassYear());
        assertEquals("Herve_Iuliano_Natama_Purba-Computer_Science-2025", student1.getStudentId());
        ArrayList<Integer> expectedStudentGrades = new ArrayList<Integer>(List.of(100, 99, 88, 77,75,98,87, 65,85,96));
        assertEquals(expectedStudentGrades, student1.getStudentGrades());
        assertEquals(87.0, student1.getAverageGrades());
        assertEquals(100, student1.getHighestGrade());
        assertEquals(65, student1.getLowestGrade());
    }
}
