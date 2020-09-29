package de.neuefische.hh2020ji.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGetName(){
        String name = "Jane Doe";
        Student student = new Student(name, 1);

        String actual = student.getName();

        assertEquals(name, actual);
    }

    @Test
    void testSetAndGetName(){
        Student student = new Student(null, 1);
        String name = "Jane Doe";

        student.setName(name);

        String actual = student.getName();

        assertEquals(name, actual);
    }

    @Test
    void testToString(){
        Student student = new Student("Jane Doe", 1);
        String expected = "Student(name=Jane Doe, id=1)";

        String actual = student.toString();

        assertEquals(expected, actual);
    }
}