package model;

import java.util.*;

public class Classroom {

    private int ClassroomId;
    private String ClassroomName;
    private String ClassroomCode;
    private String ClassroomMeetLinkage;
    private int ClassroomOrganizerID;
    private String ClassroomOwnerName;

    private static int idCount = Database.readUpdate("Classroom") + 1;

    public Classroom(int ClassroomId, String ClassroomName, int ClassroomOrganizerID, String ClassroomOwnerName){
        this.ClassroomId = ClassroomId;
        this.ClassroomName = ClassroomName;
        this.ClassroomOrganizerID = ClassroomOrganizerID;
        this.ClassroomOwnerName = ClassroomOwnerName;
    }

    public Classroom createClassroom(String ClassroomName, int ClassroomOrganizerID, String ClassroomOwnerName){
        int Id = ++idCount;
        Database.writeData("Classroom", Arrays.asList(Integer.toString(Id), ClassroomName, Integer.toString(ClassroomOrganizerID), ClassroomOwnerName));
        Database.writeUpdate("Classroom", Arrays.asList(Integer.toString(Id)));
        return new Classroom(Id, ClassroomName, ClassroomOrganizerID, ClassroomOwnerName);
    }

    public int getClassroomId(){
        return this.ClassroomId;
    }

    public String getClassroomName(){
        return this.ClassroomName;
    }

    public int getClassroomOrganizerID(){
        return this.ClassroomOrganizerID;
    }

    public String getClassroomOwnerName(){
        return this.ClassroomOwnerName;
    }

    public void setClassroomName(String ClassroomName){
        this.ClassroomName = ClassroomName;
    }

}
