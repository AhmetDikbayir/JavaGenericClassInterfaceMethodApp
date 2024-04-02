package generics.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepo implements Repository<Student>{

    Scanner scan = new Scanner(System.in);

    List<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student student) {
        studentList.add(student);
        System.out.println(student.getName() + " saved successfully.");
    }

    @Override
    public void get(Student student) {
        System.out.println(student.getName() + " found successfully.");
    }

    @Override
    public void update(Student student) {
        System.out.println("Please enter new student name : ");
        String newName = scan.nextLine();
        student.setName(newName);
        System.out.println(student.getName() + " updated successfully.");
    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName() + " deleted successfully.");
    }
}
