package model;

import java.util.Arrays;

public class Announcement {

    private int AnnouncementId;
    private int AnnouncementOwnerID;
    private int ClassroomID;
    private String AnnouncementTitle;

    private static int idCount = Database.readUpdate("Announcement") + 1;

    public Announcement(int AnnouncementId, int AnnouncementOwnerID, int ClassroomID, String AnnouncementTitle){
        this.AnnouncementId = AnnouncementId;
        this.AnnouncementOwnerID = AnnouncementOwnerID;
        this.ClassroomID = ClassroomID;
        this.AnnouncementTitle = AnnouncementTitle;
    }

    public Announcement createAnnouncement(int AnnouncementOwnerID, int ClassroomID, String AnnouncementTitle){
        int Id = ++idCount;
        Database.writeData("Announcement", Arrays.asList(Integer.toString(Id), Integer.toString(AnnouncementOwnerID), Integer.toString(ClassroomID), AnnouncementTitle));
        Database.writeUpdate("Announcement", Arrays.asList(Integer.toString(Id)));
        return new Announcement(Id, AnnouncementOwnerID, ClassroomID, AnnouncementTitle);
    }

    public int getAnnouncementId(){
        return this.AnnouncementId;
    }

    public int getAnnouncementOwnerID(){
        return this.AnnouncementOwnerID;
    }

    public int getClassroomID(){
        return this.ClassroomID;
    }

    public String getAnnouncementTitle(){
        return this.AnnouncementTitle;
    }

    public void setAnnouncementTitle(String AnnouncementTitle){
        this.AnnouncementTitle = AnnouncementTitle;
    }

}
