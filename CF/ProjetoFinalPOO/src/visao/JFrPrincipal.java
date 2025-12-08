package visao;


import javax.swing.JOptionPane;
import visao.TelaPrincipal;

public class JFrPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrPrincipal.class.getName());

    public JFrPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TxtConversorDeMoedas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoConvertido = new javax.swing.JTextField();
        TxtConvertaMoeda = new javax.swing.JLabel();
        BtLimpar = new javax.swing.JButton();
        BtConverter = new javax.swing.JButton();
        BoxMoeda = new javax.swing.JComboBox<>();
        TxtValoConvertido = new javax.swing.JLabel();
        CampoValor = new javax.swing.JTextField();
        BtLimpar2 = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 251, 148));

        TxtConversorDeMoedas.setBackground(new java.awt.Color(153, 153, 255));
        TxtConversorDeMoedas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TxtConversorDeMoedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtConversorDeMoedas.setText("Conversor De Moedas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(TxtConversorDeMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtConversorDeMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 251, 148));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Digite um Valor:");

        CampoConvertido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        TxtConvertaMoeda.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TxtConvertaMoeda.setForeground(new java.awt.Color(255, 251, 148));
        TxtConvertaMoeda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtConvertaMoeda.setText("Converta Moeda:");

        BtLimpar.setBackground(new java.awt.Color(204, 204, 204));
        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        BtConverter.setBackground(new java.awt.Color(204, 204, 204));
        BtConverter.setText("Converter");
        BtConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConverterActionPerformed(evt);
            }
        });

        BoxMoeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar para Reais", "Euro para Reais", "Peso Argentino para Reais", "Reais para Dólar", "Reais para Euro", "Reais para Peso Argentino" }));

        TxtValoConvertido.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TxtValoConvertido.setForeground(new java.awt.Color(255, 251, 148));
        TxtValoConvertido.setText("Valor Convertido:");

        BtLimpar2.setBackground(new java.awt.Color(204, 204, 204));
        BtLimpar2.setText("Limpar");
        BtLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpar2ActionPerformed(evt);
            }
        });

        BtSair.setBackground(new java.awt.Color(78, 78, 78));
        BtSair.setForeground(new java.awt.Color(153, 153, 153));
        BtSair.setText("Sair");
        BtSair.setBorderPainted(false);
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        BtVoltar.setBackground(new java.awt.Color(78, 78, 78));
        BtVoltar.setForeground(new java.awt.Color(153, 153, 153));
        BtVoltar.setText("Voltar");
        BtVoltar.setBorderPainted(false);
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtConvertaMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtLimpar))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtValoConvertido)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(CampoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtLimpar2))
                                .addComponent(BtConverter)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtConvertaMoeda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtLimpar)
                    .addComponent(BoxMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtConverter)
                .addGap(54, 54, 54)
                .addComponent(TxtValoConvertido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtLimpar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSair)
                    .addComponent(BtVoltar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        CampoValor.setText(null);
    }//GEN-LAST:event_BtLimparActionPerformed

    private void BtLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpar2ActionPerformed
        CampoConvertido.setText(null);
    }//GEN-LAST:event_BtLimpar2ActionPerformed

    private void BtConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConverterActionPerformed
       
        Double reais, euro, peso, dolar;
        
        if (CampoValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + "O Campo está vazio!", "Dados inválidos", JOptionPane.WARNING_MESSAGE);
            CampoValor.requestFocus();
            return;
        }
        
        String BoxV = (String)BoxMoeda.getSelectedItem();
        
        if (BoxV.equals("Dólar para Reais")) {
        
        dolar = Double.parseDouble(CampoValor.getText());
        reais = (dolar * 5.27);
        
        CampoConvertido.setText(String.valueOf(reais));
        }
        
        if (BoxV.equals("Euro para Reais")) {
        
        euro = Double.parseDouble(CampoValor.getText());
        reais = (euro * 6.12);
        
        CampoConvertido.setText(String.valueOf(reais));
        }
        
        if (BoxV.equals("Peso Argentino para Reais")) {
        
        peso = Double.parseDouble(CampoValor.getText());
        reais = (peso * 0.0038);
        
        CampoConvertido.setText(String.valueOf(reais));
        }
        
        if (BoxV.equals("Reais para Dólar")) {
        
        reais = Double.parseDouble(CampoValor.getText());
        dolar = (reais * 0.19);
        
        CampoConvertido.setText(String.valueOf(dolar));
        }
        
        if (BoxV.equals("Reais para Euro")) {
        
        reais = Double.parseDouble(CampoValor.getText());
        euro = (reais * 0.16);
        
        CampoConvertido.setText(String.valueOf(euro));
        }
        
        if (BoxV.equals("Reais para peso Argentino")) {
        
        reais = Double.parseDouble(CampoValor.getText());
        peso = (reais * 266.13);
        
        CampoConvertido.setText(String.valueOf(peso));
        }
    }//GEN-LAST:event_BtConverterActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true); 
            dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new JFrPrincipal().setVisible(true);
         }
        });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxMoeda;
    private javax.swing.JButton BtConverter;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtLimpar2;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JTextField CampoConvertido;
    private javax.swing.JTextField CampoValor;
    private javax.swing.JLabel TxtConversorDeMoedas;
    private javax.swing.JLabel TxtConvertaMoeda;
    private javax.swing.JLabel TxtValoConvertido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
