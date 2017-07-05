
import java.sql.Connection;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deepbhai
 */
public class InsertIntoDatabase{
    // Inserts Data Into LoginUsers Table
    public void insertIntoLoginDatabase(String fName,String lName,String gender,String address,String username,String password,String email, String phone){
        Connection cn = DatabaseConnection.getConnection();
        String insert = "insert into LoginUsers (FirstName,LastName,Gender,Address,Username,Password,Email,Phone) values('"+fName+"','"+lName+"','"+gender+"','"+address+"','"+username+"','"+password+"','"+email+"','"+phone+"')";
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(insert);
        }catch(Exception e){
            System.out.println("Exception Occured" + e.getMessage());
        }
    }
    // Inserts Data Into StudentInformation Table
    public void insertIntoStudentDatabase(String fName,String lName,String gender,String course,String semester,String address,String email,String phone){
        Connection cn = DatabaseConnection.getConnection();
        String insert = "insert into StudentInformation (FirstName,LastName,Gender,Course,Semester,Address,Email,Phone) values('"+fName+"','"+lName+"','"+gender+"','"+course+"','"+semester+"','"+address+"','"+email+"','"+phone+"')";
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(insert);
        }catch(Exception e){
            System.out.println("Exception Occured" + e.getMessage());
        }
    }
    
    public void updateIntoDatabase(int id,String fName,String lName,String gender,String course,String semester,String address,String email,String phone){
        Connection cn = DatabaseConnection.getConnection();
        String insert = "update StudentInformation set FirstName='"+fName+"',LastName='"+lName+"',Gender='"+gender+"',Course='"+course+"',Semester='"+semester+"',Address='"+address+"',Email='"+email+"',Phone='"+phone+"' where ID ='"+id+"'";
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(insert);
        }catch(Exception e){
            System.out.println("Exception Occured" + e.getMessage());
        }
    }
    public void deleteFromDatabase(int id){
        Connection cn = DatabaseConnection.getConnection();
        String insert = "delete from StudentInformation where ID = '"+id+"'";
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(insert);
        }catch(Exception e){
            System.out.println("Exception Occured" + e.getMessage());
        }
    }
}
