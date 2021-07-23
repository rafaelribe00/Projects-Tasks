/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import backend.Projetos;
import backend.Sistema;
import backend.Tarefas;
import backend.Users;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marga
 */
public class CriarTarefa extends javax.swing.JFrame {

    private Sistema sistema;
    private Projetos projeto;
    /**
     * Creates new form CriarTarefa
     */
    public CriarTarefa(Sistema sistema, Projetos p) {
        initComponents();
        this.sistema = sistema;
        this.projeto = p;
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
        nometarefa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        dataf = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nova Tarefa");

        jPanel1.setBackground(new java.awt.Color(1, 75, 84));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Criar Nova Tarefa:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 126, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nome da Tarefa:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 93, 14);

        nometarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometarefaActionPerformed(evt);
            }
        });
        jPanel1.add(nometarefa);
        nometarefa.setBounds(10, 61, 161, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Descrição:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 40, 59, 14);

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 60, 224, 96);

        jButton1.setBackground(new java.awt.Color(0, 64, 65));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Associar Utilizador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 170, 160, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Estado:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 100, 43, 14);

        jButton3.setBackground(new java.awt.Color(0, 64, 65));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 210, 90, 23);

        jButton2.setBackground(new java.awt.Color(0, 64, 65));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Criar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 210, 60, 23);

        jComboBox2.setBackground(new java.awt.Color(0, 64, 65));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(240, 240, 240));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Tarefa iniciada", "Tarefa em curso", "Tarefa acabada" }));
        jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(10, 120, 161, 26);
        jPanel1.add(dataf);
        dataf.setBounds(10, 170, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Data de Fim:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 150, 80, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Projeto voltar = new Projeto(sistema, projeto);
        voltar.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdicionarMembroTarefa adc = new AdicionarMembroTarefa(sistema, projeto);
        adc.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if ((nometarefa.getText().equals("")) || (descricao.getText().equals("")) || (jComboBox2.getSelectedItem().equals(""))){
            javax.swing.JOptionPane.showMessageDialog(this,"É necessário preencher todos os campos da tarefa!! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Tarefas t;
            t = new Tarefas(nometarefa.getText(), descricao.getText(), (String) jComboBox2.getSelectedItem(), getDataFim(), sistema.getUserLogado());
            projeto.getListaTarefas().adicionarTarefa(t);
            main.gravou = false;
            sistema.gravaObj(sistema.getDataSave());
            ListaTarefas lt = new ListaTarefas(sistema, projeto);
            lt.setVisible(true);
            dispose();
        }        // TODO add your handling code here:                  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nometarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometarefaActionPerformed

    private String getDataFim(){
        try{
        Date dataFim = dataf.getDate();
        DateFormat formato = new SimpleDateFormat (dataf.getDateFormatString());        
        String dataF = formato.format(dataFim);       
        return dataF;
        }catch (NullPointerException n){
            return null;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dataf;
    private javax.swing.JTextArea descricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nometarefa;
    // End of variables declaration//GEN-END:variables
}
