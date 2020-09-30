package de.neuefische.hh2020ji.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StudentDB {

    private ArrayList<Student> students;

    public StudentDB(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public List<Student> list(){
        return students;
    }



    public Student randomStudent(){
        double random = Math.random();
        int randomIndex = (int) (random * students.size());
        return students.get(randomIndex);
    }

    @Override
    public String toString(){
        String result = "StudentDB(\n";
        for(Student student : students) {
            result += student.toString() + "\n";
        }
        result += ")";
        return result;
    }

    public void add(Student student) {
        students.add(student);
    }

    public void removeById(int id) {
        Student student = findById(id);
        if(student == null){
            return;
        }
        students.remove(student);
    }

    private Student findById(int id) {
        for(Student student: students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }


}
