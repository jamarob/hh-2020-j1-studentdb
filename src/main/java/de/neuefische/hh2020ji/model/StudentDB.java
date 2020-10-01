package de.neuefische.hh2020ji.model;

import java.util.*;

public class StudentDB {

    private HashMap<Integer,Student> students;

    public StudentDB(List<Student> students) {
        this.students = new HashMap<>();
        for(Student student: students){
            add(student);
        }
    }

    public List<Student> list(){
        return new ArrayList<>(students.values());
    }



    public Student randomStudent(){
        int randomIndex = (int) (Math.random() * students.size());
        return list().get(randomIndex);
    }

    @Override
    public String toString(){
        String result = "StudentDB(\n";
        for(Student student : list()) {
            result += student.toString() + "\n";
        }
        result += ")";
        return result;
    }

    public void add(Student student) {
        if(!students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        } else {
            throw new RuntimeException("Id already exists");
        }
    }

    public void removeById(int id) {
        students.remove(id);
    }

    private Student findById(int id) {
        return students.get(id);
    }


}
