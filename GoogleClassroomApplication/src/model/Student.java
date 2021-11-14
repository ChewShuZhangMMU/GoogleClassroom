package model;

import java.util.*;

public class Student extends User {

    private static int idCount = Database.readUpdate("Student") + 1;

    public Student(int id, String fullName, String password, String email, String role){
        super(id,fullName,password,email,role);
    }

    public static Student createStudent(String fullName, String password, String email, String role){
        int id = ++idCount;
        Database.writeData("Student", Arrays.asList(Integer.toString(idCount),fullName,password,email,"Student"));
        Database.writeUpdate("Student", Arrays.asList(Integer.toString(idCount)));
        Database.writeData("email", Arrays.asList(email));
        return new Student(id, fullName, password, email, role);
    }

}
