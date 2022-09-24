package lab10;

import javax.swing.ImageIcon;

public class lab10_1 extends javax.swing.JFrame {
    
    public lab10_1() {
        initComponents();             
        MinL1.setIcon(smallPictures[0]);
        MinL2.setIcon(smallPictures[1]);
        MinL3.setIcon(smallPictures[2]);
        BasicLabel.setIcon(bigPictures[1]);
        RB.setIcon(leftarrow);
        LB.setIcon(rightarrow);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasicLabel = new javax.swing.JLabel();
        MinL1 = new javax.swing.JLabel();
        MinL2 = new javax.swing.JLabel();
        MinL3 = new javax.swing.JLabel();
        LB = new javax.swing.JButton();
        RB = new javax.swing.JButton();

        BasicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/LukeSky.jpg"))); // NOI18N

        MinL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/HanSoloMin.jpg"))); // NOI18N

        MinL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/LukeSkyMin.jpg"))); // NOI18N

        MinL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/OrganaMin.jpg"))); // NOI18N

        LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/rightarrow.jpg"))); // NOI18N
        LB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBActionPerformed(evt);
            }
        });

        RB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/leftarrow.jpg"))); // NOI18N
        RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BasicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(RB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(MinL1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MinL2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MinL3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BasicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MinL2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinL1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinL3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void LBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBActionPerformed
    index++;
    if(index == smallPictures.length - 1)    {
    
        MinL1.setIcon(smallPictures[index - 1]);
        MinL2.setIcon(smallPictures[index]);
        MinL3.setIcon(smallPictures[0]);
        BasicLabel.setIcon(bigPictures[index]);
    }
    else if(index == smallPictures.length)    {
        index = 0;
       
        MinL1.setIcon(smallPictures[smallPictures.length - 1]);
        MinL2.setIcon(smallPictures[index]);
        MinL3.setIcon(smallPictures[index + 1]);
        BasicLabel.setIcon(bigPictures[index]);
    }
    else    {      
        
        MinL1.setIcon(smallPictures[index - 1]);
        MinL2.setIcon(smallPictures[index]);
        MinL3.setIcon(smallPictures[index + 1]);
        BasicLabel.setIcon(bigPictures[index]);
    }
}//GEN-LAST:event_LBActionPerformed

private void RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBActionPerformed
   index--;
    
    if(index == 0)    {      
        
        MinL1.setIcon(smallPictures[smallPictures.length - 1]);
        MinL2.setIcon(smallPictures[index]);
        MinL3.setIcon(smallPictures[index + 1]);
        BasicLabel.setIcon(bigPictures[index]);
    }
    else if(index == -1)
    {
        index = smallPictures.length - 1;       
        
        MinL1.setIcon(smallPictures[index - 1]);
        MinL2.setIcon(smallPictures[index]);
        MinL3.setIcon(smallPictures[0]);
        BasicLabel.setIcon(bigPictures[index]);
    }
    else
    {       
        MinL1.setIcon(smallPictures[index - 1]);
        MinL2.setIcon(smallPictures[index]);
        MinL3.setIcon(smallPictures[index + 1]);
        BasicLabel.setIcon(bigPictures[index]);
    }

}//GEN-LAST:event_RBActionPerformed

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
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab10_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new lab10_1().setVisible(true);
            }
        });
    }
    int index = 0;
    ImageIcon leftarrow = new ImageIcon("./src/lab10/Leftarrow.jpg"); 
    ImageIcon HanSolo = new ImageIcon("./src/lab10/HanSolo.jpg");
    ImageIcon HanSoloMin = new ImageIcon("./src/lab10/HanSoloMin.jpg");
    
    ImageIcon HukeSky = new ImageIcon("./src/lab10/LukeSky.jpg");
    ImageIcon HukeSkyMin = new ImageIcon("./src/lab10/LukeSkyMin.jpg");
    
    ImageIcon Organa = new ImageIcon("./src/lab10/Organa.jpg");
    ImageIcon OrganaMin = new ImageIcon("./src/lab10/OrganaMin.jpg");
    
    ImageIcon R2D2 = new ImageIcon("./src/lab10/R2D2.jpg");
    ImageIcon R2D2Min = new ImageIcon("./src/lab10/R2D2Min.jpg");
    
    ImageIcon C3PO = new ImageIcon("./src/lab10/c3po.jpg");
    ImageIcon C3POMin = new ImageIcon("./src/lab10/c3poMin.jpg");
    
    ImageIcon Rey = new ImageIcon("./src/lab10/rey.jpg");
    ImageIcon ReyMin = new ImageIcon("./src/lab10/reyMin.jpg");
    ImageIcon rightarrow = new ImageIcon("./src/lab10/rightarrow.jpg");
    
    ImageIcon[] bigPictures = {HanSolo, HukeSky, Organa, R2D2, C3PO, Rey};
    ImageIcon[] smallPictures = {HanSoloMin, HukeSkyMin, OrganaMin, R2D2Min, C3POMin, ReyMin};

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BasicLabel;
    private javax.swing.JButton LB;
    private javax.swing.JLabel MinL1;
    private javax.swing.JLabel MinL2;
    private javax.swing.JLabel MinL3;
    private javax.swing.JButton RB;
    // End of variables declaration//GEN-END:variables
}
