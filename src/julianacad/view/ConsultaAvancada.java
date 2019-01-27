package julianacad.view;
import model.beans.Cuidadora;
import model.dao.CadastroDAO;
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
public class ConsultaAvancada extends javax.swing.JInternalFrame {
    public static int i = 0;
    /**
     * Creates new form ConsultaTabela
     */
    public ConsultaAvancada() {
        initComponents();
        
        
    }
    public void temFiltro(){
        if(jRadioButton3.isSelected() || jRadioButton4.isSelected() || jRadioButton5.isSelected() || btnRad4.isSelected() || btnRad5.isSelected() || btnRad6.isSelected() || btnRad2.isSelected() ||
                btnRad1.isSelected() || btnRad3.isSelected() || btnRad7.isSelected() || btnRad8.isSelected() || btnRad9.isSelected() || btnRad10.isSelected() || btnRad11.isSelected() || btnRad13.isSelected() ||
                btnRad12.isSelected() || btnRad14.isSelected() || btnRad17.isSelected() || btnRad16.isSelected() || btnRad15.isSelected()){
            
            jButton7.setEnabled(true);
            System.out.println("verda");
        }else{
            System.out.println("verda");
            jButton7.setEnabled(false);
        }
    }
    
    public String getTipoDeCuidadora(){
        
        if(jRadioButton3.isSelected()){
            i++;
            return "= 1";
        }else if(jRadioButton4.isSelected()){
            i++;
            return "= 2";
        }else if(jRadioButton5.isSelected()){
            i++;
            return "= 3";
        }else if(jRadioButton8.isSelected()){
            i++;
            return "IN (3,2,1,0) ";
        }else{
            return "IN (3,2,1,0) ";
        }
    }
    
    public String getMei(){
        
        if(btnRadMEI.isSelected()){
            i++;
            return "1";
        }else{
            return "";
        }
    }
    
    public String getIdade(){
        
        if(btnRad1.isSelected()){
            i++;
            return jTextField10.getText();
        }else{
            return "";
        }
    }
    
