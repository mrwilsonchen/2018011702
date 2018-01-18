package com.wilson.a2018011701.data;

/**
 * Created by Student on 2018/1/18.
 */
import java.util.ArrayList;

public interface StudentDAO {
    public boolean add(Student s);
    public ArrayList<Student> getList();
    public Student getStudent(int id);
    public boolean update(Student s);
    public boolean delete(int id);

}
