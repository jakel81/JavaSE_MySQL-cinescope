package boundaries;


import daos.Globale;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import entities.Journaliste;
import daos.JournalisteDAO;
import daos.MediaDAO;
import entities.Media;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author formation
 */
public class JIFJournalistes extends javax.swing.JInternalFrame {

    private Connection con;
    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbm;
    private String[] tEntetes;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    private Map<String, Integer> mapMedia;

    /**
     * Creates new form JInternalFrameJournaliste
     */
    public JIFJournalistes() {
        initComponents();
        Object[] tDataLigne;
        remplirTable();
    }

    private void remplirTable() {

        dtm = (DefaultTableModel) jTableJournaliste.getModel();

        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        try {
            con = Globale.getCnx();

            dcbm = new DefaultComboBoxModel();
            mapMedia = new HashMap();

            Object[] tLigne;
            JournalisteDAO dao = new JournalisteDAO(con);
            List<Journaliste> liste = dao.selectAll();

            for (int i = 0; i < liste.size(); i++) {
                Journaliste journaliste = liste.get(i);
                tLigne = new Object[3];
                tLigne[0] = journaliste.getId_journaliste();
                tLigne[1] = journaliste.getNom_journaliste();
                tLigne[2] = journaliste.getNom_media();
                dtm.addRow(tLigne);
            }

            Object[] tLigneMedia;
            MediaDAO daoMedia = new MediaDAO(con);
            List<Media> Media = daoMedia.selectAll();
            for (int i = 0; i < Media.size(); i++) {
                Media media = Media.get(i);
                tLigneMedia = new Object[2];
                tLigneMedia[0] = media.getId_media();
                tLigneMedia[1] = media.getNom_media();
                dcbm.addElement(media.getNom_media());
                mapMedia.put(media.getNom_media(), media.getId_media());
            }

            jComboBoxMedia.setModel(dcbm);

            jLabelMessage.setText("Okay !!!");

        } catch (Exception e) {
            jLabelMessage.setText(e.getMessage());
        }
    }

    private void clear() {
        jLabelIdJournaliste.setText("");
        try {
            Component[] tComposants = getContentPane().getComponents();
            for (int i = 0; i < tComposants.length; i++) {
                Object objet = tComposants[i];
                if (objet.getClass().toString().equals("class javax.swing.JTextField")) {
                    JTextField composant = (JTextField) objet;
                    composant.setText("");
                    jComboBoxMedia.setSelectedItem(null);
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
        jTableJournaliste = new javax.swing.JTable();
        jLabelId = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelMedia = new javax.swing.JLabel();
        jLabelIdJournaliste = new javax.swing.JLabel();
        jTextFieldNomJournaliste = new javax.swing.JTextField();
        jComboBoxMedia = new javax.swing.JComboBox();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CRUD Journaliste");
        setVisible(true);

        jTableJournaliste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Journaliste", "Nom Journaliste", "Media"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableJournaliste.getTableHeader().setReorderingAllowed(false);
        jTableJournaliste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJournalisteMouseClicked(evt);
            }
        });
        jTableJournaliste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableJournalisteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableJournaliste);
        if (jTableJournaliste.getColumnModel().getColumnCount() > 0) {
            jTableJournaliste.getColumnModel().getColumn(0).setResizable(false);
            jTableJournaliste.getColumnModel().getColumn(1).setResizable(false);
            jTableJournaliste.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabelId.setText("Id");

        jLabelNom.setText("Nom");

        jLabelMedia.setText("Media");

        jLabelIdJournaliste.setForeground(java.awt.Color.red);
        jLabelIdJournaliste.setText("id");

        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClear.setText("clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsert)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDelete)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelIdJournaliste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxMedia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNomJournaliste, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonClear, jButtonDelete, jButtonInsert, jButtonUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelIdJournaliste))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNomJournaliste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedia)
                    .addComponent(jComboBoxMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClear))
                .addGap(18, 18, 18)
                .addComponent(jLabelMessage))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableJournalisteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJournalisteMouseClicked
        // TODO add your handling code here:
        int ligne = jTableJournaliste.getSelectedRow();
        String id = jTableJournaliste.getValueAt(ligne, 0).toString();
        String nom = jTableJournaliste.getValueAt(ligne, 1).toString();
        String media = jTableJournaliste.getValueAt(ligne, 2).toString();
        jLabelIdJournaliste.setText(id);
        jTextFieldNomJournaliste.setText(nom);
        jComboBoxMedia.setSelectedItem(media);
        jLabelMessage.setText("");
    }//GEN-LAST:event_jTableJournalisteMouseClicked

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        String clear = "";
        jLabelIdJournaliste.setText(clear);
        jTextFieldNomJournaliste.setText(clear);
        jComboBoxMedia.setSelectedItem(null);
        jLabelMessage.setText(clear);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTableJournalisteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableJournalisteKeyReleased
        // TODO add your handling code here:
        jTableJournalisteMouseClicked(null);
    }//GEN-LAST:event_jTableJournalisteKeyReleased

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:

