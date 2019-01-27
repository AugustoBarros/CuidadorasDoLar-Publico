package julianacad.view;

/**
 *
 * @author Augusto Barros
 */
public class LogAltera extends javax.swing.JInternalFrame {

    public static int idRefe2;
    public String caminho2;
    
    /**
     * Creates new form CadastroCuidadora
     */
    public LogAltera() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //ImageIcon icon = new ImageIcon(getClass().getResource("/images/ChangeLogFundo.png"));
        //final Image fundoChange = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            //@Override
            //protected void paintComponent(Graphics g){
                //super.paintComponent(g);
                //g.drawImage(fundoChange, 0, 0, getWidth(),getHeight(),this);
                //}

        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Changelog");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(1350, 770));
        setPreferredSize(new java.awt.Dimension(900, 660));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jList1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sobre ChangeLog", "Versão 1.0.0 - 29/12/2018", "Versão 1.0.1 - 09/01/2019", "Versão 1.0.2 - 14/01/2019", "Versão 1.1.0 - 20/01/2019" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 270, 590);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("------------------------------------------------------------------------------------------\n                                             SOBRE CHANGELOG\n------------------------------------------------------------------------------------------\nChangeLog do Sistema de Gerenciamento de Informações de Cuidadoras do Lar.\n\nChangeLog é uma seção onde é disponibilizado informações sobre as alterações\nocorridasem cada versionamento, para melhor controle do usuário e do \ndesenvolvedor.\n\nNa lista ao lado estão listadas cada versão com sua data de implementação.\n\nPara visualizar as alterações ocorridas basta clicar em um dos itens da lista.\"\n\n");
        jTextArea1.setMaximumSize(new java.awt.Dimension(708, 148));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(310, 20, 560, 590);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ChangeLogfundo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 660);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 630);

        setBounds(0, 0, 900, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        int ind = jList1.getSelectedIndex();
        System.out.println(ind);
        if(ind == 0){
            jTextArea1.setText("------------------------------------------------------------------------------------------\n                                             SOBRE CHANGELOG\n------------------------------------------------------------------------------------------\nChangeLog do Sistema de Gerenciamento de Informações de Cuidadoras do Lar.\n\nChangeLog é uma seção onde é disponibilizado informações sobre as alterações\nocorridasem cada versionamento, para melhor controle do usuário e do \ndesenvolvedor.\n\nNa lista ao lado estão listadas cada versão com sua data de implementação.\n\nPara visualizar as alterações ocorridas basta clicar em um dos itens da lista.\"\n\n");
        }
        if(ind == 1){
            jTextArea1.setText("------------------------------------------------------------------------------------------\n                                                      Versão 1.0.0\n------------------------------------------------------------------------------------------\n\nPrimeira versão da Aplicação.\n\nData de Implementação: 29/12/2018\n\n------------------------------------------------------------------------------------------\n\nMódulos adicionados:\n\n- Cadastro\n- - Cuidadoras\n- - - Novo Cadastro\n- - - Visualizar Cadastro\n\n------------------------------------------------------------------------------------------\n\nNovo Cadastro(Cuidadoras) : Realiza um novo cadastro de cuidadoras.\n\nVisualizar Cadastro(Cuidadoras) : Exibe uma janela com uma tabela, onde\nsão listadas os cadastros, este menu também permite alterar, consultar\ne excluir os registros, e adicionar novos registros.\n\n ");
        }
        if(ind == 2){
            jTextArea1.setText("------------------------------------------------------------------------------------------\n                                                      Versão 1.0.1\n------------------------------------------------------------------------------------------\n\nData de Implementação: 09/01/2019\n\n\n------------------------------------------------------------------------------------------\n\nMódulos adicionados:\n\n-Changelog: Módulo para controle de alterações feitas no programa\n\n------------------------------------------------------------------------------------------\n\n-Alterações em posições de campos;\n-Campos novos adicionados no total de 5;\n-Correções em campos de \"Região\" e \"Religião\";\n-Correções na Interface de Usuário;\n-Limite de Registro alterado para 6000;\n-Correção de problemas em \"Alteração de foto\".\n\n");
        }
        if(ind == 3){
            jTextArea1.setText("------------------------------------------------------------------------------------------\n                                                      Versão 1.0.2\n------------------------------------------------------------------------------------------\n\nData de Implementação: 14/01/2019\n\n------------------------------------------------------------------------------------------\n\n-Aterações na UI(Interface de Usuário);\n-Cálculo da idade com base em data de nascimento;\n-Otimização de código.\n\n\n\n");
        }
        if(ind == 4){
            jTextArea1.setText("------------------------------------------------------------------------------------------\n                                                     Versão 1.1.0\n------------------------------------------------------------------------------------------\n\nData de Implementação: 20/01/2019\n\n------------------------------------------------------------------------------------------\n\nMódulos adicionados:\n\n    -Busca Avançada: Módulo para busca de cuidadoras mediante a filtros.\n\n------------------------------------------------------------------------------------------\n\n-Otimização de código.");
        }
        
        
        
        
    }//GEN-LAST:event_jList1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

