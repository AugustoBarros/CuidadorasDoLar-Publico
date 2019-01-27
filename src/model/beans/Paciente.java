package model.beans;

/**
 *
 * @author Augusto Barros
 */
public class Paciente {
    
    //Aba de Dados do paciente
    
    private int idPaciente;
    private String numContrato;
    private String dataVisita;
    private String nomePaciente;
    private int religiãoIndex;
    private int estadoPacienteIndex;
    private String dataNascimento;
    private String idade;
    private String enderecoPaciente;
    private String numeroPaciente;
    private String complementoPaciente;
    private String cepPaciente;
    private String cidadeTxtPaciente;
    private int cidadeListPacienteIndex;
    private String bairroTxtPaciente;
    private int bairroListPacienteIndex;
    private int regiaoListIndex;
    private int boxFilhos;
    private int boxNetos; 
    private int boxMaridoEsposa;
    private int boxSozinho;
    private int boxOutros;
    private String OutrosMoraCom;
    private String nomeContratante; 
    private String cpfContratante;
    private String telefoneContratante;
    private String celularContratante;
    private String estadoContratanteIndex;
    private String enderecoContratante;
    private String numeroContratante;
    private String complementoContratante;
    private String cepContratante;
    private String cidadeTxtContratante;
    private int cidadeListContratanteIndex;
    private String bairroTxtContratante;
    private int bairroListContratanteIndex;
    private int planoListIndex;
    private String obsPlano;
    private int convenioMedicoSimNao;
    private String qualConvenio;
    private int gostaAnimaisSimNao;
    private int temAnimaisSimNao;
    private String quaisAnimais;
    
    //FIM Aba Dados Paciente/Contratante
    
    
    //Aba de Informações Complementares
    
    private String atividadeFisica;
    private String atividadesManuiais;
    private String portadorAlergias;
    private int boxEsfignomamometro;
    private int boxTermometro;
    private int boxGlicosimetro;
    private int boxLuvas;
    private int boxAlcool;
    private int boxFisioterapia;
    private String qualFisioterapia;
    private int boxTerapia;
    private String qualTerapia;
    private int boxOutrosNaResidenciaTem;
    private String campoOutrosNaResidenciaTem;
    private String patologias;
    private int boxAlzheimer;
    private int boxParkinson;
    private int boxAvc;
    private int boxCancer;
    private int boxPressaoAlta;
    private int boxPressaoBaixa;
    private int boxArritimia;
    private int boxHipoglicemia;
    private int boxExameDextro;
    private int boxDiabetico;
    private int boxUsaInsulina;
    private String qualInsulina;
    private int boxSomenteComprimidosELiquidos;
    private int boxUsaInjecaoIntra;
    private int boxAlimentasePorSonda;
    private int boxUsaColostomia;
    private String ObsInfoComp;
    
    //FIM da Aba de Informações Complementares
    
    //Inicio da Aba de Higiene,Locomoção e Alimentação
    
    private int boxBanhoSuper;
    private int boxBanhoCadeira;
    private int boxBanheiroAdaptado;
    private int boxBanhoLeito;
    private int boxAlimentaseSolidos;
    private int boxAlimentaseLiquidos;
    private int boxAlimentaseSonda;
    private int boxFazDieta;
    private String qualDieta;
    private int boxDietaLiberada;
    private String qualDietaLiberada;
    private int boxAndaSozinho;
    private int boxAndaComAndador;
    private int boxAndaComBengala;
    private int boxCadeirante;
    private int boxAcamado;
    private int boxAndaCuidadora;
    private int boxUsaFralda;
    private int boxUsaFraldaNoite;
    private int boxEvacuaBanheiro;
    private int boxUsaComadrePapaguaio;
    private int boxSondaDeAlivio;
    private int boxSondaUretra;
    
    //Fim da Aba de Higiene,Locomoção e Alimentação
    
