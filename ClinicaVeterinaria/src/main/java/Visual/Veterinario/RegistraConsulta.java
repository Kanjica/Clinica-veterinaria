
package Visual.Veterinario;
import Visual.Veterinario.MenuVeterinario;
import Visual.MenuPrincipal;

import com.mycompany.clinicaveterinaria.*;
import java.awt.Window;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class RegistraConsulta extends javax.swing.JPanel {
    Clinica petShop;
    Veterinario veterinario;
    Animal pet;
    Consulta consul;
    
    public RegistraConsulta(Clinica clinica, Veterinario vet) {
        this.petShop = clinica;
        this.veterinario = vet;
        this.pet = null;
        this.consul = null;
        initComponents();
        
        ProblemaAnimal.setEditable(false);
        DiagnosticoAnimal.setEditable(false);
        MedicamentoAnimal.setEditable(false);
        FinalizarConsulta.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EspecialidadeSelecao = new javax.swing.JComboBox<>();
        AnimalUser = new javax.swing.JTextField();
        HoraUser = new javax.swing.JTextField();
        DataUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EspecialidadeSelecao1 = new javax.swing.JComboBox<>();
        AnimalUser1 = new javax.swing.JTextField();
        HoraUser1 = new javax.swing.JTextField();
        DataUser1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        EspecialidadeSelecao2 = new javax.swing.JComboBox<>();
        AnimalUser2 = new javax.swing.JTextField();
        HoraUser2 = new javax.swing.JTextField();
        DataUser2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        EspecialidadeSelecao3 = new javax.swing.JComboBox<>();
        AnimalUser3 = new javax.swing.JTextField();
        HoraUser3 = new javax.swing.JTextField();
        DataUser3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        MedicamentoAnimal = new javax.swing.JTextField();
        DiagnosticoAnimal = new javax.swing.JTextField();
        ProblemaAnimal = new javax.swing.JTextField();
        FinalizarConsulta = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Voltar1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        DataAgen1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        HoraAgen1 = new javax.swing.JTextField();
        VerificarAgenda = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("XXX:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("XXX:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("XXX:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("XXX:");

        EspecialidadeSelecao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EspecialidadeSelecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AnimalUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        HoraUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DataUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataUserActionPerformed(evt);
            }
        });

        jButton1.setText("Botao");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(DataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HoraUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AnimalUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EspecialidadeSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(HoraUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AnimalUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EspecialidadeSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("XXX:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("XXX:");

        EspecialidadeSelecao1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EspecialidadeSelecao1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AnimalUser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        HoraUser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DataUser1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataUser1ActionPerformed(evt);
            }
        });

        jButton2.setText("Botao");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("XXX:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("XXX:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("XXX:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("XXX:");

        EspecialidadeSelecao2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EspecialidadeSelecao2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AnimalUser2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        HoraUser2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DataUser2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton3.setText("Botao");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("XXX:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("XXX:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("XXX:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("XXX:");

        EspecialidadeSelecao3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EspecialidadeSelecao3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AnimalUser3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        HoraUser3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DataUser3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton4.setText("Botao");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("XXX:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("XXX:");

        Voltar.setText("Voltar ao Menu");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.JLabel() {
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

        setBackground(new java.awt.Color(215, 245, 245));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Registrar Consulta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Medicamento");

        MedicamentoAnimal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        DiagnosticoAnimal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ProblemaAnimal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProblemaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProblemaAnimalActionPerformed(evt);
            }
        });

        FinalizarConsulta.setText("Finalizar");
        FinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarConsultaActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Problema:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Diagnostico");

        Voltar1.setText("Voltar ao Menu");
        Voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar1ActionPerformed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/MeAh7Gx.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Digite a Data:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Hora:");

        VerificarAgenda.setText("Verificar Agenda");
        VerificarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(MedicamentoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ProblemaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiagnosticoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(Voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FinalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataAgen1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HoraAgen1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(VerificarAgenda)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(497, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(DataAgen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VerificarAgenda)
                            .addComponent(HoraAgen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(ProblemaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(DiagnosticoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MedicamentoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLabel26)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );

        FinalizarConsulta.getAccessibleContext().setAccessibleName("FinalizarConsulta");
        FinalizarConsulta.getAccessibleContext().setAccessibleDescription("");

        jLabel34.setIcon(new javax.swing.JLabel() {
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
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DataUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataUser1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ProblemaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProblemaAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProblemaAnimalActionPerformed

    private void FinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarConsultaActionPerformed

    String problema = ProblemaAnimal.getText().trim();
    String diagnostico = DiagnosticoAnimal.getText().trim();
    String medicamento = MedicamentoAnimal.getText().trim();

    if (problema.isEmpty() || diagnostico.isEmpty() || medicamento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        return;
    }

    // Aqui você emite o prontuário
    consul.EmitirProntuario(problema, diagnostico, medicamento);
    
    JOptionPane.showMessageDialog(this, "Prontuário emitido com sucesso!");
    JOptionPane.showMessageDialog(this,  consul.ImprimirProntuario());

    // Limpa os campos
    ProblemaAnimal.setText("");
    DiagnosticoAnimal.setText("");
    MedicamentoAnimal.setText("");
    ProblemaAnimal.setEditable(false);
    DiagnosticoAnimal.setEditable(false);
    MedicamentoAnimal.setEditable(false);
    FinalizarConsulta.setEnabled(false);
    FinalizarConsulta.setEnabled(false);
    DataAgen1.setEditable(true);
    HoraAgen1.setEditable(true);

        
    }//GEN-LAST:event_FinalizarConsultaActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
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
    }//GEN-LAST:event_VoltarActionPerformed

    private void Voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar1ActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this); // 'this' é o painel onde está o botão

        if (window != null) {
            window.dispose(); // fecha a janela que contém esse painel
        }

        JFrame frame = new JFrame("Tela Inicial");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);// ajusta tamanho da janela ao tamanho do painel e componentes
        frame.setLocationRelativeTo(null); // centraliza

        MenuVeterinario painel = new MenuVeterinario(petShop, veterinario);
        frame.add(painel);

        frame.setVisible(true);
    }//GEN-LAST:event_Voltar1ActionPerformed

    private void VerificarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarAgendaActionPerformed
        String dataTexto = DataAgen1.getText();
        String horaTexto = HoraAgen1.getText();
        
        // Validação de campos vazios
    if (dataTexto.isEmpty() || horaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
        return;
    }
    
    LocalDate dataAgendada = converterData(dataTexto);
    LocalTime horaAgendada = converterHora(horaTexto);
    
    //verificar a entrada de horario:
    if(veterinario.getTurnoTrabalho().equals("08h as 12h")){
        if(!petShop.verificarTurno(horaAgendada, 8, 12)){
           JOptionPane.showMessageDialog(this, "Digite um horario das 08h as 12h");
            return;
          }
    } else if(veterinario.getTurnoTrabalho().equals("14h as 18h")){
        if(!petShop.verificarTurno(horaAgendada, 14, 18)){
            JOptionPane.showMessageDialog(this, "Digite um horario das 14h as 18h!");
            return;
          }
    } else{
        JOptionPane.showMessageDialog(this, "Digite um horario das 08h as  12h ou 14h as 18h!");
    }
    
    //verificar se a agenda:
    Agendamento ag1 = veterinario.verificarAgenda1(dataAgendada, horaAgendada);
    
    if(ag1 == null){
        JOptionPane.showMessageDialog(this, "Voce nao possui consulta para esse horario!");
    } else{
        pet = ag1.getAnimal();
        consul = pet.BuscarConsulta(ag1);
        
        JOptionPane.showMessageDialog(this, "Voce possui uma consulta com " + pet.getNome() + " e seu dono(a) " + pet.getTutor().getNome());
        ProblemaAnimal.setEditable(true);
        DiagnosticoAnimal.setEditable(true);
        MedicamentoAnimal.setEditable(true);
        FinalizarConsulta.setEnabled(true);
        DataAgen1.setEditable(false);
        HoraAgen1.setEditable(false);
        FinalizarConsulta.setEnabled(true);
    }
        DataAgen1.setText("");
        HoraAgen1.setText("");
        

    }//GEN-LAST:event_VerificarAgendaActionPerformed
    
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
    private javax.swing.JTextField AnimalUser;
    private javax.swing.JTextField AnimalUser1;
    private javax.swing.JTextField AnimalUser2;
    private javax.swing.JTextField AnimalUser3;
    private javax.swing.JTextField DataAgen1;
    private javax.swing.JTextField DataUser;
    private javax.swing.JTextField DataUser1;
    private javax.swing.JTextField DataUser2;
    private javax.swing.JTextField DataUser3;
    private javax.swing.JTextField DiagnosticoAnimal;
    private javax.swing.JComboBox<String> EspecialidadeSelecao;
    private javax.swing.JComboBox<String> EspecialidadeSelecao1;
    private javax.swing.JComboBox<String> EspecialidadeSelecao2;
    private javax.swing.JComboBox<String> EspecialidadeSelecao3;
    private javax.swing.JButton FinalizarConsulta;
    private javax.swing.JTextField HoraAgen1;
    private javax.swing.JTextField HoraUser;
    private javax.swing.JTextField HoraUser1;
    private javax.swing.JTextField HoraUser2;
    private javax.swing.JTextField HoraUser3;
    private javax.swing.JTextField MedicamentoAnimal;
    private javax.swing.JTextField ProblemaAnimal;
    private javax.swing.JButton VerificarAgenda;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton Voltar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
