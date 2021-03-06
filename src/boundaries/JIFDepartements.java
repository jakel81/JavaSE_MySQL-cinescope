/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import daos.DepartementDAO;
import daos.Globale;
import entities.Departement;
import java.awt.Component;
import java.awt.Rectangle;
import java.sql.*;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rayanakel
 */
public class JIFDepartements extends javax.swing.JInternalFrame {

    private Connection icn;
    private DefaultTableModel idtm;

    /**
     * Creates new form JIFDepartements
     */
    public JIFDepartements() {
        initComponents();

        setTitle("CRUD Départements");
        setVisible(true);

        jTextFieldId.setText("ID");
        jTextFieldCode.setText("");
        jTextFieldNom.setText("");

        //Méthode avec le DAO qui fait appel a remplirJTable
        try {
            icn = Globale.getCnx();
            System.out.println(icn);
            /*
             Recuperation du Model de la jTable
             */
            idtm = (DefaultTableModel) jTableDepartements.getModel();

        } catch (Exception ex) {
            jLabelMessage.setText(ex.getMessage());
        }

        remplirJTable();

        //Methode d'affichage sans le DAO
//        try {
//            // --- Connexion
//            //String lsDSN = "jdbc:mysql://127.0.0.1:8889/cinescope2014";
//            //icn = DriverManager.getConnection(lsDSN, "root", "root");
//
//            //Affichage des donnees de la table departement
//            PreparedStatement lpst = icn.prepareStatement("SELECT * FROM departement");
//            ResultSet lrs = lpst.executeQuery();
//
//            Object[] tLigne;
//
//            DefaultTableModel idtm = (DefaultTableModel) jTableDepartements.getModel();
//
//            while (lrs.next()) {
//                tLigne = new Object[3];
//
//                tLigne[0] = lrs.getString(1);
//                tLigne[1] = lrs.getString(2);
//                tLigne[2] = lrs.getString(3);
//
//                idtm.addRow(tLigne);
//            }
//
//            lrs.close();
//            lpst.close();
//
//            jLabelMessage.setText("Chargement réussi !!");
//
//        } catch (SQLException ex) {
//            jLabelMessage.setText(ex.getMessage());
//        }
    }

    //Methode de remplissage de la JTable
    private void remplirJTable() {

        for (int i = idtm.getRowCount() - 1; i >= 0; i--) {
            idtm.removeRow(i);
        }

        try {
            Object[] tLigne;
            DepartementDAO dao = new DepartementDAO(icn);
            List<Departement> liste = dao.selectAll();
            for (int i = 0; i < liste.size(); i++) {
                Departement departement = liste.get(i);
                tLigne = new Object[3];
                tLigne[0] = departement.getIdDepartement();
                tLigne[1] = departement.getCodeDepartement();
                tLigne[2] = departement.getNomDepartement();
                idtm.addRow(tLigne);
            }

            jLabelMessage.setText("Chargement réussi !!");

        } catch (Exception ex) {
            jLabelMessage.setText(ex.getMessage());
        }

    }

