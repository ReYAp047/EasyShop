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
import java.sql.SQLException;
public class CommandDB {

        public static int AjoutProductsCommande(float prix,String date,String description,String idClient) throws SQLException, ClassNotFoundException{
           
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password); 
                PreparedStatement select = con1.prepareStatement("INSERT INTO `command` (`prix`,`date_cmd`, `state_cmd`,`Login` ) "
                                           +"VALUES (?,?,?,?)");
                select.setFloat(1, prix);
                select.setString(2, date);
                select.setString(3, description);
                select.setString(4, idClient);
           int rs =select.executeUpdate();
          return rs;
        }

        public static ResultSet GetCommand() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/ecommerce2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from command order by id_cmd desc limit 1");

                ResultSet rs =select.executeQuery();
          return rs;

        }
  
}