    public String getAltura(){
        
        if(btnRad3.isSelected()){
            i++;
            if(jTextField2.getText() != ""){
            String a = "'";
            a = a.concat(jTextField2.getText()).concat("'");
            return a;
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    
    
    public String getCorPele(){
        
        if(btnRad2.isSelected()){
            i++;
            return Integer.toString(jComboBox3.getSelectedIndex());
        }else{
            return "";
        }
    }
    
    public String getRegiao(){
        
        if(btnRad4.isSelected()){
            i++;
            return Integer.toString(jComboBox8.getSelectedIndex());
        }else{
            return "";
        }
    }
    
    public String getBairro(){
        
        if(btnRad5.isSelected()){
            i++;
            String a = "'";
            return a.concat(jTextField9.getText().concat("'"));
        }else{
            return "";
        }
    }
    
    public String getCnh(){
        
        if(btnRad17.isSelected()){
            i++;
            if(jRadioButton7.isSelected()){
                return "1";
            }else if(jRadioButton6.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    
    public String getCidade(){
        
        if(btnRad6.isSelected()){
            i++;
            String a = "'";
            return a.concat(jTextField4.getText()).concat("'");
        }else{
            return "";
        }
    }
    
    public String getReligiao(){
        
        if(btnRad7.isSelected()){
            i++;
            String ind = Integer.toString(jComboBox8.getSelectedIndex());
            return ind;
        }else{
            return "";
        }
    }
    
    public String getCozinha(){
        
        if(btnRad8.isSelected()){
            i++;
            if(jRadioButton22.isSelected()){
                return "2";
            }else if(jRadioButton23.isSelected()){
                return  "1";
            }else{
                return "";
            }
            
        }else{
            return "";
        }
        
    }
    
    public String getDormirTrabalho(){
        
        if(btnRad9.isSelected()){
            i++;
            if(jRadioButton31.isSelected()){
                return "1";
            }else if(jRadioButton30.isSelected()){
                return "2";
            }else{
            return "";
            
            }
        }else{
            return "";
        }
    }
    
    public String getEscala2424(){
        
        if(btnRad10.isSelected()){
            i++;
            if(jRadioButton33.isSelected()){
                return "1";
            }else if(jRadioButton32.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    public String getEscala1236(){
        
        if(btnRad11.isSelected()){
            i++;
            if(jRadioButton35.isSelected()){
                return "1";
            }else if(jRadioButton34.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    public String getSomenteSegSex(){
        
        if(jCheckBox3.isSelected()){
            i++;
            return "1";
        }else{
            return "";
        }
    }
    
    public String getFolguistaFDS(){
        
        if(btnRad12.isSelected()){
            i++;
            if(jRadioButton37.isSelected()){
                return "1";
            }else if(jRadioButton36.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    public String getIntegralFDS(){
        
        if(btnRad13.isSelected()){
            i++;
            if(jRadioButton39.isSelected()){
                return "1";
            }else if(jRadioButton38.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    public String getCursoCuidadora(){
        
        if(btnRad14.isSelected()){
            i++;
            if(jRadioButton41.isSelected()){
                return "1";
            }else if(jRadioButton40.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    public String getPossuiCursoTec(){
        
        if(jCheckBox18.isSelected()){
            i++;
            return "1";
        }else{
            return "";
        }
    }
    
    public String getPossuiCursoAux(){
        
        if(jCheckBox19.isSelected()){
            i++;
            return "1";
        }else{
            return "";
        }
    }
    
    public String getSinaisVitais(){
        
        if(jCheckBox6.isSelected() && jCheckBox7.isSelected() && jCheckBox8.isSelected() && jCheckBox9.isSelected()){//ok{
            i++;
            return "30";
        }else if(jCheckBox6.isSelected() && jCheckBox7.isSelected() && jCheckBox8.isSelected()){ //ok
            i++;
            return "19";
        }else if(jCheckBox6.isSelected() && jCheckBox7.isSelected() && jCheckBox9.isSelected()){ //ok
            i++;
           return "21";
        }else if(jCheckBox6.isSelected() && jCheckBox9.isSelected() && jCheckBox8.isSelected()){
            i++;
           return "23";
        }else if(jCheckBox9.isSelected() && jCheckBox7.isSelected() && jCheckBox8.isSelected()){
            i++;
           return "27";
        }else if(jCheckBox6.isSelected() && jCheckBox7.isSelected()){
            i++;
           return "10";
        }else if(jCheckBox6.isSelected() && jCheckBox8.isSelected()){
            i++;
           return "12";
        }else if(jCheckBox6.isSelected() && jCheckBox9.isSelected()){
            i++;
           return "14"; 
        }else if(jCheckBox7.isSelected() && jCheckBox8.isSelected()){
            i++;
           return "16"; 
        }else if(jCheckBox7.isSelected() && jCheckBox9.isSelected()){
            i++;
           return "18"; 
        }else if(jCheckBox8.isSelected() && jCheckBox9.isSelected()){
            i++;
           return "20"; 
        }else if(jCheckBox6.isSelected()){
            i++;
           return "3"; 
        }else if(jCheckBox7.isSelected()){
            i++;
           return "7"; 
        }else if(jCheckBox8.isSelected()){
            i++;
           return "9"; 
        }else if(jCheckBox9.isSelected()){
            i++;
           return "11"; 
        }else{
            return "";
        }
        
    }
    
    public String getTrabalhaSonda(){
        
        if(btnRad15.isSelected()){
            i++;
            if(jRadioButton46.isSelected()){
                return "1";
            }else if(jRadioButton47.isSelected()){
                return "2";
            }else{
                return "";
            }
            
        }else{
            return "";
        }
    }
    
    public String getTrabalhaBolsa(){
        
        if(btnRad16.isSelected()){
            i++;
            if(jRadioButton49.isSelected()){
                return "1";
            }else if(jRadioButton48.isSelected()){
                return "2";
            }else{
                return "";
            }
        }else{
            return "";
        }
    }
    
    
    
    
    
    
    public  void leituraJTableAvancada(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));
        CadastroDAO result = new CadastroDAO();
        modelo.setNumRows(0);

       
        for(Cuidadora c: result.consultaAvacada(getTipoDeCuidadora(), getMei(), getIdade(), getAltura(), getCorPele(), getRegiao(), getBairro(),getCnh(), getCidade(), getReligiao(), getCozinha(), getDormirTrabalho(), getEscala2424(), getEscala1236(), getSomenteSegSex(), getFolguistaFDS(), getIntegralFDS(), getCursoCuidadora(), getPossuiCursoTec(), getPossuiCursoAux(), getSinaisVitais(), getTrabalhaSonda(), getTrabalhaBolsa(), i)){
   
            
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
        btnGrupoTipo = new javax.swing.ButtonGroup();
        btnGrupoCozinha = new javax.swing.ButtonGroup();
        btnGrupoDormirTra = new javax.swing.ButtonGroup();
        btnGrupoEscala2424 = new javax.swing.ButtonGroup();
        btnGrupoEscala1236 = new javax.swing.ButtonGroup();
        btnGrupoFolguistaFds = new javax.swing.ButtonGroup();
        btnGrupoIntegralFds = new javax.swing.ButtonGroup();
        btnGrupoCursoCuidadora = new javax.swing.ButtonGroup();
        btnGrupoCnh = new javax.swing.ButtonGroup();
        btnGrupoSonda = new javax.swing.ButtonGroup();
        btnGrupoBolsa = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ImageIcon iconeBusca = new ImageIcon(getClass().getResource("/images/FundoBusca.png"));
        final Image imaBusca = iconeBusca.getImage();
        jPanel2 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics grab){
                super.paintComponent(grab);
                grab.drawImage(imaBusca, 0, 0, getWidth(), getHeight(), this);

            }

        };
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        btnRadMEI = new javax.swing.JRadioButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel79 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        btnRad1 = new javax.swing.JRadioButton();
        btnRad2 = new javax.swing.JRadioButton();
        btnRad3 = new javax.swing.JRadioButton();
        btnRad4 = new javax.swing.JRadioButton();
        btnRad5 = new javax.swing.JRadioButton();
        btnRad6 = new javax.swing.JRadioButton();
        btnRad7 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        btnRad8 = new javax.swing.JRadioButton();
        btnRad9 = new javax.swing.JRadioButton();
        btnRad10 = new javax.swing.JRadioButton();
        btnRad11 = new javax.swing.JRadioButton();
        btnRad12 = new javax.swing.JRadioButton();
        btnRad13 = new javax.swing.JRadioButton();
        btnRad14 = new javax.swing.JRadioButton();
        btnRad15 = new javax.swing.JRadioButton();
        btnRad16 = new javax.swing.JRadioButton();
        btnRad17 = new javax.swing.JRadioButton();
        jSeparator40 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator43 = new javax.swing.JSeparator();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator46 = new javax.swing.JSeparator();
        jSeparator47 = new javax.swing.JSeparator();
        jSeparator48 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator49 = new javax.swing.JSeparator();
        jSeparator50 = new javax.swing.JSeparator();
        jSeparator51 = new javax.swing.JSeparator();
        jSeparator52 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator53 = new javax.swing.JSeparator();
        jSeparator54 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator56 = new javax.swing.JSeparator();
        jSeparator57 = new javax.swing.JSeparator();
        jSeparator58 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jRadioButton8 = new javax.swing.JRadioButton();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator59 = new javax.swing.JSeparator();
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

        btnGrupoTipo.add(jRadioButton3);
        btnGrupoTipo.add(jRadioButton4);
        btnGrupoTipo.add(jRadioButton5);
        btnGrupoTipo.add(jRadioButton8);

        btnGrupoCozinha.add(jRadioButton22);
        btnGrupoCozinha.add(jRadioButton23);

        btnGrupoDormirTra.add(jRadioButton30);
        btnGrupoDormirTra.add(jRadioButton31);

        btnGrupoEscala2424.add(jRadioButton32);
        btnGrupoEscala2424.add(jRadioButton33);

        btnGrupoEscala1236.add(jRadioButton34);
        btnGrupoEscala1236.add(jRadioButton35);

        btnGrupoFolguistaFds.add(jRadioButton36);
        btnGrupoFolguistaFds.add(jRadioButton37);

        btnGrupoIntegralFds.add(jRadioButton38);
        btnGrupoIntegralFds.add(jRadioButton39);

        btnGrupoCursoCuidadora.add(jRadioButton40);
        btnGrupoCursoCuidadora.add(jRadioButton41);

        btnGrupoCnh.add(jRadioButton6);
        btnGrupoCnh.add(jRadioButton7);

        btnGrupoSonda.add(jRadioButton46);
        btnGrupoSonda.add(jRadioButton47);

        btnGrupoBolsa.add(jRadioButton48);
        btnGrupoBolsa.add(jRadioButton49);

        setClosable(true);
        setIconifiable(true);
        setTitle("Busca Avançada");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-enfermeira-30 (1).png"))); // NOI18N
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

        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N

        jPanel2.setLayout(null);

        jRadioButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton3.setText("Auxiliar de Enfermagem");
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(10, 90, 230, 30);

        jRadioButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton4.setText("Técnica(o) em Enfermagem");
        jPanel2.add(jRadioButton4);
        jRadioButton4.setBounds(240, 90, 250, 30);

        jRadioButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton5.setText("Cuidadora");
        jPanel2.add(jRadioButton5);
        jRadioButton5.setBounds(500, 90, 120, 30);

        btnRadMEI.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRadMEI.setText("Tem MEI");
        jPanel2.add(btnRadMEI);
        btnRadMEI.setBounds(1230, 210, 90, 30);

        jTextField10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jTextField10.setEnabled(false);
        jPanel2.add(jTextField10);
        jTextField10.setBounds(880, 150, 80, 30);

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jTextField2.setEnabled(false);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(660, 150, 60, 30);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel13.setText("m");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(720, 150, 20, 30);

        jComboBox3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muito Clara", "Clara", "Clara Média(Caucasiano)", "Escura Média", "Escuro (Pardo)", "Negra" }));
        jComboBox3.setEnabled(false);
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(130, 150, 230, 30);

        jComboBox8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sul", "Norte", "Leste", "Oeste", "Central" }));
        jComboBox8.setEnabled(false);
        jPanel2.add(jComboBox8);
        jComboBox8.setBounds(470, 150, 90, 30);

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jTextField4.setEnabled(false);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(1140, 90, 180, 30);

        jTextField9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jTextField9.setEnabled(false);
        jPanel2.add(jTextField9);
        jTextField9.setBounds(810, 90, 220, 30);

        jRadioButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Não");
        jRadioButton6.setEnabled(false);
        jPanel2.add(jRadioButton6);
        jRadioButton6.setBounds(1130, 270, 60, 30);

        jRadioButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton7.setText("Sim");
        jRadioButton7.setEnabled(false);
        jPanel2.add(jRadioButton7);
        jRadioButton7.setBounds(1190, 270, 51, 30);

        jComboBox5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cátolico", "Evangélico", "Espírita", "Testemunha de Jeová", "Ateu", "Outros" }));
        jComboBox5.setEnabled(false);
        jPanel2.add(jComboBox5);
        jComboBox5.setBounds(1150, 150, 160, 30);

        jRadioButton30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton30.setSelected(true);
        jRadioButton30.setText("Não");
        jRadioButton30.setEnabled(false);
        jPanel2.add(jRadioButton30);
        jRadioButton30.setBounds(190, 210, 55, 30);

        jRadioButton31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton31.setText("Sim");
        jRadioButton31.setEnabled(false);
        jPanel2.add(jRadioButton31);
        jRadioButton31.setBounds(250, 210, 60, 30);

        jRadioButton32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton32.setSelected(true);
        jRadioButton32.setText("Não");
        jRadioButton32.setEnabled(false);
        jPanel2.add(jRadioButton32);
        jRadioButton32.setBounds(460, 210, 55, 30);

        jRadioButton33.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton33.setText("Sim");
        jRadioButton33.setEnabled(false);
        jPanel2.add(jRadioButton33);
        jRadioButton33.setBounds(520, 210, 51, 30);

        jRadioButton34.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton34.setSelected(true);
        jRadioButton34.setText("Não");
        jRadioButton34.setEnabled(false);
        jPanel2.add(jRadioButton34);
        jRadioButton34.setBounds(720, 210, 60, 30);

        jRadioButton35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton35.setText("Sim");
        jRadioButton35.setEnabled(false);
        jPanel2.add(jRadioButton35);
        jRadioButton35.setBounds(780, 210, 51, 30);

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel49.setText("Somente Segunda a Sexta:");
        jPanel2.add(jLabel49);
        jLabel49.setBounds(380, 270, 210, 30);
        jPanel2.add(jCheckBox3);
        jCheckBox3.setBounds(580, 270, 20, 30);

        jRadioButton36.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton36.setSelected(true);
        jRadioButton36.setText("Não");
        jRadioButton36.setEnabled(false);
        jPanel2.add(jRadioButton36);
        jRadioButton36.setBounds(240, 270, 60, 29);

        jRadioButton37.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton37.setText("Sim");
        jRadioButton37.setEnabled(false);
        jPanel2.add(jRadioButton37);
        jRadioButton37.setBounds(300, 270, 60, 29);

        jRadioButton38.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton38.setSelected(true);
        jRadioButton38.setText("Não");
        jRadioButton38.setEnabled(false);
        jPanel2.add(jRadioButton38);
        jRadioButton38.setBounds(1090, 210, 55, 30);

        jRadioButton39.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton39.setText("Sim");
        jRadioButton39.setEnabled(false);
        jPanel2.add(jRadioButton39);
        jRadioButton39.setBounds(1150, 210, 51, 30);

        jRadioButton40.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton40.setSelected(true);
        jRadioButton40.setText("Não");
        jRadioButton40.setEnabled(false);
        jPanel2.add(jRadioButton40);
        jRadioButton40.setBounds(860, 270, 60, 30);

        jRadioButton41.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton41.setText("Sim");
        jRadioButton41.setEnabled(false);
        jPanel2.add(jRadioButton41);
        jRadioButton41.setBounds(930, 270, 50, 30);

        jLabel79.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel79.setText("Curso de Técnico em Enfermagem:");
        jPanel2.add(jLabel79);
        jLabel79.setBounds(20, 330, 260, 30);
        jPanel2.add(jCheckBox18);
        jCheckBox18.setBounds(280, 330, 20, 30);

        jLabel54.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel54.setText("Curso de Auxiliar de Enfermagem:");
        jPanel2.add(jLabel54);
        jLabel54.setBounds(330, 330, 250, 30);
        jPanel2.add(jCheckBox19);
        jCheckBox19.setBounds(580, 330, 30, 30);

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel53.setText("Sabe Aferir Sinais Vitais:");
        jPanel2.add(jLabel53);
        jLabel53.setBounds(20, 390, 180, 30);

        jCheckBox6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox6.setText("Pressão Manual");
        jPanel2.add(jCheckBox6);
        jCheckBox6.setBounds(20, 420, 133, 30);

        jCheckBox7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox7.setText("Pressão Digital");
        jPanel2.add(jCheckBox7);
        jCheckBox7.setBounds(20, 450, 127, 30);

        jCheckBox8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox8.setText("Diabetes");
        jPanel2.add(jCheckBox8);
        jCheckBox8.setBounds(20, 480, 85, 30);

        jCheckBox9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox9.setText("Insulina");
        jPanel2.add(jCheckBox9);
        jCheckBox9.setBounds(20, 510, 81, 30);

        jRadioButton47.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton47.setSelected(true);
        jRadioButton47.setText("Não");
        jRadioButton47.setEnabled(false);
        jPanel2.add(jRadioButton47);
        jRadioButton47.setBounds(850, 330, 55, 30);

        jRadioButton46.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton46.setText("Sim");
        jRadioButton46.setEnabled(false);
        jPanel2.add(jRadioButton46);
        jRadioButton46.setBounds(910, 330, 51, 30);

        jRadioButton48.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton48.setSelected(true);
        jRadioButton48.setText("Não");
        jRadioButton48.setEnabled(false);
        jPanel2.add(jRadioButton48);
        jRadioButton48.setBounds(470, 390, 60, 30);

        jRadioButton49.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton49.setText("Sim");
        jRadioButton49.setEnabled(false);
        jPanel2.add(jRadioButton49);
        jRadioButton49.setBounds(530, 390, 50, 30);

        jButton7.setBackground(new java.awt.Color(77, 166, 255));
        jButton7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton7.setText("Pesquisar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(1060, 620, 170, 50);

        btnRad1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad1.setText("Idade:");
        btnRad1.setEnabled(false);
        jPanel2.add(btnRad1);
        btnRad1.setBounds(800, 150, 80, 30);

        btnRad2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad2.setText("Cor da Pele:");
        btnRad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad2);
        btnRad2.setBounds(10, 150, 120, 30);

        btnRad3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad3.setText("Altura:");
        btnRad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad3);
        btnRad3.setBounds(580, 150, 80, 30);

        btnRad4.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad4.setText("Região:");
        btnRad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad4);
        btnRad4.setBounds(390, 150, 81, 30);

        btnRad5.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad5.setText("Bairro:");
        btnRad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad5);
        btnRad5.setBounds(740, 90, 90, 30);

        btnRad6.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad6.setText("Cidade:");
        btnRad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad6);
        btnRad6.setBounds(1060, 90, 90, 30);

        btnRad7.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad7.setText("Religião:");
        btnRad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad7);
        btnRad7.setBounds(1060, 150, 90, 30);

        jRadioButton22.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton22.setSelected(true);
        jRadioButton22.setText("Não");
        jRadioButton22.setEnabled(false);
        jPanel2.add(jRadioButton22);
        jRadioButton22.setBounds(1090, 330, 55, 30);

        jRadioButton23.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton23.setText("Sim");
        jRadioButton23.setEnabled(false);
        jPanel2.add(jRadioButton23);
        jRadioButton23.setBounds(1150, 330, 50, 30);

        btnRad8.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad8.setText("Cozinha: ");
        btnRad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad8);
        btnRad8.setBounds(1010, 330, 90, 30);

        btnRad9.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad9.setText("Dormir no Trabalho:");
        btnRad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad9ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad9);
        btnRad9.setBounds(10, 210, 180, 30);

        btnRad10.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad10.setText("Escala 24/24H:");
        btnRad10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad10ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad10);
        btnRad10.setBounds(330, 210, 131, 31);

        btnRad11.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad11.setText("Escala 12/36H: ");
        btnRad11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad11ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad11);
        btnRad11.setBounds(590, 210, 140, 30);

        btnRad12.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad12.setText("Folguista Finais de Semana:");
        btnRad12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad12ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad12);
        btnRad12.setBounds(10, 270, 230, 30);

        btnRad13.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad13.setText("Integral Sábado e Domingo:");
        btnRad13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad13ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad13);
        btnRad13.setBounds(860, 210, 230, 30);

        btnRad14.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad14.setText("Possui Curso de Cuidadora:");
        btnRad14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad14ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad14);
        btnRad14.setBounds(630, 270, 230, 30);

        btnRad15.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad15.setText("Sabe Trabalhar com Sonda:");
        btnRad15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad15ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad15);
        btnRad15.setBounds(620, 330, 230, 30);

        btnRad16.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad16.setText("Sabe Trabalhar com Bolsa:");
        btnRad16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad16ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad16);
        btnRad16.setBounds(250, 390, 220, 30);

        btnRad17.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRad17.setText("Possui CNH:");
        btnRad17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRad17ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRad17);
        btnRad17.setBounds(1010, 270, 120, 30);

        jSeparator40.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator40);
        jSeparator40.setBounds(730, 75, 2, 60);

        jSeparator26.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator26);
        jSeparator26.setBounds(0, 73, 1335, 2);

        jSeparator25.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator25);
        jSeparator25.setBounds(0, 135, 1335, 2);

        jSeparator42.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator42);
        jSeparator42.setBounds(1050, 75, 2, 60);

