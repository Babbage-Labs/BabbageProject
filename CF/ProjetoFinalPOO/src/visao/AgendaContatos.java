package visao;

import controle.ContatoControle;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.Tabela;




public class AgendaContatos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AgendaContatos.class.getName());
    ImageIcon imagemGato = new ImageIcon("gato.png"); 
    JTable tabela;
    DefaultTableModel modelo = new DefaultTableModel();
    
    Tabela utilTabela = new Tabela();

    
    public AgendaContatos() {
        
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        habilitaBotoes(true);
        habilitaForm(false);
        criarTabela();
        consultaVisao();
        
        jtfbarrapesquisa.addKeyListener(
                new KeyAdapter(){
                    public void keyReleased(KeyEvent e){
                        consultaVisao();
                    }
                }
        );
        
        tabela.addMouseListener(
                new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        atualizarForm();
                        jbModificar.setEnabled(true);
                        jbExcluir.setEnabled(true);
                    }
                }
        );
        
        labelPic.setIcon(imagemGato);
        labelPic.setText("");
       
    }
    
    public void salvarVisao(){
        contatocontrole.salvarControle(jtaID.getText(), jtaNome1.getText(), jtaNome2.getText(), jtaTel.getText(), jtaEmail.getText());
    }
    
    ContatoControle contatocontrole = new ContatoControle();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtaNome1 = new javax.swing.JTextField();
        jtaNome2 = new javax.swing.JTextField();
        jtaTel = new javax.swing.JTextField();
        jtaEmail = new javax.swing.JTextField();
        jtaID = new javax.swing.JTextField();
        jlNid = new java.awt.Label();
        labelPic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbAdicionar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jtfbarrapesquisa = new javax.swing.JTextField();
        jLabelpesquisa = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jlabelAgenda = new java.awt.Label();
        BtVoltar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 620));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jbSalvar.setBackground(new java.awt.Color(204, 51, 255));
        jbSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jbSalvar.setText("Salvar");
        jbSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalvar.addActionListener(this::jbSalvarActionPerformed);

        jbCancelar.setBackground(new java.awt.Color(204, 51, 255));
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("Cancelar");
        jbCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCancelar.addActionListener(this::jbCancelarActionPerformed);

        jtaNome1.setBackground(new java.awt.Color(102, 102, 102));
        jtaNome1.setForeground(new java.awt.Color(51, 51, 51));
        jtaNome1.setText("Nome");
        jtaNome1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jtaNome1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtaNome1.setSelectionColor(new java.awt.Color(204, 0, 255));
        jtaNome1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaNome1FocusGained(evt);
            }
        });
        jtaNome1.addActionListener(this::jtaNome1ActionPerformed);

        jtaNome2.setBackground(new java.awt.Color(102, 102, 102));
        jtaNome2.setForeground(new java.awt.Color(51, 51, 51));
        jtaNome2.setText("Sobrenome");
        jtaNome2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jtaNome2.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtaNome2.setSelectionColor(new java.awt.Color(204, 0, 255));
        jtaNome2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaNome2FocusGained(evt);
            }
        });
        jtaNome2.addActionListener(this::jtaNome2ActionPerformed);

        jtaTel.setBackground(new java.awt.Color(102, 102, 102));
        jtaTel.setForeground(new java.awt.Color(51, 51, 51));
        jtaTel.setText("Telefone");
        jtaTel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jtaTel.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtaTel.setSelectionColor(new java.awt.Color(204, 0, 255));
        jtaTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaTelFocusGained(evt);
            }
        });
        jtaTel.addActionListener(this::jtaTelActionPerformed);

        jtaEmail.setBackground(new java.awt.Color(102, 102, 102));
        jtaEmail.setForeground(new java.awt.Color(51, 51, 51));
        jtaEmail.setText("Endereço e-mail");
        jtaEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jtaEmail.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jtaEmail.setSelectionColor(new java.awt.Color(204, 0, 255));
        jtaEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaEmailFocusGained(evt);
            }
        });
        jtaEmail.addActionListener(this::jtaEmailActionPerformed);

        jtaID.setEditable(false);
        jtaID.setBackground(new java.awt.Color(102, 102, 102));
        jtaID.setForeground(new java.awt.Color(51, 51, 51));
        jtaID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtaID.setText("0");
        jtaID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtaID.addActionListener(this::jtaIDActionPerformed);

        jlNid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlNid.setForeground(new java.awt.Color(255, 51, 255));
        jlNid.setText("ID do contato:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtaNome2)
                            .addComponent(jtaEmail)
                            .addComponent(jtaTel)
                            .addComponent(jtaNome1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlNid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jtaID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jtaNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtaNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtaTel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtaID)
                    .addComponent(jlNid, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jbAdicionar.setBackground(new java.awt.Color(204, 51, 255));
        jbAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jbAdicionar.setText("Adicionar");
        jbAdicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAdicionar.addActionListener(this::jbAdicionarActionPerformed);

        jbModificar.setBackground(new java.awt.Color(204, 51, 255));
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificar.addActionListener(this::jbModificarActionPerformed);

        jbExcluir.setBackground(new java.awt.Color(204, 51, 255));
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setText("Excluir");
        jbExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbExcluir.addActionListener(this::jbExcluirActionPerformed);

        jtfbarrapesquisa.setBackground(new java.awt.Color(121, 63, 144));
        jtfbarrapesquisa.setForeground(new java.awt.Color(217, 141, 234));
        jtfbarrapesquisa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jtfbarrapesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfbarrapesquisaFocusGained(evt);
            }
        });
        jtfbarrapesquisa.addActionListener(this::jtfbarrapesquisaActionPerformed);

        jLabelpesquisa.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabelpesquisa.setForeground(new java.awt.Color(255, 102, 255));
        jLabelpesquisa.setText("Pesquisar contato");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfbarrapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelpesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfbarrapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jlabelAgenda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlabelAgenda.setForeground(new java.awt.Color(204, 51, 255));
        jlabelAgenda.setText("Agenda de Contatos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        BtVoltar.setBackground(new java.awt.Color(78, 78, 78));
        BtVoltar.setForeground(new java.awt.Color(153, 153, 153));
        BtVoltar.setText("Voltar");
        BtVoltar.setBorderPainted(false);
        BtVoltar.addActionListener(this::BtVoltarActionPerformed);

        Sair.setBackground(new java.awt.Color(78, 78, 78));
        Sair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Sair.setForeground(new java.awt.Color(153, 153, 153));
        Sair.setText("Sair");
        Sair.setBorderPainted(false);
        Sair.addActionListener(this::SairActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(BtVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtVoltar)
                    .addComponent(Sair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvarVisao();
        habilitaBotoes(true);
        habilitaForm(false);
        padraoCamposTexto();
        consultaVisao();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitaBotoes(true);
        habilitaForm(false);
        padraoCamposTexto();
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtaNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaNome1ActionPerformed

    }//GEN-LAST:event_jtaNome1ActionPerformed

    private void jtaNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaNome2ActionPerformed

    private void jtaTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaTelActionPerformed

    private void jtaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaEmailActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        habilitaBotoes(false);
        habilitaForm(true);
        padraoCamposTexto();
        jtaNome1.requestFocus();
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        habilitaBotoes(false);
        habilitaForm(true);
        jtaNome1.requestFocus();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Você realmente quer excluir esse contato?", "Deletar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            excluirVisao();
            padraoCamposTexto();
            consultaVisao();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaIDActionPerformed

    private void jtaNome1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaNome1FocusGained
        
        jtaNome1.setForeground(Color.lightGray);
    }//GEN-LAST:event_jtaNome1FocusGained

    private void jtaNome2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaNome2FocusGained
        
        jtaNome2.setForeground(Color.lightGray);
    }//GEN-LAST:event_jtaNome2FocusGained

    private void jtaTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaTelFocusGained
        
        jtaTel.setForeground(Color.lightGray);
    }//GEN-LAST:event_jtaTelFocusGained

    private void jtaEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaEmailFocusGained
        
        jtaEmail.setForeground(Color.lightGray);
    }//GEN-LAST:event_jtaEmailFocusGained

    private void jtfbarrapesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfbarrapesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfbarrapesquisaActionPerformed

    private void jtfbarrapesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfbarrapesquisaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfbarrapesquisaFocusGained

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

 
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> new AgendaContatos().setVisible(true));
    }
    
    private void habilitaBotoes(boolean estado){
        jbAdicionar.setEnabled(estado);
        
        jbSalvar.setEnabled(!estado);
        jbCancelar.setEnabled(!estado);
        
        jbModificar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }
    
    private void habilitaForm(boolean estado){
        
        jtaNome1.setEnabled(estado);
        jtaNome2.setEnabled(estado);
        jtaTel.setEnabled(estado);
        jtaEmail.setEnabled(estado);
    }
    
    private void padraoCamposTexto(){
        jtaNome1.setText("Nome");
        jtaNome2.setText("Sobrenome ");
        jtaTel.setText("Telefone");
        jtaEmail.setText("Endereço e-mail");
        jtaID.setText("0");
        
    }
    
    private void menuHome(){
        //Home tela = new Home();
        //tela.setVisible(true);
        dispose();
    }
    
    private void menuCM(){
        //ConversordeMoedas tela = new ConversordeMoedas();
        //tela.setVisible(true);
        dispose();
        
    }
    
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jPanel1,
                new Object [] {3 ,30, 30, 36, 150},
                new Object [] {"centro","centro", "centro", "centro", "centro"},
                new Object [] {"ID","Nome", "Sobrenome", "Telefone", "Email"}
        );
        
        modelo = (DefaultTableModel) tabela.getModel();
        tabela.setDefaultEditor(Object.class, null);
        
    }
    
    public void consultaVisao(){
        modelo.setNumRows(0);
        contatocontrole.consultaControle(jtfbarrapesquisa.getText(), modelo);
        
        
}
    
    public void atualizarForm(){
        jtaID.setText( (String) tabela.getValueAt(tabela.getSelectedRow(), 0 ).toString());
        jtaNome1.setText( (String) tabela.getValueAt(tabela.getSelectedRow(), 1 ).toString());
        jtaNome2.setText( (String) tabela.getValueAt(tabela.getSelectedRow(), 2 ).toString());
        jtaTel.setText( (String) tabela.getValueAt(tabela.getSelectedRow(), 3 ).toString());
        jtaEmail.setText( (String) tabela.getValueAt(tabela.getSelectedRow(), 4 ).toString());
        
    }
    
    public void excluirVisao(){
        contatocontrole.excluirControle(Integer.parseInt(jtaID.getText()));
    }
    

    
    
    

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtVoltar;
    private javax.swing.JButton Sair;
    private java.awt.Label jLabelpesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalvar;
    private java.awt.Label jlNid;
    private java.awt.Label jlabelAgenda;
    private javax.swing.JTextField jtaEmail;
    private javax.swing.JTextField jtaID;
    private javax.swing.JTextField jtaNome1;
    private javax.swing.JTextField jtaNome2;
    private javax.swing.JTextField jtaTel;
    private javax.swing.JTextField jtfbarrapesquisa;
    private javax.swing.JLabel labelPic;
    // End of variables declaration//GEN-END:variables
}
