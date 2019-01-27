package model.dao;


import connection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beans.Cuidadora;

/**
 *
 * @author Augusto Barros
 */
public class CadastroDAO {
    
    public void salvarCadastro(Cuidadora c){
        
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO cadastrocuidadora (foto ,  tipo_cuidadora ,  tem_mei ,  cnpj ,  nome ,  numero_rg ,  cpf ,  idade ,  altura ,  "
                    + "peso ,  cor_pele_lista_index ,  regiao_lista_index ,  estado_civi_lista_index ,  filhos_sim_nao ,  filho_maior_menor ,  "
                    + "campo_menor ,  cnh_sim_nao ,  possui_carro_sim_nao ,  endereco ,  numero_endereco ,  cep_endereco ,  uf_lista_index ,  bairro_endereco ,"
                    + "  cidade_endereco ,  telefone_res_cuidadora ,  telefone_celular_cuidadora ,  whatsapp_sim_nao ,  religiao_lista_index ,  "
                    + "fumante_sim_nao ,  grau_escola_lista_index ,  curso_superior ,  gosta_animal_sim_nao ,  alegias_sim_nao ,  qual_alergia ,  "
                    + "registro_clt_sim_nao ,  convenio_medico_sim_nao ,  campo_habilidades ,  disponibilidade_viajem_sim_nao ,  cozinha_sim_nao ,  "
                    + "prefere_h_ou_m ,  pressao_alta_sim_nao ,  diabete_sim_nao ,  tratamento_medico ,  dormir_trabralho_sim_nao ,  escala_5d2d_sim_nao ,  "
                    + "escala_2424_sim_nao ,  escala_1236_sim_nao ,  diurno_lista_index ,  somente_segunda_a_sex ,  folguita_fds_sim_nao ,  "
                    + "integral_sab_dom_sim_nao ,  pretencao_salarial ,  observacoes ,  tem_curso_cuidadora_sim_nao ,  campo_qual_curso ,  "
                    + "tem_certificado_sim_nao ,  tem_curso_enfermagem_sim_nao ,  campo_qual_enfermagem ,  coren_ativo_sim_nao ,  campo_inscricao_coren ,  "
                    + "como_adiquiriu_conhecimento_pc ,  sabe_aferir_sinais ,  trabalho_sonda_sim_nao , qual_sonda ,  trabalho_bolsa_sim_nao , colostomia  ,  "
                    + "grau_dependencia ,  enfermidades_alze ,  enfermidade_parkin ,  enfermidade_esquizo ,  enfermidade_demen ,  enfermidade_avc ,  "
                    + "enfermidade_cancer ,  observacoes_profissional ,  observacoes_ultimos_empregos ,  nome_empregador1 ,  telefone_empregador1 ,  "
                    + "data_empregador1 ,  observacoes_empregador1 ,  nome_empregador2 ,  telefone_empregador2 ,  data_empregador2 ,  observacoes_empregador2 ,  "
                    + "rg_pdf ,  cpf_pdf ,  endereco_pdf ,  conre_pdf ,  certificado_cuidadora_pdf ,  certificado_enfermagem_pdf ,  cnh_pdf ,  cnpj_pdf ,  "
                    + "outros_pdf ,  consideracoes, curso_enfermagem_tecnico, curso_enfermagem_auxiliar , banho_sim_nao  , escarras_sim_nao ,cadeirante_sim_nao , outras_doencas )VALUES (?,?,?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int i = 1;
            stmt.setString(i, c.getCaminhoFoto());
            i++;
            
            stmt.setInt(i, c.getTipoCuidadora());
            i++;
            
            stmt.setInt(i, c.getTemMei());
            i++;
            
            stmt.setString(i, c.getCnpj());
            i++;
            
            stmt.setString(i,c.getNome());
            i++;
            
            stmt.setString(i,c.getNumeroRg());
            i++;
            
            stmt.setString(i, c.getCpf());
            i++;
            //ARRUMAR INDICES POR CONTA DO CAMPO CPF
            stmt.setString(i,c.getIdade());
            i++;
            
            stmt.setString(i, c.getAltura());
            i++;
            
            stmt.setString(i, c.getPeso());
            i++;
            
            stmt.setInt(i, c.getCorPeleIndex());
            i++;
            
            stmt.setInt(i, c.getRegiaoListaIndex());
            i++;
            
            stmt.setInt(i, c.getEstadoCivilIndex());
            i++;
            
            stmt.setInt(i, c.getFilhosSimNao());
            i++;
            
            stmt.setInt(i, c.getFilhoMaiorMenor());
            i++;
            
            stmt.setString(i,c.getCampoMenor());
            i++;
            
            stmt.setInt(i, c.getCnhSimNao());
            i++;
            
            stmt.setInt(i, c.getPossuiCarroSimNao());
            i++;
            
            stmt.setString(i, c.getEndereco());
            i++;
            
            stmt.setString(i, c.getNumeroEndereco());
            i++;
            
            stmt.setString(i, c.getCepEndereco());
            i++;
            
            stmt.setInt(i, c.getUfListaIndex());
            i++;
            
            stmt.setString(i, c.getBairroEndereco());
            i++;
            
            stmt.setString(i, c.getCidade());
            i++;
            
            stmt.setString(i, c.getTelefoneResidencialCuidadora());
            i++;
            
            stmt.setString(i, c.getTelefoneCelularCuidadora());
            i++;
            
            stmt.setInt(i, c.getWhatsappSimNao());
            i++;
            
            stmt.setInt(i, c.getReligiaoIndex());
            i++;
            
            stmt.setInt(i, c.getFumanteSimNao());
            i++;
            
            stmt.setInt(i, c.getGrauEscolarIndex());
            i++;
            
            stmt.setString(i, c.getCursoSuperior());
            i++;
            
            stmt.setInt(i, c.getGostaAnimalSimNao());
            i++;
            
            stmt.setInt(i, c.getAlergiaSimNao());
            i++;
            
            stmt.setString(i, c.getQualAlergia());
            i++;
            
            stmt.setInt(i, c.getRegistroCLTSimNao());
            i++;
            
            stmt.setInt(i, c.getConvenioMedicoSimNao());
            i++;
            
            stmt.setString(i, c.getHabilidades());
            i++;
            
            stmt.setInt(i, c.getDisponivelViagemSimNao());
            i++;
            
            stmt.setInt(i, c.getCozinhaSimNao());
            i++;
            
            stmt.setInt(i, c.getPrefereHouM());
            i++;
            
            stmt.setInt(i, c.getPressaoAltaSimNao());
            i++;
            
            stmt.setInt(i, c.getDiabeteSimNao());
            i++;
            
            stmt.setString(i, c.getTratamentoMedico());
            i++;
            
            stmt.setInt(i, c.getDormirTrabalhoSimNao());
            i++;
            
            stmt.setInt(i, c.getDisponibilidadeTotal());
            i++;
            
            stmt.setInt(i, c.getEscala2424SimNao());
            i++;
            
            stmt.setInt(i, c.getEscala1236SimNao());
            i++;
            
            stmt.setInt(i, c.getDiurnoIndex());
            i++;
            
            stmt.setInt(i, c.getSomenteSegASex());
            i++;
            
            stmt.setInt(i, c.getFolguistaFdsSimNao());
            i++;
            
            stmt.setInt(i, c.getIntegralFdsSimNao());
            i++;
            
            stmt.setString(i, c.getPretencaoSalarial());
            i++;
            
            stmt.setString(i, c.getObservacoes());
            i++;
            
            stmt.setInt(i, c.getTemCursoCuidadora());
            i++;
            
            stmt.setString(i, c.getQualCursoCuidadora());
            i++;
            
            stmt.setInt(i, c.getTemCertificadoSimNao());
            i++;
            
            stmt.setInt(i, c.getTemCursoEnfermagemSimNao());
            i++;
            
            stmt.setString(i, c.getQualCursoEnfermagem());
            i++;
            
            stmt.setInt(i, c.getCorenAtivoSimNao());
            i++;
            
            stmt.setString(i, c.getInscricaoCoren());
            i++;
            
            stmt.setInt(i, c.getComoAdiquiriuConhecimentoPraCur());
            i++;
            
            stmt.setInt(i, c.getAferirSinaisVitais());
            i++;
            
            stmt.setInt(i, c.getTrabalhaSondaSimNao());
            i++;
            
            stmt.setString(i, c.getQualSonda());
            i++;
            
            stmt.setInt(i, c.getTrabalhaBolsaSimNao());
            i++;
            
            stmt.setInt(i, c.getColostomia());
            i++;
            
            stmt.setString(i, c.getGrauDependencia());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeAlze());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeParkin());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeEsquizo());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeDeme());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeAvc());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeCancer());
            i++;
            
            stmt.setString(i, c.getObservacoesProfissional());
            i++;
            
            stmt.setString(i, c.getObervacoesUltimosEmpregos());
            i++;
            
            stmt.setString(i, c.getNomeEmpregador1());
            i++;
            
            stmt.setString(i, c.getTelefoneEmpregador1());
            i++;
            
            stmt.setString(i, c.getDataEmpregador1());
            i++;
            
            stmt.setString(i, c.getObservacoresEmpregador1());
            i++;
            
            stmt.setString(i, c.getNomeEmpregador2());
            i++;
            
            stmt.setString(i, c.getTelefoneEmpregador2());
            i++;
            
            stmt.setString(i, c.getDataEmpregador2());
            i++;
            
            stmt.setString(i, c.getObservacoresEmpregador2()); 
            i++;
            
            stmt.setString(i, c.getRgArquivo());
            i++;
            
            stmt.setString(i,c.getCpfArquivo());
            i++;
            
            stmt.setString(i,c.getEnderecoArquivo());
            i++;
            
            stmt.setString(i, c.getConrenArquivo());
            i++;
            
            stmt.setString(i, c.getCertificadoCuidadoraArquivo());
            i++;
            
            stmt.setString(i, c.getCertificadoEnfermagemArquivo());
            i++;
            
            stmt.setString(i, c.getCnhArquivo());
            i++;
            
            stmt.setString(i, c.getCnpjArquivo());
            i++;
            
            stmt.setString(i, c.getOutrosArquivo());
            i++;
            
            stmt.setString(i,c.getConsidecoes());
            i++;
            
            stmt.setInt(i, c.getCursoEnferTecnico());
            i++;
            
            stmt.setInt(i, c.getCursoEnferAux());
            i++;
            
            stmt.setInt(i, c.getBanhoSimNao());
            i++;
            
            stmt.setInt(i, c.getEscarrasSimNao());
            i++;
            
            stmt.setInt(i, c.getCadeiranteSimNao());
            i++;
            
            stmt.setString(i, c.getOutrasDoencas());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
        
    }
    
    public void salvarCadastroTeste(Cuidadora c){
        
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        try {
            int a =1;
            stmt = con.prepareStatement("INSERT INTO cadastrocuidadora (foto , tipo_cuidadora) VALUES (?, ?) ");
            stmt.setString(1,c.getNome());
            a++;
            stmt.setInt(2, c.getTipoCuidadora());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Cuidadora> consultaTabela(){
        
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        List<Cuidadora> ListaCadastro = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT idCuidadora, nome, tipo_cuidadora, regiao_lista_index, idade, cor_pele_lista_index, telefone_celular_cuidadora FROM cadastrocuidadora");
            resultado = stmt.executeQuery();
            
            while(resultado.next()){
                Cuidadora cadastroConsultaTabela = new Cuidadora();
                cadastroConsultaTabela.setIdCuidadora(resultado.getInt("idCuidadora"));
                cadastroConsultaTabela.setNome(resultado.getString("nome"));
                cadastroConsultaTabela.setTipoCuidadora(resultado.getInt("tipo_cuidadora"));
                cadastroConsultaTabela.setRegiaoListaIndex(resultado.getInt("regiao_lista_index"));
                cadastroConsultaTabela.setIdade(resultado.getString("idade"));        
                cadastroConsultaTabela.setCorPeleIndex(resultado.getInt("cor_pele_lista_index"));
                cadastroConsultaTabela.setTelefoneCelularCuidadora(resultado.getString("telefone_celular_cuidadora"));
                ListaCadastro.add(cadastroConsultaTabela);
                        
                        
                        
                        
                        
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resultado);
        }
        
        
        
        
        return ListaCadastro;
    }
    
    public void consultaCadastro(Cuidadora c,int idCuidarora){
        String idCuida = Integer.toString(idCuidarora);
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet re = null;
        //List<Cadastro> listaCadastro = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cadastrocuidadora WHERE idCuidadora = " +idCuida);
            re = stmt.executeQuery();
            int i = 1;
            while(re.next()){
                
                c.setIdCuidadora(re.getInt(i));
                i++;
                c.setCaminhoFoto(re.getString(i));
                i++;
                c.setTipoCuidadora(re.getInt(i));
                i++;
                c.setTemMei(re.getInt(i));
                i++;
                c.setCnpj(re.getString(i));
                i++;
                c.setNome(re.getString(i));
                i++;
                c.setNumeroRg(re.getString(i));
                i++;
                c.setCpf(re.getString(i));
                i++;
                c.setIdade(re.getString(i));
                i++;
                c.setAltura(re.getString(i));
                i++;
                c.setPeso(re.getString(i));
                i++;
                c.setCorPeleIndex(re.getInt(i));
                i++;
                c.setRegiaoListaIndex(re.getInt(i));
                i++;
                c.setEstadoCivilIndex(re.getInt(i));
                i++;
                c.setFilhosSimNao(re.getInt(i));
                i++;
                c.setFilhoMaiorMenor(re.getInt(i));
                i++;
                c.setCampoMenor(re.getString(i));
                i++;
                c.setCnhSimNao(re.getInt(i));        
                i++;
                c.setPossuiCarroSimNao(re.getInt(i));        
                i++;
                c.setEndereco(re.getString(i));        
                i++;
                c.setNumeroEndereco(re.getString(i));        
                i++;
                c.setCepEndereco(re.getString(i));        
                i++;
                c.setUfListaIndex(re.getInt(i));        
                i++;
                c.setBairroEndereco(re.getString(i));        
                i++;
                c.setCidade(re.getString(i));        
                i++;
                c.setTelefoneResidencialCuidadora(re.getString(i));        
                i++;
                c.setTelefoneCelularCuidadora(re.getString(i));        
                i++;
                c.setWhatsappSimNao(re.getInt(i));        
                i++;
                c.setReligiaoIndex(re.getInt(i));        
                i++;
                c.setFumanteSimNao(re.getInt(i));        
                i++;
                c.setGrauEscolarIndex(re.getInt(i));        
                i++;
                c.setCursoSuperior(re.getString(i));        
                i++;
                c.setGostaAnimalSimNao(re.getInt(i));        
                i++;
                c.setAlergiaSimNao(re.getInt(i));        
                i++;
                c.setQualAlergia(re.getString(i));
                i++;
                c.setRegistroCLTSimNao(re.getInt(i));        
                i++;
                c.setConvenioMedicoSimNao(re.getInt(i));        
                i++;
                c.setHabilidades(re.getString(i));        
                i++;
                c.setDisponivelViagemSimNao(re.getInt(i));        
                i++;
                c.setCozinhaSimNao(re.getInt(i));        
                i++;
                c.setPrefereHouM(re.getInt(i));        
                i++;
                c.setPressaoAltaSimNao(re.getInt(i));        
                i++;
                c.setDiabeteSimNao(re.getInt(i));        
                i++;
                c.setTratamentoMedico(re.getString(i));        
                i++;
                c.setDormirTrabalhoSimNao(re.getInt(i));        
                i++;
                c.setDisponibilidadeTotal(re.getInt(i));        
                i++;
                c.setEscala2424SimNao(re.getInt(i));        
                i++;
                c.setEscala1236SimNao(re.getInt(i));        
                i++;
                c.setDiurnoIndex(re.getInt(i));        
                i++;
                c.setSomenteSegASex(re.getInt(i));        
                i++;
                c.setFolguistaFdsSimNao(re.getInt(i));        
                i++;
                c.setIntegralFdsSimNao(re.getInt(i));        
                i++;
                c.setPretencaoSalarial(re.getString(i));        
                i++;
                c.setObservacoes(re.getString(i));        
                i++;
                c.setTemCursoCuidadora(re.getInt(i));        
                i++;
                c.setQualCursoCuidadora(re.getString(i));        
                i++;
                c.setTemCertificadoSimNao(re.getInt(i));        
                i++;
                c.setTemCursoEnfermagemSimNao(re.getInt(i));        
                i++;
                c.setQualCursoEnfermagem(re.getString(i));
                i++;
                c.setCorenAtivoSimNao(re.getInt(i));        
                i++;
                c.setInscricaoCoren(re.getString(i));        
                i++;
                c.setComoAdiquiriuConhecimentoPraCur(re.getInt(i));        
                i++;
                c.setAferirSinaisVitais(re.getInt(i));        
                i++;
                c.setTrabalhaSondaSimNao(re.getInt(i));        
                i++;
                c.setQualSonda(re.getString(i));        
                i++;
                c.setTrabalhaBolsaSimNao(re.getInt(i));        
                i++;
                c.setColostomia(re.getInt(i));
                i++;
                c.setGrauDependencia(re.getString(i));        
                i++;
                c.setEnfermidadeAlze(re.getInt(i));        
                i++;
                c.setEnfermidadeParkin(re.getInt(i));        
                i++;
                c.setEnfermidadeEsquizo(re.getInt(i));        
                i++;
                c.setEnfermidadeDeme(re.getInt(i));        
                i++;
                c.setEnfermidadeAvc(re.getInt(i));        
                i++;
                c.setEnfermidadeCancer(re.getInt(i));        
                i++;
                c.setObservacoesProfissional(re.getString(i));        
                i++;
                c.setObervacoesUltimosEmpregos(re.getString(i));        
                i++;
                c.setNomeEmpregador1(re.getString(i));        
                i++;
                c.setTelefoneEmpregador1(re.getString(i));        
                i++;
                c.setDataEmpregador1(re.getString(i));        
                i++;
                c.setObservacoresEmpregador1(re.getString(i));        
                i++;
                c.setNomeEmpregador2(re.getString(i));        
                i++;
                c.setTelefoneEmpregador2(re.getString(i));        
                i++;
                c.setDataEmpregador2(re.getString(i));        
                i++;
                c.setObservacoresEmpregador2(re.getString(i));        
                i++;
                c.setRgArquivo(re.getString(i));        
                i++;
                c.setCpfArquivo(re.getString(i));        
                i++;
                c.setEnderecoArquivo(re.getString(i));        
                i++;
                c.setConrenArquivo(re.getString(i));        
                i++;
                c.setCertificadoCuidadoraArquivo(re.getString(i));        
                i++;
                c.setCertificadoEnfermagemArquivo(re.getString(i));        
                i++;
                c.setCnhArquivo(re.getString(i));        
                i++;
                c.setCnpjArquivo(re.getString(i));        
                i++;
                c.setOutrosArquivo(re.getString(i));        
                i++;
                c.setConsidecoes(re.getString(i));
                i++;
                c.setCursoEnferTecnico(re.getInt(i));
                i++;
                c.setCursoEnferAux(re.getInt(i));
                i++;
                c.setBanhoSimNao(re.getInt(i));
                i++;
                c.setEscarrasSimNao(re.getInt(i));
                i++;
                c.setCadeiranteSimNao(re.getInt(i));
                i++;
                c.setOutrasDoencas(re.getString(i));

            }
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Consultar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, re);
        }
        
        
        
        
    }
    
    
    
    public void alterarDados(Cuidadora c){
        
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        
        
        try {
            stmt = con.prepareStatement("UPDATE cadastrocuidadora SET foto = ? ,  tipo_cuidadora = ? ,  tem_mei = ? ,  cnpj = ? ,  nome = ? ,  numero_rg = ? ,  cpf = ? ,  idade = ? ,  altura = ? ,  "
                    + "peso = ? ,  cor_pele_lista_index = ? ,  regiao_lista_index = ? ,  estado_civi_lista_index = ? ,  filhos_sim_nao = ? ,  filho_maior_menor = ? ,  "
                    + "campo_menor = ? ,  cnh_sim_nao = ? ,  possui_carro_sim_nao = ? ,  endereco = ? ,  numero_endereco = ? ,  cep_endereco = ? ,  uf_lista_index = ? ,  bairro_endereco = ? ,"
                    + "  cidade_endereco = ? ,  telefone_res_cuidadora = ? ,  telefone_celular_cuidadora = ? ,  whatsapp_sim_nao = ? ,  religiao_lista_index = ? ,  "
                    + "fumante_sim_nao = ? ,  grau_escola_lista_index = ? ,  curso_superior = ? ,  gosta_animal_sim_nao = ? ,  alegias_sim_nao = ? ,  qual_alergia = ? ,  "
                    + "registro_clt_sim_nao = ? ,  convenio_medico_sim_nao = ? ,  campo_habilidades = ? ,  disponibilidade_viajem_sim_nao = ? ,  cozinha_sim_nao = ? ,  "
                    + "prefere_h_ou_m = ? ,  pressao_alta_sim_nao = ? ,  diabete_sim_nao = ? ,  tratamento_medico = ? ,  dormir_trabralho_sim_nao = ? ,  escala_5d2d_sim_nao = ? ,  "
                    + "escala_2424_sim_nao = ? ,  escala_1236_sim_nao = ? ,  diurno_lista_index = ? ,  somente_segunda_a_sex = ? ,  folguita_fds_sim_nao = ? ,  "
                    + "integral_sab_dom_sim_nao = ? ,  pretencao_salarial = ? ,  observacoes = ? ,  tem_curso_cuidadora_sim_nao = ? ,  campo_qual_curso = ? ,  "
                    + "tem_certificado_sim_nao = ? ,  tem_curso_enfermagem_sim_nao = ? ,  campo_qual_enfermagem = ? ,  coren_ativo_sim_nao = ? ,  campo_inscricao_coren = ? ,  "
                    + "como_adiquiriu_conhecimento_pc = ? ,  sabe_aferir_sinais = ? ,  trabalho_sonda_sim_nao = ? , qual_sonda = ? , trabalho_bolsa_sim_nao = ? , colostomia = ?  ,  "
                    + "grau_dependencia = ? ,  enfermidades_alze = ? ,  enfermidade_parkin = ? ,  enfermidade_esquizo = ? ,  enfermidade_demen = ? ,  enfermidade_avc = ? ,  "
                    + "enfermidade_cancer = ? ,  observacoes_profissional = ? ,  observacoes_ultimos_empregos = ? ,  nome_empregador1 = ? ,  telefone_empregador1 = ? ,  "
                    + "data_empregador1 = ? ,  observacoes_empregador1 = ? ,  nome_empregador2 = ? ,  telefone_empregador2 = ? ,  data_empregador2 = ? ,  observacoes_empregador2 = ? ,  "
                    + "rg_pdf = ? ,  cpf_pdf = ? ,  endereco_pdf = ? ,  conre_pdf = ? ,  certificado_cuidadora_pdf = ? ,  certificado_enfermagem_pdf = ? ,  cnh_pdf = ? ,  cnpj_pdf = ? ,  "
                    + "outros_pdf = ? ,  consideracoes = ? , curso_enfermagem_tecnico = ?, curso_enfermagem_auxiliar = ? , banho_sim_nao = ?, escarras_sim_nao = ?, cadeirante_sim_nao = ?, outras_doencas = ?  WHERE idCuidadora = ?");
            int i = 1;
            stmt.setString(i, c.getCaminhoFoto());
            i++;
            
            stmt.setInt(i, c.getTipoCuidadora());
            i++;
            
            stmt.setInt(i, c.getTemMei());
            i++;
            
            stmt.setString(i, c.getCnpj());
            i++;
            
            stmt.setString(i,c.getNome());
            i++;
            
            stmt.setString(i,c.getNumeroRg());
            i++;
            
            stmt.setString(i, c.getCpf());
            i++;
            
            stmt.setString(i,c.getIdade());
            i++;
            
            stmt.setString(i, c.getAltura());
            i++;
            
            stmt.setString(i, c.getPeso());
            i++;
            
            stmt.setInt(i, c.getCorPeleIndex());
            i++;
            
            stmt.setInt(i, c.getRegiaoListaIndex());
            i++;
            
            stmt.setInt(i, c.getEstadoCivilIndex());
            i++;
            
            stmt.setInt(i, c.getFilhosSimNao());
            i++;
            
            stmt.setInt(i, c.getFilhoMaiorMenor());
            i++;
            
            stmt.setString(i,c.getCampoMenor());
            i++;
            
            stmt.setInt(i, c.getCnhSimNao());
            i++;
            
            stmt.setInt(i, c.getPossuiCarroSimNao());
            i++;
            
            stmt.setString(i, c.getEndereco());
            i++;
            
            stmt.setString(i, c.getNumeroEndereco());
            i++;
            
            stmt.setString(i, c.getCepEndereco());
            i++;
            
            stmt.setInt(i, c.getUfListaIndex());
            i++;
            
            stmt.setString(i, c.getBairroEndereco());
            i++;
            
            stmt.setString(i, c.getCidade());
            i++;
            
            stmt.setString(i, c.getTelefoneResidencialCuidadora());
            i++;
            
            stmt.setString(i, c.getTelefoneCelularCuidadora());
            i++;
            
            stmt.setInt(i, c.getWhatsappSimNao());
            i++;
            
            stmt.setInt(i, c.getReligiaoIndex());
            i++;
            
            stmt.setInt(i, c.getFumanteSimNao());
            i++;
            
            stmt.setInt(i, c.getGrauEscolarIndex());
            i++;
            
            stmt.setString(i, c.getCursoSuperior());
            i++;
            
            stmt.setInt(i, c.getGostaAnimalSimNao());
            i++;
            
            stmt.setInt(i, c.getAlergiaSimNao());
            i++;
            
            stmt.setString(i, c.getQualAlergia());
            i++;
            
            stmt.setInt(i, c.getRegistroCLTSimNao());
            i++;
            
            stmt.setInt(i, c.getConvenioMedicoSimNao());
            i++;
            
            stmt.setString(i, c.getHabilidades());
            i++;
            
            stmt.setInt(i, c.getDisponivelViagemSimNao());
            i++;
            
            stmt.setInt(i, c.getCozinhaSimNao());
            i++;
            
            stmt.setInt(i, c.getPrefereHouM());
            i++;
            
            stmt.setInt(i, c.getPressaoAltaSimNao());
            i++;
            
            stmt.setInt(i, c.getDiabeteSimNao());
            i++;
            
            stmt.setString(i, c.getTratamentoMedico());
            i++;
            
            stmt.setInt(i, c.getDormirTrabalhoSimNao());
            i++;
            
            stmt.setInt(i, c.getDisponibilidadeTotal());
            i++;
            
            stmt.setInt(i, c.getEscala2424SimNao());
            i++;
            
            stmt.setInt(i, c.getEscala1236SimNao());
            i++;
            
            stmt.setInt(i, c.getDiurnoIndex());
            i++;
            
            stmt.setInt(i, c.getSomenteSegASex());
            i++;
            
            stmt.setInt(i, c.getFolguistaFdsSimNao());
            i++;
            
            stmt.setInt(i, c.getIntegralFdsSimNao());
            i++;
            
            stmt.setString(i, c.getPretencaoSalarial());
            i++;
            
            stmt.setString(i, c.getObservacoes());
            i++;
            
            stmt.setInt(i, c.getTemCursoCuidadora());
            i++;
            
            stmt.setString(i, c.getQualCursoCuidadora());
            i++;
            
            stmt.setInt(i, c.getTemCertificadoSimNao());
            i++;
            
            stmt.setInt(i, c.getTemCursoEnfermagemSimNao());
            i++;
            
            stmt.setString(i, c.getQualCursoEnfermagem());
            i++;
            
            stmt.setInt(i, c.getCorenAtivoSimNao());
            i++;
            
            stmt.setString(i, c.getInscricaoCoren());
            i++;
            
            stmt.setInt(i, c.getComoAdiquiriuConhecimentoPraCur());
            i++;
            
            stmt.setInt(i, c.getAferirSinaisVitais());
            i++;
            
            stmt.setInt(i, c.getTrabalhaSondaSimNao());
            i++;
            
            stmt.setString(i, c.getQualSonda());
            i++;
            
            stmt.setInt(i, c.getTrabalhaBolsaSimNao());
            i++;
            
            stmt.setInt(i, c.getColostomia());
            i++;
            
            stmt.setString(i, c.getGrauDependencia());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeAlze());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeParkin());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeEsquizo());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeDeme());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeAvc());
            i++;
            
            stmt.setInt(i, c.getEnfermidadeCancer());
            i++;
            
            stmt.setString(i, c.getObservacoesProfissional());
            i++;
            
            stmt.setString(i, c.getObervacoesUltimosEmpregos());
            i++;
            
            stmt.setString(i, c.getNomeEmpregador1());
            i++;
            
            stmt.setString(i, c.getTelefoneEmpregador1());
            i++;
            
            stmt.setString(i, c.getDataEmpregador1());
            i++;
            
            stmt.setString(i, c.getObservacoresEmpregador1());
            i++;
            
            stmt.setString(i, c.getNomeEmpregador2());
            i++;
            
            stmt.setString(i, c.getTelefoneEmpregador2());
            i++;
            
            stmt.setString(i, c.getDataEmpregador2());
            i++;
            
            stmt.setString(i, c.getObservacoresEmpregador2()); 
            i++;
            
            stmt.setString(i, c.getRgArquivo());
            i++;
            
            stmt.setString(i,c.getCpfArquivo());
            i++;
            
            stmt.setString(i,c.getEnderecoArquivo());
            i++;
            
            stmt.setString(i, c.getConrenArquivo());
            i++;
            
            stmt.setString(i, c.getCertificadoCuidadoraArquivo());
            i++;
            
            stmt.setString(i, c.getCertificadoEnfermagemArquivo());
            i++;
            
            stmt.setString(i, c.getCnhArquivo());
            i++;
            
            stmt.setString(i, c.getCnpjArquivo());
            i++;
            
            stmt.setString(i, c.getOutrosArquivo());
            i++;
            
            stmt.setString(i,c.getConsidecoes());
            i++;
            
            stmt.setInt(i, c.getCursoEnferTecnico());
            i++;
            
            stmt.setInt(i, c.getCursoEnferAux());
            i++;
            
            stmt.setInt(i, c.getBanhoSimNao());
            i++;
            
            stmt.setInt(i,c.getEscarrasSimNao());
            i++;
            
            stmt.setInt(i, c.getCadeiranteSimNao());
            i++;
            
            stmt.setString(i, c.getOutrasDoencas());
            i++;
            
            
            
            stmt.setInt(i, c.getIdCuidadora());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }

        
    }
    
    public void deletaRegistro(Cuidadora c){
        int retVal = 0;
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cadastrocuidadora WHERE idCuidadora = ? ");
            stmt.setInt(1, c.getIdCuidadora());
            
            
            
            retVal = JOptionPane.showConfirmDialog(null, "Deseja Apagar o Registros? Processo IRREVERSÍVEL");
            if(retVal == 0){
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Apagado!");
            
            }else if(retVal == 1){
                JOptionPane.showMessageDialog(null, "Operação Cancelada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
        
        
    }
    
    public List<Cuidadora> consultaAvacada(String parTipoCuidadora,String parTemMei, String parIdade,String parAltura, String parCorPele, String parRegiao, String parBairro,String parCnh, String parCidade, String parReligiao, String parCozinha, String parDormirTrabalho,
            String parEscala2424, String parEscala1236, String parSomenteSegSex, String parFolguistaFDS, String parIntegralFDS, String parCursoCuidadora, String parPossuiCursoTec, String parPossuiCursoAux,
            String parSinaisVitais, String parTrabalhaSonda, String parTrabalhaBolsa, int colunas){
        int i = 1;
        String and = " AND ";
        String statement = "SELECT idCuidadora, nome, tipo_cuidadora, regiao_lista_index, idade, cor_pele_lista_index, telefone_celular_cuidadora FROM cadastrocuidadora WHERE ";
       
        //String idCuidadora = "idCuidadora = ";
        String tipoCuidadora = "tipo_cuidadora ";
        String temMei = "tem_mei =";
        String idade = "SEM CAMPO NO BANCO";
        String altura = "altura = ";
        String corPele = "cor_pele_lista_index = ";
        String regiao = "regiao_lista_index = ";
        String bairro = "bairro_endereco = ";
        String cnh = "cnh_sim_nao = ";
        String cidade = "cidade_endereco  = ";
        String religiao = "religiao_lista_index =";
        String cozinha = "cozinha_sim_nao =";
        String dormirTrabalho = "dormir_trabralho_sim_nao =";
        String escala2424 = "escala_2424_sim_nao = ";
        String escala1236 = "escala_1236_sim_nao = ";
        String somenteSegSex = "somente_segunda_a_sex = ";
        String folguistaFDS = "folguita_fds_sim_nao = ";
        String integralFDS = "integral_sab_dom_sim_nao = ";
        String cursoCuidadora = "tem_curso_cuidadora_sim_nao = ";
        String possuiCursoTec = "curso_enfermagem_tecnico = ";
        String possuiCursoAux = "curso_enfermagem_auxiliar = ";
        String sinaisVitais = "sabe_aferir_sinais = ";
        String trabalhaSonda = "trabalho_sonda_sim_nao = ";
        String trabalhaBolsa = "trabalho_bolsa_sim_nao = ";
       
       
        if(parTipoCuidadora != ""){
            statement = statement.concat(tipoCuidadora);
            statement = statement.concat(parTipoCuidadora);
            if(colunas > 1 && colunas > i){
                statement = statement.concat(and);
                i++;
            }
        }
        
        if(parTemMei != ""){
            statement = statement.concat(temMei);
            statement = statement.concat(parTemMei);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parIdade != ""){
            statement = statement.concat(idade).concat(parIdade);
            
            
            if(colunas > 1 && colunas > i ){
                statement =statement.concat(and);
                i++; 
            }
        }
        
        if(parAltura != ""){
            statement = statement.concat(altura).concat(parAltura);
            if(colunas > 1 && colunas > i){
                statement = statement.concat(and);
                i++;
            }
        }
        
        
        
        
                                                                
        if(parCorPele != ""){
            statement = statement.concat(corPele).concat(parCorPele);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
            
        }
        
        if(parRegiao != ""){
            statement = statement.concat(regiao).concat(parRegiao);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parBairro != ""){
            statement =statement.concat(bairro).concat(parBairro);
            if(colunas > 1 && colunas >i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parCnh != ""){
            statement = statement.concat(cnh).concat(parCnh);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        
        if(parCidade != ""){
            statement =statement.concat(cidade).concat(parCidade);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parReligiao != ""){
            statement =statement.concat(religiao).concat(parReligiao);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parCozinha != ""){
            statement =statement.concat(cozinha).concat(parCozinha);
            if(colunas > 1 && colunas > i ){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parDormirTrabalho != ""){
            statement =statement.concat(dormirTrabalho).concat(parDormirTrabalho);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parEscala2424 != ""){
            statement =statement.concat(escala2424).concat(parEscala2424);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parEscala1236 != ""){
            statement =statement.concat(escala1236).concat(parEscala1236);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parSomenteSegSex != ""){
            statement =statement.concat(somenteSegSex).concat(parSomenteSegSex);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parFolguistaFDS != ""){
            statement =statement.concat(folguistaFDS).concat(parFolguistaFDS);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parIntegralFDS != ""){
            statement =statement.concat(integralFDS).concat(parIntegralFDS);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parCursoCuidadora != ""){
            statement =statement.concat(cursoCuidadora).concat(parCursoCuidadora);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parPossuiCursoTec != ""){
            statement = statement.concat(possuiCursoTec).concat(parPossuiCursoTec);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parPossuiCursoAux != ""){
            statement = statement.concat(possuiCursoAux).concat(parPossuiCursoAux);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
            
        }
        
        if(parSinaisVitais != ""){
            statement = statement.concat(sinaisVitais).concat(parSinaisVitais);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
                
        }
        
        
        if(parTrabalhaSonda != ""){
            statement = statement.concat(trabalhaSonda).concat(parTrabalhaSonda);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        if(parTrabalhaBolsa != ""){
            statement = statement.concat(trabalhaBolsa).concat(parTrabalhaBolsa);
            if(colunas > 1 && colunas > i){
                statement =statement.concat(and);
                i++;
            }
        }
        
        
        
        
        
        
       
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        List<Cuidadora> ListaCadastro = new ArrayList<>();
        System.out.println(statement);
        try {
            stmt = con.prepareStatement(statement);
            resultado = stmt.executeQuery();
            
            while(resultado.next()){
                Cuidadora cadastroConsultaTabela = new Cuidadora();
                cadastroConsultaTabela.setIdCuidadora(resultado.getInt("idCuidadora"));
                cadastroConsultaTabela.setNome(resultado.getString("nome"));
                cadastroConsultaTabela.setTipoCuidadora(resultado.getInt("tipo_cuidadora"));
                cadastroConsultaTabela.setRegiaoListaIndex(resultado.getInt("regiao_lista_index"));
                cadastroConsultaTabela.setIdade(resultado.getString("idade"));        
                cadastroConsultaTabela.setCorPeleIndex(resultado.getInt("cor_pele_lista_index"));
                cadastroConsultaTabela.setTelefoneCelularCuidadora(resultado.getString("telefone_celular_cuidadora"));
                ListaCadastro.add(cadastroConsultaTabela);
                        
                        
                        
                        
                        
            }
            
            JOptionPane.showMessageDialog(null, "Pesquisa Realizada com Sucesso, Verifique a Aba de Resultados.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resultado);
        }
    
    
    
    
    return ListaCadastro;
    }   
    
}
