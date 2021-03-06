/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import backend.Sistema;
import backend.Projetos;
import backend.TarefasList;
import backend.Users;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author marga
 */
public class NovoProjeto extends javax.swing.JFrame {

    private Sistema sistema;
    /**
     * Creates new form NovoProjeto
     * @param sistema
     */
    public NovoProjeto(Sistema sistema) {
        initComponents();
        this.sistema=sistema;
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
        nomep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriçaop = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        datai = new com.toedter.calendar.JDateChooser();
        dataf = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo Projeto");

        jPanel1.setBackground(new java.awt.Color(1, 75, 84));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Criar Novo Projeto:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(227, 11, 140, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nome do Projeto:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 98, 14);
        jPanel1.add(nomep);
        nomep.setBounds(20, 60, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Descrição:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(305, 43, 59, 14);

        descriçaop.setColumns(20);
        descriçaop.setRows(5);
        jScrollPane1.setViewportView(descriçaop);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(305, 63, 273, 96);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Data de Início:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(23, 101, 90, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Data de Fim:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 160, 80, 14);

        jButton2.setBackground(new java.awt.Color(0, 64, 65));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Submeter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 230, 90, 23);

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
        jButton3.setBounds(390, 230, 90, 23);

        datai.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(datai);
        datai.setBounds(20, 120, 190, 30);

        dataf.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dataf);
        dataf.setBounds(20, 180, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MenuInicial cancelar = new MenuInicial(sistema);
        cancelar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if ((nomep.getText().equals("")) || (descriçaop.getText().equals(""))){
            javax.swing.JOptionPane.showMessageDialog(this,"É necessário preencher os campos do nome e da descrição do projeto!! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Projetos p;
            p = new Projetos(nomep.getText(), sistema.getUserLogado(), descriçaop.getText(), getDataInicio(), getDataFim());
            sistema.getUserLogado().getListaProjetos().adicionarProjeto(p);
            main.gravou = false;
            sistema.gravaObj(sistema.getDataSave());
            ListaProjetosOwner submeter = new ListaProjetosOwner(sistema);
            submeter.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private String getDataInicio(){
        try{
        Date dataInicio = datai.getDate();
        DateFormat formato = new SimpleDateFormat (datai.getDateFormatString());        
        String dataI = formato.format(dataInicio);       
        return dataI;
        }catch (NullPointerException n){
            return null;
        }
    }
    
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
    private com.toedter.calendar.JDateChooser datai;
    private javax.swing.JTextArea descriçaop;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomep;
    // End of variables declaration//GEN-END:variables
}
