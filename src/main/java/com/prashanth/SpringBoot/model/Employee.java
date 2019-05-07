package com.prashanth.SpringBoot.model;

@SuppressWarnings("javadoc")
public class Employee
{
    private int id;
    private String fName;
    private String lName;
    private int age;
    private String email;

    public int getId()
    {
        return id;
    }
    public void setId(final int id)
    {
        this.id = id;
    }
    public String getfName()
    {
        return fName;
    }
    public void setfName(final String fName)
    {
        this.fName = fName;
    }
    public String getlName()
    {
        return lName;
    }
    public void setlName(final String lName)
    {
        this.lName = lName;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(final int age)
    {
        this.age = age;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(final String email)
    {
        this.email = email;
    }
}
