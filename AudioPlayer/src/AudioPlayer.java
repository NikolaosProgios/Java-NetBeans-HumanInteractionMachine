
import java.util.Hashtable;
import javax.swing.JLabel;

class Presets {
    int  bass;
    int  midrange;
    int  tremble;
    int  balance;
    int  volume;
    public Presets(int bass, int midrange, int tremble, int balance, int volume) {
        this.bass = bass;
        this.midrange = midrange;
        this.tremble = tremble;
        this.balance = balance;
        this.volume = volume;
    }
   }


public class AudioPlayer extends javax.swing.JFrame {
    void showSliderValues(){
        String bal;
        int b=SlBalance.getValue();
        if(b>0)
            bal = "Right"+String.valueOf(b);
        else if (b==0)
            bal="Center";
        else
            bal="Left"+ String.valueOf(-b);
        info.setText("<html> Bass: "+SlBass.getValue()+
                     "<br> Midrange: "+SlMidrange.getValue()+
                     "<br> Tremble: "+SlTremble.getValue()+
                    "<br> Balance: "+ bal +
                     "<br> Volue: "+SlBass.getValue()  );
        
    }
    
    public AudioPlayer() {
        initComponents();
        setupPresets();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        SlBass = new javax.swing.JSlider();
        SlMidrange = new javax.swing.JSlider();
        SlTremble = new javax.swing.JSlider();
        SlBalance = new javax.swing.JSlider();
        SlVolume = new javax.swing.JSlider();
        M0 = new javax.swing.JRadioButton();
        M1 = new javax.swing.JRadioButton();
        M2 = new javax.swing.JRadioButton();
        Store = new javax.swing.JButton();
        Bass = new javax.swing.JLabel();
        Midrange = new javax.swing.JLabel();
        Tremble = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Volume = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AudioPlayer");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        SlBass.setMajorTickSpacing(2);
        SlBass.setMaximum(10);
        SlBass.setMinimum(-10);
        SlBass.setMinorTickSpacing(1);
        SlBass.setPaintLabels(true);
        SlBass.setPaintTicks(true);
        SlBass.setValue(0);
        SlBass.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        SlBass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SlBassStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(SlBass, gridBagConstraints);

        SlMidrange.setMajorTickSpacing(2);
        SlMidrange.setMaximum(10);
        SlMidrange.setMinimum(-10);
        SlMidrange.setMinorTickSpacing(1);
        SlMidrange.setPaintLabels(true);
        SlMidrange.setPaintTicks(true);
        SlMidrange.setValue(0);
        SlMidrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        SlMidrange.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SlMidrangeStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(SlMidrange, gridBagConstraints);

        SlTremble.setMajorTickSpacing(2);
        SlTremble.setMaximum(10);
        SlTremble.setMinimum(-10);
        SlTremble.setMinorTickSpacing(1);
        SlTremble.setPaintLabels(true);
        SlTremble.setPaintTicks(true);
        SlTremble.setValue(0);
        SlTremble.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        SlTremble.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SlTrembleStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(SlTremble, gridBagConstraints);

        table.put(new Integer(0), new JLabel(("Center")));
        table.put(new Integer(-5),new JLabel(("L")));
        table.put(new Integer(5), new JLabel(("R")));
        SlBalance.setLabelTable(table);
        SlBalance.setMajorTickSpacing(2);
        SlBalance.setMaximum(5);
        SlBalance.setMinimum(-5);
        SlBalance.setMinorTickSpacing(1);
        SlBalance.setPaintLabels(true);
        SlBalance.setPaintTicks(true);
        SlBalance.setValue(0);
        SlBalance.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        SlBalance.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SlBalanceStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(SlBalance, gridBagConstraints);

        SlVolume.setMajorTickSpacing(1);
        SlVolume.setMaximum(10);
        SlVolume.setPaintLabels(true);
        SlVolume.setPaintTicks(true);
        SlVolume.setValue(0);
        SlVolume.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        SlVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SlVolumeStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(SlVolume, gridBagConstraints);

        buttonGroup1.add(M0);
        M0.setSelected(true);
        M0.setText("M0");
        M0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                M0StateChanged(evt);
            }
        });
        M0.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                M0ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        getContentPane().add(M0, gridBagConstraints);

        buttonGroup1.add(M1);
        M1.setText("M1");
        M1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                M1StateChanged(evt);
            }
        });
        M1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                M1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        getContentPane().add(M1, gridBagConstraints);

        buttonGroup1.add(M2);
        M2.setText("M2");
        M2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                M2StateChanged(evt);
            }
        });
        M2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                M2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        getContentPane().add(M2, gridBagConstraints);

        Store.setText("Store");
        Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        getContentPane().add(Store, gridBagConstraints);

        Bass.setText("Bass");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(Bass, gridBagConstraints);

        Midrange.setText("Midrange");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(Midrange, gridBagConstraints);

        Tremble.setText("Tremble");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(Tremble, gridBagConstraints);

        Balance.setText("Balance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(Balance, gridBagConstraints);

        Volume.setText("Volume");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(Volume, gridBagConstraints);

        info.setPreferredSize(new java.awt.Dimension(100, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        getContentPane().add(info, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void SlBassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SlBassStateChanged
showSliderValues();
}//GEN-LAST:event_SlBassStateChanged

private void SlMidrangeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SlMidrangeStateChanged
showSliderValues();
}//GEN-LAST:event_SlMidrangeStateChanged

private void SlTrembleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SlTrembleStateChanged
showSliderValues();
}//GEN-LAST:event_SlTrembleStateChanged

private void SlBalanceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SlBalanceStateChanged
showSliderValues();
}//GEN-LAST:event_SlBalanceStateChanged

