package com.jiker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtil {
    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;
    public JdbcUtil(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8", "root", "nbcb,111");
            String sql= "select * from user";
            stat = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
