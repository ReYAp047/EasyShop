/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import miniP.controler.CommandDB;

/**
 *
 * @author Alaa
 */
public class Command {

    private int idCmd;
    private float priceCmd;
    private String dateCmd;
    private String stateCmd;

    public Command() {
    }

    public Command(int idCmd, float priceCmd, String dateCmd, String stateCmd) {
        this.idCmd = idCmd;
        this.priceCmd = priceCmd;
        this.dateCmd = dateCmd;
        this.stateCmd = stateCmd;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    public int getIdCmd() {
        return idCmd;
    }

    public String getDateCmd() {
        return dateCmd;
    }

    public String getStateCmd() {
        return stateCmd;
    }

    public float getPriceCmd() {
        return priceCmd;
    }

    public void setStateCmd(String stateCmd) {
        this.stateCmd = stateCmd;
    }

    public void setPriceCmd(float priceCmd) {
        this.priceCmd = priceCmd;
    }

    public void setDateCmd(String dateCmd) {
        this.dateCmd = dateCmd;
    }
     public static int AjoutCommande(float prix,String date,String description,String idClient) throws SQLException, ClassNotFoundException{
     int rs = CommandDB.AjoutProductsCommande(prix,date,description,idClient);
     return rs;
}
public static ResultSet GetCommand() throws SQLException, ClassNotFoundException{
        ResultSet rs = CommandDB.GetCommand();
     return rs;
}

}