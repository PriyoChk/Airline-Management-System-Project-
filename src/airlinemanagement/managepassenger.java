/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlinemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class managepassenger extends javax.swing.JFrame {

   
    public managepassenger() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        show = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengertable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        g = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("  Manage  Passenger");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Passenger name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nationality");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Passport No");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Phone");

        insert.setBackground(new java.awt.Color(0, 204, 204));
        insert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 204, 204));
        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        show.setBackground(new java.awt.Color(0, 204, 204));
        show.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 204, 204));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 51, 51));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        passengertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Passengers name", "Gender", "Nationality", "Passport No", "Phone"
            }
        ));
        passengertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(passengertable);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("<--BACK");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        g.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(insert)
                                .addGap(112, 112, 112)
                                .addComponent(update)
                                .addGap(130, 130, 130)
                                .addComponent(show)
                                .addGap(123, 123, 123)
                                .addComponent(delete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update)
                            .addComponent(insert)
                            .addComponent(show)
                            .addComponent(delete))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

ResultSet rs1=null;
Statement st=null;
    private void Clear()
    {
        pn.setText("");
        n.setText("");
        pass.setText("");
        ph.setText("");
    
    }
     int pAId =0;
   private void CountPassenger()
{
    // int pAId =0;
    try{
      //  int pAId =0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=null;
        st = con.createStatement();
        rs1=st.executeQuery("Select Max(pid) from managepassenger");
         //pAId =rs1.getInt(1)+1;
        rs1.next();
        pAId =rs1.getInt(1)+1;
      // return pAId; 
    }
    catch(Exception e)
    {
    
    }
     
}
   /* private void CountPassenger() {
    try {
        Connection con = null;
        st = con.createStatement();
        rs1 = st.executeQuery("SELECT Max(pid) FROM managepassenger");
        rs1.next();
        pAId = rs1.getInt(1) + 1; // Increment the current maximum ID by 1
    } catch (Exception e) {
        pAId = 1; // Set the initial ID to 1 if there's an error or no existing records
    }
}*/
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(key==0)
        {
            JOptionPane.showMessageDialog(this, "Select an item first");
        }
        
         else{
        try{
            //CountPassenger();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            String sql = "UPDATE managepassenger SET name=?, gender=?, nationality=?, `passport no`=?, phone=? WHERE pid=?";
;
            
            PreparedStatement ptst= con.prepareStatement(sql);
        
         ptst.setInt(6, key);
            ptst.setString(1, pn.getText());
            ptst.setString(2, g.getSelectedItem().toString());
            ptst.setString(3, n.getText());
            ptst.setString(4, pass.getText());
            ptst.setString(5, ph.getText());

             int row=  ptst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data updated succesfully");
            con.close();
            Clear();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this,e);
        }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       if(pn.getText().isEmpty()||g.getSelectedItem().toString().isEmpty()||n.getText().isEmpty()||pass.getText().isEmpty()||ph.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else{
        try{
           CountPassenger();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            String sql="insert into managepassenger values (?,?,?,?,?,?)";
            PreparedStatement ptst= con.prepareStatement(sql);
            ptst.setInt(1, pAId);
            ptst.setString(2,pn.getText());
            ptst.setString(3,g.getSelectedItem().toString());
             ptst.setString(4,n.getText());
             ptst.setString(5,pass.getText()); 
              ptst.setString(6,ph.getText());
          ptst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data inserted succesfully");
            con.close();
            Clear();
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,e);
        } 
       }
    }//GEN-LAST:event_insertActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            Statement st= con.createStatement();
            String sql ="SELECT * from managepassenger";
            PreparedStatement ptst =con.prepareStatement(sql);
            ResultSet rs=ptst.executeQuery();
            DefaultTableModel dt =(DefaultTableModel)passengertable.getModel();
            dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getInt("pid"),rs.getString("name"),rs.getString("gender"),rs.getString("nationality"),rs.getString("passport no"),
                rs.getString("phone") };
                dt.addRow(o);
                
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_showActionPerformed


    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            Statement st = con.createStatement();
            String passport = pass.getText();
            String sql ="DELETE FROM `managepassenger` WHERE `passport no`='"+passport+"'";
            PreparedStatement ptst=con.prepareStatement(sql);
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data successfully deleted");
            
            con.close();
            Clear();
        
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
                                         
    }//GEN-LAST:event_deleteActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         dashboard obj = new dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked
int key =0;
    private void passengertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengertableMouseClicked
       DefaultTableModel model=(DefaultTableModel)passengertable.getModel();
        int myIndex=passengertable.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(myIndex,0).toString());
        pn.setText(model.getValueAt(myIndex,1).toString());
        g.setSelectedItem(model.getValueAt(myIndex,2 ).toString()); 
        n.setText(model.getValueAt(myIndex, 3).toString());
        pass.setText(model.getValueAt(myIndex, 4).toString());
         ph.setText(model.getValueAt(myIndex, 5).toString());
        
    }//GEN-LAST:event_passengertableMouseClicked

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
            java.util.logging.Logger.getLogger(managepassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managepassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managepassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managepassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managepassenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> g;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n;
    private javax.swing.JTextField pass;
    private javax.swing.JTable passengertable;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField pn;
    private javax.swing.JButton show;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
