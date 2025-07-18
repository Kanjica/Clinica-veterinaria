    
package Visual.Adm;

import Visual.*;

import com.mycompany.clinicaveterinaria.*;
import java.awt.Dimension;
import java.awt.Window;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
/**
 *
 * @author pauli
 */
public class GerenciaVacinas extends javax.swing.JPanel {
    Clinica petShop;
    /**
     * Creates new form Agendamento
     */
    public GerenciaVacinas(Clinica clinica) {
        initComponents();
        this.petShop = clinica;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        EditarVacinas = new javax.swing.JButton();
        BuscarNome = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        ListarVacinas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jButton1.setText("Voltar");

        setBackground(new java.awt.Color(106, 27, 154));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        EditarVacinas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditarVacinas.setText("Editar");
        EditarVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarVacinasActionPerformed(evt);
            }
        });

        BuscarNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BuscarNome.setText("Por Nome");
        BuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomeActionPerformed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/kMPJHvG.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        ListarVacinas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ListarVacinas.setText("Listar");
        ListarVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVacinasActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(244, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditarVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BuscarNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(ListarVacinas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(43, 43, 43)))
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jLabel30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ListarVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(EditarVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        EditarVacinas.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Vacinas");

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
                .addGap(229, 229, 229)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EditarVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarVacinasActionPerformed
        String nomeBusca;
        do {
            nomeBusca = JOptionPane.showInputDialog(null, 
                "Digite o nome da vacina que deseja editar:", 
                "Editar Vacina", 
                JOptionPane.QUESTION_MESSAGE);

            if(nomeBusca == null){
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                return;
            }

            nomeBusca = nomeBusca.trim();

        }while (nomeBusca.isEmpty());
        
        Window window = SwingUtilities.getWindowAncestor(this);

        if (window != null) {
            window.dispose(); // fecha a janela que contém esse painel
        }
         
        JFrame frame = new JFrame("Tela Tutor");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        EditarVacina painel = new EditarVacina(petShop, nomeBusca);
        frame.add(painel);

        frame.setVisible(true);
    }//GEN-LAST:event_EditarVacinasActionPerformed

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed
        String nomeBusca = JOptionPane.showInputDialog(null, "Digite o nome da vacina para procurar:", "Procurar Vacina", JOptionPane.QUESTION_MESSAGE);

        if (nomeBusca == null || nomeBusca.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome da vacina não pode ser vazio ou a operação foi cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Vacina vacinaEncontrada = petShop.buscarVacinaPorNome(nomeBusca); // 

        if (vacinaEncontrada != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String detalhes = String.format("""
                                            Detalhes da Vacina:
                                              Nome: %s
                                              Validade: %s
                                              Preço: R$ %.2f
                                              Quantidade em Estoque: %d""",
                vacinaEncontrada.getNomeVacina(),
                vacinaEncontrada.getValidadeVacina().format(formatter),
                vacinaEncontrada.getPreco(),
                vacinaEncontrada.getQuantidade()
            );
            JOptionPane.showMessageDialog(null, detalhes, "Vacina Encontrada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Vacina '" + nomeBusca + "' não encontrada.", "Vacina Não Encontrada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void ListarVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVacinasActionPerformed
    /*ArrayList<Vacina> vacinas = petShop.getListaVacinas();

        if (vacinas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há vacinas cadastradas na clínica.", "Lista de Vacinas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder listaFormatada = new StringBuilder("Lista de Vacinas:\n\n");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // 

        for (int i = 0; i < vacinas.size(); i++) {
            Vacina vacina = vacinas.get(i);
            listaFormatada.append("Vacina ").append(i + 1).append(":\n");
            listaFormatada.append("  Nome: ").append(vacina.getNomeVacina()).append("\n");
            listaFormatada.append("  Validade: ").append(vacina.getValidadeVacina().format(formatter)).append("\n");
            listaFormatada.append("  Preço: R$ ").append(String.format("%.2f", vacina.getPreco())).append("\n");
            listaFormatada.append("  Quantidade em Estoque: ").append(vacina.getQuantidade()).append("\n");
            listaFormatada.append("----------------------------------\n");
        }
        
        JOptionPane.showMessageDialog(null, listaFormatada.toString(), "Todas as Vacinas", JOptionPane.PLAIN_MESSAGE);
*/
      Window window = SwingUtilities.getWindowAncestor(this);

        if (window != null) {
            window.dispose();
        }

        JFrame frame = new JFrame("Listar Veterinarios");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        ListarVacinas painel = new ListarVacinas(petShop);
        frame.add(painel);

        frame.setVisible(true);
    }//GEN-LAST:event_ListarVacinasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           Window window = SwingUtilities.getWindowAncestor(this); 

         if (window != null) {
           window.dispose();
          }
         
        JFrame frame = new JFrame("Menu de Gerenciamento");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); 

        MenuGerenciamento painel = new MenuGerenciamento(petShop);
        frame.add(painel);

        frame.setVisible(true);     
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarNome;
    private javax.swing.JButton EditarVacinas;
    private javax.swing.JButton ListarVacinas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
