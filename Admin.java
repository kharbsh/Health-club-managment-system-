package com.mycompany.gym_project;

import java.util.*;

public class Admin extends User {
    public Admin(){
    }
    @Override
    public String getUserName(){
        return this.UserName;
    }

    @Override
   public int getId(){
        return this.Id;
    }
   @Override
   public String getPassword(){
       return this.Password;
   }
   
   @Override
    public String getDateCreratd(){
        return this.dateCreated.toString();
   }
    
    @Override
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    
    @Override
    public void setPassword(String Password){
        this.Password = Password;
    }
}