    private int boxDormeSozinho;
    private int boxDormeAcompanhado;
    private int boxDormeNoiteToda;
    private int boxInsoniaPesadelo;
    private int boxMedicamentosDormir;
    private int boxTrocaDiaPorNoite;
    private int boxDormeDepoisRefeicao;
    private int boxGostaConversar;
    private int boxConversaPouco;
    private int boxNaoGostaConversar;
    private int boxAgressivo;
    private int boxAborrecido;
    private int boxAlteracoesHumor;
    private int boxDepressao;
    private int boxBoaMemoria;
    private int boxDesorientacao;
    private String RestricaoCuidadoras;
    private String ObsGerais;
    
    //Fim da Aba de Sono e Humor.

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getReligiãoIndex() {
        return religiãoIndex;
    }

    public void setReligiãoIndex(int religiãoIndex) {
        this.religiãoIndex = religiãoIndex;
    }

    public int getEstadoPacienteIndex() {
        return estadoPacienteIndex;
    }

    public void setEstadoPacienteIndex(int estadoPacienteIndex) {
        this.estadoPacienteIndex = estadoPacienteIndex;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(String numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getComplementoPaciente() {
        return complementoPaciente;
    }

    public void setComplementoPaciente(String complementoPaciente) {
        this.complementoPaciente = complementoPaciente;
    }

    public String getCepPaciente() {
        return cepPaciente;
    }

    public void setCepPaciente(String cepPaciente) {
        this.cepPaciente = cepPaciente;
    }

    public String getCidadeTxtPaciente() {
        return cidadeTxtPaciente;
    }

    public void setCidadeTxtPaciente(String cidadeTxtPaciente) {
        this.cidadeTxtPaciente = cidadeTxtPaciente;
    }

    public int getCidadeListPacienteIndex() {
        return cidadeListPacienteIndex;
    }

    public void setCidadeListPacienteIndex(int cidadeListPacienteIndex) {
        this.cidadeListPacienteIndex = cidadeListPacienteIndex;
    }

    public String getBairroTxtPaciente() {
        return bairroTxtPaciente;
    }

    public void setBairroTxtPaciente(String bairroTxtPaciente) {
        this.bairroTxtPaciente = bairroTxtPaciente;
    }

    public int getBairroListPacienteIndex() {
        return bairroListPacienteIndex;
    }

    public void setBairroListPacienteIndex(int bairroListPacienteIndex) {
        this.bairroListPacienteIndex = bairroListPacienteIndex;
    }

    public int getRegiaoListIndex() {
        return regiaoListIndex;
    }

    public void setRegiaoListIndex(int regiaoListIndex) {
        this.regiaoListIndex = regiaoListIndex;
    }

    public int getBoxFilhos() {
        return boxFilhos;
    }

    public void setBoxFilhos(int boxFilhos) {
        this.boxFilhos = boxFilhos;
    }

    public int getBoxNetos() {
        return boxNetos;
    }

    public void setBoxNetos(int boxNetos) {
        this.boxNetos = boxNetos;
    }

    public int getBoxMaridoEsposa() {
        return boxMaridoEsposa;
    }

    public void setBoxMaridoEsposa(int boxMaridoEsposa) {
        this.boxMaridoEsposa = boxMaridoEsposa;
    }

    public int getBoxSozinho() {
        return boxSozinho;
    }

    public void setBoxSozinho(int boxSozinho) {
        this.boxSozinho = boxSozinho;
    }

    public int getBoxOutros() {
        return boxOutros;
    }

    public void setBoxOutros(int boxOutros) {
        this.boxOutros = boxOutros;
    }

    public String getOutrosMoraCom() {
        return OutrosMoraCom;
    }

    public void setOutrosMoraCom(String OutrosMoraCom) {
        this.OutrosMoraCom = OutrosMoraCom;
    }

    public String getNomeContratante() {
        return nomeContratante;
    }

    public void setNomeContratante(String nomeContratante) {
        this.nomeContratante = nomeContratante;
    }

    public String getCpfContratante() {
        return cpfContratante;
    }

    public void setCpfContratante(String cpfContratante) {
        this.cpfContratante = cpfContratante;
    }

    public String getTelefoneContratante() {
        return telefoneContratante;
    }

    public void setTelefoneContratante(String telefoneContratante) {
        this.telefoneContratante = telefoneContratante;
    }

    public String getCelularContratante() {
        return celularContratante;
    }

    public void setCelularContratante(String celularContratante) {
        this.celularContratante = celularContratante;
    }

    public String getEstadoContratanteIndex() {
        return estadoContratanteIndex;
    }

    public void setEstadoContratanteIndex(String estadoContratanteIndex) {
        this.estadoContratanteIndex = estadoContratanteIndex;
    }

    public String getEnderecoContratante() {
        return enderecoContratante;
    }

    public void setEnderecoContratante(String enderecoContratante) {
        this.enderecoContratante = enderecoContratante;
    }

    public String getNumeroContratante() {
        return numeroContratante;
    }

    public void setNumeroContratante(String numeroContratante) {
        this.numeroContratante = numeroContratante;
    }

    public String getComplementoContratante() {
        return complementoContratante;
    }

    public void setComplementoContratante(String complementoContratante) {
        this.complementoContratante = complementoContratante;
    }

    public String getCepContratante() {
        return cepContratante;
    }

    public void setCepContratante(String cepContratante) {
        this.cepContratante = cepContratante;
    }

    public String getCidadeTxtContratante() {
        return cidadeTxtContratante;
    }

    public void setCidadeTxtContratante(String cidadeTxtContratante) {
        this.cidadeTxtContratante = cidadeTxtContratante;
    }

    public int getCidadeListContratanteIndex() {
        return cidadeListContratanteIndex;
    }

    public void setCidadeListContratanteIndex(int cidadeListContratanteIndex) {
        this.cidadeListContratanteIndex = cidadeListContratanteIndex;
    }

    public String getBairroTxtContratante() {
        return bairroTxtContratante;
    }

    public void setBairroTxtContratante(String bairroTxtContratante) {
        this.bairroTxtContratante = bairroTxtContratante;
    }

    public int getBairroListContratanteIndex() {
        return bairroListContratanteIndex;
    }

    public void setBairroListContratanteIndex(int bairroListContratanteIndex) {
        this.bairroListContratanteIndex = bairroListContratanteIndex;
    }

    public int getPlanoListIndex() {
        return planoListIndex;
    }

    public void setPlanoListIndex(int planoListIndex) {
        this.planoListIndex = planoListIndex;
    }

    public String getObsPlano() {
        return obsPlano;
    }

    public void setObsPlano(String obsPlano) {
        this.obsPlano = obsPlano;
    }

    public int getConvenioMedicoSimNao() {
        return convenioMedicoSimNao;
    }

    public void setConvenioMedicoSimNao(int convenioMedicoSimNao) {
        this.convenioMedicoSimNao = convenioMedicoSimNao;
    }

    public String getQualConvenio() {
        return qualConvenio;
    }

    public void setQualConvenio(String qualConvenio) {
        this.qualConvenio = qualConvenio;
    }

    public int getGostaAnimaisSimNao() {
        return gostaAnimaisSimNao;
    }

    public void setGostaAnimaisSimNao(int gostaAnimaisSimNao) {
        this.gostaAnimaisSimNao = gostaAnimaisSimNao;
    }

    public int getTemAnimaisSimNao() {
        return temAnimaisSimNao;
    }

    public void setTemAnimaisSimNao(int temAnimaisSimNao) {
        this.temAnimaisSimNao = temAnimaisSimNao;
    }

    public String getQuaisAnimais() {
        return quaisAnimais;
    }

    public void setQuaisAnimais(String quaisAnimais) {
        this.quaisAnimais = quaisAnimais;
    }

    public String getAtividadeFisica() {
        return atividadeFisica;
    }

    public void setAtividadeFisica(String atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }

    public String getAtividadesManuiais() {
        return atividadesManuiais;
    }

    public void setAtividadesManuiais(String atividadesManuiais) {
        this.atividadesManuiais = atividadesManuiais;
    }

    public String getPortadorAlergias() {
        return portadorAlergias;
    }

    public void setPortadorAlergias(String portadorAlergias) {
        this.portadorAlergias = portadorAlergias;
    }

    public int getBoxEsfignomamometro() {
        return boxEsfignomamometro;
    }

    public void setBoxEsfignomamometro(int boxEsfignomamometro) {
        this.boxEsfignomamometro = boxEsfignomamometro;
    }

    public int getBoxTermometro() {
        return boxTermometro;
    }

    public void setBoxTermometro(int boxTermometro) {
        this.boxTermometro = boxTermometro;
    }

    public int getBoxGlicosimetro() {
        return boxGlicosimetro;
    }

    public void setBoxGlicosimetro(int boxGlicosimetro) {
        this.boxGlicosimetro = boxGlicosimetro;
    }

    public int getBoxLuvas() {
        return boxLuvas;
    }

    public void setBoxLuvas(int boxLuvas) {
        this.boxLuvas = boxLuvas;
    }

    public int getBoxAlcool() {
        return boxAlcool;
    }

    public void setBoxAlcool(int boxAlcool) {
        this.boxAlcool = boxAlcool;
    }

    public int getBoxFisioterapia() {
        return boxFisioterapia;
    }

    public void setBoxFisioterapia(int boxFisioterapia) {
        this.boxFisioterapia = boxFisioterapia;
    }

    public String getQualFisioterapia() {
        return qualFisioterapia;
    }

    public void setQualFisioterapia(String qualFisioterapia) {
        this.qualFisioterapia = qualFisioterapia;
    }

    public int getBoxTerapia() {
        return boxTerapia;
    }

    public void setBoxTerapia(int boxTerapia) {
        this.boxTerapia = boxTerapia;
    }

    public String getQualTerapia() {
        return qualTerapia;
    }

    public void setQualTerapia(String qualTerapia) {
        this.qualTerapia = qualTerapia;
    }

    public int getBoxOutrosNaResidenciaTem() {
        return boxOutrosNaResidenciaTem;
    }

    public void setBoxOutrosNaResidenciaTem(int boxOutrosNaResidenciaTem) {
        this.boxOutrosNaResidenciaTem = boxOutrosNaResidenciaTem;
    }

    public String getCampoOutrosNaResidenciaTem() {
        return campoOutrosNaResidenciaTem;
    }

    public void setCampoOutrosNaResidenciaTem(String campoOutrosNaResidenciaTem) {
        this.campoOutrosNaResidenciaTem = campoOutrosNaResidenciaTem;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public int getBoxAlzheimer() {
        return boxAlzheimer;
    }

    public void setBoxAlzheimer(int boxAlzheimer) {
        this.boxAlzheimer = boxAlzheimer;
    }

    public int getBoxParkinson() {
        return boxParkinson;
    }

    public void setBoxParkinson(int boxParkinson) {
        this.boxParkinson = boxParkinson;
    }

    public int getBoxAvc() {
        return boxAvc;
    }

    public void setBoxAvc(int boxAvc) {
        this.boxAvc = boxAvc;
    }

    public int getBoxCancer() {
        return boxCancer;
    }

    public void setBoxCancer(int boxCancer) {
        this.boxCancer = boxCancer;
    }

    public int getBoxPressaoAlta() {
        return boxPressaoAlta;
    }

    public void setBoxPressaoAlta(int boxPressaoAlta) {
        this.boxPressaoAlta = boxPressaoAlta;
    }

    public int getBoxPressaoBaixa() {
        return boxPressaoBaixa;
    }

    public void setBoxPressaoBaixa(int boxPressaoBaixa) {
        this.boxPressaoBaixa = boxPressaoBaixa;
    }

    public int getBoxArritimia() {
        return boxArritimia;
    }

    public void setBoxArritimia(int boxArritimia) {
        this.boxArritimia = boxArritimia;
    }

    public int getBoxHipoglicemia() {
        return boxHipoglicemia;
    }

    public void setBoxHipoglicemia(int boxHipoglicemia) {
        this.boxHipoglicemia = boxHipoglicemia;
    }

    public int getBoxExameDextro() {
        return boxExameDextro;
    }

    public void setBoxExameDextro(int boxExameDextro) {
        this.boxExameDextro = boxExameDextro;
    }

    public int getBoxDiabetico() {
        return boxDiabetico;
    }

    public void setBoxDiabetico(int boxDiabetico) {
        this.boxDiabetico = boxDiabetico;
    }

    public int getBoxUsaInsulina() {
        return boxUsaInsulina;
    }

    public void setBoxUsaInsulina(int boxUsaInsulina) {
        this.boxUsaInsulina = boxUsaInsulina;
    }

    public String getQualInsulina() {
        return qualInsulina;
    }

    public void setQualInsulina(String qualInsulina) {
        this.qualInsulina = qualInsulina;
    }

    public int getBoxSomenteComprimidosELiquidos() {
        return boxSomenteComprimidosELiquidos;
    }

    public void setBoxSomenteComprimidosELiquidos(int boxSomenteComprimidosELiquidos) {
        this.boxSomenteComprimidosELiquidos = boxSomenteComprimidosELiquidos;
    }

    public int getBoxUsaInjecaoIntra() {
        return boxUsaInjecaoIntra;
    }

    public void setBoxUsaInjecaoIntra(int boxUsaInjecaoIntra) {
        this.boxUsaInjecaoIntra = boxUsaInjecaoIntra;
    }

    public int getBoxAlimentasePorSonda() {
        return boxAlimentasePorSonda;
    }

    public void setBoxAlimentasePorSonda(int boxAlimentasePorSonda) {
        this.boxAlimentasePorSonda = boxAlimentasePorSonda;
    }

    public int getBoxUsaColostomia() {
        return boxUsaColostomia;
    }

    public void setBoxUsaColostomia(int boxUsaColostomia) {
        this.boxUsaColostomia = boxUsaColostomia;
    }

    public String getObsInfoComp() {
        return ObsInfoComp;
    }

    public void setObsInfoComp(String ObsInfoComp) {
        this.ObsInfoComp = ObsInfoComp;
    }

    public int getBoxBanhoSuper() {
        return boxBanhoSuper;
    }

    public void setBoxBanhoSuper(int boxBanhoSuper) {
        this.boxBanhoSuper = boxBanhoSuper;
    }

    public int getBoxBanhoCadeira() {
        return boxBanhoCadeira;
    }

    public void setBoxBanhoCadeira(int boxBanhoCadeira) {
        this.boxBanhoCadeira = boxBanhoCadeira;
    }

    public int getBoxBanheiroAdaptado() {
        return boxBanheiroAdaptado;
    }

    public void setBoxBanheiroAdaptado(int boxBanheiroAdaptado) {
        this.boxBanheiroAdaptado = boxBanheiroAdaptado;
    }

    public int getBoxBanhoLeito() {
        return boxBanhoLeito;
    }

    public void setBoxBanhoLeito(int boxBanhoLeito) {
        this.boxBanhoLeito = boxBanhoLeito;
    }

    public int getBoxAlimentaseSolidos() {
        return boxAlimentaseSolidos;
    }

    public void setBoxAlimentaseSolidos(int boxAlimentaseSolidos) {
        this.boxAlimentaseSolidos = boxAlimentaseSolidos;
    }

    public int getBoxAlimentaseLiquidos() {
        return boxAlimentaseLiquidos;
    }

    public void setBoxAlimentaseLiquidos(int boxAlimentaseLiquidos) {
        this.boxAlimentaseLiquidos = boxAlimentaseLiquidos;
    }

    public int getBoxAlimentaseSonda() {
        return boxAlimentaseSonda;
    }

    public void setBoxAlimentaseSonda(int boxAlimentaseSonda) {
        this.boxAlimentaseSonda = boxAlimentaseSonda;
    }

    public int getBoxFazDieta() {
        return boxFazDieta;
    }

    public void setBoxFazDieta(int boxFazDieta) {
        this.boxFazDieta = boxFazDieta;
    }

    public String getQualDieta() {
        return qualDieta;
    }

    public void setQualDieta(String qualDieta) {
        this.qualDieta = qualDieta;
    }

    public int getBoxDietaLiberada() {
        return boxDietaLiberada;
    }

    public void setBoxDietaLiberada(int boxDietaLiberada) {
        this.boxDietaLiberada = boxDietaLiberada;
    }

    public String getQualDietaLiberada() {
        return qualDietaLiberada;
    }

    public void setQualDietaLiberada(String qualDietaLiberada) {
        this.qualDietaLiberada = qualDietaLiberada;
    }

    public int getBoxAndaSozinho() {
        return boxAndaSozinho;
    }

    public void setBoxAndaSozinho(int boxAndaSozinho) {
        this.boxAndaSozinho = boxAndaSozinho;
    }

    public int getBoxAndaComAndador() {
        return boxAndaComAndador;
    }

    public void setBoxAndaComAndador(int boxAndaComAndador) {
        this.boxAndaComAndador = boxAndaComAndador;
    }

    public int getBoxAndaComBengala() {
        return boxAndaComBengala;
    }

    public void setBoxAndaComBengala(int boxAndaComBengala) {
        this.boxAndaComBengala = boxAndaComBengala;
    }

    public int getBoxCadeirante() {
        return boxCadeirante;
    }

    public void setBoxCadeirante(int boxCadeirante) {
        this.boxCadeirante = boxCadeirante;
    }

    public int getBoxAcamado() {
        return boxAcamado;
    }

    public void setBoxAcamado(int boxAcamado) {
        this.boxAcamado = boxAcamado;
    }

    public int getBoxAndaCuidadora() {
        return boxAndaCuidadora;
    }

    public void setBoxAndaCuidadora(int boxAndaCuidadora) {
        this.boxAndaCuidadora = boxAndaCuidadora;
    }

    public int getBoxUsaFralda() {
        return boxUsaFralda;
    }

    public void setBoxUsaFralda(int boxUsaFralda) {
        this.boxUsaFralda = boxUsaFralda;
    }

    public int getBoxUsaFraldaNoite() {
        return boxUsaFraldaNoite;
    }

    public void setBoxUsaFraldaNoite(int boxUsaFraldaNoite) {
        this.boxUsaFraldaNoite = boxUsaFraldaNoite;
    }

    public int getBoxEvacuaBanheiro() {
        return boxEvacuaBanheiro;
    }

    public void setBoxEvacuaBanheiro(int boxEvacuaBanheiro) {
        this.boxEvacuaBanheiro = boxEvacuaBanheiro;
    }

    public int getBoxUsaComadrePapaguaio() {
        return boxUsaComadrePapaguaio;
    }

    public void setBoxUsaComadrePapaguaio(int boxUsaComadrePapaguaio) {
        this.boxUsaComadrePapaguaio = boxUsaComadrePapaguaio;
    }

    public int getBoxSondaDeAlivio() {
        return boxSondaDeAlivio;
    }

    public void setBoxSondaDeAlivio(int boxSondaDeAlivio) {
        this.boxSondaDeAlivio = boxSondaDeAlivio;
    }

    public int getBoxSondaUretra() {
        return boxSondaUretra;
    }

    public void setBoxSondaUretra(int boxSondaUretra) {
        this.boxSondaUretra = boxSondaUretra;
    }

    public int getBoxDormeSozinho() {
        return boxDormeSozinho;
    }

    public void setBoxDormeSozinho(int boxDormeSozinho) {
        this.boxDormeSozinho = boxDormeSozinho;
    }

    public int getBoxDormeAcompanhado() {
        return boxDormeAcompanhado;
    }

    public void setBoxDormeAcompanhado(int boxDormeAcompanhado) {
        this.boxDormeAcompanhado = boxDormeAcompanhado;
    }

    public int getBoxDormeNoiteToda() {
        return boxDormeNoiteToda;
    }

    public void setBoxDormeNoiteToda(int boxDormeNoiteToda) {
        this.boxDormeNoiteToda = boxDormeNoiteToda;
    }

    public int getBoxInsoniaPesadelo() {
        return boxInsoniaPesadelo;
    }

    public void setBoxInsoniaPesadelo(int boxInsoniaPesadelo) {
        this.boxInsoniaPesadelo = boxInsoniaPesadelo;
    }

    public int getBoxMedicamentosDormir() {
        return boxMedicamentosDormir;
    }

    public void setBoxMedicamentosDormir(int boxMedicamentosDormir) {
        this.boxMedicamentosDormir = boxMedicamentosDormir;
    }

    public int getBoxTrocaDiaPorNoite() {
        return boxTrocaDiaPorNoite;
    }

    public void setBoxTrocaDiaPorNoite(int boxTrocaDiaPorNoite) {
        this.boxTrocaDiaPorNoite = boxTrocaDiaPorNoite;
    }

    public int getBoxDormeDepoisRefeicao() {
        return boxDormeDepoisRefeicao;
    }

    public void setBoxDormeDepoisRefeicao(int boxDormeDepoisRefeicao) {
        this.boxDormeDepoisRefeicao = boxDormeDepoisRefeicao;
    }

    public int getBoxGostaConversar() {
        return boxGostaConversar;
    }

    public void setBoxGostaConversar(int boxGostaConversar) {
        this.boxGostaConversar = boxGostaConversar;
    }

    public int getBoxConversaPouco() {
        return boxConversaPouco;
    }

    public void setBoxConversaPouco(int boxConversaPouco) {
        this.boxConversaPouco = boxConversaPouco;
    }

    public int getBoxNaoGostaConversar() {
        return boxNaoGostaConversar;
    }

    public void setBoxNaoGostaConversar(int boxNaoGostaConversar) {
        this.boxNaoGostaConversar = boxNaoGostaConversar;
    }

    public int getBoxAgressivo() {
        return boxAgressivo;
    }

    public void setBoxAgressivo(int boxAgressivo) {
        this.boxAgressivo = boxAgressivo;
    }

    public int getBoxAborrecido() {
        return boxAborrecido;
    }

    public void setBoxAborrecido(int boxAborrecido) {
        this.boxAborrecido = boxAborrecido;
    }

    public int getBoxAlteracoesHumor() {
        return boxAlteracoesHumor;
    }

    public void setBoxAlteracoesHumor(int boxAlteracoesHumor) {
        this.boxAlteracoesHumor = boxAlteracoesHumor;
    }

    public int getBoxDepressao() {
        return boxDepressao;
    }

    public void setBoxDepressao(int boxDepressao) {
        this.boxDepressao = boxDepressao;
    }

    public int getBoxBoaMemoria() {
        return boxBoaMemoria;
    }

    public void setBoxBoaMemoria(int boxBoaMemoria) {
        this.boxBoaMemoria = boxBoaMemoria;
    }

    public int getBoxDesorientacao() {
        return boxDesorientacao;
    }

    public void setBoxDesorientacao(int boxDesorientacao) {
        this.boxDesorientacao = boxDesorientacao;
    }

    public String getRestricaoCuidadoras() {
        return RestricaoCuidadoras;
    }

    public void setRestricaoCuidadoras(String RestricaoCuidadoras) {
        this.RestricaoCuidadoras = RestricaoCuidadoras;
    }

    public String getObsGerais() {
        return ObsGerais;
    }

    public void setObsGerais(String ObsGerais) {
        this.ObsGerais = ObsGerais;
    }
    
    
    
    
    
    
    
    
}
