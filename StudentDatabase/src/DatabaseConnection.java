
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
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

public class DatabaseConnection
{   public static void main(String[] args)
    {
	DatabaseConnection a = new DatabaseConnection();
	a.getConnection();
    }
    public static Connection getConnection() {
        String url="jdbc:mysql://localhost:3306/StudentDatabase";
        String con="com.mysql.jdbc.Driver";
	Connection cn=null;
	try
	{
            Class.forName(con);
            cn=(Connection) DriverManager.getConnection(url,"root","");
            return cn;
	}
	catch(Exception e)
	{
            e.printStackTrace();
            return cn;
	}

    }
        
    
}
