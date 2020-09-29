package de.neuefische.hh2020ji.model;

public class MainApp {

    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2),
                new Student("Jack Doe", 3),
                new Student("Molly Doe", 4),
                new Student("Frank Doe", 5)
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(studentDB.randomStudent());
        }
    }

}
