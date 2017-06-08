package telas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaInicial extends javax.swing.JFrame {
    public int quantidade = 0;
    TelaCadastro tela;
    public TelaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radio2 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio8 = new javax.swing.JRadioButton();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/jogodavelha.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Campeonato Jogo da Velha");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Instruções:");

        grupo1.add(radio2);
        radio2.setText("2");

        grupo1.add(radio4);
        radio4.setText("4");

        grupo1.add(radio8);
        radio8.setText("8");

        btnIniciar.setText("Novo Jogo");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Um usuário deverá selecionar a quantida de jogadores que participarão do campeonato.O sistema gera as duplas jogadoras.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Quantidade de Jogadores :");

        jButton1.setText("Carregar Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("O jogo da velha é conduzido por meio do teclado numérico, e cada posição é representada por um numero de 1 a 9 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radio4)
                                .addGap(187, 187, 187)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radio8)
                            .addComponent(btnIniciar))
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio4)
                    .addComponent(radio8)
                    .addComponent(radio2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        File file = new File("entrada.txt");
        file.delete();      
        
        File file2 = new File("ganhador.txt");
        file2.delete();
        
        File file3 = new File("perdedor.txt");
        file3.delete();
        
        if(tela == null){
            try {
                tela = new TelaCadastro();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
                
                if(radio2.isSelected()){
                    quantidade = 2;
                    tela.abrir(radio2.getText());
                }
                else if(radio4.isSelected()){
                    quantidade = 4;
                    tela.abrir(radio4.getText());
                }
                else if(radio8.isSelected()){
                    quantidade = 8;
                    tela.abrir(radio8.getText());
                }
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Jogo2 jogo = new Jogo2();
        try {
            if (quantidadeArquivo() != 0){
                jogo.abrirPlayer1(lerJogador(0));
                jogo.abrirPlayer2(lerJogador(1));
            }
            else{
                jogo.abrirPlayer1(lerGanhador(0));
                jogo.abrirPlayer2(lerGanhador(1));
            }
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        jogo.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
    public void abrir(String quantidade){
        TelaCadastro s = new TelaCadastro(quantidade);
        s.setVisible(true);
    }
    public String lerJogador(int i) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("entrada.txt");
        BufferedReader br = new BufferedReader(fr);
        List lista = new ArrayList();
        
        String linha = br.readLine();
        
        if(linha == null){
            FileReader fr2 = new FileReader("ganhador.txt");
            BufferedReader br2 = new BufferedReader(fr2);
            String linha2 = br2.readLine();
            while(linha2 != null){
                lista.add(linha2);
                linha2 = br.readLine();
            }
        }
        while(linha != null){
            lista.add(linha);
            linha = br.readLine();
        }
        Iterator it = lista.iterator();
        return lista.get(i).toString();
    }
     public String lerGanhador(int i) throws FileNotFoundException, IOException{
            FileReader fr = new FileReader("ganhador.txt");
            BufferedReader br = new BufferedReader(fr);
            List lista = new ArrayList();
            String mensagem = "Fim";
        String linha = br.readLine();
        
        while(linha != null){
            lista.add(linha);
            linha = br.readLine();
        }
        Iterator it = lista.iterator();
        if(it == null)
            return mensagem;
        else
            return lista.get(i).toString();
    }
    public int quantidadeArquivo() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("entrada.txt");
        BufferedReader br = new BufferedReader(fr);
        int num = 0;
        String linha = br.readLine();
       
        while(linha != null){
            num+=1;
            linha = br.readLine();
        }
        return num;
    }
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio8;
    // End of variables declaration//GEN-END:variables
}
