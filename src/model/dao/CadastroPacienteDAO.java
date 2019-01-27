package model.dao;
import model.beans.Paciente;
import connection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Augusto Barros
 */
public class CadastroPacienteDAO {
    
    public void salvarCadastro(Paciente p){
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO cadastro_paciente ( numContrato ,  data_visita ,  nome_paciente ,  religiao_index , "
                    + " estado_paciente_index ,  data_nascimento ,  idade_paciente ,  endereco_paciente ,  numero_paciente ,  complemento_paciente ,"
                    + "  cep_paciente ,  cidade_txt_paciente ,  cidade_list_paciente ,  bairro_txt_paciente ,  bairro_list_paciente ,  regiao_index ,"
                    + "  box_filhos ,  box_netos ,  box_marido_esposa ,  box_sozinho ,  box_outros ,  campo_moracom_outros ,  nome_contratante , "
                    + " cpf_contratante ,  telefone_contratante ,  celular_contratante ,  estado_contratante_index ,  endereco_contratante , "
                    + " numero_contratante ,  complemento_contratante ,  cep_contratante ,  cidade_txt_contratante ,  cidade_list_contratante , "
                    + " bairro_txt_contratante ,  bairro_list_contratante ,  plano_index ,  obs_plano ,  convenio_medico_sim_nao ,  qual_convenio ,"
                    + "  gosta_animais_sim_nao ,  tem_animais_sim_nao ,  quais_animais ,  atividade_fisica ,  atividades_manuais ,  portador_alergia "
                    + ",  box_esfinomamometro ,  box_termometro ,  box_luvas ,  box_alcool ,  box_fisioterapia ,  qual_fisioterapia ,  box_terapia ,"
                    + "  qual_terapia ,  box_residencia_tem_outros ,  campo_residencia_tem_outros ,  patologias ,  box_alzheimer ,  box_parkinson , "
                    + " box_avc ,  box_cancer ,  box_pressao_alta ,  box_pressao_baixa ,  box_arritimia ,  box_hipoglicemia ,  box_exame_dextro , "
                    + " box_diabetico ,  box_usa_insulina ,  qual_insulina ,  box_somente_comprimidos_liquidos ,  box_injecao_intra , "
                    + " box_alimetase_sonda ,  box_usa_colostomia ,  obs_info_comp ,  box_banho_super ,  box_banho_cadeira ,  box_banheiro_adaptado "
                    + ",  box_banho_leito ,  box_alimenta_solidos ,  box_alimenta_liquidos ,  box_alimenta_sonda ,  box_dieta ,  qual_dieta , "
                    + " box_dieta_liberada ,  qual_dieta_liberada ,  box_anda_sozinho ,  box_anda_andador ,  box_anda_bengala ,  box_cadeirante , "
                    + " box_acamado ,  box_anda_cuidadora ,  box_usa_fralda ,  box_usa_fralda_noite ,  box_evacua_banheiro ,  "
                    + "box_usa_comadre_papagaio ,  box_sonda_alivio ,  box_sonda_uretra ,  box_dorme_sozinho ,  box_dorme_acompanhado ,  "
                    + "box_dorme_noite ,  box_insonia_pesadelo ,  box_medicamentos_dormir ,  box_troca_dia_por_noite ,  box_dorme_depois_refeicao , "
                    + " box_gosta_conversar ,  box_conversa_pouco ,  obs_gerais ,  box_agressivo ,  box_aborrecido ,  box_alteracoes_humor , "
                    + " box_depressao ,  box_boa_memoria ,  box_desorientacao ,  restricao_cuidadoa ,  obs_gerais_final) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            
            int i = 1;
            stmt.setString(i, p.getNumContrato());
            i++;
            
            stmt.setString(i, p.getDataVisita());
            i++;
            
            stmt.setString(i, p.getNomePaciente());
            i++;
            
            stmt.setInt(i, p.getReligiãoIndex());
            i++;
            
            stmt.setInt(i, p.getEstadoPacienteIndex());
            i++;
            
            stmt.setString(i, p.getDataNascimento());
            i++;
            
            stmt.setString(i, p.getIdade());
            i++;
            
            stmt.setString(i, p.getEnderecoPaciente());
            i++;
            
            stmt.setString(i, p.getNumeroPaciente());
            i++;
            
            stmt.setString(i, p.getComplementoPaciente());
            i++;
            
            stmt.setString(i, p.getCepPaciente());
            i++;
            
            stmt.setString(i, p.getCidadeTxtPaciente());
            i++;
            
            stmt.setInt(i, p.getCidadeListPacienteIndex());
            i++;
            
            stmt.setString(i, p.getBairroTxtPaciente());
            i++;
            
            stmt.setInt(i, p.getBairroListPacienteIndex());
            i++;
            
            stmt.setInt(i, p.getRegiaoListIndex());
            i++;
            
            stmt.setInt(i, p.getBoxFilhos());
            i++;
            
            stmt.setInt(i, p.getBoxNetos());
            i++;
            
            stmt.setInt(i, p.getBoxMaridoEsposa());
            i++;
            
            stmt.setInt(i, p.getBoxSozinho());
            i++;
            
            stmt.setInt(i, p.getBoxOutros());
            i++;
            
            stmt.setString(i, p.getOutrosMoraCom());
            i++;
            
            stmt.setString(i, p.getNomeContratante());
            i++;
            
            stmt.setString(i, p.getCpfContratante());
            i++;
            
            stmt.setString(i, p.getTelefoneContratante());
            i++;
            
            stmt.setString(i, p.getCelularContratante());
            i++;
            
            stmt.setInt(i, p.getEstadoContratanteIndex());
            i++;
            
            stmt.setString(i, p.getEnderecoContratante());
            i++;
            
            stmt.setString(i, p.getNumeroContratante());
            i++;
            
            stmt.setString(i, p.getComplementoContratante());
            i++;
            
            stmt.setString(i, p.getCepContratante());
            i++;
            
            stmt.setString(i, p.getCidadeTxtContratante());
            i++;
            
            stmt.setInt(i, p.getCidadeListContratanteIndex());
            i++;
            
            stmt.setString(i, p.getBairroTxtContratante());
            i++;
            
            stmt.setInt(i, p.getBairroListContratanteIndex());
            i++;
            
            stmt.setInt(i, p.getPlanoListIndex());
            i++;
            
            stmt.setString(i, p.getObsPlano());
            i++;
            
            stmt.setInt(i, p.getConvenioMedicoSimNao());
            i++;
            
            stmt.setString(i, p.getQualConvenio());
            i++;
            
            stmt.setInt(i, p.getGostaAnimaisSimNao());
            i++;
            
            stmt.setInt(i, p.getTemAnimaisSimNao());
            i++;
            
            stmt.setString(i, p.getQuaisAnimais());
            i++;
            
            stmt.setString(i, p.getAtividadeFisica());
            i++;
            
            stmt.setString(i, p.getAtividadesManuiais());
            i++;
            
            stmt.setString(i, p.getPortadorAlergias());
            i++;
            
            stmt.setInt(i, p.getBoxEsfignomamometro());
            i++;
            
            stmt.setInt(i, p.getBoxTermometro());
            i++;
            
            stmt.setInt(i, p.getBoxGlicosimetro());
            i++;
            
            stmt.setInt(i, p.getBoxLuvas());
            i++;
            
            stmt.setInt(i, p.getBoxAlcool());
            i++;
            
            stmt.setInt(i, p.getBoxFisioterapia());
            i++;
            
            stmt.setString(i, p.getQualFisioterapia());
            i++;
            
            stmt.setInt(i, p.getBoxTerapia());
            i++;
            
            stmt.setString(i, p.getQualTerapia());
            i++;
            
            stmt.setInt(i, p.getBoxOutrosNaResidenciaTem());
            i++;
            
            stmt.setString(i, p.getCampoOutrosNaResidenciaTem());
            i++;
            
            stmt.setString(i, p.getPatologias());
            i++;
            
            stmt.setInt(i, p.getBoxAlzheimer());
            i++;
            
            stmt.setInt(i, p.getBoxParkinson());
            i++;
            
            stmt.setInt(i, p.getBoxAvc());
            i++;
            
            stmt.setInt(i, p.getBoxCancer());
            i++;
            
            stmt.setInt(i, p.getBoxPressaoAlta());
            i++;
            
            stmt.setInt(i, p.getBoxPressaoBaixa());
            i++;
            
            stmt.setInt(i, p.getBoxArritimia());
            i++;
            
            stmt.setInt(i, p.getBoxHipoglicemia());
            i++;
            
            stmt.setInt(i, p.getBoxExameDextro());
            i++;
            
            stmt.setInt(i, p.getBoxDiabetico());
            i++;
            
            stmt.setInt(i, p.getBoxUsaInsulina());
            i++;
            
            stmt.setString(i, p.getQualInsulina());
            i++;
            
            stmt.setInt(i, p.getBoxSomenteComprimidosELiquidos());
            i++;
            
            stmt.setInt(i, p.getBoxUsaInjecaoIntra());
            i++;
            
            stmt.setInt(i, p.getBoxAlimentasePorSonda());
            i++;
            
            stmt.setInt(i, p.getBoxUsaColostomia());
            i++;
            
            stmt.setString(i, p.getObsInfoComp());
            i++;
            
            
            
            
                    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
