/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author ahmed
 */
public class election extends javax.swing.JFrame  {

    
    /**
     * Creates new form election
     */
    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    
    public election() {
        ConnectToDB();
        initComponents();
        fillcandidatetable();
        //fillbox();

        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        candidate_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        vote_b = new javax.swing.JButton();
        code_tf = new javax.swing.JTextField();
        box = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("election");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(41, 241, 195));

        jScrollPane2.setBorder(null);

        candidate_table.setAutoCreateRowSorter(true);
        candidate_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first name", "last name", "party"
            }
        ));
        jScrollPane2.setViewportView(candidate_table);

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));

        vote_b.setBackground(new java.awt.Color(41, 241, 195));
        vote_b.setText("vote");
        vote_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote_bActionPerformed(evt);
            }
        });

        code_tf.setBackground(new java.awt.Color(34, 49, 63));
        code_tf.setForeground(new java.awt.Color(255, 255, 255));
        code_tf.setToolTipText("insert voting code");
        code_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        code_tf.setCaretColor(new java.awt.Color(255, 255, 255));

        box.setEditable(true);
        box.setToolTipText("candidat id");
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inser voting code");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose candidate ID");

        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logout)
                            .addComponent(vote_b, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logout)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vote_b)
                .addGap(42, 42, 42))
        );

        box.getAccessibleContext().setAccessibleDescription("candidate id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        login openlogin= new login();
        openlogin.setVisible(true);
        box.removeAllItems();
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void vote_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vote_bActionPerformed
        // TODO add your handling code here:
        if(!code_tf.getText().isEmpty()){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String host = "jdbc:derby://localhost:1527/samp";
                String username = "db";
                String password = "db";
                Connection con =  DriverManager.getConnection(host,username,password);
                int vote=Integer.parseInt(box.getItemAt(box.getSelectedIndex()));
                
                if(isInteger(code_tf.getText()) && isInteger(login.id_tf.getText())){
                int code=Integer.parseInt(code_tf.getText());
                int id=Integer.parseInt(login.id_tf.getText());
                PreparedStatement pstmt;
                PreparedStatement pstmt2;
                Statement stmt;

                String SQL1 ="INSERT INTO VOTES VALUES(?)";
                String SQL2="SELECT * FROM users WHERE id="+id;
                String SQL3="UPDATE USERS SET vote=? WHERE id="+id;

                pstmt= con.prepareStatement(SQL1);
                pstmt.setInt(1,vote);
                pstmt2= con.prepareStatement(SQL3);
                pstmt2.setBoolean(1,true);

                stmt=con.createStatement();

                ResultSet rs=stmt.executeQuery(SQL2);

                int i = 0,j = 0;
                while(rs.next()){
                    if(rs.getInt("code")==code){
                        int response=JOptionPane.showConfirmDialog(this, "do you want to confirm your vote?", "vote",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(response==JOptionPane.YES_OPTION){
                        i=pstmt2.executeUpdate();
                        j=pstmt.executeUpdate();}
                        

                        if(i>0&& j>0 ){
                            JOptionPane.showMessageDialog(this, "Vote saved", "Thank you for voting", JOptionPane.INFORMATION_MESSAGE);
                            code_tf.setText(null);
                            box.removeAllItems();
                            vote_b.setVisible(false);
                        }}
                        else{
                            JOptionPane.showMessageDialog(this, "wrong code", "error", JOptionPane.ERROR_MESSAGE);
                        }}}
                else{
                JOptionPane.showMessageDialog(this, "invalid code", "error", JOptionPane.ERROR_MESSAGE);}

                    }
                    catch(ClassNotFoundException | SQLException x)
                    {
                        System.out.println("Exception :" + x);

                    }}
                    else{
                        JOptionPane.showMessageDialog(this, "insert your voting code", "error", JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_vote_bActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         fillcandidatetable();
         fillbox();
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new election().setVisible(true);
            }
        });
    }
        private void fillcandidatetable() {
        try
        {
                DefaultTableModel model = new DefaultTableModel();
        
                Object[] columnsName = new Object[4];
                columnsName[0] = "ID";
                columnsName[1] = "First Name";
                columnsName[2] = "Last Name";
                columnsName[3] = "Party";

                model.setColumnIdentifiers(columnsName);
                //Class.forName("org.apache.derby.jdbc.ClientDriver");
                Class.forName("com.mysql.jdbc.Driver");
      
                 String host = "jdbc:derby://localhost:1527/samp";
                 String username = "db";
                 String password = "db";
                  Connection con =  DriverManager.getConnection(host,username,password);
                  Statement stmt= con.createStatement();

                 String SQL = "SELECT * FROM candidate";
                 ResultSet rs = stmt.executeQuery( SQL );
                 while(rs.next())
                 {
                    
                     int id = rs.getInt("id");
                     String first_name = rs.getString("f_name");
                     String last_name = rs.getString("l_name");
                     String party = rs.getString("party");
                     Object row [] = {id, first_name, last_name, party};
                     model.addRow(row);
                     //box.addItem(rs.getString("id"));
                 }
                 candidate_table.setModel(model);
                 con.close();



        }
        catch(ClassNotFoundException | SQLException x)
        {
                System.out.println("Exception :" + x);
                
        }
    }
        private void ConnectToDB()
    {
        try{
        String host = "jdbc:derby://localhost:1527/samp";
        String username = "db";
        String password = "db";
        con =  DriverManager.getConnection(host,username,password);
        stmt = con.createStatement( );
        }
         catch(SQLException err) 
                {
                    System.out.println(err.getMessage());
                }
    }
        public void fillbox(){
        try
        {
                DefaultTableModel model = new DefaultTableModel();
        
                Object[] columnsName = new Object[4];
                columnsName[0] = "ID";
                columnsName[1] = "First Name";
                columnsName[2] = "Last Name";
                columnsName[3] = "Party";

                model.setColumnIdentifiers(columnsName);
                //Class.forName("org.apache.derby.jdbc.ClientDriver");
                Class.forName("com.mysql.jdbc.Driver");
      
                 String host = "jdbc:derby://localhost:1527/samp";
                 String username = "db";
                 String password = "db";
                  Connection con =  DriverManager.getConnection(host,username,password);
                  Statement stmt= con.createStatement();

                 String SQL = "SELECT * FROM candidate";
                 ResultSet rs = stmt.executeQuery( SQL );
                 while(rs.next())
                 {
                    
                     int id = rs.getInt("id");
                     String first_name = rs.getString("f_name");
                     String last_name = rs.getString("l_name");
                     String party = rs.getString("party");
                     Object row [] = {id, first_name, last_name, party};
                     model.addRow(row);
                     box.addItem(rs.getString("id"));
                 }
                 candidate_table.setModel(model);



        }
        catch(ClassNotFoundException | SQLException x)
        {
                System.out.println("Exception :" + x);
                
        }
        }
        public void deletebox(){
          
        }
        
           public static boolean isInteger(String s) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
 
         // s is a valid integer
 
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }
 
      return isValidInteger;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JTable candidate_table;
    private javax.swing.JTextField code_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    public javax.swing.JButton vote_b;
    // End of variables declaration//GEN-END:variables
}
