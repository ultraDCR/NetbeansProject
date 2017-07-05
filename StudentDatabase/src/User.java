/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author deepbhai
 */
class User {
    private int id;
    private String fname;
    private String lname;
    private String  gender;
    private String course;
    private int semester;
    private String  address;
    private String email;
    private String phone;
    
    
    public User(int Id,String Fname,String Lname,String Gender,String Course,int Semester,String Address, String Email,String Phone)
    {
        this.id = Id;
        this.fname = Fname;
        this.lname = Lname;
        this.gender = Gender;
        this.course = Course;
        this.semester = Semester;
        this.address = Address;
        this.email = Email;
        this.phone = Phone;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
    public String getCourse()
    {
        return course;
    }
    public String getGender()
    {
        return gender;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public int getSemester()
    {
        return semester;
    }
    public String getAddress(){
        return address;
    }
}

