import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Book extends javax.swing.JFrame {

    public Book() {
        /*JLabel takis = new JLabel();
        takis.setIcon(backphoto);
        setContentPane(takis);
        initComponents();
        */
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Choice = new javax.swing.JTabbedPane();
        Menu = new javax.swing.JPanel();
        PhotoAfeteria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AfeteriaLista = new javax.swing.JList<>(afeteria);
        jScrollPane2 = new javax.swing.JScrollPane();
        ProorismoiLista = new javax.swing.JList<>(proorismoi);
        PhotoProorrimos = new javax.swing.JLabel();
        Kratisi = new javax.swing.JButton();
        Text2 = new javax.swing.JLabel();
        Times = new javax.swing.JButton();
        Text1 = new javax.swing.JLabel();
        dateAnaxorisi = new javax.swing.JTextField();
        dateEpistrofi = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        buttonepistrofi = new javax.swing.JRadioButton();
        buttonApli = new javax.swing.JRadioButton();
        ToolTip = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        Contact = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PhotoAfeteria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhotoAfeteria.setText("ΒαρκελονηPhoto");
        PhotoAfeteria.setBorder(new javax.swing.border.MatteBorder(null));

        AfeteriaLista.setBorder(javax.swing.BorderFactory.createTitledBorder("Αφετερίες"));
        AfeteriaLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AfeteriaLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AfeteriaLista.setSelectedIndex(0);
        AfeteriaLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AfeteriaListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(AfeteriaLista);

        ProorismoiLista.setBorder(javax.swing.BorderFactory.createTitledBorder("Προορισμοί"));
        ProorismoiLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ProorismoiLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProorismoiLista.setSelectedIndex(0);
        ProorismoiLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ProorismoiListaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ProorismoiLista);

        PhotoProorrimos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhotoProorrimos.setText("ΘεσσαλονικηPhoto");
        PhotoProorrimos.setBorder(new javax.swing.border.MatteBorder(null));

        Kratisi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Kratisi.setText("Κράτηση");
        Kratisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KratisiActionPerformed(evt);
            }
        });

        Text2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text2.setText(" Ηµεροµηνία αναχώρησης");

        Times.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Times.setText("Διαθεσιμότητα Τιμες");
        Times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesActionPerformed(evt);
            }
        });

        Text1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text1.setText("Tυπος πτήσεις:");

        dateAnaxorisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateAnaxorisiKeyPressed(evt);
            }
        });

        dateEpistrofi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateEpistrofiKeyPressed(evt);
            }
        });

        Text3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text3.setText(" Ηµεροµηνία επιστροφής");

        buttonGroup1.add(buttonepistrofi);
        buttonepistrofi.setText("Επιστοφη");
        buttonepistrofi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonepistrofiActionPerformed(evt);
            }
        });

        buttonGroup1.add(buttonApli);
        buttonApli.setSelected(true);
        buttonApli.setText("Απλή");
        buttonApli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApliActionPerformed(evt);
            }
        });

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airplain222.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(662, 400));
        background.setMinimumSize(new java.awt.Dimension(662, 400));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(PhotoAfeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(PhotoProorrimos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Text1))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonepistrofi)
                            .addComponent(buttonApli))
                        .addGap(88, 88, 88)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateAnaxorisi)
                            .addComponent(dateEpistrofi)
                            .addComponent(Text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Times)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Kratisi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text1)
                            .addComponent(Text2))
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(buttonApli)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Text3)
                                .addGap(11, 11, 11)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonepistrofi)
                                    .addComponent(dateEpistrofi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateAnaxorisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(ToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(Times))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Kratisi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhotoAfeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhotoProorrimos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Choice.addTab("Menu", Menu);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Η  εταιρια μας  AirTeiThe");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ContactLayout = new javax.swing.GroupLayout(Contact);
        Contact.setLayout(ContactLayout);
        ContactLayout.setHorizontalGroup(
            ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        ContactLayout.setVerticalGroup(
            ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactLayout.createSequentialGroup()
                .addGroup(ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContactLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContactLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(487, Short.MAX_VALUE))
        );

        Choice.addTab("Contact", Contact);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Choice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Choice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String typosptiseis="απλη"; 
    private void buttonApliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApliActionPerformed
        typosptiseis="απλη";
    }//GEN-LAST:event_buttonApliActionPerformed

    private void buttonepistrofiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonepistrofiActionPerformed
        typosptiseis="με επιστροφη";
    }//GEN-LAST:event_buttonepistrofiActionPerformed

    private void dateAnaxorisiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateAnaxorisiKeyPressed
        String date = dateAnaxorisi.getText();
        checkDate(date);// if date is okay  ..

    }//GEN-LAST:event_dateAnaxorisiKeyPressed

    //if einai proorimos kai afeteria idia peta ?
    boolean equals2(){
        boolean ttt=false;            
        if (afeteria[AfeteriaLista.getSelectedIndex()]==proorismoi[ProorismoiLista.getSelectedIndex()])
            return true;
        return ttt;
    }

    private void TimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesActionPerformed

        if (( "".equals(dateAnaxorisi.getText()) || "".equals(dateEpistrofi.getText())) ){
            JOptionPane.showMessageDialog(null,"Επιβεβαιωσε ημερομηνιες","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);
        }else if (equals2()){// if einai proorimos kaiafeteria idia peta lathos
            JOptionPane.showMessageDialog(null,"Λάθος προορισμός ή αφετερια","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);
        }
        else{
            timi=kostos();
            String info="Διαθεσιμοτητα: οκ \n"+"Απο: "+checkAfeteria+
            " με προορισμο: "+checkProorismos +"\nΤιμή: " + timi ;

            JOptionPane.showMessageDialog(null, info,
                "Succes",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TimesActionPerformed


    private void KratisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KratisiActionPerformed
        if (( "".equals(dateAnaxorisi.getText()) || "".equals(dateEpistrofi.getText())) ){
            myerrormessage("Επιβεβαιωσε ημερομηνιες");
            /*JOptionPane.showMessageDialog(null,"Επιβεβαιωσε ημερομηνιες","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);*/
        }else if (equals2()){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Λάθος προορισμός ή αφετερια");
            /*JOptionPane.showMessageDialog(null,"Λάθος προορισμός ή αφετερια","Σφάλμα",
                JOptionPane.ERROR_MESSAGE);*/
        }
        else{ //Ολα καλα
            String kratisiinfo="Αφετερία: "+checkAfeteria+"\n"+"Προορισμός: "+checkProorismos
                +"\nΤύπος πτήσης: " + typosptiseis
                +"\nΗµεροµηνία αναχώρησης: "+ dateAnaxorisi.getText()
                +"\nΗµεροµηνία επιστροφής: "+ dateEpistrofi.getText()
                +   "\n Κoστος: "+ kostos()+"\n";
            try {
                FileWriter writer = new FileWriter("stoixia.txt",true);
                writer.append("\nΗμερομηνια ανανέωσεις: "+showodata()+
                    " "+showTime()+" \n"+kratisiinfo);
                writer.close();
                JOptionPane.showMessageDialog(null,
                    "Αποθικευση στοιχειων επιτυχεις","Succes",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Σφάλμα","Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_KratisiActionPerformed

    private void ProorismoiListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ProorismoiListaValueChanged
        int idx=ProorismoiLista.getSelectedIndex();
        checkProorismos=proorismoi[idx];
        if (equals2()){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Λάθος προορισμός ή αφετερια");
        }else{  
            timi=kostos();// kostos afeteria+proorimos
            String check = proorismoi[idx];
            PhotoProorrimos.setText(check+"Photo");
            if ("Θεσσαλονικη".equals(check)){
                PhotoProorrimos.setIcon(skg);
            }else if   ("Βαρκελονη".equals(check)){
                PhotoProorrimos.setIcon(barkeloni);
            }
        }
    }//GEN-LAST:event_ProorismoiListaValueChanged
    
    int kostos(){
        return (timi_afeteria[AfeteriaLista.getSelectedIndex()]+
                   timi_proorismoi[ProorismoiLista.getSelectedIndex()]);
    }
    
    private void AfeteriaListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AfeteriaListaValueChanged
        int idx=AfeteriaLista.getSelectedIndex();
        checkAfeteria=afeteria[idx];
        if (equals2()){// if einai proorimos kaiafeteria idia peta lathos
            myerrormessage("Λάθος προορισμός ή αφετερια");
        }else{
            timi=kostos();
            String check = afeteria[idx];
            PhotoAfeteria.setText(check+"Photo");
            if ("Θεσσαλονικη".equals(check)){
                PhotoAfeteria.setIcon(skg);
            }else if   ("Βαρκελονη".equals(check)){
                PhotoAfeteria.setIcon(barkeloni);
            }
        }
    }//GEN-LAST:event_AfeteriaListaValueChanged

    private void dateEpistrofiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateEpistrofiKeyPressed
        String date = dateEpistrofi.getText();
        checkDate(date);
    }//GEN-LAST:event_dateEpistrofiKeyPressed

      
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Book().setVisible(true);
            }
        });
    }
   int timi;
    String checkAfeteria="Βαρκελονη";    
    String checkProorismos="Θεσσαλονικη"; 
    private void checkDate(String date){
       String flag=null;
       char first,second;
       ToolTip.setText("DD/MM/YYYY");
       if(date.length()==9){
           if(date.charAt(2)=='/' && date.charAt(5)=='/'){
            ToolTip.setText("");
            first=date.charAt(0);
            second=date.charAt(3);
                if(Character.getNumericValue(first)>3 || Character.getNumericValue(second)>1){
                    ToolTip.setText("Wrong Input");                    
                }else if(Character.getNumericValue(first)==3 && Character.getNumericValue(date.charAt(1)) >1){
                    ToolTip.setText("Wrong Input");
                    //εαν η μερα ειναι μεγαλυτερει του 31, Λαθος
                }else if(Character.getNumericValue(second)==1 && Character.getNumericValue(date.charAt(4)) >2){
                    ToolTip.setText("Wrong Input");
                }
            }
        }
        if(date.length()>9){
            ToolTip.setText("Too Many Characters");
        }
    }
     
   String afeteria[]={"Βαρκελονη","Ιταλια","Βουδαπεση","Μανχαταν","Γερμανια","Θεσσαλονικη"};
   int timi_afeteria[]={50,60,70,80,90,100};
   String proorismoi[]={"Θεσσαλονικη","Βαρκελονη","Ιταλια","Βουδαπεση","Μανχαταν","Γερμανια"};
   int timi_proorismoi[]={100,50,60,70,80,90};
   
   ImageIcon skg= new ImageIcon("skg.jgp");
   ImageIcon barkeloni= new ImageIcon("barkeloni.jgp");
   ImageIcon italia= new ImageIcon("italia.jgp");
   ImageIcon backphoto = new ImageIcon("airplain222.jpg"); 
    
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
    private javax.swing.JList<String> AfeteriaLista;
    private javax.swing.JTabbedPane Choice;
    private javax.swing.JPanel Contact;
    private javax.swing.JButton Kratisi;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel PhotoAfeteria;
    private javax.swing.JLabel PhotoProorrimos;
    private javax.swing.JList<String> ProorismoiLista;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JButton Times;
    private javax.swing.JLabel ToolTip;
    private javax.swing.JLabel background;
    private javax.swing.JRadioButton buttonApli;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton buttonepistrofi;
    private javax.swing.JTextField dateAnaxorisi;
    private javax.swing.JTextField dateEpistrofi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
