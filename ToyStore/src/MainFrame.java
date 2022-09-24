import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewDialog = new javax.swing.JDialog();
        infogame = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        typosgame = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ToolTip = new javax.swing.JLabel();
        Posotita2 = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Sales = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Total = new javax.swing.JMenuItem();

        infogame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infogameActionPerformed(evt);
            }
        });
        infogame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                infogameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                infogameKeyReleased(evt);
            }
        });

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });

        typosgame.setBorder(javax.swing.BorderFactory.createTitledBorder("Είδος Παιχνιδιού"));
        typosgame.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Επιτραπέζιο", "Ηλεκτρονικό", "other" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        typosgame.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        typosgame.setToolTipText("");
        typosgame.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                typosgameValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(typosgame);

        jLabel1.setText("Περιγραφη παιχνιδιου");

        jLabel2.setText("Ποσοτητα");

        jLabel8.setText("Τιμη");

        Posotita2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Posotita2.setToolTipText("");

        javax.swing.GroupLayout NewDialogLayout = new javax.swing.GroupLayout(NewDialog.getContentPane());
        NewDialog.getContentPane().setLayout(NewDialogLayout);
        NewDialogLayout.setHorizontalGroup(
            NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewDialogLayout.createSequentialGroup()
                        .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewDialogLayout.createSequentialGroup()
                                .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infogame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Posotita2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(NewDialogLayout.createSequentialGroup()
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(ToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 191, Short.MAX_VALUE))))
        );
        NewDialogLayout.setVerticalGroup(
            NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewDialogLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NewDialogLayout.createSequentialGroup()
                        .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewDialogLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infogame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Posotita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        File.setMnemonic('F');
        File.setText("File");

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        File.add(About);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Sales.setText("Sales");
        Sales.setToolTipText("");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        Sales.add(New);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        Sales.add(Save);

        Total.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        Total.setText("Total");
        Sales.add(Total);

        jMenuBar1.add(Sales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    System.exit(0);    
}//GEN-LAST:event_ExitActionPerformed

private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        new  About().setVisible(true);
}//GEN-LAST:event_AboutActionPerformed

private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
    NewDialog.setVisible(true);
    NewDialog.setSize(500,500);    
}//GEN-LAST:event_NewActionPerformed
String saveinfo="";Integer posotitaInt;
private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
    if ( "".equals(infogame.getText())  ){
            myerrormessage("Σημπλιρωσε πληροφοριες παιχνιδιου ");

        }else if ( "".equals(String.valueOf(Posotita2.getValue()) )){
            myerrormessage("Σημπλιρωσε ποσοτητα παιχνιδιου ");

        }
        else if ( "".equals(price.getText())){
            myerrormessage("Σημπλιρωσε τιμη παιχνιδιου ");            
        }
        else if ( "".equals(typosgameselected)){
            myerrormessage("Επελεξε τυπο παιχνιδου ");          
        }
        else { //Ολα καλα             
            String posotitaStr=String.valueOf(Posotita2.getValue());
            posotitaInt=Integer.valueOf(posotitaStr);
            
            int timiInt=(Integer.parseInt(timigame)*posotitaInt);
            String timiStr =String.valueOf(timiInt);
            
            saveinfo="Περιγραφη παιχνιδιου: "+gameinfo+"\n"+"Ποσοτητα: "+posotitaStr
                    +  "\nΤιμη  προιοντος: " + timigame
                    +  "\nΣυνολικη τιμη : " + timiStr
                     + " \nΤυπος παιχνιδιου: "+typosgameselected+" \n";
            try {
                FileWriter writer = new FileWriter("stoixia.txt",true);
                writer.append("\nΗμερομηνια ανανέωσεις: "+showodata()+
                    " "+showTime()+" \n"+saveinfo);
                writer.close();
                JOptionPane.showMessageDialog(null,
                    "Αποθικευση στοιχειων επιτυχεις","Succes",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Σφάλμα","Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_SaveActionPerformed

private void infogameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infogameKeyPressed
}//GEN-LAST:event_infogameKeyPressed


private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
}//GEN-LAST:event_priceKeyPressed

String typosgameselected="";
String typosGameTable[]={"Επιτραπέζιο","Ηλεκτρονικό","other"};
private void typosgameValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_typosgameValueChanged
        int idx=typosgame.getSelectedIndex();
        typosgameselected=typosGameTable[idx];
}//GEN-LAST:event_typosgameValueChanged

private void infogameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infogameActionPerformed
}//GEN-LAST:event_infogameActionPerformed
String timigame;
    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        timigame=price.getText();
    }//GEN-LAST:event_priceKeyReleased
String gameinfo="";
    private void infogameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infogameKeyReleased
        gameinfo = infogame.getText();
    }//GEN-LAST:event_infogameKeyReleased


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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
     void myerrormessage(String message){
        JOptionPane.showMessageDialog(null, message, 
                                    "προσοχη λάθος",
                                    JOptionPane.ERROR_MESSAGE);   
    }
    void myinfomessage(String message){
        JOptionPane.showMessageDialog(null, message,"Ενημέροση",
                                    JOptionPane.INFORMATION_MESSAGE);         
    }
    String showodata(){
        Date d  = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        return s.format(d) ;
    }
    String showTime(){
            Date d  = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            return s.format(d) ;       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem New;
    private javax.swing.JDialog NewDialog;
    private javax.swing.JSpinner Posotita2;
    private javax.swing.JMenu Sales;
    private javax.swing.JMenuItem Save;
    private javax.swing.JLabel ToolTip;
    private javax.swing.JMenuItem Total;
    private javax.swing.JTextField infogame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JList<String> typosgame;
    // End of variables declaration//GEN-END:variables
}
