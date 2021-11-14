package model;

import java.util.Arrays;

public class Organizer extends User{

    private static int idCount = Database.readUpdate("Organizer") + 1;

    public Organizer(int id, String fullName, String password, String email, String role){
        super(id,fullName,password,email,role);
    }

    public static Student createStudent(String fullName, String password, String email, String role){
        int id = ++idCount;
        Database.writeData("Organizer", Arrays.asList(Integer.toString(idCount),fullName,password,email,"Organizer"));
        Database.writeUpdate("Organizer", Arrays.asList(Integer.toString(idCount)));
        Database.writeData("email", Arrays.asList(email));
        return new Student(id, fullName, password, email, role);
    }

}
