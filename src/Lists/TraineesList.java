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
public class TraineesList extends GenericList {
    public TraineesList(Connection outlet){
        super("Trainers List", "TRAINEES_FORM");
        Statement s=null; 
        try{
        s=outlet.createStatement();
              ResultSet rs = s.executeQuery( "SELECT * FROM Trainees;" );
              while ( rs.next() ) {
        int Trainee_id = rs.getInt("TREE_ID");
        int Phone_number = rs.getInt("Phone_number");
        String  Trainee_name = rs.getString("TREE_NAME");
        String Education_level =rs.getString("Educatio_level");
         System.out.println( "Trainee_id = " + Trainee_id );
         System.out.println( "Phoen_number = " + Phone_number );
         System.out.println( "Trainee_nmae =" + Trainee_name);
         System.out.println("Education_level"+Education_level);
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
