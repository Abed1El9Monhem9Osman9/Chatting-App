/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectChat;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abed_
 */
public class ClientGui extends javax.swing.JFrame {

    /**
     * Creates new form ClientGui
     */
    IServer serverRef;
    ClientImp client;
    IGroup group;

    public ClientGui() {
        initComponents();
        jCheckBox1.setEnabled(false);
        Disconnect.setEnabled(false);
        Send.setEnabled(false);
        listConnected.setEnabled(false);
        createGroup.setEnabled(false);
        addClient.setEnabled(false);
        removeClient.setEnabled(false);
        GetAllGrpClients.setEnabled(false);
        SendGroup.setEnabled(false);
        Broadcast.setEnabled(false);
        listClients.setEnabled(false);
        listGroups.setEnabled(false);
        RemoveGrp.setEnabled(false);

        try {
            client = new ClientImp(textArea);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
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

        Connect = new javax.swing.JButton();
        Disconnect = new javax.swing.JButton();
        Send = new javax.swing.JButton();
        msg = new javax.swing.JTextField();
        remoteid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        listConnected = new javax.swing.JButton();
        localid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        createGroup = new javax.swing.JButton();
        idGrp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idAddClient = new javax.swing.JTextField();
        idRemoveClient = new javax.swing.JTextField();
        addClient = new javax.swing.JButton();
        removeClient = new javax.swing.JButton();
        GetAllGrpClients = new javax.swing.JButton();
        idGrpClients = new javax.swing.JTextField();
        msgGrp = new javax.swing.JTextField();
        SendGroup = new javax.swing.JButton();
        remoteidGrp = new javax.swing.JTextField();
        listClients = new javax.swing.JButton();
        msgBroadcast = new javax.swing.JTextField();
        Broadcast = new javax.swing.JButton();
        listGroups = new javax.swing.JButton();
        RemoveGrp = new javax.swing.JButton();
        idRemoveGrp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Connect.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });

