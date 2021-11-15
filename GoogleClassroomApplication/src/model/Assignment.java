package model;

import java.util.Arrays;

public class Assignment {

    private int AssignmentId;
    private int AssignmentOrganizerID;
    private int ClassroomID;
    private String AssignmentTitle;

    private static int idCount = Database.readUpdate("Assignment") + 1;

    public Assignment(int AssignmentId, int AssignmentOrganizerID, int ClassroomID, String AssignmentTitle){
        this.AssignmentId = AssignmentId;
        this.AssignmentOrganizerID = AssignmentOrganizerID;
        this.ClassroomID = ClassroomID;
        this.AssignmentTitle = AssignmentTitle;
    }

    public Assignment createAssignment(int AssignmentOrganizerID, int ClassroomID, String AssignmentTitle){
        int Id = ++idCount;
        Database.writeData("Assignment", Arrays.asList(Integer.toString(Id), Integer.toString(AssignmentOrganizerID), Integer.toString(ClassroomID), AssignmentTitle));
        Database.writeUpdate("Assignment", Arrays.asList(Integer.toString(Id)));
        return new Assignment(Id, AssignmentOrganizerID, ClassroomID, AssignmentTitle);
    }

    public int getAssignmentId(){
        return this.AssignmentId;
    }

    public int getAssignmentOrganizerID(){
        return this.AssignmentOrganizerID;
    }

    public int getClassroomID(){
        return this.ClassroomID;
    }

    public String getAssignmentTitle(){
        return this.AssignmentTitle;
    }

    public void setAssignmentTitle(String AssignmentTitle){
        this.AssignmentTitle = AssignmentTitle;
    }

}
