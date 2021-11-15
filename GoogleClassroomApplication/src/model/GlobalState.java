package model;

import java.util.*;

import javafx.stage.Stage;

public class GlobalState {
    private Stage publicStage;
    private boolean isLoggedIn = false;

    int LoggedInId = -1;
    String fullName = null;
    String password = null;
    String email = null;
    String role = null;

    public void setSession(int id, String fullName, String password, String email, String role){
        this.LoggedInId = id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public int getLoggedInId(){
        return this.LoggedInId;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
    public String getRole(){
        return this.role;
    }

    //Global State
    private static GlobalState instance;

    public static GlobalState getInstance(){
        if(instance==null){
            instance = new GlobalState();
        }
        return instance;
    }

    public Stage getStage(){
        return this.publicStage;
    }
    public void saveStage(Stage s){
        this.publicStage = s;
    }

}