//        int liAffecte;
//
//        if (jLabelNom.getText().isEmpty()) {
//
//            jLabelMessage.setText("Veuillez Choisir Un media et saisir un nom");
//        } else {
//            try {
//
//                JournalisteDAO dao = new JournalisteDAO(con);
//                String nomMedia = jComboBoxMedia.getSelectedItem().toString();
//                Integer idMedia = mapMedia.get(nomMedia);
//
//                Journaliste journalisteInsert = new Journaliste(jTextFieldNomJournaliste.getText(),idMedia);
//                liAffecte = dao.insert(journalisteInsert);
//
//                System.out.println(idMedia);
//                System.out.println(jTextFieldNomJournaliste.getText());
//                System.out.println(liAffecte);
//
//                if (liAffecte == 1) {
//
//                    remplirTable();
//                    int liMax = jTableJournaliste.getRowCount() - 1;
//                    jTableJournaliste.getSelectionModel().setSelectionInterval(liMax, liMax);
//                    jTableJournaliste.scrollRectToVisible(new Rectangle(jTableJournaliste.getCellRect(liMax, 0, true)));
//                    //clear();
//                }
//
//                jLabelMessage.setText("Journaliste créer");
//
//            } catch (Exception e) {
//                jLabelMessage.setText(e.getMessage());
//            }
//        }
        int p = JOptionPane.showConfirmDialog(null, "Voulez-vous Créer", "Création", JOptionPane.YES_NO_OPTION);

        if (jTextFieldNomJournaliste.getText().isEmpty() || jComboBoxMedia.getSelectedItem() == null) {
            jLabelMessage.setText("Veuillez saisir un nom");
            
            if (jComboBoxMedia.getSelectedItem() == null) {
                jLabelMessage.setText("Veuillez choisir un media");
            }
        } else {
            if (p == 0) {
                try {
                    query = "{CALL journalisteInsert(?,?)}";
                    ps = con.prepareStatement(query);

                    String nomMedia = jComboBoxMedia.getSelectedItem().toString();
                    Integer idMedia = mapMedia.get(nomMedia);

                    ps.setString(1, jTextFieldNomJournaliste.getText());
                    ps.setInt(2, idMedia);
                    System.out.println(jComboBoxMedia.getSelectedItem().toString());
                    System.out.println(nomMedia);
                    System.out.println(idMedia);

                    ps.executeUpdate();

                    ps.close();
                    con.commit();
                    clear();
                    remplirTable();

                    jLabelMessage.setText("Journaliste créer");
                    clear();
                } catch (SQLException e) {
                    jLabelMessage.setText(e.getMessage());
                    System.out.println(jComboBoxMedia.getSelectedIndex());
                }
            }
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        int p = JOptionPane.showConfirmDialog(null, "Voulez-vous mettre à jour", "Mise à jour", JOptionPane.YES_NO_OPTION);

        if (jLabelIdJournaliste.getText().equals("id") || jLabelIdJournaliste.getText().isEmpty() || jComboBoxMedia.getSelectedItem().toString().isEmpty()) {
            jLabelMessage.setText("Veuillez sélectionner une ligne !");
        } else {
            if (p == 0) {
                int liAffecte;

                try {
                    JournalisteDAO dao = new JournalisteDAO(con);
                    // Delete
                    String nomMedia = jComboBoxMedia.getSelectedItem().toString();
                    Integer idMedia = mapMedia.get(nomMedia);

                    Journaliste journalisteUpdate = new Journaliste(idMedia, jTextFieldNomJournaliste.getText(), Integer.valueOf(jLabelIdJournaliste.getText()));
                    liAffecte = dao.update(journalisteUpdate);
                    System.out.println(idMedia);
                    System.out.println(jTextFieldNomJournaliste.getText());
                    System.out.println(Integer.valueOf(jLabelIdJournaliste.getText()));
                    con.commit();
                    if (liAffecte == 1) {
                        clear();
                        remplirTable();
                        con.commit();
                    }

                    jLabelMessage.setText("Journaliste Mise à jour");
                } catch (Exception e) {
                    jLabelMessage.setText(e.getMessage());
                }

            }
        }
        //clear();
//                query = "{CALL journalisteUpdate(?,?,?)}";
//                ps = con.prepareStatement(query);
//
//                String nomMedia = jComboBoxMedia.getSelectedItem().toString();
//                Integer idMedia = mapMedia.get(nomMedia);
//
//                ps.setInt(1, idMedia);
//                ps.setString(2, jTextFieldNom.getText());
//                ps.setInt(3, Integer.valueOf(jLabelIdJournaliste.getText()));
//
//                System.out.println(idMedia);
//                System.out.println(jTextFieldNom.getText());
//                System.out.println(Integer.valueOf(jLabelIdJournaliste.getText()));
//
//                ps.executeUpdate();
//                ps.close();

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer", "Supprimer", JOptionPane.YES_NO_OPTION);

        if (jLabelIdJournaliste.getText().equals("id") || jLabelIdJournaliste.getText().isEmpty()) {
            jLabelMessage.setText("Veuillez sélectionner une ligne !");
        } else {
            if (p == 0) {
                int liAffecte;
                try {
                    JournalisteDAO dao = new JournalisteDAO(con);
                    // Delete
                    Journaliste journalisteDelete = new Journaliste(Integer.valueOf(jLabelIdJournaliste.getText()));
                    liAffecte = dao.delete(journalisteDelete);
                    con.commit();
                    System.out.println(jLabelIdJournaliste.getText());
                    if (liAffecte == 1) {
                        con.commit();
                        remplirTable();
                        clear();
                    }
                    jLabelMessage.setText("Supprimé : " + Integer.toString(liAffecte));
                } catch (Exception e) {
                    jLabelMessage.setText(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBoxMedia;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdJournaliste;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJournaliste;
    private javax.swing.JTextField jTextFieldNomJournaliste;
    // End of variables declaration//GEN-END:variables
}