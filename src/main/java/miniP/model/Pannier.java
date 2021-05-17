/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.model;

import java.sql.SQLException;
import miniP.controler.PannierBD;

/**
 *
 * @author Alaa
 */
public class Pannier {
    private int idPa;
    private int idP;
    private int idCmd;
    private int amount;

    public Pannier() {
    }

    public Pannier(int idPa, int idP, int idCmd, int amount) {
        this.idPa = idPa;
        this.idP = idP;
        this.idCmd = idCmd;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getIdCmd() {
        return idCmd;
    }

    public int getIdP() {
        return idP;
    }

    public int getIdPa() {
        return idPa;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public void setIdPa(int idPa) {
        this.idPa = idPa;
    }
        public static int AjoutPannier(int idP,int idCmd,int amount) throws ClassNotFoundException, SQLException {
          int rs = PannierBD.AjoutProductsPannier(idP,idCmd,amount);
        return rs;
    }
}
