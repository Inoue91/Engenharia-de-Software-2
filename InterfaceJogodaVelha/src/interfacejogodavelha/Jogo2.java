/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejogodavelha;

import javax.swing.JOptionPane;
/**
 *
 * @author Talita-csl
 */
public class Jogo2 extends javax.swing.JFrame {

    /**
     * Creates new form Jogo2
     */
    public Jogo2() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        TF3 = new javax.swing.JTextField();
        TF5 = new javax.swing.JTextField();
        TF6 = new javax.swing.JTextField();
        TF7 = new javax.swing.JTextField();
        TF8 = new javax.swing.JTextField();
        TF9 = new javax.swing.JTextField();
        TF4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Player 1");

        jLabel2.setText("X");

        jLabel3.setText("Player 2");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF1MousePressed(evt);
            }
        });
        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });

        TF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF2MousePressed(evt);
            }
        });
        TF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF2ActionPerformed(evt);
            }
        });

        TF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF3MousePressed(evt);
            }
        });
        TF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF3ActionPerformed(evt);
            }
        });

        TF5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF5MousePressed(evt);
            }
        });
        TF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF5ActionPerformed(evt);
            }
        });

        TF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF6MousePressed(evt);
            }
        });
        TF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF6ActionPerformed(evt);
            }
        });

        TF7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF7MousePressed(evt);
            }
        });
        TF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF7ActionPerformed(evt);
            }
        });

        TF8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF8MousePressed(evt);
            }
        });
        TF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF8ActionPerformed(evt);
            }
        });

        TF9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF9MousePressed(evt);
            }
        });
        TF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF9ActionPerformed(evt);
            }
        });

        TF4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TF4MousePressed(evt);
            }
        });
        TF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(TF1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TF4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TF8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(TF5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(TF9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Variaveis v = new Variaveis();
    
    private void CheckWin(){
    String aux1, aux2, aux3;
    String aux4, aux5, aux6;
    String aux7, aux8, aux9;
    
    aux1 = TF1.getText(); aux2 = TF2.getText(); aux3 = TF3.getText();
    aux4 = TF4.getText(); aux5 = TF5.getText(); aux6 = TF6.getText();
    aux7 = TF7.getText(); aux8 = TF8.getText(); aux9 = TF9.getText();
    
    //CHECK PARA JOGADOR X
        if(aux1.equals(v.xis) && aux2.equals(v.xis) && aux3.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux1.equals(v.xis) && aux4.equals(v.xis) && aux7.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux1.equals(v.xis) && aux5.equals(v.xis) && aux9.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux2.equals(v.xis) && aux5.equals(v.xis) && aux8.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux3.equals(v.xis) && aux6.equals(v.xis) && aux9.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux3.equals(v.xis) && aux5.equals(v.xis) && aux7.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux4.equals(v.xis) && aux5.equals(v.xis) && aux6.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux7.equals(v.xis) && aux8.equals(v.xis) && aux9.equals(v.xis)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        
    // CHECK PARA JOGADOR O
        else if(aux1.equals(v.bolinha) && aux2.equals(v.bolinha) && aux3.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux1.equals(v.bolinha) && aux4.equals(v.bolinha) && aux7.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux1.equals(v.bolinha) && aux5.equals(v.bolinha) && aux9.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux2.equals(v.bolinha) && aux5.equals(v.bolinha) && aux8.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux3.equals(v.bolinha) && aux6.equals(v.bolinha) && aux9.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux3.equals(v.bolinha) && aux5.equals(v.bolinha) && aux7.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux4.equals(v.bolinha) && aux5.equals(v.bolinha) && aux6.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        else if(aux7.equals(v.bolinha) && aux8.equals(v.bolinha) && aux9.equals(v.bolinha)){
            JOptionPane.showMessageDialog(null, "Player n Ganhou");
            System.exit(0);
        }
        
    }
    
    private void TF1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF1MousePressed
        // TODO add your handling code here:
        if(TF1.getText().trim().equals("")){
            if(v.x > v.o){
                TF1.setText(v.bolinha);
                v.o++;
            }
            else{
                TF1.setText(v.xis);
                v.x++;
                System.out.println(v.x);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF1MousePressed

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

    private void TF2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF2MousePressed
        // TODO add your handling code here:
        if(TF2.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF2.setText(v.bolinha);
                v.o++;
            }
            else{
                TF2.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF2MousePressed

    private void TF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF2ActionPerformed

    private void TF3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF3MousePressed
        // TODO add your handling code here:
        if(TF3.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF3.setText(v.bolinha);
                v.o++;
            }
            else{
                TF3.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF3MousePressed

    private void TF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF3ActionPerformed

    private void TF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF5ActionPerformed

    private void TF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF6ActionPerformed

    private void TF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF7ActionPerformed

    private void TF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF8ActionPerformed

    private void TF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF9ActionPerformed

    private void TF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF4ActionPerformed

    private void TF4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF4MousePressed
        // TODO add your handling code here:
        if(TF4.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF4.setText(v.bolinha);
                v.o++;
            }
            else{
                TF4.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF4MousePressed

    private void TF5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF5MousePressed
        // TODO add your handling code here:
        if(TF5.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF5.setText(v.bolinha);
                v.o++;
            }
            else{
                TF5.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF5MousePressed

    private void TF6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF6MousePressed
        // TODO add your handling code here:
        if(TF6.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF6.setText(v.bolinha);
                v.o++;
            }
            else{
                TF6.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF6MousePressed

    private void TF7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF7MousePressed
        // TODO add your handling code here:
        if(TF7.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF7.setText(v.bolinha);
                v.o++;
            }
            else{
                TF7.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF7MousePressed

    private void TF8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF8MousePressed
        // TODO add your handling code here:
        if(TF8.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF8.setText(v.bolinha);
                v.o++;
            }
            else{
                TF8.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF8MousePressed

    private void TF9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF9MousePressed
        // TODO add your handling code here:
        if(TF9.getText().trim().equals("")){
            System.out.println(v.x);
            if(v.x > v.o){
                TF9.setText(v.bolinha);
                v.o++;
            }
            else{
                TF9.setText(v.xis);
                v.x++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você não pode inserir aqui. Escolha outro campo");
        }
        CheckWin();
    }//GEN-LAST:event_TF9MousePressed

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
            java.util.logging.Logger.getLogger(Jogo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Jogo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JTextField TF4;
    private javax.swing.JTextField TF5;
    private javax.swing.JTextField TF6;
    private javax.swing.JTextField TF7;
    private javax.swing.JTextField TF8;
    private javax.swing.JTextField TF9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
