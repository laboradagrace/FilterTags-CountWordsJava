/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testdb;
import java.sql.*; 
//import Activity.FilterHTML;

/**
 *
 * @author laboradagr_sd2082
 */
public class TestDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/dbPractice","root","");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement(); 
        

        
        
        //insert data into datavbase
        String sqlString = "insert into tblCountWords(word,count,school) values ('sample',20,'myschool')";
        stmt.executeUpdate(sqlString);
        ResultSet rs=stmt.executeQuery("select * from tblCountWords"); 
        
        while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}       


