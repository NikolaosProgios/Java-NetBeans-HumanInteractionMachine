
import javax.swing.ImageIcon;

public class Diakopes extends javax.swing.JFrame {

    public Diakopes() {
        initComponents();
        jLHotel.setText("Το επιλεγμενο ξενοδεοχειο ειναι το ΑL Arab");
    }    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPHotels = new javax.swing.JPanel();
        jRBALArab = new javax.swing.JRadioButton();
        jRBHilton = new javax.swing.JRadioButton();
        jRBIceHotel = new javax.swing.JRadioButton();
        jPDetails = new javax.swing.JPanel();
        Breakfast = new javax.swing.JCheckBox();
        Dinner = new javax.swing.JCheckBox();
        ExtraTrip = new javax.swing.JCheckBox();
        jPRoom = new javax.swing.JPanel();
        jRBSingle = new javax.swing.JRadioButton();
        jRBDouble = new javax.swing.JRadioButton();
        jRBSuite = new javax.swing.JRadioButton();
        jRShowIcon = new javax.swing.JButton();
        jLRoomIcon = new javax.swing.JLabel();
        jPReport = new javax.swing.JPanel();
        jLHotel = new javax.swing.JLabel();
        jLRoom = new javax.swing.JLabel();
        jLDetails = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Holidays");

        buttonGroup1.add(jRBALArab);
        jRBALArab.setSelected(true);
        jRBALArab.setToolTipText("Al Arab Hotel");
        jRBALArab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotelBW.jpg"))); // NOI18N
        jRBALArab.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotel.jpg"))); // NOI18N
        jRBALArab.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotel.jpg"))); // NOI18N
        jRBALArab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/BurjAlArabHotel.jpg"))); // NOI18N
        jRBALArab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBALArabItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRBHilton);
        jRBHilton.setToolTipText("Hilton Hotel");
        jRBHilton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotelBW.jpg"))); // NOI18N
        jRBHilton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotel.jpg"))); // NOI18N
        jRBHilton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotel.jpg"))); // NOI18N
        jRBHilton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/hiltonhotel.jpg"))); // NOI18N
        jRBHilton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBHiltonItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRBIceHotel);
        jRBIceHotel.setToolTipText("IceHotel");
        jRBIceHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotelBW.jpg"))); // NOI18N
        jRBIceHotel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotel.jpg"))); // NOI18N
        jRBIceHotel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotel.jpg"))); // NOI18N
        jRBIceHotel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icehotel.jpg"))); // NOI18N
        jRBIceHotel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBIceHotelItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPHotelsLayout = new javax.swing.GroupLayout(jPHotels);
        jPHotels.setLayout(jPHotelsLayout);
        jPHotelsLayout.setHorizontalGroup(
            jPHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHotelsLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBIceHotel)
                    .addComponent(jRBHilton)
                    .addComponent(jRBALArab))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPHotelsLayout.setVerticalGroup(
            jPHotelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHotelsLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jRBALArab)
                .addGap(18, 18, 18)
                .addComponent(jRBHilton)
                .addGap(18, 18, 18)
                .addComponent(jRBIceHotel)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPHotels);

        jTabbedPane1.addTab("Hotels", jScrollPane1);

        Breakfast.setText("Breakfast");
        Breakfast.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BreakfastItemStateChanged(evt);
            }
        });

        Dinner.setText("Dinner");
        Dinner.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DinnerItemStateChanged(evt);
            }
        });

        ExtraTrip.setText("ExtraTrip");
        ExtraTrip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ExtraTripItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPDetailsLayout = new javax.swing.GroupLayout(jPDetails);
        jPDetails.setLayout(jPDetailsLayout);
        jPDetailsLayout.setHorizontalGroup(
            jPDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dinner)
                    .addComponent(ExtraTrip)
                    .addComponent(Breakfast))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPDetailsLayout.setVerticalGroup(
            jPDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetailsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Breakfast)
                .addGap(18, 18, 18)
                .addComponent(Dinner)
                .addGap(18, 18, 18)
                .addComponent(ExtraTrip)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Details", jPDetails);

        buttonGroup2.add(jRBSingle);
        jRBSingle.setText("Single");
        jRBSingle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBSingleItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRBDouble);
        jRBDouble.setText("Double");
        jRBDouble.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBDoubleItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRBSuite);
        jRBSuite.setText("Suite");
        jRBSuite.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRBSuiteItemStateChanged(evt);
            }
        });

        jRShowIcon.setText("ShowIcon");
        jRShowIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRShowIconActionPerformed(evt);
            }
        });

        jLRoomIcon.setText("RoomIcon");

        javax.swing.GroupLayout jPRoomLayout = new javax.swing.GroupLayout(jPRoom);
        jPRoom.setLayout(jPRoomLayout);
        jPRoomLayout.setHorizontalGroup(
            jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRoomLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBSingle)
                    .addComponent(jRBSuite)
                    .addComponent(jRBDouble))
                .addGap(63, 63, 63)
                .addGroup(jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRoomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRShowIcon))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPRoomLayout.setVerticalGroup(
            jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRoomLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBSingle)
                    .addComponent(jRShowIcon))
                .addGap(18, 18, 18)
                .addComponent(jRBDouble)
                .addGap(16, 16, 16)
                .addComponent(jRBSuite)
                .addGap(43, 43, 43)
                .addComponent(jLRoomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Room", jPRoom);

        jLHotel.setText("Hotel");

        jLRoom.setText("Room");

        jLDetails.setText("Details");

        javax.swing.GroupLayout jPReportLayout = new javax.swing.GroupLayout(jPReport);
        jPReport.setLayout(jPReportLayout);
        jPReportLayout.setHorizontalGroup(
            jPReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReportLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDetails)
                    .addComponent(jLRoom)
                    .addComponent(jLHotel))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPReportLayout.setVerticalGroup(
            jPReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReportLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLHotel)
                .addGap(27, 27, 27)
                .addComponent(jLRoom)
                .addGap(29, 29, 29)
                .addComponent(jLDetails)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Report", jPReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jRBALArabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBALArabItemStateChanged
    jLHotel.setText("Το επιλεγμενο ξενοδεοχειο ειναι το ΑL Arab");
}//GEN-LAST:event_jRBALArabItemStateChanged

