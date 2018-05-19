/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author 20160596
 */
public class TrainingProgramList extends GenericList {
   
    Statement s=null;
    public TrainingProgramList(Connection outlet){
         
        super("Trainers List", "TRAININGPROGRAMS_FORM");
    try{
        s=outlet.createStatement();
              ResultSet rs = s.executeQuery( "SELECT *FROM train_prog2;" );
              while ( rs.next() ) {
        int prog_id = rs.getInt("prog_id");
        String  Days = rs.getString("days");
        int Time =rs.getInt("time");
        String start_date= rs.getString("start_date");
        String end_date= rs.getString("end_date");
        String Course_name= rs.getString("course_name");
        String Course_number= rs.getString("course_no");
        }

        rs.close();
      s.close();
      
        
        }
        catch(Exception e){
        
        }
    
    
    }
    
    // should override the populateRows method 
    // code here . 
    
}
