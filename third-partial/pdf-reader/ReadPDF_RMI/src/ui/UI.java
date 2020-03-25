/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import client.Client;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import server.Server;
import server.ServerInterface;

/**
 *
 * @author andrsrz
 */

public class UI extends javax.swing.JFrame {
    
    private Client client;
    private ServerInterface server, serverIni;
    private boolean isConnected;

    /**
     * Creates new form ClientGUI
     */
    public UI() throws UnknownHostException {
        initComponents();
        this.setResizable(false);
        jTextField_ServerIP.setText(InetAddress.getLocalHost().getHostAddress().toString());
        
        try{
            // rmiregistry
            LocateRegistry.createRegistry(Integer.parseInt(jTextField_Port.getText()));

            // New server object
            serverIni = new Server();
            Naming.rebind("rmi://" 
                    + jTextField_ServerIP.getText() 
                    + ":" 
                    + jTextField_Port.getText() 
                    + "/Chat", serverIni);
            System.out.println("Server Ready...");
        } catch (Exception e){
            System.err.println("Server Failed... " + e);
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

        jTextField_ServerIP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Nickname = new javax.swing.JTextField();
        jButton_ConnectToServer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Messages = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Message = new javax.swing.JTextField();
        jButton_SendMessage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Port = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_ServerIP.setText("192.168.0.12");

        jLabel1.setText("Server IP");

        jLabel2.setText("Nickname");

        jButton_ConnectToServer.setText("Connect");
        jButton_ConnectToServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConnectToServerActionPerformed(evt);
            }
        });

        jTextArea_Messages.setEditable(false);
        jTextArea_Messages.setColumns(20);
        jTextArea_Messages.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Messages);

        jLabel3.setText("Messages");

        jButton_SendMessage.setText("Send");
        jButton_SendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SendMessageActionPerformed(evt);
            }
        });

        jLabel4.setText("Port");

        jTextField_Port.setText("1234");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Nickname)
                                    .addComponent(jTextField_Port))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ConnectToServer))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Message, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SendMessage))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_ConnectToServer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SendMessage))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SendMessageActionPerformed
        // TODO add your handling code here:
        if (!isConnected) {
            JOptionPane.showMessageDialog(this, "Debes conectarte primero");
            return;
        }
        
        String message = jTextField_Message.getText();
        message = jTextField_Nickname.getText() + ": " + message;
        jTextField_Message.setText("");
        
        try {
            server.publish(message, client);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_SendMessageActionPerformed

    private void jButton_ConnectToServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConnectToServerActionPerformed
        // TODO add your handling code here:
        if (!isConnected) {
            if (jTextField_Nickname.getText().equals("") ||
                    jTextField_Nickname.getText().equals(" ") ||
                    jTextField_ServerIP.getText().equals("") || 
                    jTextField_Port.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter all the information!.");
                return;
            }
            try {
                client = new Client(jTextField_Nickname.getText());
                // client.setUI(this);
                server = (ServerInterface)Naming.lookup("rmi://" 
                        + jTextField_ServerIP.getText() 
                        + ":" 
                        + jTextField_Port.getText()
                        + "/Chat");
                
                server.login(client);
                isConnected = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Connection Error.");
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_jButton_ConnectToServerActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UI().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void writeMessage (String message) {
        jTextArea_Messages.setText(jTextArea_Messages.getText() + "\n" + message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ConnectToServer;
    private javax.swing.JButton jButton_SendMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Messages;
    private javax.swing.JTextField jTextField_Message;
    private javax.swing.JTextField jTextField_Nickname;
    private javax.swing.JTextField jTextField_Port;
    private javax.swing.JTextField jTextField_ServerIP;
    // End of variables declaration//GEN-END:variables
}