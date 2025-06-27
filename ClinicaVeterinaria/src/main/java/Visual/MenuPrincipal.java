    
package Visual;
import Visual.Adm.CadastroTutor;
import Visual.Veterinario.LoginVeterinario;
import Visual.Tutor.LoginTutor;
import Visual.Adm.MenuAdministração;
import com.mycompany.clinicaveterinaria.*;
import java.awt.Component;
import java.awt.Window;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Ana
 */

public class MenuPrincipal extends javax.swing.JPanel {
    Clinica petShop;
    /**
     * Creates new form Agendamento
     */
    public MenuPrincipal(Clinica clinica) {
        initComponents();
        configurandoOpcoes(); // tava dando problema em iniciar com os emojis no texto, ai aqui é pra redefinir isso e aumentar a margem esquerda
        
        this.petShop = clinica;
        
    }
    
    public static void main(String[] args) {
        // Cria o objeto da clínica (ou recebe de onde você quiser)
        Clinica clinica = new Clinica("Vida Animal");
        
        CadastroTutor cadastro = new CadastroTutor(clinica);
      
        LoginTutor login = new LoginTutor(clinica);
        
        JFrame frame = new JFrame("Tela de Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuPrincipal painel = new MenuPrincipal(clinica);

        frame.getContentPane().add(painel);

        frame.setSize(800, 600); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public final void configurandoOpcoes(){
        opcoes.removeAllItems(); // Remove os itens padrão "Tutor", "Administracao", etc.
        opcoes.addItem("🐾 Tutor"); // Adiciona o emoji e texto
        opcoes.addItem("🛠️️ Administração");
        opcoes.addItem("🩺 Veterinário");
        
        opcoes.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel rendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                rendererComponent.setBorder(new EmptyBorder(1, 20, 1, 1));

                return rendererComponent; 
            }
        });
    }
    public void criarObjetos() {
    // Tutores
   /* Tutor t1 = new Tutor("Juliana Silva", "123", "juliana.silva@gmail.com", "7199123", "Rua das Acácias, 101");
    Tutor t2 = new Tutor("Carlos Eduardo", "98765432100", "carlos.edu@gmail.com", "71997654", "Avenida Central, 200");
    Tutor t3 = new Tutor("Fernanda Moura", "45678912300", "fernanda.moura@gmail.com", "7199876", "Rua São Jorge, 85");
    
    Tutor t4 = new Tutor("a", "1", "a@gmail.com", "719999", "Rua a, 12");

    // Animais
    Animal a1 = new Animal("Luna", "Golden Retriever", "15/03/2019", t1);
    Animal a2 = new Animal("Tico", "Shih Tzu", "09/11/2021", t1);
    Animal a3 = new Animal("Thor", "Pastor Alemão", "01/01/2020", t2);
    Animal a4 = new Animal("Mel", "Gato Siamês", "12/08/2018", t3);
    Animal a5 = new Animal("Zig", "Poodle", "05/05/2017", t3);
    
    Animal a6 = new Animal("b", "bbb", "01/01/1001", t4);
    Animal a7 = new Animal("c", "ccc", "02/02/2002", t4);
    Animal a8 = new Animal("d", "ddd", "03/03/3003", t4);
    Animal a9 = new Animal("e", "eee", "04/04/4004", t4);
    
    // Associar animais aos tutores
    t1.addAnimais(a1);
    t1.addAnimais(a2);
    t2.addAnimais(a3);
    t3.addAnimais(a4);
    t3.addAnimais(a5);
    
    t4.addAnimais(a6);
    t4.addAnimais(a7);
    t4.addAnimais(a8);
    t4.addAnimais(a9);

    // Adicionar tutores no petShop
    petShop.addTutor(t1);
    petShop.addTutor(t2);
    petShop.addTutor(t3);
    petShop.addTutor(t4);*/

    // Especialidades
    Especialidade esp1 = new Especialidade("Cardiologista", 80);
    Especialidade esp2 = new Especialidade("Ortopedista", 70);
    Especialidade esp3 = new Especialidade("Dermatologista", 60);

    petShop.addEspecialidades(esp1);
    petShop.addEspecialidades(esp2);
    petShop.addEspecialidades(esp3);

    // Veterinários
    Veterinario vet1 = new Veterinario("Marcos", "123", "marcos.vet@gmail.com", 7199100, esp1, 123, "08h as 12h");
    Veterinario vet2 = new Veterinario("Bianca", "100002", "bianca.vet@gmail.com", 7199200, esp2, 7788, "14h as 18h");
    Veterinario vet3 = new Veterinario("Rita", "100003", "rita.vet@gmail.com", 719300, esp3, 8899, "08h as 12h");
    Veterinario vet4 = new Veterinario("a", "1","a@gmail.com", 719111, esp1, 1, "08h as 12h");

    petShop.addVeterinarios(vet1);
    petShop.addVeterinarios(vet2);
    petShop.addVeterinarios(vet3);
    petShop.addVeterinarios(vet4);

    // Datas e horários para agendamento
    LocalDate data1 = LocalDate.of(2025, 7, 15);
    LocalDate data2 = LocalDate.of(2025, 7, 16);
    LocalTime hora1 = LocalTime.of(8, 0);
    LocalTime hora2 = LocalTime.of(10, 20);
    LocalTime hora3 = LocalTime.of(14, 0);

    // Agendamentos
 /*   Agendamento ag1 = new Agendamento(data1, hora1, esp1, a1);
    Agendamento ag2 = new Agendamento(data1, hora2, esp2, a3);
    Agendamento ag3 = new Agendamento(data2, hora3, esp3, a4);

    // Adicionando agendamentos aos animais
    a1.addListaAgendamentos(ag1);
    a3.addListaAgendamentos(ag2);
    a4.addListaAgendamentos(ag3);*/
    
    Vacina vacina1 = new Vacina("Vacina1", LocalDate.of(2025, 6, 18), 10.0f, 10);
    Vacina vacina2 = new Vacina("Vacina2", LocalDate.of(2025, 6, 10), 10.0f, 10);
    
    petShop.addVacina(vacina1);
    petShop.addVacina(vacina2);
}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        criar = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        opcoes = new javax.swing.JComboBox<>();
        boasVindas = new javax.swing.JLabel();
        prosseguirButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boasVindas1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(106, 27, 154));

        principalPanel.setBackground(new java.awt.Color(255, 255, 255));
        principalPanel.setToolTipText("");
        principalPanel.setPreferredSize(new java.awt.Dimension(774, 414));

        criar.setText("criar Objetos");
        criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarActionPerformed(evt);
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

        opcoes.setBackground(new java.awt.Color(248, 248, 248));
        opcoes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        opcoes.setForeground(new java.awt.Color(85, 85, 85));
        opcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tutor", "Administracao", "Veterinario" }));

        boasVindas.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        boasVindas.setText("Seja bem-vindo(a) à Clínica Vida Animal");

        prosseguirButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        prosseguirButton.setText("Prosseguir");
        prosseguirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosseguirButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Para prosseguir selecione o seu perfil:");

        boasVindas1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        boasVindas1.setText("Cuidando com carinho do seu melhor amigo!");

        jLabel1.setText("Clínica Vida Animal | (XX) XXXX-XXXX | Aberto de Seg-Sex: 8h-18h, Sáb: 9h-13h");

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(218, 218, 218))
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                .addComponent(boasVindas)
                                .addGap(176, 176, 176))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                .addComponent(boasVindas1)
                                .addGap(153, 153, 153))))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                                .addComponent(opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPanelLayout.createSequentialGroup()
                                                .addComponent(prosseguirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(110, 110, 110)))))
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(criar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(criar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(boasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boasVindas1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel30))
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prosseguirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        tituloPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setText("Menu Principal");

        logo.setIcon(new javax.swing.JLabel() {
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
                .addComponent(logo)
                .addGap(156, 156, 156)
                .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarActionPerformed
        criarObjetos();
        JOptionPane.showMessageDialog(this, "Objetos criados com sucesso!");
    }//GEN-LAST:event_criarActionPerformed

    private void prosseguirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosseguirButtonActionPerformed
        Window window = SwingUtilities.getWindowAncestor(this); // 'this' é o painel onde está o botão

        if (window != null) {
            window.dispose(); // fecha a janela que contém esse painel
        }

        JFrame frame = new JFrame("Agendamento");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);// ajusta tamanho da janela ao tamanho do painel e componentes
        frame.setLocationRelativeTo(null); // centraliza
        
        switch (opcoes.getSelectedItem().toString()) {
            case "🐾 Tutor" -> {
                
            LoginTutor painel = new LoginTutor(petShop);
            frame.add(painel);     
            }
            case "🛠️️ Administração" -> {
               
            MenuAdministração painel = new MenuAdministração(petShop);
            frame.add(painel);
            }
            case "🩺 Veterinário" -> {
               
            LoginVeterinario painel = new LoginVeterinario(petShop);
            frame.add(painel);

            }
            default -> {
                JOptionPane.showMessageDialog(
                null,
                "Ocorreu um erro inesperado: ", 
                "Erro Crítico do Sistema",
                JOptionPane.ERROR_MESSAGE
                );
            }
        }
        
        frame.setVisible(true);
    }//GEN-LAST:event_prosseguirButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boasVindas;
    private javax.swing.JLabel boasVindas1;
    private javax.swing.JButton criar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> opcoes;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JButton prosseguirButton;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
