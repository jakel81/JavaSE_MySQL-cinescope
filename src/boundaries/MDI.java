/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import daos.Globale;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author rayanakel
 */
public class MDI extends javax.swing.JFrame {
    
    private Connection icnx;

    /**
     * Creates new form MDI
     */
    public MDI() {
        initComponents();

        setTitle("MDI - Cinéscope 2017");
        setLocationRelativeTo(null);
        setVisible(true);
        
        icnx = Connexion.seConnecter("172.26.55.55", "3306", "p", "b", "cinescope2014");
        
        Globale.setCnx(icnx);

        //Affichage direct de la fenetre demandee
        //MenuItemPaysAjoutActionPerformed(null);
        //MenuItemPaysSupprimerActionPerformed(null);
        //MenuItemAuthentifierActionPerformed(null);
        //MenuItemPaysModificationActionPerformed(null);
        //MenuItemPaysVisuActionPerformed(null);
        //jMenuItemDepartementsActionPerformed(null);
        //jMenuItemArrondissementsActionPerformed(null);
        jMenuItemRubriquesActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuItemAuthentifier = new javax.swing.JMenuItem();
        jMenuItemDeconnecter = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemQuitter = new javax.swing.JMenuItem();
        jMenuCRUD = new javax.swing.JMenu();
        MenuItemPaysAjout = new javax.swing.JMenuItem();
        MenuItemPaysSupprimer = new javax.swing.JMenuItem();
        MenuItemPaysVisu = new javax.swing.JMenuItem();
        MenuItemPaysModification = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemArrondissements = new javax.swing.JMenuItem();
        jMenuItemDepartements = new javax.swing.JMenuItem();
        jMenuItemVilles = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemGenres = new javax.swing.JMenuItem();
        jMenuItemRubriques = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItemMedia = new javax.swing.JMenuItem();
        jMenuItemAppreciation = new javax.swing.JMenuItem();
        jMenuItemJournalistes = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCinemas = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItemGenerique = new javax.swing.JMenuItem();
        jMenuChaqueSemaine = new javax.swing.JMenu();
        jMenuItemArticles = new javax.swing.JMenuItem();
        jMenuItemApprecier = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemFilms = new javax.swing.JMenuItem();
        jMenuFenetre = new javax.swing.JMenu();
        jMenuItemMosaiqueHorizontale = new javax.swing.JMenuItem();
        jMenuItemMosaiqueVerticale = new javax.swing.JMenuItem();
        jMenuItemMosaiqueCascade = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemFermer = new javax.swing.JMenuItem();
        jMenuItemFermerTout = new javax.swing.JMenuItem();
        MenuAide = new javax.swing.JMenu();
        jMenuItemContenu = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenuFichier.setMnemonic('f');
        jMenuFichier.setText("Fichier");

        jMenuItemAuthentifier.setMnemonic('o');
        jMenuItemAuthentifier.setText("S'authentifier");
        jMenuItemAuthentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAuthentifierActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemAuthentifier);

