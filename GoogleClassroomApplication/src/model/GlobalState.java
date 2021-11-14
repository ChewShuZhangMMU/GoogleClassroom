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

}