        jSeparator27.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator27);
        jSeparator27.setBounds(0, 195, 1335, 2);

        jSeparator43.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator43);
        jSeparator43.setBounds(375, 135, 2, 60);

        jSeparator45.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator45);
        jSeparator45.setBounds(570, 135, 2, 60);

        jSeparator46.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator46);
        jSeparator46.setBounds(570, 135, 2, 60);

        jSeparator47.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator47);
        jSeparator47.setBounds(745, 135, 2, 60);

        jSeparator48.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator48);
        jSeparator48.setBounds(1030, 135, 2, 60);

        jSeparator28.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator28);
        jSeparator28.setBounds(0, 255, 1335, 2);

        jSeparator49.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator49);
        jSeparator49.setBounds(310, 195, 2, 60);

        jSeparator50.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator50);
        jSeparator50.setBounds(580, 195, 2, 60);

        jSeparator51.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator51);
        jSeparator51.setBounds(840, 195, 2, 60);

        jSeparator52.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator52);
        jSeparator52.setBounds(1215, 195, 2, 60);

        jSeparator29.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator29);
        jSeparator29.setBounds(0, 315, 1335, 2);

        jSeparator53.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator53);
        jSeparator53.setBounds(360, 255, 2, 60);

        jSeparator54.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator54);
        jSeparator54.setBounds(615, 255, 2, 60);

        jSeparator55.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator55);
        jSeparator55.setBounds(990, 255, 2, 60);

        jSeparator30.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator30);
        jSeparator30.setBounds(230, 435, 371, 2);

        jSeparator56.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator56);
        jSeparator56.setBounds(230, 375, 2, 177);

        jSeparator57.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator57);
        jSeparator57.setBounds(610, 315, 2, 60);

        jSeparator58.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator58);
        jSeparator58.setBounds(985, 315, 2, 60);

        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator31);
        jSeparator31.setBounds(0, 550, 230, 2);

        jRadioButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton8.setSelected(true);
        jRadioButton8.setText("Todos");
        jPanel2.add(jRadioButton8);
        jRadioButton8.setBounds(630, 90, 77, 30);

        jSeparator32.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator32);
        jSeparator32.setBounds(0, 375, 1335, 2);

        jSeparator59.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator59);
        jSeparator59.setBounds(600, 375, 2, 60);

        jTabbedPane1.addTab("Filtros da Pesquisa", jPanel2);

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

        jTabbedPane1.addTab("Resultados da Pesquisa", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1340, 740);

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
        CadastroDAO apaga = new CadastroDAO();
        c.setIdCuidadora(AtualizaCuidadora.idRefe2);
        
        apaga.deletaRegistro(c);

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
        CadastroDAO apaga = new CadastroDAO();
        c.setIdCuidadora(AtualizaCuidadora.idRefe2);
        
        apaga.deletaRegistro(c);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        leituraJTableAvancada();
        i = 0;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnRad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad2ActionPerformed
        if(btnRad2.isSelected()){
            
           jComboBox3.setEnabled(true);
       }else{
           jComboBox3.setEnabled(false);
       }   
    }//GEN-LAST:event_btnRad2ActionPerformed

    private void btnRad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad3ActionPerformed
        if(btnRad3.isSelected()){
            
           jTextField2.setEnabled(true);
       }else{
           jTextField2.setEnabled(false);
       } 
    }//GEN-LAST:event_btnRad3ActionPerformed

    private void btnRad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad4ActionPerformed
       if(btnRad4.isSelected()){
          
           jComboBox8.setEnabled(true);
       }else{
           
           jComboBox8.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad4ActionPerformed

    private void btnRad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad5ActionPerformed
        if(btnRad5.isSelected()){
            temFiltro();
            jTextField9.setEnabled(true);
        }else{
            jTextField9.setEnabled(false);
        }
    }//GEN-LAST:event_btnRad5ActionPerformed

    private void btnRad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad6ActionPerformed
        if(btnRad6.isSelected()){
            temFiltro();
            jTextField4.setEnabled(true);
        }else{
            jTextField4.setEnabled(false);
        }
    }//GEN-LAST:event_btnRad6ActionPerformed

    private void btnRad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad7ActionPerformed
        if(btnRad7.isSelected()){
            temFiltro();
           jComboBox5.setEnabled(true);
       }else{
           jComboBox5.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad7ActionPerformed

    private void btnRad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad8ActionPerformed
        if(btnRad8.isSelected()){
           
           jRadioButton22.setEnabled(true);
           jRadioButton23.setEnabled(true);
       }else{
           jRadioButton22.setEnabled(false);
           jRadioButton23.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad8ActionPerformed

    private void btnRad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad9ActionPerformed
        if(btnRad9.isSelected()){
           jRadioButton30.setEnabled(true);
           jRadioButton31.setEnabled(true);
       }else{
           jRadioButton30.setEnabled(false);
           jRadioButton31.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad9ActionPerformed

    private void btnRad10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad10ActionPerformed
        if(btnRad10.isSelected()){
           jRadioButton32.setEnabled(true);
           jRadioButton33.setEnabled(true);
       }else{
           jRadioButton32.setEnabled(false);
           jRadioButton33.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad10ActionPerformed

    private void btnRad11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad11ActionPerformed
        if(btnRad11.isSelected()){
           jRadioButton34.setEnabled(true);
           jRadioButton35.setEnabled(true);
       }else{
           jRadioButton34.setEnabled(false);
           jRadioButton35.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad11ActionPerformed

    private void btnRad12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad12ActionPerformed
        if(btnRad12.isSelected()){
           jRadioButton36.setEnabled(true);
           jRadioButton37.setEnabled(true);
       }else{
           jRadioButton36.setEnabled(false);
           jRadioButton37.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad12ActionPerformed

    private void btnRad13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad13ActionPerformed
        if(btnRad13.isSelected()){
           jRadioButton38.setEnabled(true);
           jRadioButton39.setEnabled(true);
       }else{
           jRadioButton38.setEnabled(false);
           jRadioButton39.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad13ActionPerformed

    private void btnRad14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad14ActionPerformed
        if(btnRad14.isSelected()){
           jRadioButton40.setEnabled(true);
           jRadioButton41.setEnabled(true);
       }else{
           jRadioButton40.setEnabled(false);
           jRadioButton41.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad14ActionPerformed

    private void btnRad15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad15ActionPerformed
        if(btnRad15.isSelected()){
           jRadioButton46.setEnabled(true);
           jRadioButton47.setEnabled(true);
       }else{
           jRadioButton46.setEnabled(false);
           jRadioButton47.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad15ActionPerformed

    private void btnRad16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad16ActionPerformed
        if(btnRad16.isSelected()){
           jRadioButton48.setEnabled(true);
           jRadioButton49.setEnabled(true);
       }else{
           jRadioButton48.setEnabled(false);
           jRadioButton49.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad16ActionPerformed

    private void btnRad17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRad17ActionPerformed
        if(btnRad17.isSelected()){
           jRadioButton6.setEnabled(true);
           jRadioButton7.setEnabled(true);
       }else{
           jRadioButton6.setEnabled(false);
           jRadioButton7.setEnabled(false);
       }
    }//GEN-LAST:event_btnRad17ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoBolsa;
    private javax.swing.ButtonGroup btnGrupoCnh;
    private javax.swing.ButtonGroup btnGrupoCozinha;
    private javax.swing.ButtonGroup btnGrupoCursoCuidadora;
    private javax.swing.ButtonGroup btnGrupoDormirTra;
    private javax.swing.ButtonGroup btnGrupoEscala1236;
    private javax.swing.ButtonGroup btnGrupoEscala2424;
    private javax.swing.ButtonGroup btnGrupoFiltroPesquisa;
    private javax.swing.ButtonGroup btnGrupoFolguistaFds;
    private javax.swing.ButtonGroup btnGrupoIntegralFds;
    private javax.swing.ButtonGroup btnGrupoSonda;
    private javax.swing.ButtonGroup btnGrupoTipo;
    private javax.swing.JRadioButton btnRad1;
    private javax.swing.JRadioButton btnRad10;
    private javax.swing.JRadioButton btnRad11;
    private javax.swing.JRadioButton btnRad12;
    private javax.swing.JRadioButton btnRad13;
    private javax.swing.JRadioButton btnRad14;
    private javax.swing.JRadioButton btnRad15;
    private javax.swing.JRadioButton btnRad16;
    private javax.swing.JRadioButton btnRad17;
    private javax.swing.JRadioButton btnRad2;
    private javax.swing.JRadioButton btnRad3;
    private javax.swing.JRadioButton btnRad4;
    private javax.swing.JRadioButton btnRad5;
    private javax.swing.JRadioButton btnRad6;
    private javax.swing.JRadioButton btnRad7;
    private javax.swing.JRadioButton btnRad8;
    private javax.swing.JRadioButton btnRad9;
    private javax.swing.JRadioButton btnRadMEI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables














}
