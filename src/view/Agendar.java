package view;

import model.Agendamento;
import dao.AgendaDao;
import javax.swing.JOptionPane;


public class Agendar extends javax.swing.JFrame {

  
    public Agendar() {
        initComponents();
    }
    
    public void limparTodos(){
        txtEspecialidade.setText("");
        txtData.setText("");
        txtHora.setText("");
        rbtnConsulta.setSelected(false);
        rbtnExame.setSelected(false);
        rbtnCartao.setSelected(false);
        rbtnDinheiro.setSelected(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("hospital?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        medicoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Medico m");
        medicoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : medicoQuery.getResultList();
        medicoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Medico m");
        medicoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : medicoQuery1.getResultList();
        pacienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paciente p");
        pacienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacienteQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelEspecialidades = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtnExame = new javax.swing.JRadioButton();
        rbtnConsulta = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbtnDinheiro = new javax.swing.JRadioButton();
        rbtnCartao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        txtMedicos = new javax.swing.JLabel();
        nomeMedicos = new javax.swing.JComboBox<>();
        txtEspecialidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JFormattedTextField();
        txtHora = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Agendamento");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("     Agendar");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        labelEspecialidades.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelEspecialidades.setText("Especialidade");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Pagamento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Data");

        rbtnExame.setBackground(new java.awt.Color(255, 255, 255));
        rbtnExame.setText("Exame");
        rbtnExame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnExameMouseClicked(evt);
            }
        });
        rbtnExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnExameActionPerformed(evt);
            }
        });

        rbtnConsulta.setBackground(new java.awt.Color(255, 255, 255));
        rbtnConsulta.setText("Consulta");
        rbtnConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnConsultaMouseClicked(evt);
            }
        });
        rbtnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsultaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(" Hora");

        rbtnDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        rbtnDinheiro.setText("Dinheiro");
        rbtnDinheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnDinheiroMouseClicked(evt);
            }
        });
        rbtnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDinheiroActionPerformed(evt);
            }
        });

        rbtnCartao.setBackground(new java.awt.Color(255, 255, 255));
        rbtnCartao.setText("Cartao");
        rbtnCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnCartaoMouseClicked(evt);
            }
        });
        rbtnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCartaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("  Tipo");

        btnAgendar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        txtMedicos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMedicos.setText("Medico");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, medicoList1, nomeMedicos);
        bindingGroup.addBinding(jComboBoxBinding);

        nomeMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeMedicosActionPerformed(evt);
            }
        });

        txtEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Paciente:");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pacienteList, cbPaciente);
        bindingGroup.addBinding(jComboBoxBinding);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setText("  /  / ");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbtnConsulta)
                            .addComponent(rbtnExame))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtnCartao)
                                        .addComponent(rbtnDinheiro))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEspecialidades)
                        .addGap(18, 18, 18)
                        .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnAgendar)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEspecialidades)
                    .addComponent(txtMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtnExame)
                    .addComponent(jLabel3)
                    .addComponent(rbtnDinheiro))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnConsulta)
                    .addComponent(rbtnCartao))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnExameActionPerformed
        String opcaoSelecionada = "Exame";   // TODO add your handling code here:
    }//GEN-LAST:event_rbtnExameActionPerformed

    private void rbtnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsultaActionPerformed
        String opcaoSelecionada = "Consulta";  // TODO add your handling code here:
    }//GEN-LAST:event_rbtnConsultaActionPerformed

    private void rbtnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDinheiroActionPerformed
        String opcaoSelecionada = "Dinheiro";        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnDinheiroActionPerformed

    private void rbtnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCartaoActionPerformed
        String opcaoSelecionada = "cartao";  // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCartaoActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed

        if (txtMedicos.getText().isEmpty() || txtEspecialidade.getText().isEmpty() || txtData.getText().isEmpty() || txtHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {

            String medicos = nomeMedicos.getSelectedItem().toString();
            String especialidade = txtEspecialidade.getText();
            String tipo;
            if(rbtnExame.isSelected() == true){
                tipo = "Exame";
            }else{
                tipo = "Consulta";
            }
            String data = txtData.getText();
            String hora = txtHora.getText();
            String pagamento;
            if(rbtnCartao.isSelected() == true){
                pagamento= "Cartão";
            }else{
                pagamento = "Dinheiro";
            }
            String paciente = cbPaciente.getSelectedItem().toString();

            Agendamento agendar = new Agendamento(medicos, especialidade, tipo, data, hora, pagamento, paciente);
            
            AgendaDao dao = new AgendaDao();
            dao.cadastrarAgendamento(agendar);
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            limparTodos();
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void nomeMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeMedicosActionPerformed
              
                             
    }//GEN-LAST:event_nomeMedicosActionPerformed

    private void txtEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadeActionPerformed

    }//GEN-LAST:event_txtEspecialidadeActionPerformed

    private void rbtnExameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnExameMouseClicked
       rbtnExame.setSelected(true);
        rbtnConsulta.setSelected(false);
    }//GEN-LAST:event_rbtnExameMouseClicked

    private void rbtnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnConsultaMouseClicked
        rbtnExame.setSelected(false);
        rbtnConsulta.setSelected(true);
    }//GEN-LAST:event_rbtnConsultaMouseClicked

    private void rbtnDinheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnDinheiroMouseClicked
        rbtnCartao.setSelected(false);
        rbtnDinheiro.setSelected(true);
    }//GEN-LAST:event_rbtnDinheiroMouseClicked

    private void rbtnCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnCartaoMouseClicked
        rbtnCartao.setSelected(true);
        rbtnDinheiro.setSelected(false);
    }//GEN-LAST:event_rbtnCartaoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

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
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbPaciente;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEspecialidades;
    private java.util.List<util.Medico> medicoList;
    private java.util.List<util.Medico> medicoList1;
    private javax.persistence.Query medicoQuery;
    private javax.persistence.Query medicoQuery1;
    private javax.swing.JComboBox<String> nomeMedicos;
    private java.util.List<util.Paciente> pacienteList;
    private javax.persistence.Query pacienteQuery;
    private javax.swing.JRadioButton rbtnCartao;
    private javax.swing.JRadioButton rbtnConsulta;
    private javax.swing.JRadioButton rbtnDinheiro;
    private javax.swing.JRadioButton rbtnExame;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JLabel txtMedicos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
