package Visual.Tutor;
import com.mycompany.clinicaveterinaria.Agendamento;
import com.mycompany.clinicaveterinaria.Animal;
import com.mycompany.clinicaveterinaria.Clinica;
import com.mycompany.clinicaveterinaria.Tutor;
import java.awt.Color;
import java.awt.Window;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AgendaAnimal extends javax.swing.JPanel {

   
    private Clinica clinica;
    private Animal pet;
    private Tutor dono;
    
    public AgendaAnimal(Clinica clinica, Animal pet, Tutor dono) {
        initComponents();
        this.clinica = clinica;
        this.pet = pet;
        this.dono = dono;
        jTextArea1.setForeground(Color.decode("#E6E51D"));
        agenda(); // preenche na criação
    }
    
    private void agenda(){
        jTextArea1.setText("");//limpar
        
        if(!pet.getListaAgendamentos().isEmpty()){
            for(Agendamento agen: pet.getListaAgendamentos()){
                jTextArea1.append(
                agen.imprimir() +
                "\n\t--------------------------------------------------------------------------------------------------\n"
            );
            }
    }
    else{
        jTextArea1.append(
                "Sem próximos agendamentos "+
                "\n\t--------------------------------------------------------------------------------------------------\n"
            );
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(106, 27, 154));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(106, 27, 154));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150)));
        jTextArea1.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Cancelar Agendamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Agenda");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this);

        if (window != null) {
            window.dispose();
        }

        JFrame frame = new JFrame("Gerenciamento Animal");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        GerenciamentoAnimais painel = new GerenciamentoAnimais(clinica, dono);
        frame.add(painel);

        frame.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String dataCancelar = JOptionPane.showInputDialog(this, "Qual a data que gostaria de cancelar? (dd/MM/yyyy)", "Cancelar Agendamento", JOptionPane.QUESTION_MESSAGE);

   if (dataCancelar != null && !dataCancelar.trim().isEmpty()) {
      LocalDate dataAgendada = converterData(dataCancelar);

     if (dataAgendada == null) {
         return; // já mostrou o JOptionPane dentro do converterData
        }

    String horaCancelar = JOptionPane.showInputDialog(this, "Qual o horário que gostaria de cancelar? (HH:mm)", "Cancelar Agendamento", JOptionPane.QUESTION_MESSAGE);

    if (horaCancelar != null && !horaCancelar.trim().isEmpty()) {
        LocalTime horaAgendada = converterHora(horaCancelar);

        if (horaAgendada == null) {
            return;
        }
        
        // Se chegou aqui, data e hora são válidos
        if(pet.cancelarAgendamento(dataAgendada, horaAgendada)){
            JOptionPane.showMessageDialog(this, "Agendamento cancelado com sucesso.");
        } else{
            JOptionPane.showMessageDialog(this, "Agendamento não encontrado para essa data e horário.");
        }

    } else {
        JOptionPane.showMessageDialog(this, "Nenhum horário foi informado.");
    }

} else {
    JOptionPane.showMessageDialog(this, "Nenhuma data foi informada.");
}

        
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
