import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Makis extends javax.swing.JFrame {

    public Makis() {
        initComponents();
        foodicon.setIcon(gyros);
        drinkicon.setIcon(fanta);
        Table.setAutoCreateRowSorter(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        app = new javax.swing.JTabbedPane();
        FormaParagkelias = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        food = new javax.swing.JList(foods);
        foodicon = new javax.swing.JLabel();
        Posotita1 = new javax.swing.JSpinner();
        DrinkCombo = new javax.swing.JComboBox();
        Posotita2 = new javax.swing.JSpinner();
        drinkicon = new javax.swing.JLabel();
        addButton2 = new javax.swing.JButton();
        addButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SynolikiPragkelia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TotalPrice = new javax.swing.JLabel();
        stimi = new javax.swing.JLabel();
        euro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ο ΜΑΚΗΣ");

        food.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        food.setToolTipText("");
        food.setSelectedIndex(0);
        food.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                foodValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(food);

        foodicon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Posotita1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Posotita1.setToolTipText("");

        DrinkCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Πορτοκαλαδα", "Κοκακολα ", "Nero", "lemonada" }));
        DrinkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkComboActionPerformed(evt);
            }
        });

        Posotita2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        drinkicon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        addButton2.setText("Προσθεστε στην παραγκελια");
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        addButton1.setText("Προσθεστε στην παραγκελια");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Επέλεξε Φαγητό");

        jLabel2.setText("Επέλεξε ανψυ");

        jLabel3.setText("Ποσότητα");

        jLabel4.setText("Ποσότητα");

        javax.swing.GroupLayout FormaParagkeliasLayout = new javax.swing.GroupLayout(FormaParagkelias);
        FormaParagkelias.setLayout(FormaParagkeliasLayout);
        FormaParagkeliasLayout.setHorizontalGroup(
            FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foodicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Posotita1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                        .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DrinkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Posotita2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel4)))))
                        .addGap(42, 42, 42)
                        .addComponent(drinkicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        FormaParagkeliasLayout.setVerticalGroup(
            FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                        .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Posotita1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(foodicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(addButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinkicon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                        .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(FormaParagkeliasLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormaParagkeliasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrinkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Posotita2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(addButton2)))
                .addGap(20, 20, 20))
        );

        app.addTab("ΦΟΡΜΑ ΠΑΡΑΓΓΕΛΙΑΣ", FormaParagkelias);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Παραγγελία", "Ποιότητα", "Τιμη Μονάδας"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TotalPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalPrice.setText("Συνολικη Τιμη:");

        stimi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stimi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stimi.setText("0");

        euro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        euro.setText("ευρω");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TotalPrice)
                .addGap(46, 46, 46)
                .addComponent(stimi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(euro)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPrice)
                    .addComponent(stimi)
                    .addComponent(euro))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SynolikiPragkeliaLayout = new javax.swing.GroupLayout(SynolikiPragkelia);
        SynolikiPragkelia.setLayout(SynolikiPragkeliaLayout);
        SynolikiPragkeliaLayout.setHorizontalGroup(
            SynolikiPragkeliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SynolikiPragkeliaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(SynolikiPragkeliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        SynolikiPragkeliaLayout.setVerticalGroup(
            SynolikiPragkeliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SynolikiPragkeliaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        app.addTab("ΣΥΝΟΛΙΚΗ ΠΑΡΑΓΓΕΛΙΑ", SynolikiPragkelia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(app, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(app, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void foodValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_foodValueChanged
    int idx=food.getSelectedIndex();
    String foodtype = foods[idx];
    if ("Γυρος".equals(foodtype)){
        foodicon.setIcon(gyros);        
    }else if   ("Σουτουκακια".equals(foodtype)){
        foodicon.setIcon(soutzoukaki);
    }else if   (foodtype=="Σουβλακι"){
        foodicon.setIcon(souvlaki);
    }else if   ("Xωριατικη".equals(foodtype)){
        foodicon.setIcon(xoriatiki);
    }else if   (foodtype=="Πράσινη"){
        foodicon.setIcon(prasini);        
    }else if   (foodtype=="Γεμιστα"){
        foodicon.setIcon(gemitsa);        
    }
}//GEN-LAST:event_foodValueChanged

private void DrinkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkComboActionPerformed
    int idx=DrinkCombo.getSelectedIndex();
    String drinktype = drinks[idx];
    if (drinktype=="Πορτοκαλαδα"){
        drinkicon.setIcon(fanta);        
    }else if   (drinktype=="Κοκακολα"){
        drinkicon.setIcon(kokakola);
    }else if   ("Nero".equals(drinktype)){
        drinkicon.setIcon(nero);
    }else if   (drinktype=="Λεμοναδα"){
        drinkicon.setIcon(lemonada);        
    }
}//GEN-LAST:event_DrinkComboActionPerformed

private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
    int idx=food.getSelectedIndex();
    String foodtype=foods[idx];
    String strposotita=String.valueOf(Posotita1.getValue());
    posotita=Integer.valueOf(strposotita);
    timi=foodprice[idx];
    Object[] row = { foodtype , posotita, timi } ; 
    DefaultTableModel model  = (DefaultTableModel) Table.getModel();
    model.addRow(row);
    sunolo=sunolo+ (posotita*timi);
    stimi.setText(String.valueOf(sunolo));  
}//GEN-LAST:event_addButton1ActionPerformed

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
    int idx=DrinkCombo.getSelectedIndex();
    String drinktype=drinks[idx];
    String strposotita=String.valueOf(Posotita2.getValue());
    /*String */posotita=Integer.valueOf(strposotita);
    timi=drinksprce[idx];
    Object[] row = { drinktype , posotita , timi } ; 
    DefaultTableModel model  = (DefaultTableModel) Table.getModel();
    model.addRow(row);
    sunolo=sunolo+ (posotita*timi);
    stimi.setText(String.valueOf(sunolo));  
    }//GEN-LAST:event_addButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Makis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Makis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Makis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Makis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Makis().setVisible(true);
            }
        });
    }
    
    String foods[]={"Γυρος","Σουτουκακια","Σουβλακι","Xωριατικη","Πράσινη","Γεμιστα"};
    int foodprice[]={6,5,4,3,2,7};
    
    String drinks[]={"Πορτοκαλαδα","Κοκακολα","Nero","Λεμοναδα"};
    int drinksprce[]={2,3,1,2};    
    
    int posotita=0;
    int sunolo=0;
    int timi=0;
   ImageIcon gyros= new ImageIcon("gyros.jgp");
   ImageIcon soutzoukaki= new ImageIcon("soutsoukaki.jgp");
   ImageIcon souvlaki= new ImageIcon("souvlaki.jgp");
   ImageIcon xoriatiki= new ImageIcon("xoriatiki.jgp");
   ImageIcon gemitsa= new ImageIcon("gemista.jgp");   
   ImageIcon prasini= new ImageIcon("prasini.jgp"); 
   
   ImageIcon fanta= new ImageIcon("fanta.jgp");
   ImageIcon lemonada= new ImageIcon("lemonada.jgp");
   ImageIcon nero= new ImageIcon("nero.jgp");
   ImageIcon kokakola= new ImageIcon("kokakola.jgp");  
           
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DrinkCombo;
    private javax.swing.JPanel FormaParagkelias;
    private javax.swing.JSpinner Posotita1;
    private javax.swing.JSpinner Posotita2;
    private javax.swing.JPanel SynolikiPragkelia;
    private javax.swing.JTable Table;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton2;
    private javax.swing.JTabbedPane app;
    private javax.swing.JLabel drinkicon;
    private javax.swing.JLabel euro;
    private javax.swing.JList food;
    private javax.swing.JLabel foodicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel stimi;
    // End of variables declaration//GEN-END:variables
}
