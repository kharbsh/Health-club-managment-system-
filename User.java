package com.mycompany.gym_project;

import java.util.*;

public class User {
    protected String UserName;
    protected int Id ;
    protected String Password;
    protected java.util.Date dateCreated;
    
    public User(){
        dateCreated = new java.util.Date();
    }
    public User(String UserName, int Id,String Password){
        this.UserName = UserName;
        this.Id = Id;
        this.Password = Password;
        
    }
    public String getUserName(){
        return this.UserName;
    }
    
    public int getId(){
        return this.Id;
    }
    public String getPassWord(){
        return this.Password;
    } 
    public String getDateCreratd(){
        return this.dateCreated.toString();
    }
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
}
