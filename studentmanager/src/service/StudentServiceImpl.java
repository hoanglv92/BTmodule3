package service;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentSevice {
    private static Map<Integer,Student> students;
    static {
        students=new HashMap<Integer,Student>();
        students.put(1,new Student(1,"hoang","hung yen"));
        students.put(2,new Student(2,"khai","bac ninh"));
        students.put(3,new Student(3,"linh","nam dinh"));
        students.put(4,new Student(4,"tien","thanh hoa"));
        students.put(5,new Student(5,"toan","quang ninh"));
    }
    @Override
    public List<Student> showAll() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(),student);

    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }

    @Override
    public void update(int id, Student student) {
        students.put(id,student);
    }

    @Override
    public void remove(int id) {
        students.remove(id);

    }
}
