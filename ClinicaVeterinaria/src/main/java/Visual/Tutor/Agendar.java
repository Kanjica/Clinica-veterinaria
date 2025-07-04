
package Visual.Tutor;
import Visual.*;

import com.mycompany.clinicaveterinaria.*;
import java.awt.Window;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author pauli
 */
public class Agendar extends javax.swing.JPanel {
    Clinica petShop;
    Tutor dono;
    Animal pet;

    
    /** 
     * Creates new form Agendamento
     */
    public Agendar(Clinica clinica, Tutor dono, Animal pet) {
        initComponents();
        this.petShop = clinica;
        this.dono = dono;
        this.pet = pet;
        carregarEspecialidades();
        
    }
    private void carregarEspecialidades() {
       EspecialidadeSelecao.removeAllItems();

    for (Especialidade esp : petShop.getListaEspecialidades()) {
        EspecialidadeSelecao.addItem(esp.getNome()); // ou esp diretamente se tiver toString()
    }
    }
    
    
    
    
    /**petShop.addEspecialidades(esp2);
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        Voltar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EspecialidadeSelecao = new javax.swing.JComboBox<>();
        HorarioAgen = new javax.swing.JTextField();
        DataAgen = new javax.swing.JTextField();
        agendar = new javax.swing.JButton();
        Voltar2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Voltar1.setText("Voltar ao Menu");
        Voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(106, 27, 154));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Data:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Horario:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Especialidade:");

        EspecialidadeSelecao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EspecialidadeSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadeSelecaoActionPerformed(evt);
            }
        });

        HorarioAgen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DataAgen.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DataAgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAgenActionPerformed(evt);
            }
        });

        agendar.setText("Agendar");
        agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarActionPerformed(evt);
            }
        });

        Voltar2.setText("Voltar ao Menu");
        Voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar2ActionPerformed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/0fnxfSD.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HorarioAgen, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(DataAgen)
                            .addComponent(EspecialidadeSelecao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DataAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(HorarioAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EspecialidadeSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        HorarioAgen.getAccessibleContext().setAccessibleName("");
        agendar.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agendamento");

        jLabel32.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/Ifajv0U.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(175, 175, 175)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarActionPerformed

    String dataTexto = DataAgen.getText();
    String horaTexto = HorarioAgen.getText();
    Especialidade especialidade = petShop.buscarEspecialidadePorNome((String) EspecialidadeSelecao.getSelectedItem());

    // Validação de campos vazios
    if (dataTexto.isEmpty() || horaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        return;
    }
    
    LocalDate dataAgendada = converterData(dataTexto);
    LocalTime horaAgendada = converterHora(horaTexto);
    
    if (dataAgendada == null || horaAgendada == null) {
      return;
    }
    
    if(!petShop.verificarTurno(horaAgendada, 8, 12) && !petShop.verificarTurno(horaAgendada, 14, 18)){
        JOptionPane.showMessageDialog(this, "Digite um horario das 08h as 12h ou das 14h as 18h!");
        return;
    }
    
     Agendamento ag1 = new Agendamento(dataAgendada,horaAgendada, especialidade,pet);
     pet.addListaAgendamentos(ag1);
     JOptionPane.showMessageDialog(this, "Agendamento feito com sucesso!");
     JOptionPane.showMessageDialog(this, ag1.imprimir());
     
      DataAgen.setText("");
      HorarioAgen.setText("");
     
   
   
    }//GEN-LAST:event_agendarActionPerformed

    public LocalDate converterData(String dataTexto) {
        if (!dataTexto.matches("\\d{2}/\\d{2}/\\d{4}")) {
             JOptionPane.showMessageDialog(null, 
            "Data inválida! Use o formato dd/MM/yyyy.");
             return null;
         } else {
            DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(dataTexto, formatoData);
            }
    }
    
    public LocalTime converterHora(String horaTexto) {
      if (!horaTexto.matches("\\d{2}:\\d{2}")) {
         JOptionPane.showMessageDialog(null, 
            "Hora inválida! Use o formato HH:mm.");
          return null;
      }
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(horaTexto, formatoHora);
        
    }
    
    
    
    private void EspecialidadeSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadeSelecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspecialidadeSelecaoActionPerformed

    private void Voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar1ActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this); // 'this' é o painel onde está o botão

        if (window != null) {
            window.dispose(); // fecha a janela que contém esse painel
        }

        JFrame frame = new JFrame("Tela Inicial");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);// ajusta tamanho da janela ao tamanho do painel e componentes
        frame.setLocationRelativeTo(null); // centraliza

        MenuPrincipal painel = new MenuPrincipal(petShop);
        frame.add(painel);

        frame.setVisible(true);
    }//GEN-LAST:event_Voltar1ActionPerformed

    private void Voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar2ActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this); // 'this' é o painel onde está o botão

        if (window != null) {
            window.dispose(); // fecha a janela que contém esse painel
        }

        JFrame frame = new JFrame("Tela Inicial");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);// ajusta tamanho da janela ao tamanho do painel e componentes
        frame.setLocationRelativeTo(null); // centraliza

        GerenciamentoAnimais painel = new GerenciamentoAnimais(petShop, dono);
        frame.add(painel);

        frame.setVisible(true);
    }//GEN-LAST:event_Voltar2ActionPerformed

    private void DataAgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAgenActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DataAgen;
    private javax.swing.JComboBox<String> EspecialidadeSelecao;
    private javax.swing.JTextField HorarioAgen;
    private javax.swing.JButton Voltar1;
    private javax.swing.JButton Voltar2;
    private javax.swing.JButton agendar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
}
