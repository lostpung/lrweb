/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lrweb;
import java.sql.*;
/**
 *
 * @author rishabh
 */
public class CommonTasks {
    public static int getNextLLApplicationNo(){
        int counter=0;
        try{
            Connection con=DatabaseConnection.getConnection();
            PreparedStatement stmt=con.prepareStatement("select count(*) from LearningLicenseJSP");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
            {
                counter=rs.getInt(1);
                counter++;
            }
            
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return counter;
    }
    
}