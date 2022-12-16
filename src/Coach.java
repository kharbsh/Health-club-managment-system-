import java.sql.*;

public class Coach {
    
    public Coach(){
        
    }
    
    public static void putPlan(String plan, int ID){
        plan = plan.toLowerCase();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set plan_type = ? where users.ID = ? ");
                prep.setString(1, plan );
                prep.setInt(2, ID);
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    
//        public static String[] memberList(int coach_id) {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
//                Statement stnt = con.createStatement();
//                ResultSet rs = stnt.executeQuery("select ID, users.coach_id, fname, lname, plan_type, days_plan from users right join coaches on coaches.ID = users.coach_id where users.coach_id = coaches.ID ");
//                while (rs.next()) {
//                    if(rs.getInt(2 ) == coach_id){
//                        String id = String.valueOf(rs.getInt("ID"));
//                        String fname = rs.getString("fname");
//                        String lname = rs.getString("lname");
//                        String plan_type = rs.getString("plan_type");
//                        String days_plan = rs.getString("days_plan");
//                        String tData[] = {id, fname, lname, plan_type, days_plan};
//                        
//                    }
//                }
//            }
//        } catch (ClassNotFoundException | SQLException a) {
//            System.out.println(a);
//        }
//        
//    }
    
}
