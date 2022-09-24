
import java.awt.Component;


public class Calculator1 extends javax.swing.JFrame {

    @SuppressWarnings("OverrideableMethodCallInConstructor")
    public Calculator1() {
        initComponents();
        disable_componet();
        getRootPane().setDefaultButton(Buttonison);
    }
    public void disable_componet(){
        int compcount = getContentPane().getComponentCount();
        for (int i=0;i<compcount;i++){
            Component comp=getContentPane().getComponent(i);
            if (comp != Buttonpower){
                comp.setEnabled(false);            
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton18 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        Buttonaf = new javax.swing.JButton();
        Buttonplus = new javax.swing.JButton();
        Buttonpol = new javax.swing.JButton();
        Buttondier = new javax.swing.JButton();
        Buttonpower = new javax.swing.JButton();
        Buttontel = new javax.swing.JButton();
        Buttonison = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();

        jButton18.setText("jButton18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Button1.setText("1");
        Button1.setEnabled(false);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button1, gridBagConstraints);

        Button2.setText("2");
        Button2.setEnabled(false);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button2, gridBagConstraints);

        Button3.setText("3");
        Button3.setEnabled(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button3, gridBagConstraints);

        Button4.setText("4");
        Button4.setEnabled(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button4, gridBagConstraints);

        Button5.setText("5");
        Button5.setEnabled(false);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button5, gridBagConstraints);

        Button6.setText("6");
        Button6.setEnabled(false);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button6, gridBagConstraints);

        Button7.setText("7");
        Button7.setEnabled(false);
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button7, gridBagConstraints);

        Button8.setText("8");
        Button8.setEnabled(false);
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button8, gridBagConstraints);

        Button9.setText("9");
        Button9.setEnabled(false);
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button9, gridBagConstraints);

        Button0.setText("0");
        Button0.setEnabled(false);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Button0, gridBagConstraints);

        ButtonC.setForeground(new java.awt.Color(255, 0, 0));
        ButtonC.setText("C");
        ButtonC.setEnabled(false);
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(ButtonC, gridBagConstraints);

        Buttonaf.setForeground(new java.awt.Color(255, 0, 0));
        Buttonaf.setText("-");
        Buttonaf.setEnabled(false);
        Buttonaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonafActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Buttonaf, gridBagConstraints);

        Buttonplus.setForeground(new java.awt.Color(255, 0, 0));
        Buttonplus.setText("+");
        Buttonplus.setEnabled(false);
        Buttonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonplusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Buttonplus, gridBagConstraints);

        Buttonpol.setForeground(new java.awt.Color(255, 0, 0));
        Buttonpol.setText("*");
        Buttonpol.setEnabled(false);
        Buttonpol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpolActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Buttonpol, gridBagConstraints);

        Buttondier.setForeground(new java.awt.Color(255, 0, 0));
        Buttondier.setText("/");
        Buttondier.setEnabled(false);
        Buttondier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtondierActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Buttondier, gridBagConstraints);

        Buttonpower.setForeground(new java.awt.Color(255, 0, 0));
        Buttonpower.setText("POWER");
        Buttonpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpowerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        getContentPane().add(Buttonpower, gridBagConstraints);

        Buttontel.setForeground(new java.awt.Color(255, 0, 0));
        Buttontel.setText(".");
        Buttontel.setEnabled(false);
        Buttontel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtontelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Buttontel, gridBagConstraints);

        Buttonison.setForeground(new java.awt.Color(255, 0, 0));
        Buttonison.setText("=");
        Buttonison.setEnabled(false);
        Buttonison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonisonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(Buttonison, gridBagConstraints);

        TextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(TextField, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ButtonpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpowerActionPerformed
    int compcount = getContentPane().getComponentCount();
    for (int i=0;i<compcount;i++){
        Component comp=getContentPane().getComponent(i);
        if (comp != Buttonpower){
            comp.setEnabled(!comp.isEnabled());            
        }
    }
    // TODO add your handling code here:
}//GEN-LAST:event_ButtonpowerActionPerformed

private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
    TextField.setText(TextField.getText()+"7");
}//GEN-LAST:event_Button7ActionPerformed

private void ButtontelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtontelActionPerformed
    if (dotflag == false){
        TextField.setText(TextField.getText()+".");
        dotflag = true;
    }
}//GEN-LAST:event_ButtontelActionPerformed

private void ButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonplusActionPerformed
    number1=Double.valueOf(TextField.getText());
    TextField.setText("");
    Buttontel.setEnabled(true);
    sign="add";
}//GEN-LAST:event_ButtonplusActionPerformed

private void ButtonafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonafActionPerformed
    number1=Double.valueOf(TextField.getText());
    TextField.setText("");
    Buttontel.setEnabled(true);
    sign="minus";
}//GEN-LAST:event_ButtonafActionPerformed

private void ButtonpolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpolActionPerformed
    number1=Double.valueOf(TextField.getText());
    TextField.setText("");
    Buttontel.setEnabled(true);
    sign="times";
}//GEN-LAST:event_ButtonpolActionPerformed

private void ButtondierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtondierActionPerformed
    number1=Double.valueOf(TextField.getText());
    TextField.setText("");
    Buttontel.setEnabled(true);
    sign="divide";
}//GEN-LAST:event_ButtondierActionPerformed

private void ButtonisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonisonActionPerformed
    String temp = TextField.getText();
    if (temp.isEmpty()){
        if (number1 !=0){
            TextField.setText(String.valueOf(number1));
        }else if(number1==0){
            TextField.setText("0.0");
        }
    }else{
        number2=Double.valueOf(temp);
        if (sign.contentEquals("add")) result=number1 + number2;
        else if (sign.contentEquals("minus")) result=number1 - number2;
        else if (sign.contentEquals("times")) result=number1 * number2;
        else if (sign.contentEquals("divide")) {
            if (number2!=0){
                result=number1/number2;
            }
            else{
                errorflag = true;
            }
        }
        if (errorflag ==false){
            resulttext=String.valueOf(result);
            TextField.setText(resulttext);
        }else TextField.setText("ERROR");
    }
}//GEN-LAST:event_ButtonisonActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        TextField.setText(TextField.getText()+"8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        TextField.setText(TextField.getText()+"0");
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        TextField.setText(TextField.getText()+"1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
         TextField.setText(TextField.getText()+"2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        TextField.setText(TextField.getText()+"3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        TextField.setText(TextField.getText()+"4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        TextField.setText(TextField.getText()+"5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        TextField.setText(TextField.getText()+"6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        TextField.setText(TextField.getText()+"9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        TextField.setText("");
        Buttontel.setEnabled(true);
        errorflag=false;
        number1=0;
        number2=0;
        result=0;
    }//GEN-LAST:event_ButtonCActionPerformed


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
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calculator1().setVisible(true);
            }
        });
    }
    
    
    double number1=0;
    double number2=0; 
    double result;
    String sign=null;
    boolean dotflag=false; 
    boolean errorflag=false;
    String resulttext="                  ";
    String temp ;
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton Buttonaf;
    private javax.swing.JButton Buttondier;
    private javax.swing.JButton Buttonison;
    private javax.swing.JButton Buttonplus;
    private javax.swing.JButton Buttonpol;
    private javax.swing.JButton Buttonpower;
    private javax.swing.JButton Buttontel;
    private javax.swing.JTextField TextField;
    private javax.swing.JButton jButton18;
    // End of variables declaration//GEN-END:variables
}
