package de.neuefische.hh2020ji.model;

import javax.swing.text.html.Option;
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
        if(students.containsKey(student.getId())){
            throw new RuntimeException("StudentID already in list.");
        }
        students.put(student.getId(),student);
    }

    public void removeById(int id) {
        students.remove(id);
    }

    public Optional<Student> findById(int id) {
        if(students.containsKey(id)){
            return Optional.of(students.get(id));
        }else{
            return Optional.empty();
        }
    }


}
