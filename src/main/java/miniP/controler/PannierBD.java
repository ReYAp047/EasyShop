/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alaa
 */
public class PannierBD {
         public static int AjoutProductsPannier(int idP,int idCmd,int amount) throws SQLException, ClassNotFoundException{
           
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password); 
                PreparedStatement select = con1.prepareStatement("INSERT INTO `panier` (`idP`, `idCmd`,`qnt` ) "
                                           +"VALUES (?,?,?)");
                select.setInt(1, idP);
                select.setInt(2, idCmd);
                select.setInt(3, amount);
           int rs =select.executeUpdate();
          return rs;
        }
}
