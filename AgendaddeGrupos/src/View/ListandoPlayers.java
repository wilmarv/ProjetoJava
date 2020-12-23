/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilmar
 */
public class ListandoPlayers extends javax.swing.JFrame {

    ControllerBD controller = new ControllerBD();
    String nome = controller.selecionarGrupo();
    ArrayList<String> lista = new ArrayList();
    String raca,classe,nomeAuxiliar;
    int contador = 0;
    
    
    /**
     * Creates new form CriandoGrupo
     */
    public ListandoPlayers() {      
        initComponents();
        lista = controller.listarMembros(nome);
        if(lista.size()<=0){
            JOptionPane.showMessageDialog(null, "Grupo vazio");
            this.dispose();
        }  
        this.setLocationRelativeTo(null);        
        Titulo.setText(controller.selecionarGrupo());
        
        classe = lista.get(7);
        raca = lista.get(8);
        
        Abruxo.setVisible(false);
        Ahunter.setVisible(false);
        Amago.setVisible(false);
        Apala.setVisible(false);
        Aprist.setVisible(false);
        Arogue.setVisible(false);
        Ashaman.setVisible(false);
        Awarrior.setVisible(false);
        Edruida.setVisible(false);
        Ehunter.setVisible(false);
        Emago.setVisible(false);
        Eprist.setVisible(false);
        Erogue.setVisible(false);
        Ewarrior.setVisible(false);
        Gbruxo.setVisible(false);
        Gwarrior.setVisible(false);
        Ghunter.setVisible(false);
        Gmago.setVisible(false);
        Gprist.setVisible(false);
        Grogue.setVisible(false);
        Hbruxo.setVisible(false);
        Hhunter.setVisible(false);
        Hmago.setVisible(false);
        Hpala.setVisible(false);
        Hpriest.setVisible(false);
        Hrogue.setVisible(false);
        Hwarrior.setVisible(false);
        if(raca.equals("Humano")){
           if(classe.equals("Guerreiro")){
               Hwarrior.setVisible(true);
           }
           else if(classe.equals("Caçador")){
               Hhunter.setVisible(true);               
           }
           else if(classe.equals("Mago")){
               Hmago.setVisible(true);               
           }
           else if(classe.equals("Rogue")){
               Hrogue.setVisible(true);               
           }
           else if(classe.equals("Sarcedote")){
               Hpriest.setVisible(true);               
           }
           else if(classe.equals("Bruxo")){
               Hbruxo.setVisible(true);               
           }
           else if(classe.equals("Paladino")){
               Hpala.setVisible(true);               
           }
        }
        else if(raca.equals("Anão")){
            if(classe.equals("Guerreiro")){
                Awarrior.setVisible(true);               
           }
           else if(classe.equals("Caçador")){
               Ahunter.setVisible(true);               
           }
           else if(classe.equals("Mago")){
               Amago.setVisible(true);               
           }
           else if(classe.equals("Rogue")){
               Arogue.setVisible(true);               
           }
           else if(classe.equals("Sarcedote")){
               Aprist.setVisible(true);               
           }
           else if(classe.equals("Bruxo")){
               Abruxo.setVisible(true);               
           }
           else if(classe.equals("Paladino")){
               Apala.setVisible(true);               
           }
           else if(classe.equals("Xamã")){
               Ashaman.setVisible(true);               
           }            
        }
        else if(raca.equals("Elfo")){
           if(classe.equals("Guerreiro")){
               Ewarrior.setVisible(true);               
           }
           else if(classe.equals("Caçador")){
               Ehunter.setVisible(true);                
           }
           else if(classe.equals("Mago")){
               Emago.setVisible(true);                
           }
           else if(classe.equals("Rogue")){
               Erogue.setVisible(true);                
           }
           else if(classe.equals("Sarcedote")){
               Eprist.setVisible(true);                
           }
           else if(classe.equals("Druida")){
               Edruida.setVisible(true);                
           }
            
        }
        else if(raca.equals("Gnomo")){
           if(classe.equals("Guerreiro")){
               Gwarrior.setVisible(true);               
           }
           else if(classe.equals("Caçador")){
               Ghunter.setVisible(true);               
           }
           else if(classe.equals("Mago")){
               Gmago.setVisible(true);               
           }
           else if(classe.equals("Rogue")){
               Grogue.setVisible(true);               
           }
           else if(classe.equals("Sarcedote")){
               Gprist.setVisible(true);               
           }
           else if(classe.equals("Bruxo")){
               Gbruxo.setVisible(true);               
           } 
        }
        
        nickTextField.setText(lista.get(0));
        funcaoTextField.setText(lista.get(6));
        ilvlTextField.setText(lista.get(1));
        classeTextField.setText(lista.get(7));
        atributoPrimarioTextField.setText(lista.get(2));
        acertoCriticoTextField.setText(lista.get(3));
        maestriaTextField.setText(lista.get(4));
        aceleracaoTextField.setText(lista.get(5));        
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
        Titulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Titulo2 = new javax.swing.JTextField();
        Titulo3 = new javax.swing.JTextField();
        Titulo4 = new javax.swing.JTextField();
        Titulo5 = new javax.swing.JTextField();
        Titulo6 = new javax.swing.JTextField();
        Titulo7 = new javax.swing.JTextField();
        Titulo8 = new javax.swing.JTextField();
        funcaoTextField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ilvlTextField = new javax.swing.JTextField();
        classeTextField = new javax.swing.JTextField();
        atributoPrimarioTextField = new javax.swing.JTextField();
        acertoCriticoTextField = new javax.swing.JTextField();
        maestriaTextField = new javax.swing.JTextField();
        aceleracaoTextField = new javax.swing.JTextField();
        nickTextField = new javax.swing.JTextField();
        Titulo9 = new javax.swing.JTextField();
        Hwarrior = new javax.swing.JLabel();
        Hhunter = new javax.swing.JLabel();
        Hbruxo = new javax.swing.JLabel();
        Hrogue = new javax.swing.JLabel();
        Hpriest = new javax.swing.JLabel();
        Hpala = new javax.swing.JLabel();
        Hmago = new javax.swing.JLabel();
        Abruxo = new javax.swing.JLabel();
        Ahunter = new javax.swing.JLabel();
        Amago = new javax.swing.JLabel();
        Apala = new javax.swing.JLabel();
        Aprist = new javax.swing.JLabel();
        Arogue = new javax.swing.JLabel();
        Ashaman = new javax.swing.JLabel();
        Awarrior = new javax.swing.JLabel();
        Ehunter = new javax.swing.JLabel();
        Edruida = new javax.swing.JLabel();
        Emago = new javax.swing.JLabel();
        Eprist = new javax.swing.JLabel();
        Erogue = new javax.swing.JLabel();
        Ewarrior = new javax.swing.JLabel();
        Gbruxo = new javax.swing.JLabel();
        Ghunter = new javax.swing.JLabel();
        Gmago = new javax.swing.JLabel();
        Gprist = new javax.swing.JLabel();
        Grogue = new javax.swing.JLabel();
        Gwarrior = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setEditable(false);
        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(250, 250, 250));
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Função");
        Titulo.setBorder(null);
        Titulo.setOpaque(false);
        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 140, 40));

        jButton1.setText("->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        Titulo2.setEditable(false);
        Titulo2.setBackground(new java.awt.Color(0, 0, 0));
        Titulo2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(250, 250, 250));
        Titulo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo2.setText("Classe:");
        Titulo2.setBorder(null);
        Titulo2.setOpaque(false);
        Titulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo2ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 60, 20));

        Titulo3.setEditable(false);
        Titulo3.setBackground(new java.awt.Color(0, 0, 0));
        Titulo3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(250, 250, 250));
        Titulo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo3.setText("Ilvl:");
        Titulo3.setBorder(null);
        Titulo3.setOpaque(false);
        Titulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo3ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 60, 20));

        Titulo4.setEditable(false);
        Titulo4.setBackground(new java.awt.Color(0, 0, 0));
        Titulo4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo4.setForeground(new java.awt.Color(250, 250, 250));
        Titulo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo4.setText("Atributo Primario");
        Titulo4.setBorder(null);
        Titulo4.setOpaque(false);
        Titulo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo4ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 110, 20));

        Titulo5.setEditable(false);
        Titulo5.setBackground(new java.awt.Color(0, 0, 0));
        Titulo5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo5.setForeground(new java.awt.Color(250, 250, 250));
        Titulo5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo5.setText("Acerto Critico");
        Titulo5.setBorder(null);
        Titulo5.setOpaque(false);
        Titulo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo5ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 100, 20));

        Titulo6.setEditable(false);
        Titulo6.setBackground(new java.awt.Color(0, 0, 0));
        Titulo6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(250, 250, 250));
        Titulo6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo6.setText("Maestria:");
        Titulo6.setBorder(null);
        Titulo6.setOpaque(false);
        Titulo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo6ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 60, 20));

        Titulo7.setEditable(false);
        Titulo7.setBackground(new java.awt.Color(0, 0, 0));
        Titulo7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo7.setForeground(new java.awt.Color(250, 250, 250));
        Titulo7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo7.setText("Aceleração");
        Titulo7.setBorder(null);
        Titulo7.setOpaque(false);
        Titulo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo7ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 80, 20));

        Titulo8.setEditable(false);
        Titulo8.setBackground(new java.awt.Color(0, 0, 0));
        Titulo8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo8.setForeground(new java.awt.Color(250, 250, 250));
        Titulo8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo8.setText("Função");
        Titulo8.setBorder(null);
        Titulo8.setOpaque(false);
        Titulo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo8ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 50, 20));

        funcaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(funcaoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 90, -1));

        jButton5.setText("Apagar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        ilvlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilvlTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ilvlTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 90, -1));

        classeTextField.setEditable(false);
        classeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(classeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 90, -1));

        atributoPrimarioTextField.setEditable(false);
        atributoPrimarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atributoPrimarioTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(atributoPrimarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 90, -1));

        acertoCriticoTextField.setEditable(false);
        acertoCriticoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acertoCriticoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(acertoCriticoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 90, -1));

        maestriaTextField.setEditable(false);
        maestriaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestriaTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(maestriaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 90, -1));

        aceleracaoTextField.setEditable(false);
        aceleracaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceleracaoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(aceleracaoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 90, -1));

        nickTextField.setEditable(false);
        nickTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nickTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 90, -1));

        Titulo9.setEditable(false);
        Titulo9.setBackground(new java.awt.Color(0, 0, 0));
        Titulo9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titulo9.setForeground(new java.awt.Color(250, 250, 250));
        Titulo9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo9.setText("Nick:");
        Titulo9.setBorder(null);
        Titulo9.setOpaque(false);
        Titulo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo9ActionPerformed(evt);
            }
        });
        jPanel1.add(Titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 20));

        Hwarrior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanowarrior.png"))); // NOI18N
        jPanel1.add(Hwarrior, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Hhunter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanohunter.png"))); // NOI18N
        Hhunter.setOpaque(true);
        jPanel1.add(Hhunter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Hbruxo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanobruxo.png"))); // NOI18N
        Hbruxo.setOpaque(true);
        jPanel1.add(Hbruxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, -1));

        Hrogue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanorogue.png"))); // NOI18N
        Hrogue.setOpaque(true);
        jPanel1.add(Hrogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Hpriest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanoprist.png"))); // NOI18N
        Hpriest.setOpaque(true);
        jPanel1.add(Hpriest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Hpala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanopala.png"))); // NOI18N
        Hpala.setOpaque(true);
        jPanel1.add(Hpala, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Hmago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Humano/humanomage.png"))); // NOI18N
        Hmago.setOpaque(true);
        jPanel1.add(Hmago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Abruxo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãobruxo.png"))); // NOI18N
        Abruxo.setOpaque(true);
        jPanel1.add(Abruxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Ahunter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãohunter.png"))); // NOI18N
        Ahunter.setOpaque(true);
        jPanel1.add(Ahunter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Amago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãomage.png"))); // NOI18N
        Amago.setOpaque(true);
        jPanel1.add(Amago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Apala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãopala.png"))); // NOI18N
        Apala.setOpaque(true);
        jPanel1.add(Apala, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Aprist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãopriest.png"))); // NOI18N
        Aprist.setOpaque(true);
        jPanel1.add(Aprist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Arogue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãorogue.png"))); // NOI18N
        Arogue.setOpaque(true);
        jPanel1.add(Arogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Ashaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãoshaman.png"))); // NOI18N
        Ashaman.setOpaque(true);
        jPanel1.add(Ashaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Awarrior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Anão/anãowarrior.png"))); // NOI18N
        Awarrior.setOpaque(true);
        jPanel1.add(Awarrior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Ehunter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Elf/ElfHunter.png"))); // NOI18N
        Ehunter.setOpaque(true);
        jPanel1.add(Ehunter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Edruida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Elf/Elfdruid.png"))); // NOI18N
        Edruida.setOpaque(true);
        jPanel1.add(Edruida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Emago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Elf/Elfmage.png"))); // NOI18N
        Emago.setOpaque(true);
        jPanel1.add(Emago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Eprist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Elf/Elfpriest.png"))); // NOI18N
        Eprist.setOpaque(true);
        jPanel1.add(Eprist, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Erogue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Elf/Elfrogue.png"))); // NOI18N
        Erogue.setOpaque(true);
        jPanel1.add(Erogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Ewarrior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Elf/Elfwarrior.png"))); // NOI18N
        Ewarrior.setOpaque(true);
        jPanel1.add(Ewarrior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Gbruxo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gnomo/Gnomobruxo.png"))); // NOI18N
        Gbruxo.setOpaque(true);
        jPanel1.add(Gbruxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Ghunter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gnomo/Gnomohunter.png"))); // NOI18N
        Ghunter.setOpaque(true);
        jPanel1.add(Ghunter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Gmago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gnomo/Gnomomage.png"))); // NOI18N
        Gmago.setOpaque(true);
        jPanel1.add(Gmago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Gprist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gnomo/Gnomopriest.png"))); // NOI18N
        Gprist.setOpaque(true);
        jPanel1.add(Gprist, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Grogue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gnomo/Gnomorogue.png"))); // NOI18N
        Grogue.setOpaque(true);
        jPanel1.add(Grogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Gwarrior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Gnomo/Gnomowarrior.png"))); // NOI18N
        Gwarrior.setOpaque(true);
        jPanel1.add(Gwarrior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/fundo.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:        
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Titulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo2ActionPerformed

    private void Titulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo3ActionPerformed

    private void Titulo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo4ActionPerformed

    private void Titulo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo5ActionPerformed

    private void Titulo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo6ActionPerformed

    private void Titulo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo7ActionPerformed

    private void Titulo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo8ActionPerformed

    private void funcaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoTextFieldActionPerformed

    private void ilvlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilvlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilvlTextFieldActionPerformed

    private void classeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classeTextFieldActionPerformed

    private void atributoPrimarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atributoPrimarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atributoPrimarioTextFieldActionPerformed

    private void acertoCriticoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acertoCriticoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acertoCriticoTextFieldActionPerformed

    private void maestriaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maestriaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maestriaTextFieldActionPerformed

    private void aceleracaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceleracaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceleracaoTextFieldActionPerformed

    private void nickTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        contador+=9;
        if(contador>lista.size()-9){
            contador = 0;
        }        
        raca = lista.get(contador+8);
        classe = lista.get(contador+7);
        nickTextField.setText(lista.get(contador));
        funcaoTextField.setText(lista.get(contador+6));
        ilvlTextField.setText(lista.get(contador+1));
        classeTextField.setText(classe);
        atributoPrimarioTextField.setText(lista.get(contador+2));
        acertoCriticoTextField.setText(lista.get(contador+3));
        maestriaTextField.setText(lista.get(contador+4));
        aceleracaoTextField.setText(lista.get(contador+5));
        Abruxo.setVisible(false);
        Ahunter.setVisible(false);
        Amago.setVisible(false);
        Apala.setVisible(false);
        Aprist.setVisible(false);
        Arogue.setVisible(false);
        Ashaman.setVisible(false);
        Awarrior.setVisible(false);
        Edruida.setVisible(false);
        Ehunter.setVisible(false);
        Emago.setVisible(false);
        Eprist.setVisible(false);
        Erogue.setVisible(false);
        Ewarrior.setVisible(false);
        Gbruxo.setVisible(false);
        Gwarrior.setVisible(false);
        Ghunter.setVisible(false);
        Gmago.setVisible(false);
        Gprist.setVisible(false);
        Grogue.setVisible(false);
        Hbruxo.setVisible(false);
        Hhunter.setVisible(false);
        Hmago.setVisible(false);
        Hpala.setVisible(false);
        Hpriest.setVisible(false);
        Hrogue.setVisible(false);
        Hwarrior.setVisible(false);
        if(raca.equals("Humano")){
           if(classe.equals("Guerreiro")){
               Hwarrior.setVisible(true);
           }
           else if(classe.equals("Caçador")){
               Hhunter.setVisible(true);               
           }
           else if(classe.equals("Mago")){
               Hmago.setVisible(true);               
           }
           else if(classe.equals("Rogue")){
               Hrogue.setVisible(true);               
           }
           else if(classe.equals("Sarcedote")){
               Hpriest.setVisible(true);               
           }
           else if(classe.equals("Bruxo")){
               Hbruxo.setVisible(true);               
           }
           else if(classe.equals("Paladino")){
               Hpala.setVisible(true);               
           }
        }
        else if(raca.equals("Anão")){
            if(classe.equals("Guerreiro")){
                Awarrior.setVisible(true);               
           }
           else if(classe.equals("Caçador")){
               Ahunter.setVisible(true);               
           }
           else if(classe.equals("Mago")){
               Amago.setVisible(true);               
           }
           else if(classe.equals("Rogue")){
               Arogue.setVisible(true);               
           }
           else if(classe.equals("Sarcedote")){
               Aprist.setVisible(true);               
           }
           else if(classe.equals("Bruxo")){
               Abruxo.setVisible(true);               
           }
           else if(classe.equals("Paladino")){
               Apala.setVisible(true);               
           }
           else if(classe.equals("Xamã")){
               Ashaman.setVisible(true);               
           }
            
        }
        else if(raca.equals("Elfo")){
           if(classe.equals("Guerreiro")){
               Ewarrior.setVisible(true);               
           }
           else if(classe.equals("Caçador")){
               Ehunter.setVisible(true);                
           }
           else if(classe.equals("Mago")){
               Emago.setVisible(true);                
           }
           else if(classe.equals("Rogue")){
               Erogue.setVisible(true);                
           }
           else if(classe.equals("Sarcedote")){
               Eprist.setVisible(true);                
           }
           else if(classe.equals("Druida")){
               Edruida.setVisible(true);                
           }
            
        }
        else if(raca.equals("Gnomo")){
           if(classe.equals("Guerreiro")){
               Gwarrior.setVisible(true);               
           }
           else if(classe.equals("Caçador")){
               Ghunter.setVisible(true);               
           }
           else if(classe.equals("Mago")){
               Gmago.setVisible(true);               
           }
           else if(classe.equals("Rogue")){
               Grogue.setVisible(true);               
           }
           else if(classe.equals("Sarcedote")){
               Gprist.setVisible(true);               
           }
           else if(classe.equals("Bruxo")){
               Gbruxo.setVisible(true);               
           } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:)
        controller.editarPersonagem(nickTextField.getText(),ilvlTextField.getText(),funcaoTextField.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Titulo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Titulo9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        controller.apagarPersonagem(nickTextField.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ListandoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListandoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListandoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListandoPlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListandoPlayers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abruxo;
    private javax.swing.JLabel Ahunter;
    private javax.swing.JLabel Amago;
    private javax.swing.JLabel Apala;
    private javax.swing.JLabel Aprist;
    private javax.swing.JLabel Arogue;
    private javax.swing.JLabel Ashaman;
    private javax.swing.JLabel Awarrior;
    private javax.swing.JLabel Edruida;
    private javax.swing.JLabel Ehunter;
    private javax.swing.JLabel Emago;
    private javax.swing.JLabel Eprist;
    private javax.swing.JLabel Erogue;
    private javax.swing.JLabel Ewarrior;
    private javax.swing.JLabel Gbruxo;
    private javax.swing.JLabel Ghunter;
    private javax.swing.JLabel Gmago;
    private javax.swing.JLabel Gprist;
    private javax.swing.JLabel Grogue;
    private javax.swing.JLabel Gwarrior;
    private javax.swing.JLabel Hbruxo;
    private javax.swing.JLabel Hhunter;
    private javax.swing.JLabel Hmago;
    private javax.swing.JLabel Hpala;
    private javax.swing.JLabel Hpriest;
    private javax.swing.JLabel Hrogue;
    private javax.swing.JLabel Hwarrior;
    private javax.swing.JTextField Titulo;
    private javax.swing.JTextField Titulo2;
    private javax.swing.JTextField Titulo3;
    private javax.swing.JTextField Titulo4;
    private javax.swing.JTextField Titulo5;
    private javax.swing.JTextField Titulo6;
    private javax.swing.JTextField Titulo7;
    private javax.swing.JTextField Titulo8;
    private javax.swing.JTextField Titulo9;
    private javax.swing.JTextField aceleracaoTextField;
    private javax.swing.JTextField acertoCriticoTextField;
    private javax.swing.JTextField atributoPrimarioTextField;
    private javax.swing.JTextField classeTextField;
    private javax.swing.JTextField funcaoTextField;
    private javax.swing.JTextField ilvlTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField maestriaTextField;
    private javax.swing.JTextField nickTextField;
    // End of variables declaration//GEN-END:variables
}
