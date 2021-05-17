/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mefta
 */
public class OrderManagmentt {
        public static ResultSet allCommand() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from command order by id_cmd");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }

public static ResultSet allProductsCommand(int idC) throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from panier pa ,product p where pa.idCmd=? and pa.idP=p.idP  ");
                select.setInt(1, idC);
                ResultSet rs =select.executeQuery();
          return rs;
}

public static void CommandAccept(int idC) throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           String state="Procecced";
            PreparedStatement update = con1.prepareStatement("update command set state_cmd =? where id_cmd=?");
            update.setString(1, state);
            update.setInt(2, idC);
            update.executeUpdate();
}


public static void CommandDecline(int idC) throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           String state="Declined";
            PreparedStatement update = con1.prepareStatement("update command set state_cmd =? where id_cmd=?");
            update.setString(1, state);
            update.setInt(2, idC);
            update.executeUpdate();
}

}

        
