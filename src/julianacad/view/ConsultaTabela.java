package julianacad.view;
import model.beans.Cuidadora;
import model.dao.CadastroCuidadoraDAO;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Augusto Barros
 */
public class ConsultaTabela extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaTabela
     */
    public ConsultaTabela() {
        initComponents();
        leituraJTable();
        
    }
    
    
    public  void leituraJTable(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        CadastroCuidadoraDAO result = new CadastroCuidadoraDAO();
        modelo.setNumRows(0);

        for(Cuidadora c: result.consultaTabela()){
          
            modelo.addRow(new Object[]{
                c.getIdCuidadora(),
                c.getNome(),
                c.getTipoCuidadora(c.getTipoCuidadora()),
                c.getRegiaoListaIndex(c.getRegiaoListaIndex()),
                c.getIdade(),
                c.getCorPeleIndex(c.getCorPeleIndex()),
                c.getTelefoneCelularCuidadora()
                    
            });
      
        }
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnGrupoFiltroPesquisa = new javax.swing.ButtonGroup();
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/FundoConsulta.png"));
        final Image imageConsulta = icon1.getImage();
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(imageConsulta, 0, 0, getWidth(), getHeight(), this);
            }

        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenuItem3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jMenuItem3.setText("Consultar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jMenuItem4.setText("Alterar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        jMenuItem2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jMenuItem2.setText("Apagar");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(100, 30));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        btnGrupoFiltroPesquisa.add(jRadioButton1);
        btnGrupoFiltroPesquisa.add(jRadioButton2);

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastros de Cuidadoras");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/IconeVisualizarCadastros.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(1350, 770));
        setPreferredSize(new java.awt.Dimension(1350, 770));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 700));
        pack();
        jPanel1.setSize(screenSize.width,screenSize.height);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(2000, 100));

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Função", "Região", "Idade", "Cor", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable1.setPreferredSize(new java.awt.Dimension(1350, 1000000));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(25);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 1317, 518);

        jButton1.setBackground(new java.awt.Color(77, 166, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 40, 150, 30);

        jButton2.setBackground(new java.awt.Color(77, 166, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton2.setText("Atualizar Lista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 130, 150, 30);

        jButton3.setBackground(new java.awt.Color(77, 166, 255));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton3.setText("Alterar Registro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(540, 130, 150, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel1.setText("Filtro:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 40, 70, 30);
        jPanel1.add(txtFiltro);
        txtFiltro.setBounds(130, 40, 190, 30);

        jButton4.setBackground(new java.awt.Color(77, 166, 255));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton4.setText("Novo Cadastro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(220, 130, 150, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel2.setText("Pesquisa:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 40, 70, 30);

        jRadioButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton1.setText("Código");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(540, 40, 80, 29);

        jRadioButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton2.setText("Nome");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(620, 40, 80, 29);

        jButton5.setBackground(new java.awt.Color(77, 166, 255));
        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton5.setText("Consulta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(380, 130, 150, 30);

        jButton6.setBackground(new java.awt.Color(77, 166, 255));
        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton6.setText("Apagar Registro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(700, 130, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1350, 740);

        setBounds(0, 0, 1350, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Object codigo = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        String codigoStr = codigo.toString();
        int codFinal = Integer.parseInt(codigoStr);
        
        ConsultaCuidadora.idRefe = codFinal;
        AtualizaCuidadora.idRefe2 = codFinal;
        
        if(SwingUtilities.isRightMouseButton(evt) && (jTable1.getSelectedRow() != -1) && (jTable1.getSelectedRowCount() == 1)){
        
            if(jPopupMenu2.isVisible() == false){
            
                jPopupMenu2.show(jTable1, evt.getX(), evt.getY() );
                
            }else{
                
                jPopupMenu2.setVisible(false);
                
            }
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if(SwingUtilities.isLeftMouseButton(evt)){
            jTable1.clearSelection();
        }
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jRadioButton1.isSelected() ){
            for(int i = 0; i < jTable1.getRowCount(); i++){
                
                if(txtFiltro.getText().equals(jTable1.getModel().getValueAt(i, 0).toString())){
                    jTable1.changeSelection(i, 0, false, false);
                    break;
                }
            }
           
        }else if(jRadioButton2.isSelected()  ){
            for(int i = 0; i < jTable1.getRowCount(); i++){
                
                String filtroResultado = jTable1.getModel().getValueAt(i, 1).toString();
                filtroResultado = filtroResultado.toLowerCase();
                
                if(txtFiltro.getText().toLowerCase().equals(filtroResultado) || filtroResultado.contains(txtFiltro.getText().toLowerCase()) ){
                    
                    jTable1.changeSelection(i, 1, false, false);
                    break;
                }
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        leituraJTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AtualizaCuidadora atualizaCad = new AtualizaCuidadora();
        getParent().add(atualizaCad);
        atualizaCad.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CadastroCuidadora novoCadastro = new CadastroCuidadora();
        getParent().add(novoCadastro);
        novoCadastro.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        

        ConsultaCuidadora con = new ConsultaCuidadora();
        getParent().add(con);
        con.setVisible(true);
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Cuidadora c = new Cuidadora();
        CadastroCuidadoraDAO apaga = new CadastroCuidadoraDAO();
        c.setIdCuidadora(AtualizaCuidadora.idRefe2);
        
        apaga.deletaRegistro(c);
        leituraJTable();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultaCuidadora con = new ConsultaCuidadora();
        getParent().add(con);
        con.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AtualizaCuidadora atualizaCad = new AtualizaCuidadora();
        getParent().add(atualizaCad);
        atualizaCad.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Cuidadora c = new Cuidadora();
        CadastroCuidadoraDAO apaga = new CadastroCuidadoraDAO();
        c.setIdCuidadora(AtualizaCuidadora.idRefe2);
        
        apaga.deletaRegistro(c);
        leituraJTable();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoFiltroPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