private void jRBHiltonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBHiltonItemStateChanged
    jLHotel.setText("Το επιλεγμενο ξενοδεοχειο ειναι το Hilton");
}//GEN-LAST:event_jRBHiltonItemStateChanged

private void jRBIceHotelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBIceHotelItemStateChanged
    jLHotel.setText("Το επιλεγμενο ξενοδεοχειο ειναι το Ice Hotel");
}//GEN-LAST:event_jRBIceHotelItemStateChanged

private void BreakfastItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BreakfastItemStateChanged
    String infodetails="";
    if(Breakfast.isSelected()) infodetails+="Breakfast ";
    if(Dinner.isSelected()) infodetails+="Dinner ";
    if(ExtraTrip.isSelected()) infodetails+="Extra Trip ";
    jLDetails.setText("Επιλογη Πακετου: " + infodetails);
    
}//GEN-LAST:event_BreakfastItemStateChanged

private void DinnerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DinnerItemStateChanged
    String infodetails="";
    if(Breakfast.isSelected()) infodetails+="Breakfast ";
    if(Dinner.isSelected()) infodetails+="Dinner" ;
    if(ExtraTrip.isSelected()) infodetails+="Extρa Trip ";
    jLDetails.setText("Επιλογη Πακετου: " + infodetails);
    
}//GEN-LAST:event_DinnerItemStateChanged

private void ExtraTripItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ExtraTripItemStateChanged
    String infodetails="";
    if(Breakfast.isSelected()) infodetails+="Breakfast ";
    if(Dinner.isSelected()) infodetails+="Dinner" ;
    if(ExtraTrip.isSelected()) infodetails+="Extρa Trip ";
    jLDetails.setText("Επιλογη Πακετου: " + infodetails);
}//GEN-LAST:event_ExtraTripItemStateChanged

