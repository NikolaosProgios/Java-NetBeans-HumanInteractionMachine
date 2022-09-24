package lab10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class lab10_2 extends javax.swing.JFrame {

    public lab10_2() {
        initComponents();
        
        BasicLabel.setIcon(bigPictures[1]);        
        MinL1.setIcon(smallPictures[0]);
        MinL2.setIcon(smallPictures[1]);
        MinL3.setIcon(smallPictures[2]);
        BasicLabel.setIcon(bigPictures[1]);  
        
        Timer timer = new Timer(1000, actionListener);
        timer.setRepeats(true);
        timer.start();    
    }
    ActionListener actionListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                index++;
    
                if(index == smallPictures.length - 1)
                {
                    BasicLabel.setIcon(bigPictures[index]);

                    MinL1.setIcon(smallPictures[index - 1]);
                    MinL2.setIcon(smallPictures[index]);
                    MinL3.setIcon(smallPictures[0]);
                }
                else if(index == smallPictures.length)
                {
                    index = 0;
                    BasicLabel.setIcon(bigPictures[index]);
                    MinL1.setIcon(smallPictures[smallPictures.length - 1]);
                    MinL2.setIcon(smallPictures[index]);
                    MinL3.setIcon(smallPictures[index + 1]);
                }
                else
                {
                    BasicLabel.setIcon(bigPictures[index]);

                    MinL1.setIcon(smallPictures[index - 1]);
                    MinL2.setIcon(smallPictures[index]);
                    MinL3.setIcon(smallPictures[index + 1]);
                }
            }
        };       
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasicLabel = new javax.swing.JLabel();
        MinL1 = new javax.swing.JLabel();
        MinL2 = new javax.swing.JLabel();
        MinL3 = new javax.swing.JLabel();

        BasicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/LukeSky.jpg"))); // NOI18N

        MinL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/HanSoloMin.jpg"))); // NOI18N

        MinL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/LukeSkyMin.jpg"))); // NOI18N

        MinL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab10/OrganaMin.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BasicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(MinL1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MinL2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MinL3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BasicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MinL2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinL1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinL3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(lab10_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab10_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab10_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab10_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new lab10_2().setVisible(true);
            }
        });
    }
    int index = 0;
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
    
    ImageIcon[] bigPictures = {HanSolo, HukeSky, Organa, R2D2, C3PO, Rey};
    ImageIcon[] smallPictures = {HanSoloMin, HukeSkyMin, OrganaMin, R2D2Min, C3POMin, ReyMin};

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BasicLabel;
    private javax.swing.JLabel MinL1;
    private javax.swing.JLabel MinL2;
    private javax.swing.JLabel MinL3;
    // End of variables declaration//GEN-END:variables
}
