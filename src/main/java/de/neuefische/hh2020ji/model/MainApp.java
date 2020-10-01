package de.neuefische.hh2020ji.model;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB(
                List.of(
                        new Student("Jane Doe", 1),
                        new Student("John Doe", 2),
                        new Student("Molly Doe", 3)
                ));

        studentDB.printIds();
    }

}
