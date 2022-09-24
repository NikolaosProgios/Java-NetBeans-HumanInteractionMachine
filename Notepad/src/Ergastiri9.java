import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ergastiri9 extends javax.swing.JFrame {

    public Ergastiri9() {
        initComponents();

        FileNameExtensionFilter  filter = new FileNameExtensionFilter("TEXT Files " , "txt");
        OpenFileChooser.setFileFilter(filter);
        SaveFileChooser.setFileFilter(filter);
        OpenFileChooser.setCurrentDirectory(new File("."));
        SaveFileChooser.setCurrentDirectory(new File("."));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpenDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        OpenFileText = new javax.swing.JTextField();
        OpenButton = new javax.swing.JButton();
        OpenCancelButton = new javax.swing.JButton();
        SaveDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        SaveFileText = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        SaveCancelButton = new javax.swing.JButton();
        AboutDialog = new javax.swing.JDialog();
        photoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AboutTextArea = new javax.swing.JTextArea();
        OpenFileChooser = new javax.swing.JFileChooser();
        SaveFileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        OpenFile = new javax.swing.JMenuItem();
        CloseFile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SaveFile = new javax.swing.JMenuItem();
        SaveAsFile = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenu();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        OpenDialog.setTitle("Open File");

        jLabel1.setText("Ορίστε το όνομα και τη διαδρομή του αρχείου");

        OpenButton.setText("Open");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonActionPerformed(evt);
            }
        });

        OpenCancelButton.setText("Cancel");
        OpenCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OpenDialogLayout = new javax.swing.GroupLayout(OpenDialog.getContentPane());
        OpenDialog.getContentPane().setLayout(OpenDialogLayout);
        OpenDialogLayout.setHorizontalGroup(
            OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(OpenDialogLayout.createSequentialGroup()
                        .addComponent(OpenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OpenCancelButton))
                    .addComponent(OpenFileText, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        OpenDialogLayout.setVerticalGroup(
            OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpenDialogLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OpenFileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenButton)
                    .addComponent(OpenCancelButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SaveDialog.setTitle("SaveDialog");

        jLabel2.setText("Ορίστε το όνομα και τη διαδρομή του αρχείου");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        SaveCancelButton.setText("Cancel");
        SaveCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaveDialogLayout = new javax.swing.GroupLayout(SaveDialog.getContentPane());
        SaveDialog.getContentPane().setLayout(SaveDialogLayout);
        SaveDialogLayout.setHorizontalGroup(
            SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaveDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SaveDialogLayout.createSequentialGroup()
                        .addComponent(SaveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveCancelButton))
                    .addComponent(SaveFileText, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        SaveDialogLayout.setVerticalGroup(
            SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SaveDialogLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveFileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SaveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(SaveCancelButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        AboutDialog.setTitle("infoDetails");

        AboutTextArea.setColumns(20);
        AboutTextArea.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AboutTextArea.setRows(5);
        AboutTextArea.setText("Η εφαρμογη αυτη υλοποιήθηκη \nαπο τον Πρόγιο Νίκο\nστον μάθημα Αλληλεπίδραση Ανθρώπου-Μηχανής \nστις 29 Νοεμβρίου 2018.");
        jScrollPane2.setViewportView(AboutTextArea);

        javax.swing.GroupLayout AboutDialogLayout = new javax.swing.GroupLayout(AboutDialog.getContentPane());
        AboutDialog.getContentPane().setLayout(AboutDialogLayout);
        AboutDialogLayout.setHorizontalGroup(
            AboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AboutDialogLayout.setVerticalGroup(
            AboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimpleMenuEditor");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        File.setMnemonic('F');
        File.setText("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        OpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenFile.setMnemonic('O');
        OpenFile.setText("Open");
        OpenFile.setToolTipText("Open a Text File");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });
        File.add(OpenFile);

        CloseFile.setMnemonic('C');
        CloseFile.setText("Close");
        CloseFile.setToolTipText("Close the file");
        CloseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseFileActionPerformed(evt);
            }
        });
        File.add(CloseFile);
        File.add(jSeparator1);

        SaveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveFile.setMnemonic('S');
        SaveFile.setText("Save");
        SaveFile.setToolTipText("Save the File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        File.add(SaveFile);

        SaveAsFile.setMnemonic('A');
        SaveAsFile.setText("Save As");
        SaveAsFile.setToolTipText("Save file with a new name");
        SaveAsFile.setDisplayedMnemonicIndex(5);
        SaveAsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsFileActionPerformed(evt);
            }
        });
        File.add(SaveAsFile);
        File.add(jSeparator2);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setMnemonic('E');
        Exit.setText("Exit");
        Exit.setToolTipText("Close the application");
        File.add(Exit);

        jMenuBar1.add(File);

        Cut.setMnemonic('E');
        Cut.setText("Edit");

        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copy.setMnemonic('C');
        Copy.setText("Copy");
        Copy.setToolTipText("Copy to clipboard");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Cut.add(Copy);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Paste.setMnemonic('P');
        Paste.setText("Paste");
        Paste.setToolTipText("Paste text from clipboard");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        Cut.add(Paste);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('U');
        jMenuItem1.setText("Cut");
        jMenuItem1.setToolTipText("Cut to clipboard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Cut.add(jMenuItem1);

        jMenuBar1.add(Cut);

        Help.setMnemonic('H');
        Help.setText("Help");

        About.setMnemonic('A');
        About.setText("About");
        About.setToolTipText("Info about the developer");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Help.add(About);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
       FileReader fw;
        returnVal = OpenFileChooser.showOpenDialog(this);      
        File fileodject = OpenFileChooser.getSelectedFile();
        if (fileodject != null && returnVal == JFileChooser.APPROVE_OPTION){
            filename=fileodject.getPath();
     
            try{
            fw = new FileReader(filename);
            jTextArea1.read(fw,null);
            fw.close();
            setTitle(filename);
            myinfomessage("Το αρχείο φορτοθηκε σωστά.");                  
        } catch (IOException exc)  {
            myerrormessage(exc.getMessage());            
        }
      }else if (returnVal ==JFileChooser.CANCEL_OPTION){
          myerrormessage("Επιλεξατε ακύρωση ή κλείσιμο");      
      } 
        
         
    }//GEN-LAST:event_OpenFileActionPerformed

    private void OpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonActionPerformed
        FileReader fw;
        filename = OpenFileText.getText();
        if (filename.length() ==0){
            myinfomessage("Οριτστε το ονομα και την διαδρομη του αρχείου " +
                    "που θελετε να ανιοιξετε");
            OpenDialog.setVisible(false);
            return ;
        }
        try{
            fw = new FileReader(filename);
            jTextArea1.read(fw,null);
            fw.close();
        } catch (IOException exc)  {
            myinfomessage("Λάθος Όνομα αρχείου");
            return ; 
        }
        myinfomessage("To αρχείιου σωστά.");              
    }//GEN-LAST:event_OpenButtonActionPerformed

    private void OpenCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenCancelButtonActionPerformed
        OpenDialog.setVisible(false);                
    }//GEN-LAST:event_OpenCancelButtonActionPerformed

    private void CloseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseFileActionPerformed
        jTextArea1.setText("");
        filename="";
        setTitle("Simple Menu Editor");
    }//GEN-LAST:event_CloseFileActionPerformed

    private void SaveAsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsFileActionPerformed
    FileWriter fw;
    returnVal = SaveFileChooser.showSaveDialog(this);
    File fileodject = SaveFileChooser.getSelectedFile();      
        if (fileodject != null && returnVal == JFileChooser.APPROVE_OPTION){
            filename=fileodject.getPath();
            if (fileodject.exists())
                mysave();            
            else{
                try{
                fw = new FileWriter(filename);
                jTextArea1.write(fw);
                fw.close();
                setTitle(filename);
                myinfomessage("Το αρχείο φορτοθηκε σωστά.");                  
              } catch (IOException exc)  {
                myerrormessage(exc.getMessage());                        
              }
            } 
          }else if (returnVal == JFileChooser.CANCEL_OPTION){
              myinfomessage("Επιλεξατε ακύρωση ή κλείσιμο");      
      }       
    }//GEN-LAST:event_SaveAsFileActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        FileWriter fw ; 
        if (filename ==""){
            SaveDialog.setVisible(true);
            SaveDialog.setSize(280,170);
        }else {
            try{
                fw = new FileWriter(filename);
                jTextArea1.write(fw);
                fw.close();
                myinfomessage("Το αρχειο αποθεικευτικε σωστα.");
            }catch(IOException exc){
                myerrormessage(exc.getMessage());
            }           
        }
        
    }//GEN-LAST:event_SaveFileActionPerformed

    private void SaveCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCancelButtonActionPerformed
        SaveDialog.setVisible(false);
        
    }//GEN-LAST:event_SaveCancelButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        FileWriter fw;
        filename = SaveFileText.getText();
        if ( filename.length() ==0 ){
            myinfomessage("Οριτστε το ονομα και την διαδρομη του αρχείου " +
                    "που θελετε να ανιοιξετε");
            SaveDialog.setVisible(false);
            return ;
        }
        try{
            fw = new FileWriter(filename);
            jTextArea1.write(fw);
            fw.close();
        } catch (IOException exc)  {
            myinfomessage("Λάθος Όνομα αρχείου");
            return ; 
        }
        myinfomessage("To αρχείιου σωστά.");
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FileActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        jTextArea1.copy();
    }//GEN-LAST:event_CopyActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        jTextArea1.paste();

    }//GEN-LAST:event_PasteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jTextArea1.cut();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        AboutDialog.setVisible(true);
        AboutDialog.setSize(1450,220);
    }//GEN-LAST:event_AboutActionPerformed
    
    
    void mysave(){
       int result = JOptionPane.showConfirmDialog(this,
                                        "Το αρχειο υπάρχει.  Να γινεί αντικατάσταση "
                                        ,"Αντικατασταη αρχείου",
                                        JOptionPane.YES_NO_CANCEL_OPTION);
       switch(result){
            case JOptionPane.YES_OPTION:
                FileWriter fw;
                try {
                    fw =  new FileWriter(filename);
                    jTextArea1.write(fw);
                fw.close();
                setTitle(filename);
                }catch (IOException exc){
                myerrormessage(exc.getMessage());   
                }
                return ;
            case JOptionPane.NO_OPTION:
                SaveAsFile.doClick();
            case JOptionPane.CLOSED_OPTION:
            case JOptionPane.CANCEL_OPTION:
       }
   }           
         
    String filename="" ; 
    int returnVal ; 
    void myerrormessage(String message){
        JOptionPane.showMessageDialog(null,
                                    message, 
                                    "προσοχη λάθιος",
                                    JOptionPane.ERROR_MESSAGE);   
    }
    
    void myinfomessage(String message){
        JOptionPane.showMessageDialog(null,
                                    message, 
                                    "Ενημέροση",
                                    JOptionPane.INFORMATION_MESSAGE);         
    }
    
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
            java.util.logging.Logger.getLogger(Ergastiri9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ergastiri9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ergastiri9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ergastiri9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ergastiri9().setVisible(true);
            }
        });
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JDialog AboutDialog;
    private javax.swing.JTextArea AboutTextArea;
    private javax.swing.JMenuItem CloseFile;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenu Cut;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JButton OpenButton;
    private javax.swing.JButton OpenCancelButton;
    private javax.swing.JDialog OpenDialog;
    private javax.swing.JMenuItem OpenFile;
    private javax.swing.JFileChooser OpenFileChooser;
    private javax.swing.JTextField OpenFileText;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem SaveAsFile;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SaveCancelButton;
    private javax.swing.JDialog SaveDialog;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JFileChooser SaveFileChooser;
    private javax.swing.JTextField SaveFileText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel photoLabel;
    // End of variables declaration//GEN-END:variables
}
