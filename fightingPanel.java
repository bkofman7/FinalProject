/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ben
 */
public class fightingPanel extends javax.swing.JPanel implements ActionListener {
    private String lastCommand;
    private String returnedLastCommand;
    /**
     * Creates new form fightingPanel
     */
    public fightingPanel() {
        initComponents();
        typefield.addActionListener(this);
        lastCommand = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerpic = new javax.swing.JLabel();
        dragonpic = new javax.swing.JLabel();
        typefield = new javax.swing.JTextField();
        ability1 = new javax.swing.JLabel();
        ability2 = new javax.swing.JLabel();
        ability3 = new javax.swing.JLabel();
        phlabel = new javax.swing.JLabel();
        mlabel = new javax.swing.JLabel();
        playerHealth = new javax.swing.JLabel();
        playerMana = new javax.swing.JLabel();
        dhlabel = new javax.swing.JLabel();
        dragonhealth = new javax.swing.JLabel();

        playerpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/warriorpicture.jpg"))); // NOI18N

        dragonpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/dragonpicture.jpg"))); // NOI18N

        typefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typefieldActionPerformed(evt);
            }
        });

        ability1.setText("jLabel1");

        ability2.setText("jLabel2");

        ability3.setText("jLabel3");

        phlabel.setText("Health:");

        mlabel.setText("Mana:");

        dhlabel.setText("Dragon Health:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(typefield)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(playerpic, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dhlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dragonhealth)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(dragonpic, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ability1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(ability2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ability3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addComponent(playerMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dhlabel)
                            .addComponent(dragonhealth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerpic, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(dragonpic, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ability1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ability2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ability3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phlabel)
                            .addComponent(playerHealth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mlabel)
                            .addComponent(playerMana))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typefieldActionPerformed

    public void setPlayerPic(int type) {
        switch (type) {
            case 1: playerpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/warriorpicture.jpg")));
                    break;
            case 2: playerpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/archerpicture.jpg")));
                    break;
            case 3: playerpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/magepicture.jpg")));
                    break;
        }
    }
    
    public void changeDragonHealth(int newHealth) {
        dragonhealth.setText(""+newHealth);
    }
    
    public void changePlayerHealth(int newHealth) {
        playerHealth.setText(""+newHealth);
    }

    public void changePlayerMana(int newMana) {
        playerMana.setText(""+newMana);
    }
    
    public void setAbility1Name(String text) {
        ability1.setText(text);
        ability1.setForeground(new Color(50,205,50));
    }
    public void setAbility2Name(String text) {
        ability2.setText(text);
        ability2.setForeground(new Color(50,205,50));
    }
    public void setAbility3Name(String text) {
        ability3.setText(text);
        ability3.setForeground(new Color(50,205,50));
    }
    public void makeAbilityCD(int ability) {
        
    }
    public String getLastCommand() {
        String lc = lastCommand;
        lastCommand = "";
        return lc;
    }
    public void setthattext(String text) {
        dhlabel.setText(text);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        lastCommand = typefield.getText();
        typefield.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ability1;
    private javax.swing.JLabel ability2;
    private javax.swing.JLabel ability3;
    private javax.swing.JLabel dhlabel;
    private javax.swing.JLabel dragonhealth;
    private javax.swing.JLabel dragonpic;
    private javax.swing.JLabel mlabel;
    private javax.swing.JLabel phlabel;
    private javax.swing.JLabel playerHealth;
    private javax.swing.JLabel playerMana;
    private javax.swing.JLabel playerpic;
    private javax.swing.JTextField typefield;
    // End of variables declaration//GEN-END:variables
}