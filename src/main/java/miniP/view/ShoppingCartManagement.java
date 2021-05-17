/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.view;

import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import miniP.model.Command;
import miniP.model.Panier;
import static miniP.model.Panier.ii;
import miniP.model.Pannier;
import miniP.model.Product;
import miniP.model.globalUserLogin;


/**
 *
 * @author mefta
 */
public class ShoppingCartManagement extends javax.swing.JFrame {


    /**
     * Creates new form Browse_Product
     */
    public ShoppingCartManagement() {
        try {
            initComponents();
            table_update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
    }
        
      private void table_update() throws ClassNotFoundException, SQLException{
            int c;
           String idClient="aze";  
           Object rowData[]=new Object[5];
           DefaultTableModel tab =(DefaultTableModel)ScmTable.getModel();  
           tab.setRowCount(0);
             for(int j=0; j<ii ; j++){
              rowData[0]=Panier.panier[j].getName();
              rowData[1]=Panier.panier[j].getCategory();
              rowData[2]=Panier.panier[j].getPrice();
              rowData[3]=Panier.panier[j].getDescription();
              rowData[4]=Panier.panier[j].getAmoount();
              tab.addRow(rowData);
        }
      }      
     
                  /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        RightMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScmTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        Validate = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Delete = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ShoppingCartManagement");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1051, 665));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftMenu.setBackground(new java.awt.Color(0, 116, 193));
        LeftMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LeftMenu.setForeground(new java.awt.Color(102, 102, 102));
        LeftMenu.setMaximumSize(new java.awt.Dimension(340, 665));
        LeftMenu.setMinimumSize(new java.awt.Dimension(340, 665));
        LeftMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lato Hairline", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Shopping cart management");
        LeftMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel4.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 26, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        LeftMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 104, -1, -1));

        jLabel3.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lato Hairline", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Order management");
        LeftMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel6.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lato Hairline", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order history");
        LeftMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel8.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lato Hairline", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact Us");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        LeftMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel10.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lato Hairline", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Log out");
        LeftMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel12.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 513, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lato Hairline", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Browse products");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        LeftMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel14.setLabelFor(LeftMenu);
        LeftMenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("EASY-Shop");
        jLabel15.setAlignmentX(114.0F);
        jLabel15.setAlignmentY(50.0F);
        LeftMenu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 50, -1, -1));

        jPanel7.setBackground(new java.awt.Color(105, 149, 253));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        LeftMenu.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 320, 70));

        getContentPane().add(LeftMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 640));
        LeftMenu.getAccessibleContext().setAccessibleName("");

        RightMenu.setBackground(new java.awt.Color(255, 255, 255));
        RightMenu.setMaximumSize(new java.awt.Dimension(780, 640));
        RightMenu.setMinimumSize(new java.awt.Dimension(780, 640));
        RightMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Raleway", 0, 15)); // NOI18N
        jLabel1.setText("by EASY Team");
        jLabel1.setAlignmentX(114.0F);
        jLabel1.setAlignmentY(50.0F);
        RightMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, -1));

        jLabel16.setLabelFor(RightMenu);
        RightMenu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 30, 19));

        jPanel4.setBackground(new java.awt.Color(68, 68, 68));
        jPanel4.setMaximumSize(new java.awt.Dimension(711, 147));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("SimSun-ExtB", 0, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("delivered in front of your door !");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("SimSun-ExtB", 0, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("One click and all products  will be");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        RightMenu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 730, 130));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Raleway", 0, 15)); // NOI18N
        jLabel20.setText("Made with");
        jLabel20.setAlignmentX(114.0F);
        jLabel20.setAlignmentY(50.0F);
        RightMenu.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        ScmTable.setFont(new java.awt.Font("Raleway", 0, 15)); // NOI18N
        ScmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Category", "Price", "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScmTable.setFocusable(false);
        ScmTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ScmTable.setRowHeight(25);
        ScmTable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        ScmTable.setShowVerticalLines(false);
        ScmTable.getTableHeader().setReorderingAllowed(false);
        ScmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScmTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ScmTable);

        RightMenu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 254, 670, 200));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        Validate.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        Validate.setForeground(new java.awt.Color(255, 255, 255));
        Validate.setLabelFor(RightMenu);
        Validate.setText("Validate the order");
        Validate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValidateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Validate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Validate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        RightMenu.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 237, 40));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        Delete.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setLabelFor(RightMenu);
        Delete.setText("Delete this prodcuts");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Delete.getAccessibleContext().setAccessibleName("Delete this product");

        RightMenu.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 240, 40));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jLabel17.setText("Your Shopping cart");
        jLabel17.setAlignmentX(114.0F);
        jLabel17.setAlignmentY(50.0F);
        RightMenu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 214, 350, 30));

        jLabel21.setText("Amount :");
        RightMenu.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 50, 20));

        Amount.setText("0");
        RightMenu.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 40, -1));

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setForeground(new java.awt.Color(240, 240, 240));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        RightMenu.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, 20));

        getContentPane().add(RightMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 740, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
     int row = ScmTable.getSelectedRow();
     if(ScmTable.getRowCount()==0){
         JOptionPane.showMessageDialog(this, "Table is Empty !");
     }else if( ScmTable.getSelectedRowCount()<=0){
         JOptionPane.showMessageDialog(this, "Please Select Row for delete !");
         
     }else{
         if(row<ii){
      for(int i=row;i<(ii-1);i++){
     Panier.panier[i].setName(Panier.panier[i+1].getName());
     Panier.panier[i].setCategory(Panier.panier[i+1].getCategory());
     Panier.panier[i].setPrice(Panier.panier[i+1].getPrice());
     Panier.panier[i].setDescription(Panier.panier[i+1].getDescription());
     Panier.panier[i].setAmoount(Panier.panier[i+1].getAmoount());
     }  
     Panier.ii=ii-1;
     }else{
     Panier.ii=ii-1;
     }
     }
        try {
            table_update();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            this.setVisible(false);
            Browse_Product a=new Browse_Product();
            a.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void ValidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValidateMouseClicked
        java.util.Date date=Calendar.getInstance().getTime();
        SimpleDateFormat setDate=new SimpleDateFormat("yyyy/MM/dd");
        int row = ScmTable.getSelectedRow();
        String Login= globalUserLogin.userLogin;
        Login="aze";
         if(ScmTable.getRowCount()==0){
         JOptionPane.showMessageDialog(this, "Table is Empty !");
        }else{ 
             
             String today =setDate.format(date);
             float price=0;
             for(int i=0;i<ii;i++){
                 try {
                     price=price+(Panier.panier[i].getPrice()*Panier.panier[i].getAmoount());
                     String name = Panier.panier[i].getName();
                     int amount =Panier.panier[i].getAmoount();
                     ResultSet rs = Product.getProductsbyName(name);
                     rs.next();
                     int id=rs.getInt("idP");
                     int am=rs.getInt("amount");
                     am=am-amount;
                     String amounte= String.valueOf(am);
                     Product.UpdatAmount(name, amounte);
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (SQLException ex) {
                     Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             System.out.println(price);
            Command command = new Command();
            try {
                command.AjoutCommande(price,today,"encours",Login);
                for(int i=0;i<ii;i++){
                String name = Panier.panier[i].getName();
                int amount =Panier.panier[i].getAmoount();
                ResultSet rs = Product.getProductsbyName(name);
                rs.next();
                int idP=rs.getInt("idP");
                ResultSet rs1 = Command.GetCommand();
                rs1.next();
                int idCmde=rs1.getInt("id_cmd");
                Pannier.AjoutPannier(idP, idCmde, amount);
                }
                JOptionPane.showMessageDialog(this, "ordered successfully !!");
                Panier.ii=0;
                table_update() ;
                } catch (SQLException ex) {
                Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    }//GEN-LAST:event_ValidateMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      try {
            this.setVisible(false);
            Contact a=new Contact();
            a.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        try {
        if( ScmTable.getSelectedRowCount()==0){
        JOptionPane.showMessageDialog(this, "Please Select Row !!!"); }
        else{
        int row = ScmTable.getSelectedRow();
        String name =(ScmTable.getModel().getValueAt(row, 0).toString());
         ResultSet rs = Product.getProductsbyName(name);
         rs.next();
         int am=rs.getInt("amount");
        String count = Amount.getText();
        int c=Integer.parseInt(count);
        if (c<=0 || c>=am){
        JOptionPane.showMessageDialog(this, "Invalid Amount !!");
        }else{
        Panier.panier[row].setAmoount(c);
        String amount= String.valueOf(c);
        ScmTable.setValueAt(amount, row, 4);
        }}  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ShoppingCartManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_addActionPerformed

    private void ScmTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScmTableMouseClicked
        int i = ScmTable.getSelectedRow();
        TableModel model = ScmTable.getModel();
        Amount.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_ScmTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCartManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JLabel Delete;
    private javax.swing.JPanel LeftMenu;
    private javax.swing.JPanel RightMenu;
    private javax.swing.JTable ScmTable;
    private javax.swing.JLabel Validate;
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
