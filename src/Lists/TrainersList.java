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
public class TrainersList extends GenericList {
    public TrainersList(Connection outlet){
        super("Trainers List", "TRAINERS_FORM");
        
        Statement s=null;
         try{
        s=outlet.createStatement();
              ResultSet rs = s.executeQuery( "SELECT * FROM Trainers;" );
              while ( rs.next() ) {
        int id_number = rs.getInt("id");
        String  Trainer_name = rs.getString("trainer_name");
        int phone_number =rs.getInt("phone_number");
      
      }

        rs.close();
      s.close();
      
        
        }
        catch(Exception e){
        
        }
     
    }
        
    }
    
    // should override the populateRows method 
    // code here . 
    
