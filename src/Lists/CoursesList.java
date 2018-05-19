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
public class CoursesList extends GenericList {

    Statement s =null;
    public CoursesList(Connection outlet){
        super("Courses List", "COURSES_FORM");
        try{
        s=outlet.createStatement();
              ResultSet rs = s.executeQuery( "SELECT * FROM Courses;" );
              while ( rs.next() ) {
        int Course_number = rs.getInt("Course_no");
        String  Course_name = rs.getString("Course_name");
        int Credit_hours =rs.getInt("Credit_hours");
         System.out.println( "Course_number = " + Course_number );
         System.out.println( "Course_NAME = " + Course_name );
         System.out.println( "Credit_hours =" + Credit_hours );
         System.out.println();
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