        jMenuItemDeconnecter.setMnemonic('s');
        jMenuItemDeconnecter.setText("Se déconnecter");
        jMenuItemDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeconnecterActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemDeconnecter);
        jMenuFichier.add(jSeparator3);

        jMenuItemQuitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemQuitter.setMnemonic('x');
        jMenuItemQuitter.setText("Quitter");
        jMenuItemQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitterActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemQuitter);

        menuBar.add(jMenuFichier);

        jMenuCRUD.setMnemonic('e');
        jMenuCRUD.setText("CRUD");

        MenuItemPaysAjout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuItemPaysAjout.setMnemonic('t');
        MenuItemPaysAjout.setText("Pays (Ajout)");
        MenuItemPaysAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPaysAjoutActionPerformed(evt);
            }
        });
        jMenuCRUD.add(MenuItemPaysAjout);

        MenuItemPaysSupprimer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuItemPaysSupprimer.setMnemonic('y');
        MenuItemPaysSupprimer.setText("Pays (Suppression)");
        MenuItemPaysSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPaysSupprimerActionPerformed(evt);
            }
        });
        jMenuCRUD.add(MenuItemPaysSupprimer);

        MenuItemPaysVisu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuItemPaysVisu.setMnemonic('p');
        MenuItemPaysVisu.setText("Pays (Visualisation)");
        MenuItemPaysVisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPaysVisuActionPerformed(evt);
            }
        });
        jMenuCRUD.add(MenuItemPaysVisu);

        MenuItemPaysModification.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuItemPaysModification.setMnemonic('d');
        MenuItemPaysModification.setText("Pays (Modification)");
        MenuItemPaysModification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPaysModificationActionPerformed(evt);
            }
        });
        jMenuCRUD.add(MenuItemPaysModification);
        jMenuCRUD.add(jSeparator4);

        jMenuItemArrondissements.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemArrondissements.setText("Arrondissements CRUD");
        jMenuItemArrondissements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArrondissementsActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemArrondissements);

        jMenuItemDepartements.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemDepartements.setText("Départements CRUD");
        jMenuItemDepartements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDepartementsActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemDepartements);

        jMenuItemVilles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemVilles.setText("Villes CRUD");
        jMenuItemVilles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVillesActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemVilles);
        jMenuCRUD.add(jSeparator5);

        jMenuItemGenres.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemGenres.setText("Genres CRUD");
        jMenuItemGenres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenresActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemGenres);

        jMenuItemRubriques.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemRubriques.setText("Rubriques CRUD");
        jMenuItemRubriques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRubriquesActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemRubriques);
        jMenuCRUD.add(jSeparator6);

        jMenuItemMedia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemMedia.setText("Media (CRUD)");
        jMenuItemMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMediaActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemMedia);

        jMenuItemAppreciation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemAppreciation.setText("Appréciation (CRUD)");
        jMenuCRUD.add(jMenuItemAppreciation);

        jMenuItemJournalistes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemJournalistes.setText("Journalistes (CRUD)");
        jMenuItemJournalistes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJournalistesActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemJournalistes);
        jMenuCRUD.add(jSeparator7);

        jMenuItemCinemas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemCinemas.setText("Cinémas (Ajout)");
        jMenuItemCinemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCinemasActionPerformed(evt);
            }
        });
        jMenuCRUD.add(jMenuItemCinemas);
        jMenuCRUD.add(jSeparator8);

        jMenuItemGenerique.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGenerique.setText("Générique (CRUD)");
        jMenuCRUD.add(jMenuItemGenerique);

        menuBar.add(jMenuCRUD);

        jMenuChaqueSemaine.setText("Chaque semaine");

        jMenuItemArticles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemArticles.setText("Articles (CRUD)");
        jMenuItemArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArticlesActionPerformed(evt);
            }
        });
        jMenuChaqueSemaine.add(jMenuItemArticles);

        jMenuItemApprecier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemApprecier.setText("Apprécier (CRUD)");
        jMenuItemApprecier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemApprecierActionPerformed(evt);
            }
        });
        jMenuChaqueSemaine.add(jMenuItemApprecier);
        jMenuChaqueSemaine.add(jSeparator2);

        jMenuItemFilms.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFilms.setText("Films (Ajout)");
        jMenuItemFilms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilmsActionPerformed(evt);
            }
        });
        jMenuChaqueSemaine.add(jMenuItemFilms);

        menuBar.add(jMenuChaqueSemaine);

        jMenuFenetre.setText("Fenêtre");

        jMenuItemMosaiqueHorizontale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMosaiqueHorizontale.setText("Horizontale");
        jMenuItemMosaiqueHorizontale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMosaiqueHorizontaleActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemMosaiqueHorizontale);

        jMenuItemMosaiqueVerticale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMosaiqueVerticale.setText("Verticale");
        jMenuItemMosaiqueVerticale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMosaiqueVerticaleActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemMosaiqueVerticale);

        jMenuItemMosaiqueCascade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMosaiqueCascade.setText("Cascade");
        jMenuItemMosaiqueCascade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMosaiqueCascadeActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemMosaiqueCascade);
        jMenuFenetre.add(jSeparator1);

        jMenuItemFermer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFermer.setText("Fermer");
        jMenuItemFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFermerActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemFermer);

        jMenuItemFermerTout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFermerTout.setText("Fermer tout");
        jMenuItemFermerTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFermerToutActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemFermerTout);

        menuBar.add(jMenuFenetre);

        MenuAide.setMnemonic('h');
        MenuAide.setText("Aide");

        jMenuItemContenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemContenu.setMnemonic('c');
        jMenuItemContenu.setText("Contenu");
        jMenuItemContenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContenuActionPerformed(evt);
            }
        });
        MenuAide.add(jMenuItemContenu);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("A propos");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        MenuAide.add(aboutMenuItem);

        menuBar.add(MenuAide);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemQuitterActionPerformed

    private void jMenuItemAuthentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAuthentifierActionPerformed
        // TODO add your handling code here:
        JFrameAuthentification jif = new JFrameAuthentification();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemAuthentifierActionPerformed

    private void jMenuItemContenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemContenuActionPerformed

    private void jMenuItemDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeconnecterActionPerformed
        // TODO add your handling code here:
        JFrameDeconnection jif = new JFrameDeconnection();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemDeconnecterActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItemApprecierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemApprecierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemApprecierActionPerformed

    private void jMenuItemArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArticlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemArticlesActionPerformed

    private void jMenuItemFermerToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFermerToutActionPerformed
        // TODO add your handling code here:
        JDesktopPane jdpBureau = this.desktopPane;

        //Fermeture de toutes les fenetres
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();
        try {
            for (int i = 0; i < tFrames.length; ++i) {
                tFrames[i].setClosed(true);
            }
        } catch (PropertyVetoException e) {
        }

    }//GEN-LAST:event_jMenuItemFermerToutActionPerformed

    private void MenuItemPaysSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPaysSupprimerActionPerformed
        // TODO add your handling code here:
        JIFSuppressionPays jif = new JIFSuppressionPays();
        this.desktopPane.add(jif);
        //JIFPaysSuppression jif = new JIFPaysSuppression();
        //this.desktopPane.add(jif);

    }//GEN-LAST:event_MenuItemPaysSupprimerActionPerformed

    private void MenuItemPaysModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPaysModificationActionPerformed
        // TODO add your handling code here:
        JIFModificationPays jif = new JIFModificationPays();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_MenuItemPaysModificationActionPerformed

    private void jMenuItemArrondissementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArrondissementsActionPerformed
        // TODO add your handling code here:
        JIFArrondissements jif = new JIFArrondissements();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemArrondissementsActionPerformed

    private void jMenuItemFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFermerActionPerformed
        // TODO add your handling code here:
        JDesktopPane jdpBureau = this.desktopPane;
        
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();
        try {
            if (tFrames.length > 0) {
                tFrames[0].setClosed(true);
            }
        } catch (PropertyVetoException e) {
        }

    }//GEN-LAST:event_jMenuItemFermerActionPerformed

    private void jMenuItemMosaiqueHorizontaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMosaiqueHorizontaleActionPerformed
        // TODO add your handling code here:
        JDesktopPane jdpBureau = this.desktopPane;

        //Mise en position horizontale des fenetres
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        try {
            int ly = 0;

            int liLargeurBureau = jdpBureau.getWidth();
            int liHauteurBureau = jdpBureau.getHeight();
            int liHauteur = liHauteurBureau / tFrames.length;

            for (int i = tFrames.length - 1; i >= 0; i--) {
                tFrames[i].setBounds(0, ly, liLargeurBureau, liHauteur);
                ly += liHauteur;
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItemMosaiqueHorizontaleActionPerformed

    private void jMenuItemMosaiqueVerticaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMosaiqueVerticaleActionPerformed
        // TODO add your handling code here:
        JDesktopPane jdpBureau = this.desktopPane;
        
        //Mise en position verticale des fenetres
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();
        try {
            int lx = 0;

            int liLargeurBureau = jdpBureau.getWidth();
            int liHauteurBureau = jdpBureau.getHeight();
            int liLargeur = liLargeurBureau / tFrames.length;

            for (int i = tFrames.length - 1; i >= 0; i--) {
                tFrames[i].setBounds(lx, 0, liLargeur, liHauteurBureau);
                lx += liLargeur;
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItemMosaiqueVerticaleActionPerformed

    private void MenuItemPaysAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPaysAjoutActionPerformed
        // TODO add your handling code here:
        JIFPaysAjout jif = new JIFPaysAjout();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_MenuItemPaysAjoutActionPerformed

    private void jMenuItemMosaiqueCascadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMosaiqueCascadeActionPerformed
        // TODO add your handling code here:
        JDesktopPane jdpBureau = this.desktopPane;

        //Mise en cascade des fenetres
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();
        try {
            int lx = 0, ly = 0;
            for (int i = tFrames.length - 1; i >= 0; i--){
                tFrames[i].setBounds (lx, ly ,500, 300);
                lx += 30;
                ly += 30;
            }
        }
       catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItemMosaiqueCascadeActionPerformed

    private void jMenuItemFilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFilmsActionPerformed

    private void jMenuItemJournalistesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJournalistesActionPerformed
        // TODO add your handling code here:
        JIFJournalistes jif = new JIFJournalistes();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemJournalistesActionPerformed

    private void MenuItemPaysVisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPaysVisuActionPerformed
        // TODO add your handling code here:
        JIFPaysVisu jif = new JIFPaysVisu();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_MenuItemPaysVisuActionPerformed

    private void jMenuItemDepartementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDepartementsActionPerformed
        // TODO add your handling code here:
        JIFDepartements jif = new JIFDepartements();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemDepartementsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Connexion.seDeconnecter(icnx);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemVillesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVillesActionPerformed
        // TODO add your handling code here:
        JIFVilles jif = new JIFVilles();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemVillesActionPerformed

    private void jMenuItemGenresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenresActionPerformed
        // TODO add your handling code here:
        JIFGenres jif = new JIFGenres();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemGenresActionPerformed

    private void jMenuItemRubriquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRubriquesActionPerformed
        // TODO add your handling code here:
        JIFRubriques jif = new JIFRubriques();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemRubriquesActionPerformed

    private void jMenuItemMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMediaActionPerformed
        // TODO add your handling code here:
        JIFMedia jif = new JIFMedia();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemMediaActionPerformed

    private void jMenuItemCinemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCinemasActionPerformed
        // TODO add your handling code here:
        JIFCinema jif = new JIFCinema();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemCinemasActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAide;
    private javax.swing.JMenuItem MenuItemPaysAjout;
    private javax.swing.JMenuItem MenuItemPaysModification;
    private javax.swing.JMenuItem MenuItemPaysSupprimer;
    private javax.swing.JMenuItem MenuItemPaysVisu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenuCRUD;
    private javax.swing.JMenu jMenuChaqueSemaine;
    private javax.swing.JMenu jMenuFenetre;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemAppreciation;
    private javax.swing.JMenuItem jMenuItemApprecier;
    private javax.swing.JMenuItem jMenuItemArrondissements;
    private javax.swing.JMenuItem jMenuItemArticles;
    private javax.swing.JMenuItem jMenuItemAuthentifier;
    private javax.swing.JMenuItem jMenuItemCinemas;
    private javax.swing.JMenuItem jMenuItemContenu;
    private javax.swing.JMenuItem jMenuItemDeconnecter;
    private javax.swing.JMenuItem jMenuItemDepartements;
    private javax.swing.JMenuItem jMenuItemFermer;
    private javax.swing.JMenuItem jMenuItemFermerTout;
    private javax.swing.JMenuItem jMenuItemFilms;
    private javax.swing.JMenuItem jMenuItemGenerique;
    private javax.swing.JMenuItem jMenuItemGenres;
    private javax.swing.JMenuItem jMenuItemJournalistes;
    private javax.swing.JMenuItem jMenuItemMedia;
    private javax.swing.JMenuItem jMenuItemMosaiqueCascade;
    private javax.swing.JMenuItem jMenuItemMosaiqueHorizontale;
    private javax.swing.JMenuItem jMenuItemMosaiqueVerticale;
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JMenuItem jMenuItemRubriques;
    private javax.swing.JMenuItem jMenuItemVilles;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
