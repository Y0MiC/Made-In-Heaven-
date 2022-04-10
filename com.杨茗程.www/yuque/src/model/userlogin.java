package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class userlogin {
 
    String drv = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/login";
    String usr = "root";
    String pwd = "123456";
 
    public  boolean isuserlogin(String id,String password){
        boolean isValid = false;
 
        String sql="select * from customers where user_name='"+id+"' and user_password='"+password+"'";
        try{
            Class.forName(drv);
            Connection conn = DriverManager.getConnection(url,usr,pwd);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
 
            if(rs.next()){
                isValid = true;
            }
 
            rs.close();
            stm.close();
            conn.close();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        if(isValid){
            return true;
        }
        else return false;
    }
}


