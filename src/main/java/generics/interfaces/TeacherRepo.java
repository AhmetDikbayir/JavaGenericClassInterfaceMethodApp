package generics.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepo implements Repository<Teacher>{

    Scanner scan = new Scanner(System.in);
    List<Teacher> teacherList = new ArrayList<>();
    @Override
    public void add(Teacher teacher) {
        teacherList.add(teacher);
        System.out.println(teacher.getName() + " saved successfully.");
    }

    @Override
    public void get(Teacher teacher) {
        System.out.println(teacher.getName() + " found successfully.");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Please enter teacher's new name : ");
        System.out.println(teacher.getName() + " updated successfully.");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println(teacher.getName() + " deleted successfully.");
    }
}
