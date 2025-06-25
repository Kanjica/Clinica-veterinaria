    
package Visual.Adm;

import Visual.*;

import com.mycompany.clinicaveterinaria.*;
import java.awt.Dimension;
import java.awt.Window;
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
public class GerenciaEspecialidades extends javax.swing.JPanel {
    Clinica petShop;
    /**
     * Creates new form Agendamento
     */
    public GerenciaEspecialidades(Clinica clinica) {
        initComponents();
        this.petShop = clinica;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        EditarVeterinario = new javax.swing.JButton();
        BuscarNome = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        ListarVeterinario = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jButton1.setText("Voltar");

        setBackground(new java.awt.Color(223, 250, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        EditarVeterinario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditarVeterinario.setText("Editar");
        EditarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarVeterinarioActionPerformed(evt);
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

        ListarVeterinario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ListarVeterinario.setText("Listar");
        ListarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVeterinarioActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditarVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListarVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar)
                        .addGap(139, 139, 139)))
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ListarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltar)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel30))
        );

        EditarVeterinario.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Especialidades");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EditarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarVeterinarioActionPerformed
    
    }//GEN-LAST:event_EditarVeterinarioActionPerformed

    private void BuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomeActionPerformed
 
    }//GEN-LAST:event_BuscarNomeActionPerformed

    private void ListarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVeterinarioActionPerformed

    }//GEN-LAST:event_ListarVeterinarioActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
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
    }//GEN-LAST:event_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarNome;
    private javax.swing.JButton EditarVeterinario;
    private javax.swing.JButton ListarVeterinario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
