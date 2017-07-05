import java.sql.*;

public class CreateDatabase{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
  
   /*
   public static void createStudentDatabase(){
    Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE StudentDatabase";
      stmt.executeUpdate(sql);
      System.out.println("Database created successfully...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
}//end main*/
   
   public static void createLoginUsersTable(){
    com.mysql.jdbc.Connection cn = DatabaseConnection.getConnection();
        String insert = "create table LoginUsers (ID int NOT NULL AUTO_INCREMENT,FirstName varchar(20),LastName varchar(20),Gender varchar(10),Address varchar(20),Username varchar(15),Password varchar(15),Email varchar(50),Phone varchar(15),PRIMARY KEY (ID))";
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(insert);
        }catch(Exception e){
            System.out.println("Exception Occured" + e.getMessage());
        }
    }
   
   public static void createStudentInformationTable(){
        com.mysql.jdbc.Connection cn = DatabaseConnection.getConnection();
        String insert = "create table StudentInformation (ID int NOT NULL AUTO_INCREMENT,FirstName varchar(20),LastName varchar(20),Gender varchar(10),Course varchar(10),Semester int(15),Address varchar(20),Email varchar(50),Phone varchar(15),PRIMARY KEY (ID))";
        try{
            Statement stat = cn.createStatement();
            stat.executeUpdate(insert);
        }catch(Exception e){
            System.out.println("Exception Occured" + e.getMessage());
        }
   }
   public static Connection studentDatabase(){
        String url="jdbc:mysql://localhost:3306/";
        String con="com.mysql.jdbc.Driver";
	Connection cn=null;
        Statement stmt = null;
	try
	{
            Class.forName(con);
            cn=(com.mysql.jdbc.Connection) DriverManager.getConnection(url,"root","");
            stmt = cn.createStatement();
      
            String sql = "CREATE DATABASE StudentDatabase";
            stmt.executeUpdate(sql);
            return cn;
	}
	catch(Exception e)
	{
            e.printStackTrace();
            return cn;
	}
   }
   public static com.mysql.jdbc.Connection getConnection() {
        String url="jdbc:mysql://localhost:3306/";
        String con="com.mysql.jdbc.Driver";
	com.mysql.jdbc.Connection cn=null;
	try
	{
            Class.forName(con);
            cn=(com.mysql.jdbc.Connection) DriverManager.getConnection(url,"root","");
            return cn;
	}
	catch(Exception e)
	{
            e.printStackTrace();
            return cn;
	}

    }
}//end JDBCExample

