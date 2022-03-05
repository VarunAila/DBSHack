package com.telusko.springmvcboot;

 

import java.sql.*;

 

public class connection
{
  public static void main(String[] args)
  {
    try
    {
      // create our mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/user_details";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "jyo41v$*");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM user_db";
      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
      
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String EmailId=rs.getString("email_id");
        String password=rs.getString("password");
        
        // print the results
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, EmailId,password);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }          
  }
}
