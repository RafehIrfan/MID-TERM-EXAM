package question2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Question2_GetData extends javax.swing.JFrame {

   
    public Question2_GetData() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        city_id = new javax.swing.JLabel();
        city_name = new javax.swing.JLabel();
        Combobox1 = new javax.swing.JComboBox<>();
        Combobox2 = new javax.swing.JComboBox<>();
        getid = new javax.swing.JButton();
        getname = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        city_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city_id.setText("City_ID:");

        city_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city_name.setText("City_Name:");

        getid.setBackground(new java.awt.Color(204, 255, 0));
        getid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getid.setText("Get ID");
        getid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getidActionPerformed(evt);
            }
        });

        getname.setBackground(new java.awt.Color(255, 255, 102));
        getname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getname.setText("Get Name");
        getname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city_name)
                    .addComponent(city_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_id))
                .addGap(13, 13, 13)
                .addComponent(getid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city_name)
                    .addComponent(Combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(getname)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getidActionPerformed
        // TODO add your handling code here:
         
         try {
            Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/question2";
            String userName = "postgres";
            String password = "Rafey12345";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from rafey.\"CITIES\" ";
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
               String value = rs.getString("city_id");
               Combobox1.addItem(value);

            }
            rs.close();
            stmt.close();
            conn.close();

        } 
           catch (SQLException e) {
            e.printStackTrace();
             
        }
        
    }//GEN-LAST:event_getidActionPerformed

    private void getnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnameActionPerformed
        // TODO add your handling code here:
        
        try {
             Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/question2";
            String userName = "postgres";
            String password = "Rafey12345";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from rafey.\"CITIES\" ";
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               String value1 = rs.getString("city_name");
               Combobox2.addItem(value1);  

            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
             
        }
        
        
    }//GEN-LAST:event_getnameActionPerformed

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
            java.util.logging.Logger.getLogger(Question2_GetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question2_GetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question2_GetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question2_GetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question2_GetData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox1;
    private javax.swing.JComboBox<String> Combobox2;
    private javax.swing.JLabel city_id;
    private javax.swing.JLabel city_name;
    private javax.swing.JButton getid;
    private javax.swing.JButton getname;
    // End of variables declaration//GEN-END:variables
}