private void SlVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SlVolumeStateChanged
showSliderValues();
}//GEN-LAST:event_SlVolumeStateChanged

private void M0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_M0StateChanged

}//GEN-LAST:event_M0StateChanged

private void M1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_M1StateChanged

}//GEN-LAST:event_M1StateChanged

private void M2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_M2StateChanged

}//GEN-LAST:event_M2StateChanged

private void M0ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_M0ItemStateChanged
loadPresets(pinakas[0]);
}//GEN-LAST:event_M0ItemStateChanged

private void M1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_M1ItemStateChanged
loadPresets(pinakas[1]);
}//GEN-LAST:event_M1ItemStateChanged

private void M2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_M2ItemStateChanged
loadPresets(pinakas[2]);
}//GEN-LAST:event_M2ItemStateChanged

private void StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreActionPerformed
    if(M0.isSelected())
        storePresets(pinakas[0]);
    else if (M1.isSelected())
        storePresets(pinakas[1]);
    else if (M2.isSelected())
        storePresets(pinakas[2]);
}//GEN-LAST:event_StoreActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AudioPlayer().setVisible(true);
            }
        });
    } 
    
    void storePresets(Presets data){
        data.bass=SlBass.getValue();
        data.midrange=SlMidrange.getValue();
        data.tremble=SlTremble.getValue();
        data.balance=SlBalance.getValue();
        data.volume=SlVolume.getValue();

    }
    void loadPresets(Presets data){
        SlBass.setValue(data.bass);
        SlMidrange.setValue(data.midrange);
        SlTremble.setValue(data.tremble);
        SlBalance.setValue(data.balance);
        SlVolume.setValue(data.volume);
        showSliderValues();
    }
    
    void setupPresets(){
        pinakas[0]=new Presets(0,0,0,0,0);
        pinakas[1]=new Presets(1,-1,9,0,4);
        pinakas[2]=new Presets(2,4,-2,4,2);
    }
    
    Hashtable table = new Hashtable();
    Presets pinakas[]=new Presets[3];
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel Bass;
    private javax.swing.JRadioButton M0;
    private javax.swing.JRadioButton M1;
    private javax.swing.JRadioButton M2;
    private javax.swing.JLabel Midrange;
    private javax.swing.JSlider SlBalance;
    private javax.swing.JSlider SlBass;
    private javax.swing.JSlider SlMidrange;
    private javax.swing.JSlider SlTremble;
    private javax.swing.JSlider SlVolume;
    private javax.swing.JButton Store;
    private javax.swing.JLabel Tremble;
    private javax.swing.JLabel Volume;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel info;
    // End of variables declaration//GEN-END:variables
}