    //Methode qui permet de vider les JTextField 
    private void cls() {

        try {
            Component[] tComposants = getContentPane().getComponents();
            for (int i = 0; i < tComposants.length; i++) {
                Object objet = tComposants[i];
                if (objet.getClass().toString().equals("class javax.swing.JTextField")) {
                    JTextField composant = (JTextField) objet;
                    composant.setText("");
                }
            }
        } catch (Exception e) {
            jLabelMessage.setText(e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDepartements = new javax.swing.JTable();
        jLabelID = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jButtonAjouter = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTableDepartements.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableDepartements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code", "Nom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDepartements.setGridColor(new java.awt.Color(0, 0, 0));
        jTableDepartements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDepartementsMouseClicked(evt);
            }
        });
        jTableDepartements.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableDepartementsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDepartements);

        jLabelID.setText("ID");

        jLabelCode.setText("Code");

        jLabelNom.setText("Nom");

        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jButtonModifier.setText("Modifier");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        jLabelMessage.setText("Message");

        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jTextFieldId.setBackground(new java.awt.Color(238, 238, 238));
        jTextFieldId.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldId.setText("ID");
        jTextFieldId.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNom)
                                    .addComponent(jLabelCode)
                                    .addComponent(jLabelID))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAjouter)
                        .addGap(158, 158, 158)
                        .addComponent(jButtonModifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSupprimer)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjouter)
                    .addComponent(jButtonModifier)
                    .addComponent(jButtonSupprimer))
                .addGap(18, 18, 18)
                .addComponent(jLabelMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        // TODO add your handling code here:

        int liAffecte;

        if (jTextFieldCode.getText().isEmpty() || jTextFieldNom.getText().isEmpty()) {

            jLabelMessage.setText("Veuillez renseigner tout les champs !!");
        } else {
            try {

                DepartementDAO dao = new DepartementDAO(icn);

                // Insert
                Departement di = new Departement(jTextFieldCode.getText(), jTextFieldNom.getText());
                liAffecte = dao.insert(di);
                if (liAffecte == 1) {
                    icn.commit();
                    remplirJTable();
                    int liMax = jTableDepartements.getRowCount() - 1;
                    jTableDepartements.getSelectionModel().setSelectionInterval(liMax, liMax);
                    jTableDepartements.scrollRectToVisible(new Rectangle(jTableDepartements.getCellRect(liMax, 0, true)));
                }
                jLabelMessage.setText("Ajout réussi !");

                cls();

                //Ancienne méthode sans le DAO
//                // INSERTION
//                String lsSQL = "INSERT INTO departement (CODE_departement, NOM_departement) VALUES(?,?)";
//
//                PreparedStatement lpst = icn.prepareStatement(lsSQL);
//
//                //Recuperation des donnes dans les champs
//                lpst.setString(1, jTextFieldCode.getText());
//                lpst.setString(2, jTextFieldNom.getText());
//
//                //Execution
//                lpst.executeUpdate();
//
//                Object[] tLigne;
//
//                DefaultTableModel ldtm = (DefaultTableModel) jTableDepartements.getModel();
//
//                tLigne = new Object[3];
//
//                tLigne[1] = jTextFieldCode.getText();
//                tLigne[2] = jTextFieldNom.getText();
//
//                ldtm.addRow(tLigne);
//
//                lpst.close();
//
//                jLabelMessage.setText("Ajout réussi !");
                //Rafraichissement de la jTable = affichage de la table
//                String lsSQL2 = "SELECT * FROM departement";
//
//                PreparedStatement lpst2 = icn.prepareStatement(lsSQL2);
//
//                ResultSet lrs = lpst2.executeQuery();
//
//                Object[] tLigne;
//
//                DefaultTableModel ldtm = (DefaultTableModel) jTableDepartements.getModel();
//
//                while (lrs.next()) {
//                    tLigne = new Object[3];
//
//                    tLigne[0] = lrs.getString(1);
//                    tLigne[1] = lrs.getString(2);
//                    tLigne[2] = lrs.getString(3);
//
//                    ldtm.addRow(tLigne);
//                }
//
//                lrs.close();
//                lpst.close();
            } catch (SQLException ex) {
                jLabelMessage.setText(ex.getMessage());
            }
        }


    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        // TODO add your handling code here:

        if (jTextFieldCode.getText().isEmpty() || jTextFieldNom.getText().isEmpty()) {

            jLabelMessage.setText("Veuillez sélectionner une ligne.");
        } else {
            int liAffecte;

            try {
                DepartementDAO dao = new DepartementDAO(icn);

                // Update
                Departement di = new Departement(Integer.valueOf(jTextFieldId.getText()), jTextFieldCode.getText(), jTextFieldNom.getText());
                liAffecte = dao.update(di);
                if (liAffecte == 1) {
                    icn.commit();
                    remplirJTable();
                    cls();
                }
                jLabelMessage.setText("Département modifié !");

            } catch (SQLException e) {
                jLabelMessage.setText(e.getMessage());
            }
        }

        //Méthode sans le DAO
//        int liSelectedRow = this.jTableDepartements.getSelectedRow();
//
//        if (jTextFieldCode.getText().isEmpty() || jTextFieldNom.getText().isEmpty()) {
//
//            jLabelMessage.setText("Veuillez choisir un département.");
//        } else {
//            try {
//                // MODIFICATION
//                String lstSQL = "UPDATE departement SET code_departement = ?, nom_departement = ? WHERE id_departement = ?";
//
//                PreparedStatement lpst = icn.prepareStatement(lstSQL);
//
//                //Recuperation des valeurs dans les champs et update de la table
//                lpst.setString(1, jTextFieldCode.getText());
//                lpst.setString(2, jTextFieldNom.getText());
//                lpst.setString(3, jTextFieldId.getText());
//
//                lpst.executeUpdate();
//
//                lpst.close();
//
//                jTableDepartements.setValueAt(jTextFieldId.getText(), liSelectedRow, 0);
//                jTableDepartements.setValueAt(jTextFieldCode.getText(), liSelectedRow, 1);
//                jTableDepartements.setValueAt(jTextFieldNom.getText(), liSelectedRow, 2);
//
//                jLabelMessage.setText("Département modifié !!!");
//
//            } catch (SQLException ex) {
//                jLabelMessage.setText(ex.getMessage());
//            }
//        }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        // TODO add your handling code here:

        if (jTextFieldCode.getText().isEmpty() || jTextFieldNom.getText().isEmpty()) {

            jLabelMessage.setText("Veuillez sélectionner une ligne.");
        } else {
            int liAffecte;
            try {
                DepartementDAO dao = new DepartementDAO(icn);

                // Delete
                Departement dd = new Departement(Integer.valueOf(jTextFieldId.getText()), jTextFieldCode.getText(), jTextFieldNom.getText());
                liAffecte = dao.delete(dd);
                icn.commit();
                if (liAffecte == 1) {
                    icn.commit();
                    remplirJTable();
                    cls();
                }
                jLabelMessage.setText("Département supprimé !");

            } catch (SQLException e) {
                jLabelMessage.setText(e.getMessage());
            }
        }

        //Méthode sans le DAO
//        int liSelectedRow = this.jTableDepartements.getSelectedRow();
//
//        if (jTextFieldCode.getText().isEmpty() || jTextFieldNom.getText().isEmpty()) {
//
//            jLabelMessage.setText("Veuillez choisir un département.");
//        } else {
//            try {
//                String lstSQL = "DELETE FROM departement WHERE id_departement = ?";
//
//                PreparedStatement lpst = icn.prepareStatement(lstSQL);
//
//                lpst.setString(1, jTableDepartements.getValueAt(liSelectedRow, 0).toString());
//
//                lpst.executeUpdate();
//
//                lpst.close();
//
////                jTableDepartements.setValueAt(jTextFieldId.getText(),liSelectedRow, 0);
////                jTableDepartements.setValueAt(jTextFieldCode.getText(),liSelectedRow, 1);
////                jTableDepartements.setValueAt(jTextFieldNom.getText(),liSelectedRow, 2);
//                DefaultTableModel ldtm = (DefaultTableModel) jTableDepartements.getModel();
//
//                int tLigne = this.jTableDepartements.getSelectedRow();
//
//                ldtm.removeRow(tLigne);
//
//                jLabelMessage.setText("Département supprimé !!!");
//
//            } catch (SQLException ex) {
//                jLabelMessage.setText(ex.getMessage());
//            }
//        }
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jTableDepartementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDepartementsMouseClicked
        // TODO add your handling code here:
        int liSelectedRow = this.jTableDepartements.getSelectedRow();

        jTextFieldId.setText(jTableDepartements.getValueAt(liSelectedRow, 0).toString());
        jTextFieldCode.setText(jTableDepartements.getValueAt(liSelectedRow, 1).toString());
        jTextFieldNom.setText(jTableDepartements.getValueAt(liSelectedRow, 2).toString());

    }//GEN-LAST:event_jTableDepartementsMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        //PLus nécessaire car la deconnection se fait dans la MDI
//        try {
//            icn.close();
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//        }
    }//GEN-LAST:event_formInternalFrameClosing

    //Navigation dans la jTable avec le clavier
    private void jTableDepartementsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableDepartementsKeyReleased
        // TODO add your handling code here:
        jTableDepartementsMouseClicked(null);
    }//GEN-LAST:event_jTableDepartementsKeyReleased

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDepartements;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNom;
    // End of variables declaration//GEN-END:variables
}
