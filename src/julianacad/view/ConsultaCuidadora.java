package julianacad.view;
import java.awt.Graphics;
import java.util.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import model.beans.Cuidadora;
import model.dao.CadastroDAO;

/**
 *
 * @author Augusto Barros
 */
public class ConsultaCuidadora extends javax.swing.JInternalFrame {

    public static int idRefe;
    
    
    /**
     * Creates new form CadastroCuidadora
     */
    public ConsultaCuidadora() {
        initComponents();
        CadastroDAO re = new CadastroDAO();
        Cuidadora c = new Cuidadora();
        
        
        re.consultaCadastro(c,idRefe);
        this.setTitle("Consulta no Cadastro de " + c.getNome());
        //id cuidadora
        jTextField3.setText(String.valueOf(c.getIdCuidadora()));
        
        // nome cuidadora
        jTextField10.setText(c.getNome());
        
        //Tipo de cuidadora
        if(c.getTipoCuidadora() == 1){
            jRadioButton3.setSelected(true);
        }else if(c.getTipoCuidadora() == 2){
            jRadioButton1.setSelected(true);
        }else if(c.getTipoCuidadora() == 3){
            jRadioButton2.setSelected(true);
        }
       
        //tem mei
        if(c.getTemMei() == 1){
            btnRadMEI.setSelected(true);
        }
        
        //cnpj
        if(btnRadMEI.isSelected()){
            txtCNPJ.setEnabled(true);
            lblCNPJ.setEnabled(true);
            txtCNPJ.setText(c.getCnpj());
        }
         
        //RG
        jTextField30.setText(c.getNumeroRg());
        
        //CPF
        txtFild3.setText(c.getCpf());
        
        //idade
        txtFild10.setText(c.getIdade());
        if(txtFild10.getText() != ""){
        String nasc = txtFild10.getText();
        nasc = nasc.substring(6, 10);
        int nascInt = Integer.parseInt(nasc);
        //data e conversão para int para calculo
        Date hoje = new Date();
        String data = hoje.toString();
        String ano = data.substring(25, 29);
        int anoInt = Integer.parseInt(ano);
        
        
        
        //Cálculo para idade
        Integer res = anoInt - nascInt;
        
        
        
        jTextField6.setText(res.toString());
        }
        //altura
        jTextField2.setText(c.getAltura());
        
        //peso
        jTextField7.setText(c.getPeso());
        
        
        //cor da pele
        jComboBox3.setSelectedIndex(c.getCorPeleIndex());
        
        
        //regiao
        if(c.getRegiaoListaIndex() >= 0 && c.getRegiaoListaIndex() < 5){
            jComboBox7.setSelectedIndex(c.getRegiaoListaIndex());
        }else{
            jComboBox7.setSelectedIndex(1);
        }
        
        
        
        //estado civil
        jComboBox2.setSelectedIndex(c.getEstadoCivilIndex());
        
        //filhos
        if(c.getFilhosSimNao() == 1){
            radFilhoSim.setSelected(true);
            radMenor.setEnabled(true);
            radMaior.setEnabled(true);
        }else if(c.getFilhosSimNao() == 2){
            radFilhoNao.setSelected(true);
        }
        
        //filhor menor maior e campo menor
        if(c.getFilhoMaiorMenor() == 2){
            
            radMenor.setSelected(true);
            txtNumFilhos.setEnabled(true);
            txtNumFilhos.setText(c.getCampoMenor());
        }else if(c.getFilhoMaiorMenor() == 1){
            radMaior.setSelected(true);
            
        }
        
        //cnh sim nao
        if(c.getCnhSimNao() == 1){
            jRadioButton4.setSelected(true);
        }else if(c.getCnhSimNao() == 2){
            jRadioButton5.setSelected(true);
        }
        
        if(c.getPossuiCarroSimNao() == 1){
            jRadioButton7.setSelected(true);
        }else if(c.getPossuiCarroSimNao() == 2){
            jRadioButton6.setSelected(true);
        }
        
        //endereco
        jTextField11.setText(c.getEndereco());
        
                
        //numero
        jTextField8.setText(c.getNumeroEndereco());
        
        //cep
        txtFild4.setText(c.getCepEndereco());
        
        //uf index
        jComboBox1.setSelectedIndex(c.getUfListaIndex());
        
        //Bairro Endere
        jTextField9.setText(c.getBairroEndereco());
        
        //ciade endere
        jTextField4.setText(c.getCidade());
        
        //telefone Resi
        txtFild5.setText(c.getTelefoneResidencialCuidadora());
        
        //Telefone Ce
        txtFild2.setText(c.getTelefoneCelularCuidadora());
        
        //whats
        if(c.getWhatsappSimNao() == 1){
            jRadioButton8.setSelected(true);
        }else if(c.getWhatsappSimNao() == 2){
            jRadioButton9.setSelected(true);
        }
        
        //religiao
        jComboBox5.setSelectedIndex(c.getReligiaoIndex());
        
        //fumante sim nao
        if(c.getFumanteSimNao() == 1){
            jRadioButton10.setSelected(true);
        }else if(c.getFumanteSimNao() == 2){
            jRadioButton11.setSelected(true);
        }
        
        //grau
        jComboBox6.setSelectedIndex(c.getGrauEscolarIndex());
        
        //campo superior
        jTextField5.setText(c.getCursoSuperior());
        
        //gosta de animais
        if(c.getGostaAnimalSimNao() == 1){
            jRadioButton13.setSelected(true);
        }else if(c.getGostaAnimalSimNao() == 2){
            jRadioButton12.setSelected(true);
        }
        
        //alergias sim nao
        if(c.getAlergiaSimNao() == 1){
            jRadioButton14.setSelected(true);
            txtAlergia.setEnabled(true);
            txtAlergia.setText(c.getQualAlergia());
        }else if(c.getAlergiaSimNao() == 2){
            jRadioButton15.setSelected(true);
        }
        
        
        //registro Clt
        if(c.getRegistroCLTSimNao() == 1){
            jRadioButton17.setSelected(true);
        }else if(c.getRegistroCLTSimNao() == 2){
            jRadioButton16.setSelected(true);
        }
        
        //convenio medico
        if(c.getConvenioMedicoSimNao() == 1){
            jRadioButton19.setSelected(true);
        }else if(c.getConvenioMedicoSimNao() == 2){
            jRadioButton18.setSelected(true);
        }
        
        //habilidades
        jTextField15.setText(c.getHabilidades());
        
        //disponibilidade para viajar
        if(c.getDisponivelViagemSimNao() == 1){
            jRadioButton21.setSelected(true);
        }else if(c.getDisponivelViagemSimNao() == 2){
            jRadioButton20.setSelected(true);
        }
        
        //cozinha sim nao
        if(c.getCozinhaSimNao() == 1){
            jRadioButton23.setSelected(true);
        }else if(c.getCozinhaSimNao() == 2){
            jRadioButton22.setSelected(true);
        }
        
        //prefere H ou M
        if(c.getPrefereHouM() == 3){
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
        }else if(c.getPrefereHouM() == 2){
            jCheckBox2.setSelected(true);
        }else if(c.getPrefereHouM() == 1){
            jCheckBox1.setSelected(true);
        }
        
        //pressao alta sim nao
        if(c.getPressaoAltaSimNao() == 1) {
            jRadioButton27.setSelected(true);
        }else if(c.getPressaoAltaSimNao() == 2){
            jRadioButton26.setSelected(true);
        }
        
        //diabetes
        if(c.getDiabeteSimNao() == 1){
            jRadioButton28.setSelected(true);
        }else if(c.getDiabeteSimNao() == 2){
            jRadioButton29.setSelected(true);
        }
        
        //tratamento medico
        jTextField13.setText(c.getTratamentoMedico());
        
        //dormir trabalho
        if(c.getDormirTrabalhoSimNao() == 1){
            jRadioButton31.setSelected(true);
        }else if(c.getDormirTrabalhoSimNao() == 2){
            jRadioButton30.setSelected(true);
        }
        
        //escala 5 2 - AGORA É DISPONIBILIDADE TOTATL
        if(c.getDisponibilidadeTotal() == 1){
            jCheckBox16.setSelected(true);
        }else {
            jCheckBox16.setSelected(true);
        }
        
        //escala 2424
        if(c.getEscala2424SimNao() == 1){
            jRadioButton33.setSelected(true);
        }else if(c.getEscala2424SimNao() == 2){
            jRadioButton32.setSelected(true);
        }
        
        //escala 1236
        if(c.getEscala1236SimNao() == 1){
            jRadioButton35.setSelected(true);
        }else if(c.getEscala1236SimNao() == 2){
            jRadioButton34.setSelected(true);
        }
        
        //lista diuron
        if(jRadioButton35.isSelected()){
            jComboBox4.setSelectedIndex(c.getDiurnoIndex());
        }
        
        //somente seg a sex
        if(c.getSomenteSegASex() == 1){
            jCheckBox3.setSelected(true);
        }
        
        //folguista fds
        if(c.getFolguistaFdsSimNao() == 1){
            jRadioButton37.setSelected(true);
        }else if(c.getFolguistaFdsSimNao() == 2){
            jRadioButton36.setSelected(true);
        }
        
        //integral fds
        if(c.getIntegralFdsSimNao() == 1){
            jRadioButton39.setSelected(true);
        }else if(c.getIntegralFdsSimNao() == 2){
            jRadioButton38.setSelected(true);
        }
        
        //pretencao sal
        txtFild.setText(c.getPretencaoSalarial());
        
        //obsercações
        jTextArea1.setText(c.getObservacoes());
        
        //tem curso cuidadora
        if(c.getTemCursoCuidadora() == 1){
            jRadioButton41.setSelected(true);
            lblQual.setEnabled(true);
            jTextField12.setEnabled(true);
            lblCertificado.setEnabled(true);
            btnRadSimCertificado.setEnabled(true);
            btnRadNaoCertificado.setEnabled(true);
        }else if(c.getTemCertificadoSimNao() == 2){
            jRadioButton40.setSelected(true);
        }
        
        //qual curos
        if(jRadioButton41.isSelected()){
            jTextField12.setText(c.getQualCursoCuidadora());
        }
        
        //tem certificado
        if(c.getTemCertificadoSimNao() == 1){
            btnRadSimCertificado.setSelected(true);
        }else if(c.getTemCertificadoSimNao() == 2){
            btnRadNaoCertificado.setSelected(true);
        }
        
        //coren ativo
        if(c.getCorenAtivoSimNao() == 1){
            jRadioButton45.setSelected(true);
            txtInscricao.setEnabled(true);
        }else if(c.getCorenAtivoSimNao() == 2){
            jRadioButton44.setSelected(true);
        }
        
        //numero conren
        if(jRadioButton45.isSelected()){
            txtInscricao.setText(c.getInscricaoCoren());
        }
        
        //como pedou conecimento
        if(c.getComoAdiquiriuConhecimentoPraCur() == 3){
            jCheckBox5.setSelected(true);
            jCheckBox4.setSelected(true);
        }else if(c.getComoAdiquiriuConhecimentoPraCur() == 1){
            jCheckBox4.setSelected(true);
        }else if(c.getComoAdiquiriuConhecimentoPraCur() == 2){
            jCheckBox5.setSelected(true);
        }
        
        //sabe aferir dados vitais
        if(c.getAferirSinaisVitais() == 30){
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(true);
            jCheckBox8.setSelected(true);
            jCheckBox9.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 19){
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(true);
            jCheckBox8.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 21){
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(true);
            jCheckBox9.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 23){
            jCheckBox6.setSelected(true);
            jCheckBox9.setSelected(true);
            jCheckBox8.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 27){
            jCheckBox9.setSelected(true);
            jCheckBox7.setSelected(true);
            jCheckBox8.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 10){
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 12){
            jCheckBox6.setSelected(true);
            jCheckBox8.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 14){
            jCheckBox6.setSelected(true);
            jCheckBox9.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 16){
            jCheckBox7.setSelected(true);
            jCheckBox8.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 18){
            jCheckBox7.setSelected(true);
            jCheckBox9.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 20){
            jCheckBox8.setSelected(true);
            jCheckBox9.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 3){
            jCheckBox6.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 7){
            jCheckBox7.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 9){
            jCheckBox8.setSelected(true);
        }else if(c.getAferirSinaisVitais() == 11){
            jCheckBox9.setSelected(true);
        }
        
        //trabalha com sonda
        if(c.getTrabalhaSondaSimNao() == 1){
            jRadioButton46.setSelected(true);
            lblQualBolsa.setEnabled(true);
            txtQualBolsa.setEnabled(true);
        }else if(c.getTrabalhaBolsaSimNao() == 2){
            jRadioButton47.setSelected(true);
        }
        
        //qual sonda
        if(jRadioButton49.isSelected()){
            txtQualBolsa.setText(c.getQualSonda());
        }
        
        //trabalha com bolsa
        if(c.getTrabalhaBolsaSimNao() == 1){
            jRadioButton49.setSelected(true);
            
        }else if(c.getTrabalhaBolsaSimNao() == 2){
            jRadioButton48.setSelected(true);
        }
        //colostomia
        
        if(c.getColostomia() == 1){
            jCheckBox19.setEnabled(true);
            jCheckBox19.setSelected(true);
        }
        
        
        //dependenic
        jTextField17.setText(c.getGrauDependencia());
        
        //enfermidade Alz
        if(c.getEnfermidadeAlze() == 1){
            jCheckBox10.setSelected(true);
        }
        
        //enfermidade park
        if(c.getEnfermidadeParkin() == 1){
            jCheckBox11.setSelected(true);
        }
        
        //enfer esqui
        if(c.getEnfermidadeEsquizo() == 1){
            jCheckBox12.setSelected(true);
        }
        
        //enfer deme
        if(c.getEnfermidadeDeme() == 1){
            jCheckBox13.setSelected(true);
        }
        
        //enfer avc
        if(c.getEnfermidadeAvc() == 1){
            jCheckBox14.setSelected(true);
        }
        
        //enfer cance
        if(c.getEnfermidadeCancer() == 1){
            jCheckBox15.setSelected(true);
        }
        
        //observacoes profissional
        jTextArea3.setText(c.getObservacoesProfissional());
        
        //observacoes uktimo
       jTextArea2.setText(c.getObervacoesUltimosEmpregos());
        
        //nome empregador 1
        jTextField18.setText(c.getNomeEmpregador1());
        
        //telefone 1
        txtFild6.setText(c.getTelefoneEmpregador1());

        //data emrpegador 1
        txtFild7.setText(c.getDataEmpregador1());
        
        //obs emprega 1
        jTextField16.setText(c.getObservacoresEmpregador1());
        
        //nome empregador 2
        jTextField20.setText(c.getNomeEmpregador2());
        
        //telefone
        txtFild8.setText(c.getTelefoneEmpregador2());
        
        //data emrpeg 2
        txtFild9.setText(c.getDataEmpregador2());
        
        //obs emp 2
        jTextField19.setText(c.getObservacoresEmpregador2());
        
        //rg
        jTextField21.setText(c.getRgArquivo()); 
        
        //cpf
        jTextField22.setText(c.getCpfArquivo());
        
        //endereco
        jTextField23.setText(c.getEnderecoArquivo());
        
        //coren
        jTextField24.setText(c.getConrenArquivo());
        
        //cert cuidadora
        jTextField25.setText(c.getCertificadoCuidadoraArquivo());
        
        
        //Cert enfer,m
        jTextField26.setText(c.getCertificadoEnfermagemArquivo());
        
        
        //cnh
        jTextField27.setText(c.getCnhArquivo());
        
        
        //cnpj
        jTextField28.setText(c.getCnpjArquivo());
        
        //Outros
        jTextField29.setText(c.getOutrosArquivo());
        
        //consire
        jTextArea4.setText(c.getConsidecoes());
        
        //curso tecnico
        if(c.getCursoEnferTecnico() == 1){
            jCheckBox17.setSelected(true);
        }
        
        //curso auziliar
        if(c.getCursoEnferAux() == 1){
            jCheckBox18.setSelected(true);
        }
        
        //banho no leito
        if(c.getBanhoSimNao() == 1){
            jRadioButton43.setSelected(true);
        }else if(c.getBanhoSimNao() == 2){
            jRadioButton42.setSelected(true);
        }
        
        //tratamento escarras
        if(c.getEscarrasSimNao() == 1){
            jRadioButton51.setSelected(true);
        }else if(c.getEscarrasSimNao() == 2){
            jRadioButton50.setSelected(true);
        }
        
        //cadeirante
        if(c.getCadeiranteSimNao() == 1){
            jRadioButton53.setSelected(true);
        }else if(c.getCadeiranteSimNao() == 2){
            jRadioButton52.setSelected(true);
        }
        
        //outras doenças
        jTextField31.setText(c.getOutrasDoencas());
        
        
        
        
        
        //foto
        String caminho = c.getCaminhoFoto();
        if(caminho != null){
            File file = new File(caminho);
            try {
                BufferedImage image = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(image);
                Image foto = icon.getImage();
                Image fotoResize = foto.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(),java.awt.Image.SCALE_SMOOTH);
                icon.setImage(fotoResize);
                lblFoto.setIcon(icon);
            } catch (IOException ex) {
                Logger.getLogger(ConsultaCuidadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletorDocumentosEmAnexo = new javax.swing.JFileChooser();
        btnGrupoTipoDeCuidadora = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        btnGrupoMaiorMenor = new javax.swing.ButtonGroup();
        btnGrupoFilhos = new javax.swing.ButtonGroup();
        btnGrupoCNH = new javax.swing.ButtonGroup();
        btnGrupoTemCarro = new javax.swing.ButtonGroup();
        btnGrupoWhats = new javax.swing.ButtonGroup();
        btnGrupoFuma = new javax.swing.ButtonGroup();
        btnGrupoGostaAnimal = new javax.swing.ButtonGroup();
        btnGrupoAlergia = new javax.swing.ButtonGroup();
        btnGrupoRegistroCLT = new javax.swing.ButtonGroup();
        btnGrupoConvenio = new javax.swing.ButtonGroup();
        btnGrupoViagem = new javax.swing.ButtonGroup();
        btnGrupoCozinha = new javax.swing.ButtonGroup();
        btnGrupoPressao = new javax.swing.ButtonGroup();
        btnGrupoDiabetes = new javax.swing.ButtonGroup();
        btnGrupoDormir = new javax.swing.ButtonGroup();
        btnGrupoEscala2424 = new javax.swing.ButtonGroup();
        btnGrupoEscala1236 = new javax.swing.ButtonGroup();
        btnGrupoFolguistaFinalDeSemana = new javax.swing.ButtonGroup();
        btnGrupoIntegralSabadoDomingo = new javax.swing.ButtonGroup();
        btnGrupoCursoCuidadora = new javax.swing.ButtonGroup();
        btnGrupoCertificado = new javax.swing.ButtonGroup();
        btnGrupoCorenAtivo = new javax.swing.ButtonGroup();
        btnGrupoSonda = new javax.swing.ButtonGroup();
        btnGrupoBolsa = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnGrupoBanho = new javax.swing.ButtonGroup();
        btnGrupoEscarras = new javax.swing.ButtonGroup();
        btnGrupoCadeirante = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/FundoCadastroDadosPessoais.png"));
        final Image dadosImagem2 = icon1.getImage();
        panelDadosPessoais = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(dadosImagem2,0,0,getWidth(),getHeight(),this);
            }

        };
        lblCNPJ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnRadMEI = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumFilhos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblFoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSelecionarFoto = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        txtFild3 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        radFilhoNao = new javax.swing.JRadioButton();
        radFilhoSim = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        radMenor = new javax.swing.JRadioButton();
        radMaior = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFild4 = new javax.swing.JFormattedTextField();
        txtFild5 = new javax.swing.JFormattedTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jTextField11 = new javax.swing.JTextField();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtAlergia = new javax.swing.JTextField();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFild2 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jTextField30 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator63 = new javax.swing.JSeparator();
        jSeparator64 = new javax.swing.JSeparator();
        jSeparator65 = new javax.swing.JSeparator();
        jSeparator66 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator67 = new javax.swing.JSeparator();
        jSeparator68 = new javax.swing.JSeparator();
        jSeparator69 = new javax.swing.JSeparator();
        jSeparator70 = new javax.swing.JSeparator();
        jSeparator71 = new javax.swing.JSeparator();
        jSeparator72 = new javax.swing.JSeparator();
        jSeparator73 = new javax.swing.JSeparator();
        jSeparator74 = new javax.swing.JSeparator();
        jSeparator75 = new javax.swing.JSeparator();
        jSeparator76 = new javax.swing.JSeparator();
        jSeparator77 = new javax.swing.JSeparator();
        jSeparator78 = new javax.swing.JSeparator();
        jSeparator79 = new javax.swing.JSeparator();
        jSeparator80 = new javax.swing.JSeparator();
        jSeparator81 = new javax.swing.JSeparator();
        jSeparator82 = new javax.swing.JSeparator();
        jSeparator83 = new javax.swing.JSeparator();
        jSeparator84 = new javax.swing.JSeparator();
        jSeparator85 = new javax.swing.JSeparator();
        jSeparator86 = new javax.swing.JSeparator();
        jLabel85 = new javax.swing.JLabel();
        txtFild10 = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        ImageIcon icon44 = new ImageIcon(getClass().getResource("/images/FundoInfo.png"));
        final Image imageInfo = icon44.getImage();
        panelInfo = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics graph){
                super.paintComponent(graph);
                graph.drawImage(imageInfo, 0, 0, getWidth(), getHeight(),this);
            }
        };
        jSeparator40 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jSeparator43 = new javax.swing.JSeparator();
        jSeparator44 = new javax.swing.JSeparator();
        jSeparator45 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        txtFild = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/FundoConhecimentos.png"));
        final Image imageConhecimentos = icon2.getImage();
        panelConhecimentosProfissionais = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics ga){
                super.paintComponent(ga);
                ga.drawImage(imageConhecimentos, 0, 0, getWidth(), getHeight(), this);
            }
        };
        lblCertificado = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        lblInscricao = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        lblQual = new javax.swing.JLabel();
        btnRadNaoCertificado = new javax.swing.JRadioButton();
        btnRadSimCertificado = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtInscricao = new javax.swing.JTextField();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        lblCoren = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel55 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel56 = new javax.swing.JLabel();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        lblQualBolsa = new javax.swing.JLabel();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        txtQualBolsa = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jTextField17 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel83 = new javax.swing.JLabel();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jLabel84 = new javax.swing.JLabel();
        jRadioButton51 = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jTextField31 = new javax.swing.JTextField();
        jSeparator89 = new javax.swing.JSeparator();
        jSeparator90 = new javax.swing.JSeparator();
        jSeparator91 = new javax.swing.JSeparator();
        jSeparator92 = new javax.swing.JSeparator();
        jSeparator93 = new javax.swing.JSeparator();
        jSeparator94 = new javax.swing.JSeparator();
        jSeparator95 = new javax.swing.JSeparator();
        jSeparator96 = new javax.swing.JSeparator();
        jSeparator97 = new javax.swing.JSeparator();
        jSeparator98 = new javax.swing.JSeparator();
        jSeparator99 = new javax.swing.JSeparator();
        jSeparator100 = new javax.swing.JSeparator();
        jSeparator101 = new javax.swing.JSeparator();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel65 = new javax.swing.JLabel();
        ImageIcon im = new ImageIcon(getClass().getResource("/images/FundoRefe.png"));
        final Image imageFundo2 = im.getImage();
        panelRefe = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics gra){
                super.paintComponent(gra);
                gra.drawImage(imageFundo2, 0, 0, getWidth(), getHeight(), this);
            }

        };
        jSeparator46 = new javax.swing.JSeparator();
        jSeparator47 = new javax.swing.JSeparator();
        jSeparator48 = new javax.swing.JSeparator();
        jSeparator87 = new javax.swing.JSeparator();
        jSeparator88 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField18 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtFild7 = new javax.swing.JFormattedTextField();
        txtFild6 = new javax.swing.JFormattedTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        txtFild8 = new javax.swing.JFormattedTextField();
        jTextField20 = new javax.swing.JTextField();
        txtFild9 = new javax.swing.JFormattedTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/FundoAnexo.png"));
        final Image imageAnexo = icon3.getImage();
        jPanel3 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics gra){
                super.paintComponent(gra);
                gra.drawImage(imageAnexo, 0, 0, getWidth(),getHeight(),this);
            }

        };
        jLabel51 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jSeparator23 = new javax.swing.JSeparator();

        seletorDocumentosEmAnexo.setFileFilter(new FiltroDocumentos());

        btnGrupoTipoDeCuidadora.add(jRadioButton1);
        btnGrupoTipoDeCuidadora.add(jRadioButton2);
        btnGrupoTipoDeCuidadora.add(jRadioButton3);

        jFileChooser1.setFileFilter(new MyCustomFilter());

        btnGrupoMaiorMenor.add(radMaior);
        btnGrupoMaiorMenor.add(radMenor);

        btnGrupoFilhos.add(radFilhoNao);
        btnGrupoFilhos.add(radFilhoSim);

        btnGrupoCNH.add(jRadioButton4);
        btnGrupoCNH.add(jRadioButton5);

        btnGrupoTemCarro.add(jRadioButton6);
        btnGrupoTemCarro.add(jRadioButton7);

        btnGrupoWhats.add(jRadioButton8);
        btnGrupoWhats.add(jRadioButton9);

        btnGrupoFuma.add(jRadioButton10);
        btnGrupoFuma.add(jRadioButton11);

        btnGrupoGostaAnimal.add(jRadioButton12);
        btnGrupoGostaAnimal.add(jRadioButton13);

        btnGrupoAlergia.add(jRadioButton14);
        btnGrupoAlergia.add(jRadioButton15);

        btnGrupoRegistroCLT.add(jRadioButton16);
        btnGrupoRegistroCLT.add(jRadioButton17);

        btnGrupoConvenio.add(jRadioButton18);
        btnGrupoConvenio.add(jRadioButton19);

        btnGrupoViagem.add(jRadioButton20);
        btnGrupoViagem.add(jRadioButton21);

        btnGrupoCozinha.add(jRadioButton22);
        btnGrupoCozinha.add(jRadioButton23);

        btnGrupoPressao.add(jRadioButton26);
        btnGrupoPressao.add(jRadioButton27);

        btnGrupoDiabetes.add(jRadioButton28);
        btnGrupoDiabetes.add(jRadioButton29);

        btnGrupoDormir.add(jRadioButton30);
        btnGrupoDormir.add(jRadioButton31);

        btnGrupoEscala2424.add(jRadioButton32);
        btnGrupoEscala2424.add(jRadioButton33);

        btnGrupoEscala1236.add(jRadioButton34);
        btnGrupoEscala1236.add(jRadioButton35);

        btnGrupoFolguistaFinalDeSemana.add(jRadioButton36);
        btnGrupoFolguistaFinalDeSemana.add(jRadioButton37);

        btnGrupoIntegralSabadoDomingo.add(jRadioButton38);
        btnGrupoIntegralSabadoDomingo.add(jRadioButton39);

        btnGrupoCursoCuidadora.add(jRadioButton40);
        btnGrupoCursoCuidadora.add(jRadioButton41);

        btnGrupoCertificado.add(btnRadNaoCertificado);
        btnGrupoCertificado.add(btnRadSimCertificado);

        btnGrupoCorenAtivo.add(jRadioButton45);
        btnGrupoCorenAtivo.add(jRadioButton44);

        btnGrupoSonda.add(jRadioButton46);
        btnGrupoSonda.add(jRadioButton47);

        btnGrupoBolsa.add(jRadioButton48);
        btnGrupoBolsa.add(jRadioButton49);

        btnGrupoBanho.add(jRadioButton42);
        btnGrupoBanho.add(jRadioButton43);

        btnGrupoEscarras.add(jRadioButton50);
        btnGrupoEscarras.add(jRadioButton51);

        btnGrupoCadeirante.add(jRadioButton52);
        btnGrupoCadeirante.add(jRadioButton53);

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Cuidadora");
        setMinimumSize(new java.awt.Dimension(1350, 770));
        setPreferredSize(new java.awt.Dimension(1350, 770));
        getContentPane().setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N

        panelDadosPessoais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelDadosPessoais.setLayout(null);

        lblCNPJ.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCNPJ.setText("-    CNPJ:");
        lblCNPJ.setEnabled(false);
        panelDadosPessoais.add(lblCNPJ);
        lblCNPJ.setBounds(920, 10, 70, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Código:");
        panelDadosPessoais.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 30);

        jRadioButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton1.setText("Técnica(o) em Enfermagem");
        panelDadosPessoais.add(jRadioButton1);
        jRadioButton1.setBounds(440, 10, 260, 33);

        jRadioButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton2.setText("Cuidadora");
        panelDadosPessoais.add(jRadioButton2);
        jRadioButton2.setBounds(710, 10, 120, 33);

        jRadioButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jRadioButton3.setText("Auxiliar de Enfermagem");
        panelDadosPessoais.add(jRadioButton3);
        jRadioButton3.setBounds(210, 10, 230, 33);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel3.setText("Data de Nasc.:");
        panelDadosPessoais.add(jLabel3);
        jLabel3.setBounds(220, 130, 110, 30);

        btnRadMEI.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnRadMEI.setText("MEI");
        btnRadMEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadMEIActionPerformed(evt);
            }
        });
        panelDadosPessoais.add(btnRadMEI);
        btnRadMEI.setBounds(860, 10, 60, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField2);
        jTextField2.setBounds(260, 185, 60, 30);

        txtCNPJ.setEditable(false);
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setEnabled(false);
        txtCNPJ.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(txtCNPJ);
        txtCNPJ.setBounds(1000, 10, 180, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField3);
        jTextField3.setBounds(90, 10, 90, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel4.setText("Fumante:");
        panelDadosPessoais.add(jLabel4);
        jLabel4.setBounds(510, 185, 80, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel5.setText("RG:");
        panelDadosPessoais.add(jLabel5);
        jLabel5.setBounds(890, 65, 40, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel6.setText("CPF: ");
        panelDadosPessoais.add(jLabel6);
        jLabel6.setBounds(1120, 65, 40, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel7.setText("UF:");
        panelDadosPessoais.add(jLabel7);
        jLabel7.setBounds(20, 365, 30, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField4);
        jTextField4.setBounds(240, 365, 140, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel8.setText("Altura:");
        panelDadosPessoais.add(jLabel8);
        jLabel8.setBounds(210, 185, 50, 30);

        txtNumFilhos.setEditable(false);
        txtNumFilhos.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtNumFilhos.setEnabled(false);
        panelDadosPessoais.add(txtNumFilhos);
        txtNumFilhos.setBounds(1090, 185, 70, 30);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel9.setText("Cor de Pele:");
        panelDadosPessoais.add(jLabel9);
        jLabel9.setBounds(990, 125, 90, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel10.setText("Kg");
        panelDadosPessoais.add(jLabel10);
        jLabel10.setBounds(470, 185, 20, 30);

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        panelDadosPessoais.add(jComboBox1);
        jComboBox1.setBounds(60, 365, 60, 30);

        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "Separado(a)" }));
        panelDadosPessoais.add(jComboBox2);
        jComboBox2.setBounds(800, 125, 170, 30);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PlaceholderResize.jpg"))); // NOI18N
        lblFoto.setText("jLabel1");
        panelDadosPessoais.add(lblFoto);
        lblFoto.setBounds(40, 80, 130, 160);

        jButton1.setText("Apagar Foto");
        jButton1.setEnabled(false);
        panelDadosPessoais.add(jButton1);
        jButton1.setBounds(50, 290, 110, 30);

        btnSelecionarFoto.setText("Selecionar Foto");
        btnSelecionarFoto.setEnabled(false);
        panelDadosPessoais.add(btnSelecionarFoto);
        btnSelecionarFoto.setBounds(40, 250, 130, 30);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator8);
        jSeparator8.setBounds(120, 610, 1140, 0);

        txtFild3.setEditable(false);
        try {
            txtFild3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild3.setText("");
        txtFild3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(txtFild3);
        txtFild3.setBounds(1160, 65, 160, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel12.setText("Peso:");
        panelDadosPessoais.add(jLabel12);
        jLabel12.setBounds(360, 185, 40, 30);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel13.setText("m");
        panelDadosPessoais.add(jLabel13);
        jLabel13.setBounds(320, 185, 20, 30);

        radFilhoNao.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        radFilhoNao.setText("Não");
        radFilhoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFilhoNaoActionPerformed(evt);
            }
        });
        panelDadosPessoais.add(radFilhoNao);
        radFilhoNao.setBounds(790, 185, 55, 30);

        radFilhoSim.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        radFilhoSim.setText("Sim");
        radFilhoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFilhoSimActionPerformed(evt);
            }
        });
        panelDadosPessoais.add(radFilhoSim);
        radFilhoSim.setBounds(850, 185, 50, 30);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel16.setText("Filhos :");
        panelDadosPessoais.add(jLabel16);
        jLabel16.setBounds(730, 185, 50, 30);

        radMenor.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        radMenor.setText("Menor:");
        radMenor.setEnabled(false);
        panelDadosPessoais.add(radMenor);
        radMenor.setBounds(1010, 185, 80, 30);

        radMaior.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        radMaior.setText("Maior");
        radMaior.setEnabled(false);
        panelDadosPessoais.add(radMaior);
        radMaior.setBounds(940, 185, 70, 30);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel17.setText("Estado Civil:");
        panelDadosPessoais.add(jLabel17);
        jLabel17.setBounds(700, 125, 100, 30);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField7);
        jTextField7.setBounds(400, 185, 70, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel11.setText("Nome Completo:");
        panelDadosPessoais.add(jLabel11);
        jLabel11.setBounds(210, 65, 130, 30);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel19.setText("WhatsApp:");
        panelDadosPessoais.add(jLabel19);
        jLabel19.setBounds(670, 245, 80, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField6);
        jTextField6.setBounds(590, 125, 80, 30);

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel20.setText("Número:");
        panelDadosPessoais.add(jLabel20);
        jLabel20.setBounds(1050, 305, 70, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField8);
        jTextField8.setBounds(1120, 305, 160, 30);

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel21.setText("Endereço:");
        panelDadosPessoais.add(jLabel21);
        jLabel21.setBounds(210, 305, 80, 30);

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel22.setText("Bairro:");
        panelDadosPessoais.add(jLabel22);
        jLabel22.setBounds(420, 365, 50, 30);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField9);
        jTextField9.setBounds(480, 365, 140, 30);

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel23.setText("Telefone:");
        panelDadosPessoais.add(jLabel23);
        jLabel23.setBounds(210, 245, 70, 30);

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel24.setText("Celular:");
        panelDadosPessoais.add(jLabel24);
        jLabel24.setBounds(450, 245, 60, 30);

        txtFild4.setEditable(false);
        try {
            txtFild4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(txtFild4);
        txtFild4.setBounds(700, 365, 110, 30);

        txtFild5.setEditable(false);
        try {
            txtFild5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFild5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(txtFild5);
        txtFild5.setBounds(290, 245, 110, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField10);
        jTextField10.setBounds(340, 65, 510, 30);

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel25.setText("Cidade:");
        panelDadosPessoais.add(jLabel25);
        jLabel25.setBounds(180, 365, 60, 30);

        jRadioButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton8.setText("Sim");
        panelDadosPessoais.add(jRadioButton8);
        jRadioButton8.setBounds(820, 245, 50, 30);

        jRadioButton9.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton9.setText("Não");
        panelDadosPessoais.add(jRadioButton9);
        jRadioButton9.setBounds(760, 245, 60, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField11);
        jTextField11.setBounds(290, 305, 710, 30);

        jRadioButton10.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton10.setText("Sim");
        panelDadosPessoais.add(jRadioButton10);
        jRadioButton10.setBounds(640, 185, 51, 29);

        jRadioButton11.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton11.setText("Não");
        panelDadosPessoais.add(jRadioButton11);
        jRadioButton11.setBounds(580, 185, 60, 29);

        jComboBox3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muito Clara", "Clara", "Clara Média(Caucasiano)", "Escura Média", "Escuro (Pardo)", "Negra" }));
        panelDadosPessoais.add(jComboBox3);
        jComboBox3.setBounds(1090, 125, 230, 30);

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel28.setText("Alergias:");
        panelDadosPessoais.add(jLabel28);
        jLabel28.setBounds(280, 425, 70, 30);

        txtAlergia.setEditable(false);
        txtAlergia.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtAlergia.setEnabled(false);
        panelDadosPessoais.add(txtAlergia);
        txtAlergia.setBounds(580, 425, 400, 30);

        jRadioButton12.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton12.setText("Não");
        panelDadosPessoais.add(jRadioButton12);
        jRadioButton12.setBounds(150, 425, 60, 30);

        jRadioButton13.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton13.setText("Sim");
        panelDadosPessoais.add(jRadioButton13);
        jRadioButton13.setBounds(210, 425, 50, 30);

        jRadioButton14.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton14.setText("Sim");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        panelDadosPessoais.add(jRadioButton14);
        jRadioButton14.setBounds(410, 425, 50, 29);

        jRadioButton15.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton15.setText("Não");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        panelDadosPessoais.add(jRadioButton15);
        jRadioButton15.setBounds(350, 425, 55, 29);

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel31.setText("Gosta de Animais:");
        panelDadosPessoais.add(jLabel31);
        jLabel31.setBounds(20, 425, 130, 30);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel15.setText("CEP:");
        panelDadosPessoais.add(jLabel15);
        jLabel15.setBounds(660, 365, 40, 30);

        txtFild2.setEditable(false);
        try {
            txtFild2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFild2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(txtFild2);
        txtFild2.setBounds(510, 245, 120, 30);

        jButton3.setBackground(new java.awt.Color(77, 166, 255));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelDadosPessoais.add(jButton3);
        jButton3.setBounds(1180, 640, 135, 50);

        jTextField30.setEditable(false);
        jTextField30.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(jTextField30);
        jTextField30.setBounds(920, 65, 170, 30);

        jComboBox7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sul", "Norte", "Leste", "Oeste", "Central" }));
        panelDadosPessoais.add(jComboBox7);
        jComboBox7.setBounds(930, 365, 90, 30);

        jLabel50.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel50.setText("Região:");
        panelDadosPessoais.add(jLabel50);
        jLabel50.setBounds(860, 365, 60, 30);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator10);
        jSeparator10.setBounds(830, 0, 2, 50);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator11);
        jSeparator11.setBounds(0, 48, 1400, 2);

        jSeparator62.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator62.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator62);
        jSeparator62.setBounds(830, 0, 2, 50);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator12);
        jSeparator12.setBounds(200, 50, 2, 298);

        jSeparator63.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator63);
        jSeparator63.setBounds(200, 110, 1140, 2);

        jSeparator64.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator64);
        jSeparator64.setBounds(200, 288, 1140, 2);

        jSeparator65.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator65.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator65);
        jSeparator65.setBounds(880, 50, 2, 60);

        jSeparator66.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator66);
        jSeparator66.setBounds(200, 170, 1140, 2);

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator15);
        jSeparator15.setBounds(1105, 50, 2, 60);

        jSeparator67.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator67.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator67);
        jSeparator67.setBounds(520, 110, 2, 60);

        jSeparator68.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator68.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator68);
        jSeparator68.setBounds(690, 110, 2, 60);

        jSeparator69.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator69.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator69);
        jSeparator69.setBounds(985, 110, 2, 60);

        jSeparator70.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator70.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator70);
        jSeparator70.setBounds(350, 170, 2, 60);

        jSeparator71.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator71.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator71);
        jSeparator71.setBounds(500, 170, 2, 60);

        jSeparator72.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator72.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator72);
        jSeparator72.setBounds(710, 170, 2, 60);

        jSeparator73.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator73.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator73);
        jSeparator73.setBounds(920, 170, 2, 60);

        jSeparator74.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator74);
        jSeparator74.setBounds(200, 228, 1140, 2);

        jSeparator75.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator75.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator75);
        jSeparator75.setBounds(430, 230, 2, 60);

        jSeparator76.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator76.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator76);
        jSeparator76.setBounds(640, 230, 2, 60);

        jSeparator77.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator77.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator77);
        jSeparator77.setBounds(1025, 290, 2, 60);

        jSeparator78.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator78);
        jSeparator78.setBounds(0, 348, 1335, 2);

        jSeparator79.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator79);
        jSeparator79.setBounds(0, 408, 1335, 2);

        jSeparator80.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator80.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator80);
        jSeparator80.setBounds(150, 350, 2, 60);

        jSeparator81.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator81.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator81);
        jSeparator81.setBounds(400, 350, 2, 60);

        jSeparator82.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator82.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator82);
        jSeparator82.setBounds(640, 350, 2, 60);

        jSeparator83.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator83.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator83);
        jSeparator83.setBounds(830, 350, 2, 60);

        jSeparator84.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator84);
        jSeparator84.setBounds(0, 468, 1335, 2);

        jSeparator85.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator85.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator85);
        jSeparator85.setBounds(270, 410, 2, 60);

        jSeparator86.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator86.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelDadosPessoais.add(jSeparator86);
        jSeparator86.setBounds(470, 410, 2, 60);

        jLabel85.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel85.setText("Alergias a:");
        panelDadosPessoais.add(jLabel85);
        jLabel85.setBounds(490, 425, 90, 30);

        txtFild10.setEditable(false);
        try {
            txtFild10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild10.setText("");
        txtFild10.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelDadosPessoais.add(txtFild10);
        txtFild10.setBounds(360, 130, 130, 30);

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel34.setText("Idade:");
        panelDadosPessoais.add(jLabel34);
        jLabel34.setBounds(540, 125, 50, 30);

        jTabbedPane1.addTab("Dados Pessoais", panelDadosPessoais);

        panelInfo.setLayout(null);

        jSeparator40.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator40);
        jSeparator40.setBounds(275, 75, 2, 60);

        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator16);
        jSeparator16.setBounds(0, 375, 1335, 2);

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator17);
        jSeparator17.setBounds(0, 135, 1335, 2);

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator18);
        jSeparator18.setBounds(0, 73, 1335, 2);

        jSeparator24.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator24);
        jSeparator24.setBounds(662, 135, 2, 60);

        jSeparator25.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator25);
        jSeparator25.setBounds(192, 135, 0, 60);

        jSeparator26.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator26);
        jSeparator26.setBounds(430, 135, 2, 60);

        jSeparator27.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator27);
        jSeparator27.setBounds(0, 193, 1335, 2);

        jSeparator28.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator28);
        jSeparator28.setBounds(240, 193, 2, 60);

        jSeparator29.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator29);
        jSeparator29.setBounds(190, 135, 2, 60);

        jSeparator30.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator30);
        jSeparator30.setBounds(580, 193, 2, 60);

        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator31);
        jSeparator31.setBounds(950, 193, 2, 60);

        jSeparator32.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator32);
        jSeparator32.setBounds(0, 253, 1335, 2);

        jSeparator33.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator33);
        jSeparator33.setBounds(215, 253, 2, 60);

        jSeparator34.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator34);
        jSeparator34.setBounds(460, 253, 2, 60);

        jSeparator35.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator35);
        jSeparator35.setBounds(0, 313, 1335, 2);

        jSeparator36.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator36);
        jSeparator36.setBounds(295, 375, 2, 60);

        jSeparator37.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator37);
        jSeparator37.setBounds(515, 375, 2, 60);

        jSeparator38.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator38);
        jSeparator38.setBounds(770, 375, 2, 60);

        jSeparator39.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator39);
        jSeparator39.setBounds(0, 433, 1335, 2);

        jSeparator41.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator41);
        jSeparator41.setBounds(250, 435, 2, 60);

        jSeparator42.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator42);
        jSeparator42.setBounds(607, 435, 2, 60);

        jSeparator43.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator43);
        jSeparator43.setBounds(750, 75, 2, 60);

        jSeparator44.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator44);
        jSeparator44.setBounds(960, 435, 2, 60);

        jSeparator45.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelInfo.add(jSeparator45);
        jSeparator45.setBounds(0, 493, 1335, 2);

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel29.setText("Religião:");
        panelInfo.add(jLabel29);
        jLabel29.setBounds(20, 90, 63, 30);

        jComboBox5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cátolico", "Evangélico", "Espírita", "Testemunha de Jeová", "Ateu", "Outros" }));
        panelInfo.add(jComboBox5);
        jComboBox5.setBounds(90, 90, 160, 30);

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel26.setText("Grau de Instrução:");
        panelInfo.add(jLabel26);
        jLabel26.setBounds(310, 90, 140, 30);

        jComboBox6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analfabeto", "Técnico em Enfermagem", "Ensino Fundamental Incompleto", "Ensino Fundamental Completo", "Ensino médio incompleto", "Ensino médio completo", "Superior completo", "Pós-Graduação", "Mestrado", "Doutorado", "Pòs-Doutorado " }));
        panelInfo.add(jComboBox6);
        jComboBox6.setBounds(450, 90, 260, 30);

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel27.setText("Superior:");
        panelInfo.add(jLabel27);
        jLabel27.setBounds(780, 90, 340, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelInfo.add(jTextField5);
        jTextField5.setBounds(850, 90, 300, 30);

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel18.setText("CNH:");
        panelInfo.add(jLabel18);
        jLabel18.setBounds(20, 150, 50, 30);

        jRadioButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton4.setText("Sim");
        panelInfo.add(jRadioButton4);
        jRadioButton4.setBounds(130, 150, 50, 30);

        jRadioButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton5.setText("Não");
        panelInfo.add(jRadioButton5);
        jRadioButton5.setBounds(70, 150, 55, 30);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel14.setText("Possui Carro:");
        panelInfo.add(jLabel14);
        jLabel14.setBounds(210, 150, 100, 30);

        jRadioButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton7.setText("Sim");
        panelInfo.add(jRadioButton7);
        jRadioButton7.setBounds(370, 150, 50, 30);

        jRadioButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton6.setText("Não");
        panelInfo.add(jRadioButton6);
        jRadioButton6.setBounds(310, 150, 55, 30);

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel36.setText("Cozinha:");
        panelInfo.add(jLabel36);
        jLabel36.setBounds(450, 150, 70, 30);

        jRadioButton22.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton22.setText("Não");
        panelInfo.add(jRadioButton22);
        jRadioButton22.setBounds(520, 150, 55, 30);

        jRadioButton23.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton23.setText("Sim");
        panelInfo.add(jRadioButton23);
        jRadioButton23.setBounds(590, 150, 50, 30);

        jLabel40.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel40.setText("Habilidades Manuais:");
        panelInfo.add(jLabel40);
        jLabel40.setBounds(680, 150, 154, 30);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelInfo.add(jTextField15);
        jTextField15.setBounds(840, 150, 400, 30);

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel32.setText("Registro CLT:");
        panelInfo.add(jLabel32);
        jLabel32.setBounds(20, 210, 100, 30);

        jRadioButton16.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton16.setText("Não");
        panelInfo.add(jRadioButton16);
        jRadioButton16.setBounds(120, 210, 60, 29);

        jRadioButton17.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton17.setText("Sim");
        panelInfo.add(jRadioButton17);
        jRadioButton17.setBounds(180, 210, 50, 29);

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel30.setText("Possui Convênio Médico:");
        panelInfo.add(jLabel30);
        jLabel30.setBounds(260, 210, 190, 30);

        jRadioButton18.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton18.setText("Não");
        panelInfo.add(jRadioButton18);
        jRadioButton18.setBounds(450, 210, 55, 29);

        jRadioButton19.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton19.setText("Sim");
        panelInfo.add(jRadioButton19);
        jRadioButton19.setBounds(510, 210, 50, 29);

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel37.setText("Pressão Alta:");
        panelInfo.add(jLabel37);
        jLabel37.setBounds(230, 270, 100, 30);

        jRadioButton26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton26.setText("Não");
        panelInfo.add(jRadioButton26);
        jRadioButton26.setBounds(330, 270, 55, 30);

        jRadioButton27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton27.setText("Sim");
        panelInfo.add(jRadioButton27);
        jRadioButton27.setBounds(390, 270, 50, 30);

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel35.setText("Disponibilidade Para Viagens:");
        panelInfo.add(jLabel35);
        jLabel35.setBounds(600, 210, 220, 30);

        jRadioButton20.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton20.setText("Não");
        panelInfo.add(jRadioButton20);
        jRadioButton20.setBounds(820, 210, 55, 29);

        jRadioButton21.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jRadioButton21.setText("Sim");
        panelInfo.add(jRadioButton21);
        jRadioButton21.setBounds(880, 210, 50, 29);

        jLabel41.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel41.setText("Prefere Cuidar de:");
        panelInfo.add(jLabel41);
        jLabel41.setBounds(980, 210, 140, 30);

        jCheckBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox1.setText("Homem");
        panelInfo.add(jCheckBox1);
        jCheckBox1.setBounds(1120, 210, 80, 30);

        jCheckBox2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox2.setText("Mulher");
        panelInfo.add(jCheckBox2);
        jCheckBox2.setBounds(1200, 210, 75, 30);

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel38.setText("Diabetes:");
        panelInfo.add(jLabel38);
        jLabel38.setBounds(20, 270, 70, 30);

        jRadioButton29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton29.setText("Não");
        panelInfo.add(jRadioButton29);
        jRadioButton29.setBounds(90, 270, 55, 30);

        jRadioButton28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton28.setText("Sim");
        panelInfo.add(jRadioButton28);
        jRadioButton28.setBounds(150, 270, 51, 30);

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel33.setText("Tratamento Médico:");
        panelInfo.add(jLabel33);
        jLabel33.setBounds(480, 270, 160, 30);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelInfo.add(jTextField13);
        jTextField13.setBounds(640, 270, 650, 30);

        jLabel48.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel48.setText("Dormir no Trabalho:");
        panelInfo.add(jLabel48);
        jLabel48.setBounds(10, 390, 150, 30);

        jRadioButton30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton30.setText("Não");
        panelInfo.add(jRadioButton30);
        jRadioButton30.setBounds(160, 390, 55, 30);

        jRadioButton31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton31.setText("Sim");
        panelInfo.add(jRadioButton31);
        jRadioButton31.setBounds(220, 390, 60, 30);

        jLabel43.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel43.setText("Disponibilidade Total:");
        panelInfo.add(jLabel43);
        jLabel43.setBounds(310, 390, 160, 30);
        panelInfo.add(jCheckBox16);
        jCheckBox16.setBounds(470, 390, 30, 30);

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel44.setText("Escala 24H/24H:");
        panelInfo.add(jLabel44);
        jLabel44.setBounds(530, 390, 120, 30);

        jRadioButton32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton32.setText("Não");
        panelInfo.add(jRadioButton32);
        jRadioButton32.setBounds(650, 390, 55, 30);

        jRadioButton33.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton33.setText("Sim");
        panelInfo.add(jRadioButton33);
        jRadioButton33.setBounds(710, 390, 51, 30);

        jLabel39.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel39.setText("Escala 12H/36H:");
        panelInfo.add(jLabel39);
        jLabel39.setBounds(790, 390, 120, 30);

        jRadioButton34.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton34.setText("Não");
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });
        panelInfo.add(jRadioButton34);
        jRadioButton34.setBounds(910, 390, 60, 30);

        jRadioButton35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton35.setText("Sim");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });
        panelInfo.add(jRadioButton35);
        jRadioButton35.setBounds(970, 390, 51, 30);

        jComboBox4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurno", "Noturno", "Sem Preferência" }));
        jComboBox4.setEnabled(false);
        panelInfo.add(jComboBox4);
        jComboBox4.setBounds(1030, 390, 150, 30);

        txtFild.setEditable(false);
        txtFild.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtFild.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFild.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelInfo.add(txtFild);
        txtFild.setBounds(1130, 450, 100, 30);

        jLabel42.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel42.setText("Pretenção Salarial:");
        panelInfo.add(jLabel42);
        jLabel42.setBounds(980, 450, 140, 30);

        jRadioButton39.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton39.setText("Sim");
        panelInfo.add(jRadioButton39);
        jRadioButton39.setBounds(890, 450, 51, 30);

        jRadioButton38.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton38.setText("Não");
        panelInfo.add(jRadioButton38);
        jRadioButton38.setBounds(830, 450, 55, 30);

        jLabel47.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel47.setText("Integral Sábado e Domingo:");
        panelInfo.add(jLabel47);
        jLabel47.setBounds(620, 450, 210, 30);

        jRadioButton37.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton37.setText("Sim");
        panelInfo.add(jRadioButton37);
        jRadioButton37.setBounds(530, 450, 60, 29);

        jRadioButton36.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton36.setText("Não");
        panelInfo.add(jRadioButton36);
        jRadioButton36.setBounds(470, 450, 60, 29);

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel46.setText("Folguista Finais de Semana:");
        panelInfo.add(jLabel46);
        jLabel46.setBounds(260, 450, 210, 30);
        panelInfo.add(jCheckBox3);
        jCheckBox3.setBounds(210, 450, 20, 30);

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel49.setText("Somente Segunda a Sexta:");
        panelInfo.add(jLabel49);
        jLabel49.setBounds(10, 450, 200, 30);

        jLabel45.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel45.setText("Observações:");
        panelInfo.add(jLabel45);
        jLabel45.setBounds(590, 500, 100, 30);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelInfo.add(jScrollPane1);
        jScrollPane1.setBounds(20, 540, 1300, 150);

        jTabbedPane1.addTab("Informações e Horários", panelInfo);

        panelConhecimentosProfissionais.setLayout(null);

        lblCertificado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblCertificado.setText("Certificado:");
        lblCertificado.setEnabled(false);
        panelConhecimentosProfissionais.add(lblCertificado);
        lblCertificado.setBounds(690, 115, 90, 30);

        jRadioButton40.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton40.setSelected(true);
        jRadioButton40.setText("Não");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton40);
        jRadioButton40.setBounds(210, 115, 60, 30);

        jRadioButton41.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton41.setText("Sim");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton41);
        jRadioButton41.setBounds(270, 115, 60, 30);

        lblInscricao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblInscricao.setText("Inscrição:");
        panelConhecimentosProfissionais.add(lblInscricao);
        lblInscricao.setBounds(850, 175, 70, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jTextField12.setEnabled(false);
        panelConhecimentosProfissionais.add(jTextField12);
        jTextField12.setBounds(390, 115, 290, 30);

        lblQual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblQual.setText("Qual(is):");
        lblQual.setEnabled(false);
        panelConhecimentosProfissionais.add(lblQual);
        lblQual.setBounds(330, 115, 70, 30);

        btnRadNaoCertificado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btnRadNaoCertificado.setText("Não");
        btnRadNaoCertificado.setEnabled(false);
        panelConhecimentosProfissionais.add(btnRadNaoCertificado);
        btnRadNaoCertificado.setBounds(780, 115, 55, 29);

        btnRadSimCertificado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btnRadSimCertificado.setText("Sim");
        btnRadSimCertificado.setEnabled(false);
        panelConhecimentosProfissionais.add(btnRadSimCertificado);
        btnRadSimCertificado.setBounds(840, 115, 50, 29);

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel52.setText("Possui Curso de Cuidadora:");
        panelConhecimentosProfissionais.add(jLabel52);
        jLabel52.setBounds(10, 115, 210, 30);

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel53.setText("Sabe Aferir Sinais Vitais:");
        panelConhecimentosProfissionais.add(jLabel53);
        jLabel53.setBounds(30, 220, 180, 30);

        txtInscricao.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelConhecimentosProfissionais.add(txtInscricao);
        txtInscricao.setBounds(920, 175, 70, 30);

        jRadioButton44.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton44.setText("Não");
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton44);
        jRadioButton44.setBounds(720, 175, 55, 29);

        jRadioButton45.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton45.setText("Sim");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton45);
        jRadioButton45.setBounds(780, 175, 50, 29);

        lblCoren.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblCoren.setText("COREN Ativo:");
        panelConhecimentosProfissionais.add(lblCoren);
        lblCoren.setBounds(620, 175, 100, 30);

        jLabel54.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel54.setText("Curso de Auxiliar de Enfermagem:");
        panelConhecimentosProfissionais.add(jLabel54);
        jLabel54.setBounds(310, 175, 250, 30);

        jCheckBox4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox4.setText("Prática");
        panelConhecimentosProfissionais.add(jCheckBox4);
        jCheckBox4.setBounds(1110, 115, 73, 30);

        jCheckBox5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox5.setText("Curso");
        panelConhecimentosProfissionais.add(jCheckBox5);
        jCheckBox5.setBounds(1190, 115, 65, 30);

        jLabel55.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel55.setText("Sabe Trabalhar com Bolsa:");
        panelConhecimentosProfissionais.add(jLabel55);
        jLabel55.setBounds(670, 280, 210, 30);

        jCheckBox6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox6.setText("Pressão Manual");
        panelConhecimentosProfissionais.add(jCheckBox6);
        jCheckBox6.setBounds(30, 250, 133, 30);

        jCheckBox7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox7.setText("Pressão Digital");
        panelConhecimentosProfissionais.add(jCheckBox7);
        jCheckBox7.setBounds(30, 280, 127, 30);

        jCheckBox8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox8.setText("Diabetes");
        panelConhecimentosProfissionais.add(jCheckBox8);
        jCheckBox8.setBounds(30, 310, 85, 30);

        jCheckBox9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox9.setText("Insulina");
        panelConhecimentosProfissionais.add(jCheckBox9);
        jCheckBox9.setBounds(30, 340, 81, 30);

        jLabel56.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel56.setText("Conhecimeto através de :");
        panelConhecimentosProfissionais.add(jLabel56);
        jLabel56.setBounds(910, 115, 190, 30);

        jRadioButton46.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton46.setText("Sim");
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton46);
        jRadioButton46.setBounds(940, 230, 51, 30);

        jRadioButton47.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton47.setSelected(true);
        jRadioButton47.setText("Não");
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton47);
        jRadioButton47.setBounds(880, 230, 55, 30);

        lblQualBolsa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblQualBolsa.setText("Qual(is):");
        lblQualBolsa.setEnabled(false);
        panelConhecimentosProfissionais.add(lblQualBolsa);
        lblQualBolsa.setBounds(1000, 230, 60, 30);

        jRadioButton48.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton48.setSelected(true);
        jRadioButton48.setText("Não");
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton48);
        jRadioButton48.setBounds(860, 280, 55, 30);

        jRadioButton49.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton49.setText("Sim");
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jRadioButton49);
        jRadioButton49.setBounds(920, 280, 60, 30);

        txtQualBolsa.setEditable(false);
        txtQualBolsa.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        txtQualBolsa.setEnabled(false);
        panelConhecimentosProfissionais.add(txtQualBolsa);
        txtQualBolsa.setBounds(1070, 230, 240, 30);

        jLabel59.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel59.setText("Sabe Trabalhar com Sonda:");
        panelConhecimentosProfissionais.add(jLabel59);
        jLabel59.setBounds(670, 230, 200, 30);

        jCheckBox10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox10.setText("Alzheimer");
        panelConhecimentosProfissionais.add(jCheckBox10);
        jCheckBox10.setBounds(240, 250, 100, 30);

        jCheckBox11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox11.setText("Parkinson");
        panelConhecimentosProfissionais.add(jCheckBox11);
        jCheckBox11.setBounds(240, 290, 100, 30);

        jCheckBox12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox12.setText("Esquizofrenia");
        panelConhecimentosProfissionais.add(jCheckBox12);
        jCheckBox12.setBounds(470, 250, 120, 30);

        jCheckBox13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox13.setText("Demência");
        panelConhecimentosProfissionais.add(jCheckBox13);
        jCheckBox13.setBounds(360, 250, 100, 30);

        jCheckBox14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox14.setText("AVC");
        panelConhecimentosProfissionais.add(jCheckBox14);
        jCheckBox14.setBounds(360, 290, 60, 30);

        jCheckBox15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox15.setText("Câncer");
        panelConhecimentosProfissionais.add(jCheckBox15);
        jCheckBox15.setBounds(470, 290, 73, 30);

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelConhecimentosProfissionais.add(jTextField17);
        jTextField17.setBounds(1040, 335, 280, 30);

        jLabel79.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel79.setText("Curso de Técnico em Enfermagem:");
        panelConhecimentosProfissionais.add(jLabel79);
        jLabel79.setBounds(10, 175, 260, 30);

        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        panelConhecimentosProfissionais.add(jCheckBox17);
        jCheckBox17.setBounds(270, 175, 21, 30);
        panelConhecimentosProfissionais.add(jCheckBox18);
        jCheckBox18.setBounds(560, 175, 21, 30);

        jLabel83.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel83.setText("Sabe dar Banho no Leito:");
        panelConhecimentosProfissionais.add(jLabel83);
        jLabel83.setBounds(10, 395, 210, 30);

        jRadioButton42.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton42.setSelected(true);
        jRadioButton42.setText("Não");
        panelConhecimentosProfissionais.add(jRadioButton42);
        jRadioButton42.setBounds(200, 395, 60, 30);

        jRadioButton43.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton43.setText("Sim");
        panelConhecimentosProfissionais.add(jRadioButton43);
        jRadioButton43.setBounds(260, 395, 60, 30);

        jLabel84.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel84.setText("Tratamento de Escarras:");
        panelConhecimentosProfissionais.add(jLabel84);
        jLabel84.setBounds(330, 395, 210, 30);

        jRadioButton51.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton51.setText("Sim");
        panelConhecimentosProfissionais.add(jRadioButton51);
        jRadioButton51.setBounds(570, 395, 60, 30);

        jLabel81.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel81.setText("Já trabalhou com Cadeirantes:");
        panelConhecimentosProfissionais.add(jLabel81);
        jLabel81.setBounds(640, 395, 220, 30);

        jRadioButton50.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton50.setSelected(true);
        jRadioButton50.setText("Não");
        panelConhecimentosProfissionais.add(jRadioButton50);
        jRadioButton50.setBounds(510, 395, 60, 30);

        jRadioButton52.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton52.setSelected(true);
        jRadioButton52.setText("Não");
        panelConhecimentosProfissionais.add(jRadioButton52);
        jRadioButton52.setBounds(870, 395, 60, 30);

        jRadioButton53.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jRadioButton53.setText("Sim");
        panelConhecimentosProfissionais.add(jRadioButton53);
        jRadioButton53.setBounds(930, 395, 60, 30);

        jTextField31.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelConhecimentosProfissionais.add(jTextField31);
        jTextField31.setBounds(300, 335, 330, 30);

        jSeparator89.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator89);
        jSeparator89.setBounds(-10, 100, 1350, 2);

        jSeparator90.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator90);
        jSeparator90.setBounds(-10, 160, 1350, 2);

        jSeparator91.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator91);
        jSeparator91.setBounds(220, 220, 2, 160);

        jSeparator92.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator92);
        jSeparator92.setBounds(-10, 220, 1350, 2);

        jSeparator93.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator93);
        jSeparator93.setBounds(650, 220, 2, 160);

        jSeparator94.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator94);
        jSeparator94.setBounds(600, 160, 2, 60);

        jSeparator95.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator95);
        jSeparator95.setBounds(900, 100, 2, 60);

        jSeparator96.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator96);
        jSeparator96.setBounds(650, 270, 680, 2);

        jSeparator97.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator97);
        jSeparator97.setBounds(650, 320, 680, 2);

        jSeparator98.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator98);
        jSeparator98.setBounds(-10, 380, 1350, 2);

        jSeparator99.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator99);
        jSeparator99.setBounds(630, 380, 2, 60);

        jSeparator100.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator100);
        jSeparator100.setBounds(-10, 440, 1350, 2);

        jSeparator101.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelConhecimentosProfissionais.add(jSeparator101);
        jSeparator101.setBounds(320, 380, 2, 60);

        jLabel86.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel86.setText("Experiência com Doenças, Enfermidades ou Debilidades:");
        panelConhecimentosProfissionais.add(jLabel86);
        jLabel86.setBounds(230, 220, 420, 30);

        jLabel87.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel87.setText("Outros:");
        panelConhecimentosProfissionais.add(jLabel87);
        jLabel87.setBounds(230, 335, 60, 30);

        jCheckBox19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jCheckBox19.setText("Colostomia");
        jCheckBox19.setEnabled(false);
        panelConhecimentosProfissionais.add(jCheckBox19);
        jCheckBox19.setBounds(990, 280, 110, 30);

        jLabel65.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel65.setText("Grau de Dependendecia de Cuidados Realizados:");
        panelConhecimentosProfissionais.add(jLabel65);
        jLabel65.setBounds(670, 335, 370, 30);

        jTabbedPane1.addTab("Conhecimentos Profissionais", panelConhecimentosProfissionais);

        panelRefe.setLayout(null);

        jSeparator46.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRefe.add(jSeparator46);
        jSeparator46.setBounds(-10, 100, 1350, 2);

        jSeparator47.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRefe.add(jSeparator47);
        jSeparator47.setBounds(-10, 460, 1360, 40);

        jSeparator48.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator48.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRefe.add(jSeparator48);
        jSeparator48.setBounds(673, 100, 2, 360);

        jSeparator87.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRefe.add(jSeparator87);
        jSeparator87.setBounds(-10, 145, 1350, 2);

        jSeparator88.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRefe.add(jSeparator88);
        jSeparator88.setBounds(-10, 600, 1350, 2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        panelRefe.add(jScrollPane3);
        jScrollPane3.setBounds(20, 160, 630, 300);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        panelRefe.add(jScrollPane2);
        jScrollPane2.setBounds(700, 160, 610, 300);

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(jTextField18);
        jTextField18.setBounds(320, 510, 400, 30);

        jLabel62.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel62.setText("Telefone:");
        panelRefe.add(jLabel62);
        jLabel62.setBounds(770, 510, 70, 30);

        jLabel66.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel66.setText("Data:");
        panelRefe.add(jLabel66);
        jLabel66.setBounds(1010, 510, 50, 30);

        txtFild7.setEditable(false);
        try {
            txtFild7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild7.setText("");
        txtFild7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(txtFild7);
        txtFild7.setBounds(1070, 510, 130, 30);

        txtFild6.setEditable(false);
        try {
            txtFild6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFild6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(txtFild6);
        txtFild6.setBounds(860, 510, 120, 30);

        jLabel68.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel68.setText("Nome do Empregador:");
        panelRefe.add(jLabel68);
        jLabel68.setBounds(140, 510, 180, 30);

        jLabel67.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel67.setText("Observações:");
        panelRefe.add(jLabel67);
        jLabel67.setBounds(140, 560, 100, 30);

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(jTextField16);
        jTextField16.setBounds(250, 560, 950, 30);

        txtFild8.setEditable(false);
        try {
            txtFild8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFild8.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(txtFild8);
        txtFild8.setBounds(860, 610, 120, 30);

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(jTextField20);
        jTextField20.setBounds(320, 610, 400, 30);

        txtFild9.setEditable(false);
        try {
            txtFild9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFild9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFild9.setText("");
        txtFild9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(txtFild9);
        txtFild9.setBounds(1070, 610, 130, 30);

        jLabel72.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel72.setText("Data:");
        panelRefe.add(jLabel72);
        jLabel72.setBounds(1010, 610, 50, 30);

        jLabel71.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel71.setText("Telefone:");
        panelRefe.add(jLabel71);
        jLabel71.setBounds(770, 610, 70, 30);

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        panelRefe.add(jTextField19);
        jTextField19.setBounds(250, 660, 950, 30);

        jLabel69.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel69.setText("Nome do Empregador:");
        panelRefe.add(jLabel69);
        jLabel69.setBounds(140, 610, 180, 30);

        jLabel70.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel70.setText("Observações:");
        panelRefe.add(jLabel70);
        jLabel70.setBounds(140, 660, 100, 30);

        jLabel63.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel63.setText("Observações sobre Experiência Profissional para o Cargo Pretendido:");
        panelRefe.add(jLabel63);
        jLabel63.setBounds(40, 110, 530, 30);

        jLabel61.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel61.setText("Observações Sobre dois últimos empregos, quanto tempo ficou e por que saiu:");
        panelRefe.add(jLabel61);
        jLabel61.setBounds(700, 110, 630, 30);

        jTabbedPane1.addTab("Referências Profissionais", panelRefe);

        jPanel3.setLayout(null);

        jLabel51.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel51.setText("Cópia do CPF:");
        jPanel3.add(jLabel51);
        jLabel51.setBounds(250, 80, 110, 30);

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel57.setText("Compovante de Endereço:");
        jPanel3.add(jLabel57);
        jLabel57.setBounds(160, 130, 200, 30);

        jLabel73.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel73.setText("COREN:");
        jPanel3.add(jLabel73);
        jLabel73.setBounds(300, 180, 60, 30);

        jLabel74.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel74.setText("Certificado Curso de Cuidadora:");
        jPanel3.add(jLabel74);
        jLabel74.setBounds(120, 230, 240, 30);

        jLabel75.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel75.setText("Cert. Aux/Téc. Enfermagem:");
        jPanel3.add(jLabel75);
        jLabel75.setBounds(150, 280, 210, 30);

        jLabel76.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel76.setText("Habilitação:");
        jPanel3.add(jLabel76);
        jLabel76.setBounds(270, 330, 90, 30);

        jLabel77.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel77.setText("CNPJ:");
        jPanel3.add(jLabel77);
        jLabel77.setBounds(310, 380, 50, 30);

        jLabel78.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel78.setText("Outros:");
        jPanel3.add(jLabel78);
        jLabel78.setBounds(300, 430, 60, 30);

        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton5.setText("Selecionar");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(960, 30, 110, 30);

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton6.setText("Abrir");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(1090, 30, 120, 30);

        jButton7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton7.setText("Abrir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(1090, 80, 120, 30);

        jButton8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton8.setText("Selecionar");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(960, 80, 110, 30);

        jButton9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton9.setText("Abrir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(1090, 130, 120, 30);

        jButton10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton10.setText("Selecionar");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(960, 130, 110, 30);

        jButton11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton11.setText("Abrir");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(1090, 180, 120, 30);

        jButton12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton12.setText("Selecionar");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);
        jButton12.setBounds(960, 180, 110, 30);

        jButton13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton13.setText("Abrir");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13);
        jButton13.setBounds(1090, 230, 120, 30);

        jButton14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton14.setText("Selecionar");
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(960, 230, 110, 30);

        jButton15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton15.setText("Abrir");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15);
        jButton15.setBounds(1090, 280, 120, 30);

        jButton16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton16.setText("Selecionar");
        jButton16.setEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16);
        jButton16.setBounds(960, 280, 110, 30);

        jButton17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton17.setText("Abrir");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17);
        jButton17.setBounds(1090, 330, 120, 30);

        jButton18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton18.setText("Selecionar");
        jButton18.setEnabled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18);
        jButton18.setBounds(960, 330, 110, 30);

        jButton19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton19.setText("Abrir");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19);
        jButton19.setBounds(1090, 380, 120, 30);

        jButton20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton20.setText("Selecionar");
        jButton20.setEnabled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20);
        jButton20.setBounds(960, 380, 110, 30);

        jButton21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton21.setText("Abrir");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21);
        jButton21.setBounds(1090, 430, 120, 30);

        jButton22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton22.setText("Selecionar");
        jButton22.setEnabled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22);
        jButton22.setBounds(960, 430, 110, 30);

        jLabel80.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel80.setText("Cópia do RG:");
        jPanel3.add(jLabel80);
        jLabel80.setBounds(250, 30, 100, 30);

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField21.setFocusable(false);
        jPanel3.add(jTextField21);
        jTextField21.setBounds(360, 30, 590, 30);

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField22);
        jTextField22.setBounds(360, 80, 590, 30);

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField23);
        jTextField23.setBounds(360, 130, 590, 30);

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField24);
        jTextField24.setBounds(360, 180, 590, 30);

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField25);
        jTextField25.setBounds(360, 230, 590, 30);

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField26);
        jTextField26.setBounds(360, 280, 590, 30);

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField27);
        jTextField27.setBounds(360, 330, 590, 30);

        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField28);
        jTextField28.setBounds(360, 380, 590, 30);

        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextField29);
        jTextField29.setBounds(360, 430, 590, 30);

        jLabel82.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel82.setText("CONSIDERAÇÕES FINAIS");
        jPanel3.add(jLabel82);
        jLabel82.setBounds(590, 490, 210, 30);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(26, 546, 1270, 130);

        jSeparator23.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.add(jSeparator23);
        jSeparator23.setBounds(-10, 490, 1360, 30);

        jTabbedPane1.addTab("Documentos em Anexo / Considerações Finais", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1340, 740);

        setBounds(0, 0, 1350, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadMEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadMEIActionPerformed
        if(btnRadMEI.isSelected()){
            lblCNPJ.setEnabled(true);
            txtCNPJ.setEnabled(true);
        }else if(btnRadMEI.isSelected() == false){
            lblCNPJ.setEnabled(false);
            txtCNPJ.setEnabled(false);
        }
    }//GEN-LAST:event_btnRadMEIActionPerformed

    private void radFilhoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFilhoNaoActionPerformed
        if(radFilhoNao.isSelected()){
            radMaior.setEnabled(false);
            radMenor.setEnabled(false);
            txtNumFilhos.setEnabled(false);
        }
    }//GEN-LAST:event_radFilhoNaoActionPerformed

    private void radFilhoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFilhoSimActionPerformed
        if(radFilhoSim.isSelected()){
            radMaior.setEnabled(true);
            radMenor.setEnabled(true);
            txtNumFilhos.setEnabled(true);
        }
    }//GEN-LAST:event_radFilhoSimActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        if(jRadioButton15.isSelected()){
            txtAlergia.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        if(jRadioButton14.isSelected()){
            txtAlergia.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        if(jRadioButton35.isSelected()){
            jComboBox4.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        if(jRadioButton34.isSelected()){
            jComboBox4.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        if(jRadioButton40.isSelected()){
            lblQual.setEnabled(false);
            jTextField12.setEnabled(false);
            lblCertificado.setEnabled(false);
            btnRadNaoCertificado.setEnabled(false);
            btnRadSimCertificado.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        if(jRadioButton41.isSelected()){
            lblQual.setEnabled(true);
            jTextField12.setEnabled(true);
            lblCertificado.setEnabled(true);
            btnRadNaoCertificado.setEnabled(true);
            btnRadSimCertificado.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
        if(jRadioButton48.isSelected()){
            jCheckBox19.setEnabled(false);
            jCheckBox19.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton48ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        if(jRadioButton49.isSelected()){
            jCheckBox19.setEnabled(true);
            jCheckBox19.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField21);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField22);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField23);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField24);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField25);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField26);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField27);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField29);
        
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Utilitario seletor = new Utilitario();
        seletor.selecionarArquivo(seletorDocumentosEmAnexo, jTextField28);
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
               
        Utilitario.abrirArquivo(jTextField21); 
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        Utilitario.abrirArquivo(jTextField22);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        Utilitario.abrirArquivo(jTextField23);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        Utilitario.abrirArquivo(jTextField24);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       
        Utilitario.abrirArquivo(jTextField25);
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        Utilitario.abrirArquivo(jTextField26);
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       
        Utilitario.abrirArquivo(jTextField27);
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       
        Utilitario.abrirArquivo(jTextField28);
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
        Utilitario.abrirArquivo(jTextField29);
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        if(jRadioButton44.isSelected()){
            lblInscricao.setEnabled(false);
            txtInscricao.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        if(jRadioButton45.isSelected()){
            lblInscricao.setEnabled(true);
            txtInscricao.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        if(jCheckBox18.isSelected()){
            lblCoren.setEnabled(true);
            jRadioButton44.setEnabled(true);
            jRadioButton45.setEnabled(true);
        }else if(jCheckBox18.isSelected() == false){
            lblCoren.setEnabled(false);
            jRadioButton44.setEnabled(false);
            jRadioButton45.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        if(jRadioButton46.isSelected()){
            lblQualBolsa.setEnabled(true);
            txtQualBolsa.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        if(jRadioButton47.isSelected()){
            lblQualBolsa.setEnabled(false);
            txtQualBolsa.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton47ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoAlergia;
    private javax.swing.ButtonGroup btnGrupoBanho;
    private javax.swing.ButtonGroup btnGrupoBolsa;
    private javax.swing.ButtonGroup btnGrupoCNH;
    private javax.swing.ButtonGroup btnGrupoCadeirante;
    private javax.swing.ButtonGroup btnGrupoCertificado;
    private javax.swing.ButtonGroup btnGrupoConvenio;
    private javax.swing.ButtonGroup btnGrupoCorenAtivo;
    private javax.swing.ButtonGroup btnGrupoCozinha;
    private javax.swing.ButtonGroup btnGrupoCursoCuidadora;
    private javax.swing.ButtonGroup btnGrupoDiabetes;
    private javax.swing.ButtonGroup btnGrupoDormir;
    private javax.swing.ButtonGroup btnGrupoEscala1236;
    private javax.swing.ButtonGroup btnGrupoEscala2424;
    private javax.swing.ButtonGroup btnGrupoEscarras;
    private javax.swing.ButtonGroup btnGrupoFilhos;
    private javax.swing.ButtonGroup btnGrupoFolguistaFinalDeSemana;
    private javax.swing.ButtonGroup btnGrupoFuma;
    private javax.swing.ButtonGroup btnGrupoGostaAnimal;
    private javax.swing.ButtonGroup btnGrupoIntegralSabadoDomingo;
    private javax.swing.ButtonGroup btnGrupoMaiorMenor;
    private javax.swing.ButtonGroup btnGrupoPressao;
    private javax.swing.ButtonGroup btnGrupoRegistroCLT;
    private javax.swing.ButtonGroup btnGrupoSonda;
    private javax.swing.ButtonGroup btnGrupoTemCarro;
    private javax.swing.ButtonGroup btnGrupoTipoDeCuidadora;
    private javax.swing.ButtonGroup btnGrupoViagem;
    private javax.swing.ButtonGroup btnGrupoWhats;
    private javax.swing.JRadioButton btnRadMEI;
    private javax.swing.JRadioButton btnRadNaoCertificado;
    private javax.swing.JRadioButton btnRadSimCertificado;
    private javax.swing.JButton btnSelecionarFoto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JFileChooser jFileChooser1;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
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
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator100;
    private javax.swing.JSeparator jSeparator101;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JSeparator jSeparator72;
    private javax.swing.JSeparator jSeparator73;
    private javax.swing.JSeparator jSeparator74;
    private javax.swing.JSeparator jSeparator75;
    private javax.swing.JSeparator jSeparator76;
    private javax.swing.JSeparator jSeparator77;
    private javax.swing.JSeparator jSeparator78;
    private javax.swing.JSeparator jSeparator79;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator80;
    private javax.swing.JSeparator jSeparator81;
    private javax.swing.JSeparator jSeparator82;
    private javax.swing.JSeparator jSeparator83;
    private javax.swing.JSeparator jSeparator84;
    private javax.swing.JSeparator jSeparator85;
    private javax.swing.JSeparator jSeparator86;
    private javax.swing.JSeparator jSeparator87;
    private javax.swing.JSeparator jSeparator88;
    private javax.swing.JSeparator jSeparator89;
    private javax.swing.JSeparator jSeparator90;
    private javax.swing.JSeparator jSeparator91;
    private javax.swing.JSeparator jSeparator92;
    private javax.swing.JSeparator jSeparator93;
    private javax.swing.JSeparator jSeparator94;
    private javax.swing.JSeparator jSeparator95;
    private javax.swing.JSeparator jSeparator96;
    private javax.swing.JSeparator jSeparator97;
    private javax.swing.JSeparator jSeparator98;
    private javax.swing.JSeparator jSeparator99;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCertificado;
    private javax.swing.JLabel lblCoren;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblInscricao;
    private javax.swing.JLabel lblQual;
    private javax.swing.JLabel lblQualBolsa;
    private javax.swing.JPanel panelConhecimentosProfissionais;
    private javax.swing.JPanel panelDadosPessoais;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelRefe;
    private javax.swing.JRadioButton radFilhoNao;
    private javax.swing.JRadioButton radFilhoSim;
    private javax.swing.JRadioButton radMaior;
    private javax.swing.JRadioButton radMenor;
    private javax.swing.JFileChooser seletorDocumentosEmAnexo;
    private javax.swing.JTextField txtAlergia;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtFild;
    private javax.swing.JFormattedTextField txtFild10;
    private javax.swing.JFormattedTextField txtFild2;
    private javax.swing.JFormattedTextField txtFild3;
    private javax.swing.JFormattedTextField txtFild4;
    private javax.swing.JFormattedTextField txtFild5;
    private javax.swing.JFormattedTextField txtFild6;
    private javax.swing.JFormattedTextField txtFild7;
    private javax.swing.JFormattedTextField txtFild8;
    private javax.swing.JFormattedTextField txtFild9;
    private javax.swing.JTextField txtInscricao;
    private javax.swing.JTextField txtNumFilhos;
    private javax.swing.JTextField txtQualBolsa;
    // End of variables declaration//GEN-END:variables
}