private void jRBSingleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBSingleItemStateChanged
    jLRoom.setText("Ο επιλεγμενος τύπος δoματίου ειναι μόνο");
}//GEN-LAST:event_jRBSingleItemStateChanged

private void jRBDoubleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBDoubleItemStateChanged
    jLRoom.setText("Ο επιλεγμενος τύπος δβματίου ειναι διπλο");
}//GEN-LAST:event_jRBDoubleItemStateChanged

private void jRBSuiteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRBSuiteItemStateChanged
    jLRoom.setText("Ο επιλεγμενος τύπος δβματίου ειναι σοίτα");
}//GEN-LAST:event_jRBSuiteItemStateChanged

private void jRShowIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRShowIconActionPerformed
    if (jRBALArab.isSelected()){
        if (jRBSingle.isSelected())
            jLRoomIcon.setIcon(BAAHSingle);
        else if (jRBDouble.isSelected())
            jLRoomIcon.setIcon(BAAHDouble);
        else if (jRBSuite.isSelected())
            jLRoomIcon.setIcon(BAAHSuite);
    }
    else if (jRBHilton.isSelected()){
        if (jRBSingle.isSelected())
            jLRoomIcon.setIcon(HiltonSingle);
        else if (jRBDouble.isSelected())
            jLRoomIcon.setIcon(HiltonDouble);
        else if (jRBSuite.isSelected())
            jLRoomIcon.setIcon(HiltonSuite);
    }
    else if (jRBIceHotel.isSelected()){
        if (jRBSingle.isSelected())
            jLRoomIcon.setIcon(IceHotelSingle);
        else if (jRBDouble.isSelected())
            jLRoomIcon.setIcon(IceHotelDouble);
        else if (jRBSuite.isSelected())
           jLRoomIcon.setIcon(IceHotelSuite);
    }
}//GEN-LAST:event_jRShowIconActionPerformed

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
            java.util.logging.Logger.getLogger(Diakopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diakopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diakopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diakopes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Diakopes().setVisible(true);
            }
        });
    }  
    
    ImageIcon BAAHSingle = new ImageIcon("AlArabRoom.jpg");
    ImageIcon BAAHDouble = new ImageIcon("AlArabDouble.jpg");
    ImageIcon BAAHSuite = new ImageIcon("AlArabSuite.jpg");
    ImageIcon HiltonSingle = new ImageIcon("HiltonSingle.jpg");
    ImageIcon HiltonDouble = new ImageIcon("HiltonDouble.jpg");
    ImageIcon HiltonSuite = new ImageIcon("HiltonSuite.jpg");
    ImageIcon IceHotelSingle = new ImageIcon("IceHotelSingle.jpg");
    ImageIcon IceHotelDouble = new ImageIcon("IceHotelDouble.jpg");
    ImageIcon IceHotelSuite = new ImageIcon("IceHotelSuite.jpg");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Breakfast;
    private javax.swing.JCheckBox Dinner;
    private javax.swing.JCheckBox ExtraTrip;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLDetails;
    private javax.swing.JLabel jLHotel;
    private javax.swing.JLabel jLRoom;
    private javax.swing.JLabel jLRoomIcon;
    private javax.swing.JPanel jPDetails;
    private javax.swing.JPanel jPHotels;
    private javax.swing.JPanel jPReport;
    private javax.swing.JPanel jPRoom;
    private javax.swing.JRadioButton jRBALArab;
    private javax.swing.JRadioButton jRBDouble;
    private javax.swing.JRadioButton jRBHilton;
    private javax.swing.JRadioButton jRBIceHotel;
    private javax.swing.JRadioButton jRBSingle;
    private javax.swing.JRadioButton jRBSuite;
    private javax.swing.JButton jRShowIcon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
