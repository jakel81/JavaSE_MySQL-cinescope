/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rayanakel
 */
public class JIFPaysVisu extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFPaysVisu
     */
    public JIFPaysVisu() {
        initComponents();

        setTitle("Liste Pays");
        setVisible(true);

        try {
            // --- Connexion
            Connection lcn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/cinescope2014", "root", "root");

            PreparedStatement lpst = lcn.prepareStatement("SELECT * FROM pays");
            ResultSet lrs = lpst.executeQuery();

            Object[] tLigne;

            DefaultTableModel ldtm = (DefaultTableModel) jTableListePays.getModel();

            while (lrs.next()) {
                tLigne = new Object[5];

//                Méthode d'affichage sans la boucle
//                tLigne[0] = lrs.getString(1);
//                tLigne[1] = lrs.getString(2);
//                tLigne[2] = lrs.getString(3);
//                tLigne[3] = lrs.getString(4);
//                tLigne[4] = lrs.getString(5);

                //Méthode d'affichage avec une boucle
                for (int i = 0; i < 5; i++) {
                    tLigne[i] = lrs.getString(i + 1);
                }

                ldtm.addRow(tLigne);
            }

            lrs.close();
            lpst.close();
            lcn.close();

            jLabelMessage.setText("Chargement réussi !!");

        } catch (SQLException ex) {
            jLabelMessage.setText(ex.getMessage());
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
        jTableListePays = new javax.swing.JTable();
        jLabelMessage = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Liste Pays");

        jTableListePays.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableListePays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pays", "Nom du pays", "Masculin", "Feminin", "Neutre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListePays.setGridColor(new java.awt.Color(0, 0, 0));
        jTableListePays.setShowGrid(true);
        jScrollPane1.setViewportView(jTableListePays);

        jLabelMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListePays;
    // End of variables declaration//GEN-END:variables
}