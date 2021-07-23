/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import backend.Projetos;
import backend.Sistema;
import backend.Tarefas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marga
 */
public class ListaTarefas extends javax.swing.JFrame {

    private Sistema sistema;
    private DefaultTableModel tabela;
    private Projetos projeto;
    
    /**
     * Creates new form ListaProjetos
     */
    public ListaTarefas(Sistema sistema, Projetos p) {
        initComponents();
        this.sistema=sistema;
        tabela = (DefaultTableModel) jTable1.getModel();
        tabela.setNumRows(0);
        this.projeto = p;
        getDadosTarefaOwner();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Tarefas");

        jPanel1.setBackground(new java.awt.Color(1, 75, 84));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Lista de Tarefas ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 10, 120, 17);

        jTable1.setBackground(new java.awt.Color(0, 64, 65));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome da Tarefa", "Prioridade", "Data de Fim", "Estado", "Utilizador Associado"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nome da Tarefa");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Prioridade");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Data de Fim");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Estado");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Utilizador Associado");
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(21, 36, 611, 155);

        jButton1.setBackground(new java.awt.Color(0, 64, 65));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 210, 80, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Projeto voltar = new Projeto(sistema,projeto);
        voltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Tarefa tf = new Tarefa(sistema, projeto);
        tf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void getDadosTarefaOwner(){
        for (Tarefas t : projeto.getListaTarefas().getListaTarefas()){
            String nomeTarefa, prioridade, dataFim, estado, userAss;
            nomeTarefa = t.getNome();
            prioridade = "";
            dataFim = t.getData_fim();
            estado = t.getEstado();
            userAss = "";
            tabela.addRow(new Object[] {nomeTarefa, prioridade, dataFim, estado, userAss});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
