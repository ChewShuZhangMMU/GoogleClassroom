package model;

public abstract class User {

    protected int Id;
    protected String fullName;
    protected String password;
    protected String email;
    protected String role; //Role: Student/Lecturer

    public User(int Id, String fullName, String password, String email, String role){
        this.Id = Id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public int getId(){
        return this.Id;
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

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
