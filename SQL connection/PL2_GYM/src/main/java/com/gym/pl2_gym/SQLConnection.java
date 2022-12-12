
package com.gym.pl2_gym;

import java.sql.*;

public class SQLConnection {

   
     public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin");
            Statement stnt = con.createStatement();
             ResultSet rs = stnt.executeQuery("select ID from users");
             while( rs.next()){
                 System.out.println(rs.getInt(1)/*+" " + rs.getString(5)+" " + rs.getString(6)+" "*/);
                 con.close();
                
             }
            
        }
        catch(Exception a){
            System.out.println(a);
        }
    }
}