        Disconnect.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        Disconnect.setText("Disconnect");
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });

        Send.setText("SendToClient");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        remoteid.setText("Id");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        listConnected.setText("listConnected");
        listConnected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listConnectedActionPerformed(evt);
            }
        });

        localid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Do you want to subscribe to the \"offline notification\" ?? ");

        jCheckBox1.setText("Offline Notification");

        createGroup.setText("CreateGroup");
        createGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Creation Of Group");

        addClient.setText("AddClient");
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });

        removeClient.setText("RemoveClient");
        removeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClientActionPerformed(evt);
            }
        });

        GetAllGrpClients.setText("GetAllGrpClients");
        GetAllGrpClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetAllGrpClientsActionPerformed(evt);
            }
        });

        SendGroup.setText("SendToGroup");
        SendGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendGroupActionPerformed(evt);
            }
        });

        remoteidGrp.setText("Id");

        listClients.setText("listClients");
        listClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listClientsActionPerformed(evt);
            }
        });

        Broadcast.setText("Broadcast");
        Broadcast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BroadcastActionPerformed(evt);
            }
        });

        listGroups.setText("listGroups");
        listGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listGroupsActionPerformed(evt);
            }
        });

        RemoveGrp.setText("RemoveGroup");
        RemoveGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveGrpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Local ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(msg)
                            .addComponent(jScrollPane1)
                            .addComponent(msgGrp)
                            .addComponent(msgBroadcast))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Send)
                                .addGap(18, 18, 18)
                                .addComponent(remoteid, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(listGroups, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(listClients, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(listConnected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Broadcast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SendGroup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(remoteidGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(localid)
                                .addGap(18, 18, 18)
                                .addComponent(Connect)
                                .addGap(18, 18, 18)
                                .addComponent(Disconnect))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(idGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idRemoveClient, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idGrpClients, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idRemoveGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(createGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addClient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GetAllGrpClients)
                                    .addComponent(RemoveGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Connect)
                    .addComponent(Disconnect)
                    .addComponent(localid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Send)
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remoteid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendGroup)
                    .addComponent(msgGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remoteidGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Broadcast)
                    .addComponent(msgBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listConnected)
                        .addGap(18, 18, 18)
                        .addComponent(listClients)
                        .addGap(18, 18, 18)
                        .addComponent(listGroups))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createGroup)
                    .addComponent(idGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRemoveClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idGrpClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetAllGrpClients))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRemoveGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveGrp))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        Disconnect.setEnabled(true);
        Send.setEnabled(true);
        listConnected.setEnabled(true);
        Connect.setEnabled(false);
        jCheckBox1.setEnabled(true);
        createGroup.setEnabled(true);
        Broadcast.setEnabled(true);
        listClients.setEnabled(true);
        listGroups.setEnabled(true);
        SendGroup.setEnabled(true);

        if (serverRef == null) {
            try {
                serverRef = (IServer) Naming.lookup("rmi://127.0.0.1:2000/serv");
            } catch (NotBoundException | MalformedURLException | RemoteException ex) {
                Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            serverRef.reconnect(localid.getText().trim(), client);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ConnectActionPerformed

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        Disconnect.setEnabled(false);
        Send.setEnabled(false);
        listConnected.setEnabled(false);
        Connect.setEnabled(true);
        jCheckBox1.setEnabled(false);
        createGroup.setEnabled(false);
        addClient.setEnabled(false);
        removeClient.setEnabled(false);
        GetAllGrpClients.setEnabled(false);
        RemoveGrp.setEnabled(false);
        SendGroup.setEnabled(false);
        Broadcast.setEnabled(false);
        listClients.setEnabled(false);
        listGroups.setEnabled(false);

        if (jCheckBox1.isSelected()) {
            try {
                serverRef.subscribe(localid.getText().trim(), true);
            } catch (RemoteException ex) {
                Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                serverRef.subscribe(localid.getText().trim(), false);
            } catch (RemoteException ex) {
                Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            serverRef.disconnect(localid.getText().trim());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DisconnectActionPerformed

    private void localidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        String id = remoteid.getText().trim();

        try {
            serverRef.send(msg.getText(), id);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SendActionPerformed

    private void listConnectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listConnectedActionPerformed
        try {
            textArea.append("\n" + serverRef.listConnected());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listConnectedActionPerformed

    private void createGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupActionPerformed

        try {

            if (serverRef.getListGrp().contains(idGrp.getText().trim())) {
                System.out.println("id already exist");
                return;
            }
            addClient.setEnabled(true);
            removeClient.setEnabled(true);
            GetAllGrpClients.setEnabled(true);
            RemoveGrp.setEnabled(true);

            group = new GroupImp(idGrp.getText().trim(), localid.getText().trim(), serverRef);

            serverRef.createGroup(idGrp.getText().trim(), localid.getText().trim(), group);

        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createGroupActionPerformed

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        try {

            group.addClient(idAddClient.getText().trim(), serverRef);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addClientActionPerformed

    private void removeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClientActionPerformed
        try {
            group.removeClient(idRemoveClient.getText().trim());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeClientActionPerformed

    private void GetAllGrpClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetAllGrpClientsActionPerformed
        try {
            idGrpClients.setText(group.getAllClients());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GetAllGrpClientsActionPerformed

    private void SendGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendGroupActionPerformed
        try {
            serverRef.sendToGroup(remoteidGrp.getText().trim(), msgGrp.getText().trim());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SendGroupActionPerformed

    private void listClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listClientsActionPerformed
        try {
            textArea.append("\n" + serverRef.getAllClients());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listClientsActionPerformed

    private void BroadcastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BroadcastActionPerformed
        try {
            serverRef.broadcast(msgBroadcast.getText().trim());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BroadcastActionPerformed

    private void listGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listGroupsActionPerformed
        try {
            textArea.append("\n" + serverRef.getListGrp());
        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listGroupsActionPerformed

    private void RemoveGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveGrpActionPerformed
        try {
            if (idRemoveGrp.getText().trim().isEmpty()) {
                return;
            }
            if (serverRef.getListGrp().contains(idRemoveGrp.getText().trim())) {
                boolean b = serverRef.removeGroup(idRemoveGrp.getText().trim(), localid.getText().trim());
                if (b) {
                    addClient.setEnabled(false);
                    removeClient.setEnabled(false);
                    GetAllGrpClients.setEnabled(false);
                    RemoveGrp.setEnabled(false);
                }
            }

        } catch (RemoteException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RemoveGrpActionPerformed

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
            java.util.logging.Logger.getLogger(ClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Broadcast;
    private javax.swing.JButton Connect;
    private javax.swing.JButton Disconnect;
    private javax.swing.JButton GetAllGrpClients;
    private javax.swing.JButton RemoveGrp;
    private javax.swing.JButton Send;
    private javax.swing.JButton SendGroup;
    private javax.swing.JButton addClient;
    private javax.swing.JButton createGroup;
    private javax.swing.JTextField idAddClient;
    private javax.swing.JTextField idGrp;
    private javax.swing.JTextField idGrpClients;
    private javax.swing.JTextField idRemoveClient;
    private javax.swing.JTextField idRemoveGrp;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listClients;
    private javax.swing.JButton listConnected;
    private javax.swing.JButton listGroups;
    private javax.swing.JTextField localid;
    private javax.swing.JTextField msg;
    private javax.swing.JTextField msgBroadcast;
    private javax.swing.JTextField msgGrp;
    private javax.swing.JTextField remoteid;
    private javax.swing.JTextField remoteidGrp;
    private javax.swing.JButton removeClient;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
