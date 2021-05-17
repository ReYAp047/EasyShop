package miniP.controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Stat {
        public static ResultSet allAvrageOrder() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select avg(prix) from command ");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }
        
        
                public static ResultSet allMinPrice() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select min(price) from product ");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }
                
            public static ResultSet allMaxPrice() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select max(price) from product ");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }
            
            
                        public static ResultSet allTopThree() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select p.name, sum(pa.qnt) as some from product p, panier pa where p.idP=pa.idP group by p.name order by some desc limit 3");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }
}
