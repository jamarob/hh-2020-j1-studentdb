package de.neuefische.hh2020ji.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testList(){
        StudentDB studentDB = new StudentDB(new Student[]{
           new Student("Jane Doe", 1),
           new Student("John Doe", 2)
        });

        Student[] actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 3)
        }, actual);
    }

    @Test
    void testToString(){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2)
        });
        String expected = "StudentDB(\n"
                +"Student(name=Jane Doe, id=1)\n"
                +"Student(name=John Doe, id=2)\n"
                +")";

        String actual = studentDB.toString();

        assertEquals(expected, actual);
    }

    @Test
    void testAddStudent(){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2)
        });

        studentDB.add(new Student("Molly Doe", 3));

        Student[] actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2),
                new Student("Molly Doe", 3)
        }, actual);
    }

    @Test
    void testRemoveStudent(){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2),
                new Student("Molly Doe", 3)
        });

        studentDB.remove(2);

        Student[] actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("Molly Doe", 3)
        }, actual);
    }

    @Test
    void testRemoveLastStudent(){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2),
                new Student("Molly Doe", 3)
        });

        studentDB.remove(3);

        Student[] actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2)
        }, actual);
    }
}
