package service;

import model.Student;

import java.util.List;

public interface StudentSevice {
    List<Student>showAll();
    void save (Student student);
    Student findById(int id);
    void update(int id, Student student);
    void remove(int id);
}
