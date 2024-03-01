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

public class ticketcancellation extends javax.swing.JFrame {

   
    public ticketcancellation() {
        initComponents();
        GetTickets();
        fc.setEditable(false);
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        tid = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cdate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        Back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ctable = new javax.swing.JTable();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Ticket  Cancellation");

        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Ticket  ID ");

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Flight Code");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cancellation date");

        cancel.setBackground(new java.awt.Color(0, 204, 204));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 51, 51));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 204, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        Show.setBackground(new java.awt.Color(0, 204, 204));
        Show.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Show.setForeground(new java.awt.Color(255, 255, 255));
        Show.setText("SHOW");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 0, 0));
        Back.setText("<--BACK");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        Ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cancel Id", "Ticket Id", "Flight Code", "Cancellation date"
            }
        ));
        jScrollPane1.setViewportView(Ctable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(137, 166, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(cancel)
                .addGap(163, 163, 163)
                .addComponent(reset)
                .addGap(131, 131, 131)
                .addComponent(Show)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(reset)
                    .addComponent(Show))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 Connection con=null;
    PreparedStatement ptst=null;
    ResultSet rs=null,rs1=null;
    Statement st=null,st1=null;
    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       dashboard obj = new dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        GetFlightCode();
    }//GEN-LAST:event_tidActionPerformed
private void cancel()
{
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            Statement st = con.createStatement();
           
            String sql ="DELETE FROM bookingtable WHERE ticketid ="+tid.getSelectedItem();
            PreparedStatement ptst=con.prepareStatement(sql);
            ptst.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Ticket Cancelled");
            
            con.close();
           // Clear();
        
        }
     catch(Exception e)
     {
         
     }
}
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       fc.setText("");
      
    }//GEN-LAST:event_resetActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        if(fc.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else{
        try{
           CountCancellation();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            String sql="insert into cancellationtable values (?,?,?,?)";
            PreparedStatement ptst= con.prepareStatement(sql);
            ptst.setInt(1, Cid);
            ptst.setInt(2,Integer.valueOf(tid.getSelectedItem().toString()));
           
             ptst.setString(3,fc.getText());
             ptst.setString(4,Cdate.getDate().toString()); 
             
          ptst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Ticket Cancelled successfully");
            con.close();
           // Clear();
           cancel();
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,e);
        } 
       }
        
    }//GEN-LAST:event_cancelActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed

  try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            Statement st= con.createStatement();
            String sql ="SELECT * from cancellationtable";
            PreparedStatement ptst =con.prepareStatement(sql);
            ResultSet rs=ptst.executeQuery();
            DefaultTableModel dt =(DefaultTableModel)Ctable.getModel();
            dt.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getString("cancelled Id"),rs.getString("ticket Id"),rs.getString("Fl Code"),rs.getString("Cancellation Date")
                };
                dt.addRow(o);
                
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this,e);
        }

       
    }//GEN-LAST:event_ShowActionPerformed

   private void GetTickets() 
    {
     try{   
        con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
        st=con.createStatement();
        String sql="Select * from bookingtable";
        rs=st.executeQuery(sql);
        while(rs.next())
        {
            String TID =rs.getString("ticketid");
            tid.addItem(TID);
        }
        
        
      }
     catch(Exception e)
     {
         
     }
    }
    private void GetFlightCode()
    {
        String sql ="Select * from bookingtable where ticketid= "+tid.getSelectedItem().toString();
        Statement st;
        ResultSet rs;
        try{
            con= java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3308/ams","root","");
            st=con.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next())
            {
                fc.setText(rs.getString("Flcode"));
               
            }
            
        }
        catch(Exception e)
        {
            
        }
    }
   int Cid=0;
 private void CountCancellation()
{
    try{
        Connection con=null;
        st = con.createStatement();
        rs1=st.executeQuery("select Max(cancelled Id) from cancellationtable");
        rs1.next();
        Cid=rs1.getInt(1)+1;
    }
    catch(Exception e)
    {
    
    }
}

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketcancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private com.toedter.calendar.JDateChooser Cdate;
    private javax.swing.JTable Ctable;
    private javax.swing.JButton Show;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField fc;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> tid;
    // End of variables declaration//GEN-END:variables
}
