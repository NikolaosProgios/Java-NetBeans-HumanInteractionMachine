
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class lab1_1 extends javax.swing.JFrame {

    public lab1_1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        infogame = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        posotita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        typosgame = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ToolTip = new javax.swing.JLabel();

        infogame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                infogameKeyPressed(evt);
            }
        });

        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
        });

        posotita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                posotitaKeyPressed(evt);
            }
        });

        typosgame.setBorder(javax.swing.BorderFactory.createTitledBorder("Είδος Παιχνιδιού"));
        typosgame.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Επιτραπέζιο", "Ηλεκτρονικό", "other" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infogame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(posotita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(ToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 170, Short.MAX_VALUE))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infogame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posotita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

String saveinfo="";

public void checkIsOk(){//ελενγψος εαν συμπληροσε ολα τα παιδια
    if ( "".equals(infogame.getText())  ){
            myerrormessage("Σημπλιρωσε πληροφοριες παιχνιδιου ");
            /*JOptionPane.showMessageDialog(null,"Επιβεβαιωσε ημερομηνιες","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);*/
        }else if ( "".equals(posotita.getText())){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Σημπλιρωσε ποσοτητα παιχνιδιου ");
            /*JOptionPane.showMessageDialog(null,"Λάθος προορισμός ή αφετερια","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);*/
        }
        else if ( "".equals(price.getText())){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Σημπλιρωσε τιμη παιχνιδιου ");
            /*JOptionPane.showMessageDialog(null,"Λάθος προορισμός ή αφετερια","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);*/
        }
        else if ( "".equals(typosgameselected)){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Επελεξε τυπο παιχνιδου ");
            /*JOptionPane.showMessageDialog(null,"Λάθος προορισμός ή αφετερια","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);*/
        }
        else { //Ολα καλα
             saveinfo="Περιγραφη παιχνιδιου: "+gameinfo+"\n"+"Ποσοτητα: "+posotitagame
                    +  "\nΤιμη : " + timigame + " \n" ;
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
}
public String gameinfo="";
private void infogameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_infogameKeyPressed
             gameinfo = infogame.getText();
}//GEN-LAST:event_infogameKeyPressed
String posotitagame;
private void posotitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_posotitaKeyPressed
        posotitagame=posotita.getText();
}//GEN-LAST:event_posotitaKeyPressed
String timigame;
private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        timigame=price.getText();
}//GEN-LAST:event_priceKeyPressed
String typosgameselected="";
String typosGameTable[]={"Επιτραπέζιο","Ηλεκτρονικό","other"};
private void typosgameValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_typosgameValueChanged
        int idx=typosgame.getSelectedIndex();
        typosgameselected=typosGameTable[idx];
        /*if (equals2()){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Λάθος προορισμός ή αφετερια");
        }else{  
            timi=kostos();// kostos afeteria+proorimos
            String check = proorismoi[idx];
            PhotoProorrimos.setText(check+"Photo");
            if ("Θεσσαλονικη".equals(check)){
                PhotoProorrimos.setIcon(skg);
            }else if   ("Βαρκελονη".equals(check)){
                PhotoProorrimos.setIcon(barkeloni);
        }*/
}//GEN-LAST:event_typosgameValueChanged

 
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
            java.util.logging.Logger.getLogger(lab1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab1_1().setVisible(true);
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
    private javax.swing.JLabel ToolTip;
    private javax.swing.JTextField infogame;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField posotita;
    private javax.swing.JTextField price;
    private javax.swing.JList<String> typosgame;
    // End of variables declaration//GEN-END:variables
}
