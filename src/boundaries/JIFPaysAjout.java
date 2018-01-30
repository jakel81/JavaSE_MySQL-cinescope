/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.awt.Component;
import java.sql.*;
import javax.swing.JTextField;


/**
 *
 * @author rayanakel
 */
public class JIFPaysAjout extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFNouveauPays
     */
    public JIFPaysAjout() {
        initComponents();

        jTextFieldNomPays.setText("");
        jTextFieldMasculin.setText("");
        jTextFieldFeminin.setText("");
        jTextFieldNeutre.setText("");

        setTitle("Nouveau pays");
        setVisible(true);

    }
    
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

        jLabelNomPays = new javax.swing.JLabel();
        jLabelMasculin = new javax.swing.JLabel();
        jLabelFeminin = new javax.swing.JLabel();
        jLabelNeutre = new javax.swing.JLabel();
        jTextFieldNomPays = new javax.swing.JTextField();
        jTextFieldMasculin = new javax.swing.JTextField();
        jTextFieldFeminin = new javax.swing.JTextField();
        jTextFieldNeutre = new javax.swing.JTextField();
        jButtonAjouter = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nouveau Pays");

        jLabelNomPays.setText("Nom du pays");

        jLabelMasculin.setText("Masculin");

        jLabelFeminin.setText("Féminin");

        jLabelNeutre.setText("Neutre");

        jTextFieldNomPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomPaysActionPerformed(evt);
            }
        });

        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jLabelMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNomPays)
                                .addComponent(jLabelMasculin)
                                .addComponent(jLabelFeminin)
                                .addComponent(jLabelNeutre))
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNomPays)
                                .addComponent(jTextFieldFeminin, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(jTextFieldMasculin)
                                .addComponent(jTextFieldNeutre)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomPays)
                    .addComponent(jTextFieldNomPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMasculin)
                    .addComponent(jTextFieldMasculin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFeminin)
                    .addComponent(jTextFieldFeminin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNeutre)
                    .addComponent(jTextFieldNeutre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAjouter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMessage)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        // TODO add your handling code here:
        
        //Verification si les champs sont vides
        if (jTextFieldNomPays.getText().isEmpty() || jTextFieldMasculin.getText().isEmpty() || jTextFieldFeminin.getText().isEmpty() || jTextFieldNeutre.getText().isEmpty()) {

            jLabelMessage.setText("Veuillez renseigner tout les champs!!");
        } else {
            try {
                // --- Connexion
                Class.forName("org.gjt.mm.mysql.Driver");
                String lsDSN = "jdbc:mysql://127.0.0.1:8889/cinescope2014";
                Connection cnx = DriverManager.getConnection(lsDSN, "root", "root");

                // INSERTION
                String lsSQL = "INSERT INTO pays(nom_pays, masculin, feminin, neutre) VALUES(?,?,?,?)";

                PreparedStatement lpst = cnx.prepareStatement(lsSQL);

                //Recuperation des donnes dans les champs
                lpst.setString(1, jTextFieldNomPays.getText());
                lpst.setString(2, jTextFieldMasculin.getText());
                lpst.setString(3, jTextFieldFeminin.getText());
                lpst.setString(4, jTextFieldNeutre.getText());

                //Execution
                lpst.executeUpdate();

                lpst.close();
                cnx.close();

                jLabelMessage.setText("Ajout réussi !");
                
                cls();

            } catch (ClassNotFoundException | SQLException ex) {
                jLabelMessage.setText(ex.getMessage());
            }
        }


    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jTextFieldNomPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomPaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomPaysActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JLabel jLabelFeminin;
    private javax.swing.JLabel jLabelMasculin;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNeutre;
    private javax.swing.JLabel jLabelNomPays;
    private javax.swing.JTextField jTextFieldFeminin;
    private javax.swing.JTextField jTextFieldMasculin;
    private javax.swing.JTextField jTextFieldNeutre;
    private javax.swing.JTextField jTextFieldNomPays;
    // End of variables declaration//GEN-END:variables
}
