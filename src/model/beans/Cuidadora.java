package model.beans;

import com.mysql.jdbc.Blob;

/**
 *
 * @author Augusto Barros
 */
public class Cuidadora {
    // Campos da Tabela -- 93 (com id) no total.
    private int idCuidadora;
    private String caminhoFoto;
    private int tipoCuidadora;
    private int temMei;
    private String cnpj;
    private String cpf;
    private String nome;
    private String numeroRg;
    private String idade;
    private String altura;
    private String peso;
    private int corPeleIndex;
    private int regiaoListaIndex;
    private int estadoCivilIndex;
    private int filhosSimNao;
    private int filhoMaiorMenor;
    private String campoMenor;
    private int cnhSimNao;
    private int possuiCarroSimNao;
    private String endereco;
    private String numeroEndereco;
    private String cepEndereco;
    private int ufListaIndex;
    private String bairroEndereco;
    private String cidade;
    private String telefoneResidencialCuidadora;
    private String telefoneCelularCuidadora;
    private int whatsappSimNao;
    private int religiaoIndex;
    private int fumanteSimNao;
    private int grauEscolarIndex;
    private String cursoSuperior;
    private int gostaAnimalSimNao;
    private int alergiaSimNao;
    private String qualAlergia;
    private int registroCLTSimNao;
    private int convenioMedicoSimNao;
    private String habilidades;
    private int disponivelViagemSimNao;
    private int cozinhaSimNao;
    private int prefereHouM;       
    private int pressaoAltaSimNao;       
    private int diabeteSimNao;
    private String tratamentoMedico;
    private int dormirTrabalhoSimNao;
    
    
    private int disponibilidadeTotal;
    
    
    
    private int escala2424SimNao; 
    private int escala1236SimNao;
    private int diurnoIndex;
    private int somenteSegASex;
    private int folguistaFdsSimNao;
    private int integralFdsSimNao;
    private String pretencaoSalarial;
    private String observacoes;
    private int temCursoCuidadora;
    private String qualCursoCuidadora;
    private int temCertificadoSimNao;
    private int temCursoEnfermagemSimNao;
    private String qualCursoEnfermagem;
    private int corenAtivoSimNao;
    private String inscricaoCoren;
    private int comoAdiquiriuConhecimentoPraCur;
    private int aferirSinaisVitais;
    private int trabalhaSondaSimNao;
    private String qualSonda;
    private int trabalhaBolsaSimNao;
    private int colostomia;
    
    private String grauDependencia;
    private int enfermidadeAlze;
    private int enfermidadeParkin;
    private int enfermidadeEsquizo;
    private int enfermidadeDeme;
    private int enfermidadeAvc;
    private int enfermidadeCancer;
    private String observacoesProfissional;
    private String obervacoesUltimosEmpregos;
    private String nomeEmpregador1;
    private String telefoneEmpregador1;
    private String dataEmpregador1;
    private String observacoresEmpregador1;
    private String nomeEmpregador2;
    private String telefoneEmpregador2;
    private String dataEmpregador2;
    private String observacoresEmpregador2;
    private String rgArquivo;
    private String cpfArquivo;
    private String enderecoArquivo;
    private String conrenArquivo;
    private String certificadoCuidadoraArquivo;
    private String certificadoEnfermagemArquivo;
    private String cnhArquivo;
    private String cnpjArquivo;
    private String outrosArquivo;
    private String considecoes;
    private int cursoEnferTecnico;
    private int cursoEnferAux;
    private int banhoSimNao;
    private int escarrasSimNao;
    private int cadeiranteSimNao;
    private String outrasDoencas; 
            
    //Getters e Setters

    public int getIdCuidadora() {
        return idCuidadora;
    }

    public void setIdCuidadora(int idCuidadora) {
        this.idCuidadora = idCuidadora;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String foto) {
        this.caminhoFoto = foto;
    }

    public int getTipoCuidadora() {
        
        return tipoCuidadora;
    }
    public String getTipoCuidadora(int tipo) {
            if(tipo == 1){
                return "Auxiliar de Enfermagem";
            }else if(tipo == 2){
                return "Técnica(o) em Enfermagem";
            }else if(tipo == 3){
                return "Cuidadora";
            }
        return "Não definido";
    }        
    public void setTipoCuidadora(int tipoCuidadora) {
        this.tipoCuidadora = tipoCuidadora;
    }

    public int getTemMei() {
        return temMei;
    }

    public void setTemMei(int temMei) {
        this.temMei = temMei;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getCorPeleIndex() {
        return corPeleIndex;
    }
    public String getCorPeleIndex(int indice) {
        
        if(indice == 0){
            return "Muito Clara";
        }else
        if(indice == 1){
            return "Clara";
        }else
        if(indice == 2){
            return "Caucasiano";
        }else
        if(indice == 3){
            return "Escura Média";
        }else
        if(indice == 4){
            return "Escura";
        }else
        if(indice == 5){
            return "Negra";
        }
            return "Sem informações";
    }

    public void setCorPeleIndex(int corPeleIndex) {
        this.corPeleIndex = corPeleIndex;
    }

    public int getRegiaoListaIndex() {
        return regiaoListaIndex;
    }
    public String getRegiaoListaIndex(int indice) {
        if(indice == 0){
            return "Sul";
        }else if(indice == 1){
            return "Norte";
        }else if(indice == 2){
            return "Leste";
        }else if(indice == 3){
            return "Oeste";    
        }else if(indice == 4){
            return "Central";
        }
        
        return "sem informações";
    }

    public void setRegiaoListaIndex(int regiaoListaIndex) {
        this.regiaoListaIndex = regiaoListaIndex;
    }

    public int getEstadoCivilIndex() {
        return estadoCivilIndex;
    }

    public void setEstadoCivilIndex(int estadoCivilIndex) {
        this.estadoCivilIndex = estadoCivilIndex;
    }

    public int getFilhosSimNao() {
        return filhosSimNao;
    }

    public void setFilhosSimNao(int filhosSimNao) {
        this.filhosSimNao = filhosSimNao;
    }

    public int getFilhoMaiorMenor() {
        return filhoMaiorMenor;
    }

    public void setFilhoMaiorMenor(int filhoMaiorMenor) {
        this.filhoMaiorMenor = filhoMaiorMenor;
    }

    public String getCampoMenor() {
        return campoMenor;
    }

    public void setCampoMenor(String campoMenor) {
        this.campoMenor = campoMenor;
    }

    public int getCnhSimNao() {
        return cnhSimNao;
    }

    public void setCnhSimNao(int cnhSimNao) {
        this.cnhSimNao = cnhSimNao;
    }

    public int getPossuiCarroSimNao() {
        return possuiCarroSimNao;
    }

    public void setPossuiCarroSimNao(int possuiCarroSimNao) {
        this.possuiCarroSimNao = possuiCarroSimNao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public int getUfListaIndex() {
        return ufListaIndex;
    }

    public void setUfListaIndex(int ufListaIndex) {
        this.ufListaIndex = ufListaIndex;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefoneResidencialCuidadora() {
        return telefoneResidencialCuidadora;
    }

    public void setTelefoneResidencialCuidadora(String telefoneResidencialCuidadora) {
        this.telefoneResidencialCuidadora = telefoneResidencialCuidadora;
    }

    public String getTelefoneCelularCuidadora() {
        return telefoneCelularCuidadora;
    }

    public void setTelefoneCelularCuidadora(String telefoneCelularCuidadora) {
        this.telefoneCelularCuidadora = telefoneCelularCuidadora;
    }

    public int getWhatsappSimNao() {
        return whatsappSimNao;
    }

    public void setWhatsappSimNao(int whatsappSimNao) {
        this.whatsappSimNao = whatsappSimNao;
    }

    public int getReligiaoIndex() {
        return religiaoIndex;
    }

    public void setReligiaoIndex(int religiaoIndex) {
        this.religiaoIndex = religiaoIndex;
    }

    public int getFumanteSimNao() {
        return fumanteSimNao;
    }

    public void setFumanteSimNao(int fumanteSimNao) {
        this.fumanteSimNao = fumanteSimNao;
    }

    public int getGrauEscolarIndex() {
        return grauEscolarIndex;
    }

    public void setGrauEscolarIndex(int grauEscolarIndex) {
        this.grauEscolarIndex = grauEscolarIndex;
    }

    public String getCursoSuperior() {
        return cursoSuperior;
    }

    public void setCursoSuperior(String cursoSuperior) {
        this.cursoSuperior = cursoSuperior;
    }

    public int getGostaAnimalSimNao() {
        return gostaAnimalSimNao;
    }

    public void setGostaAnimalSimNao(int gostaAnimalSimNao) {
        this.gostaAnimalSimNao = gostaAnimalSimNao;
    }

    public int getAlergiaSimNao() {
        return alergiaSimNao;
    }

    public void setAlergiaSimNao(int alergiaSimNao) {
        this.alergiaSimNao = alergiaSimNao;
    }

    public String getQualAlergia() {
        return qualAlergia;
    }

    public void setQualAlergia(String qualAlergia) {
        this.qualAlergia = qualAlergia;
    }

    public int getRegistroCLTSimNao() {
        return registroCLTSimNao;
    }

    public void setRegistroCLTSimNao(int registroCLTSimNao) {
        this.registroCLTSimNao = registroCLTSimNao;
    }

    public int getConvenioMedicoSimNao() {
        return convenioMedicoSimNao;
    }

    public void setConvenioMedicoSimNao(int convenioMedicoSimNao) {
        this.convenioMedicoSimNao = convenioMedicoSimNao;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getDisponivelViagemSimNao() {
        return disponivelViagemSimNao;
    }

    public void setDisponivelViagemSimNao(int disponivelViagemSimNao) {
        this.disponivelViagemSimNao = disponivelViagemSimNao;
    }

    public int getCozinhaSimNao() {
        return cozinhaSimNao;
    }

    public void setCozinhaSimNao(int cozinhaSimNao) {
        this.cozinhaSimNao = cozinhaSimNao;
    }

    public int getPrefereHouM() {
        return prefereHouM;
    }

    public void setPrefereHouM(int prefereHouM) {
        this.prefereHouM = prefereHouM;
    }

    public int getPressaoAltaSimNao() {
        return pressaoAltaSimNao;
    }

    public void setPressaoAltaSimNao(int pressaoAltaSimNao) {
        this.pressaoAltaSimNao = pressaoAltaSimNao;
    }

    public int getDiabeteSimNao() {
        return diabeteSimNao;
    }

    public void setDiabeteSimNao(int diabeteSimNao) {
        this.diabeteSimNao = diabeteSimNao;
    }

    public String getTratamentoMedico() {
        return tratamentoMedico;
    }

    public void setTratamentoMedico(String tratamentoMedico) {
        this.tratamentoMedico = tratamentoMedico;
    }

    public int getDormirTrabalhoSimNao() {
        return dormirTrabalhoSimNao;
    }

    public void setDormirTrabalhoSimNao(int dormirTrabalhoSimNao) {
        this.dormirTrabalhoSimNao = dormirTrabalhoSimNao;
    }

    public int getDisponibilidadeTotal() {
        return disponibilidadeTotal;
    }

    public void setDisponibilidadeTotal(int disponibilidadeTotal) {
        this.disponibilidadeTotal = disponibilidadeTotal;
    }

    public int getEscala2424SimNao() {
        return escala2424SimNao;
    }

    public void setEscala2424SimNao(int escala2424SimNao) {
        this.escala2424SimNao = escala2424SimNao;
    }

    public int getEscala1236SimNao() {
        return escala1236SimNao;
    }

    public void setEscala1236SimNao(int escala1236SimNao) {
        this.escala1236SimNao = escala1236SimNao;
    }

    public int getDiurnoIndex() {
        return diurnoIndex;
    }

    public void setDiurnoIndex(int diurnoIndex) {
        this.diurnoIndex = diurnoIndex;
    }

    public int getSomenteSegASex() {
        return somenteSegASex;
    }

    public void setSomenteSegASex(int somenteSegASex) {
        this.somenteSegASex = somenteSegASex;
    }

    public int getFolguistaFdsSimNao() {
        return folguistaFdsSimNao;
    }

    public void setFolguistaFdsSimNao(int folguistaFdsSimNao) {
        this.folguistaFdsSimNao = folguistaFdsSimNao;
    }

    public int getIntegralFdsSimNao() {
        return integralFdsSimNao;
    }

    public void setIntegralFdsSimNao(int integralFdsSimNao) {
        this.integralFdsSimNao = integralFdsSimNao;
    }

    public String getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(String pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getTemCursoCuidadora() {
        return temCursoCuidadora;
    }

    public void setTemCursoCuidadora(int temCursoCuidadora) {
        this.temCursoCuidadora = temCursoCuidadora;
    }

    public String getQualCursoCuidadora() {
        return qualCursoCuidadora;
    }

    public void setQualCursoCuidadora(String qualCursoCuidadora) {
        this.qualCursoCuidadora = qualCursoCuidadora;
    }

    public int getTemCertificadoSimNao() {
        return temCertificadoSimNao;
    }

    public void setTemCertificadoSimNao(int temCertificadoSimNao) {
        this.temCertificadoSimNao = temCertificadoSimNao;
    }

    public int getTemCursoEnfermagemSimNao() {
        return temCursoEnfermagemSimNao;
    }

    public void setTemCursoEnfermagemSimNao(int temCursoEnfermagemSimNao) {
        this.temCursoEnfermagemSimNao = temCursoEnfermagemSimNao;
    }

    public String getQualCursoEnfermagem() {
        return qualCursoEnfermagem;
    }

    public void setQualCursoEnfermagem(String qualCursoEnfermagem) {
        this.qualCursoEnfermagem = qualCursoEnfermagem;
    }

    public int getCorenAtivoSimNao() {
        return corenAtivoSimNao;
    }

    public void setCorenAtivoSimNao(int corenAtivoSimNao) {
        this.corenAtivoSimNao = corenAtivoSimNao;
    }

    public String getInscricaoCoren() {
        return inscricaoCoren;
    }

    public void setInscricaoCoren(String inscricaoCoren) {
        this.inscricaoCoren = inscricaoCoren;
    }

    public int getComoAdiquiriuConhecimentoPraCur() {
        return comoAdiquiriuConhecimentoPraCur;
    }

    public void setComoAdiquiriuConhecimentoPraCur(int comoAdiquiriuConhecimentoPraCur) {
        this.comoAdiquiriuConhecimentoPraCur = comoAdiquiriuConhecimentoPraCur;
    }

    public int getAferirSinaisVitais() {
        return aferirSinaisVitais;
    }

    public void setAferirSinaisVitais(int aferirSinaisVitais) {
        this.aferirSinaisVitais = aferirSinaisVitais;
    }

    public int getTrabalhaSondaSimNao() {
        return trabalhaSondaSimNao;
    }

    public void setTrabalhaSondaSimNao(int trabalhaSondaSimNao) {
        this.trabalhaSondaSimNao = trabalhaSondaSimNao;
    }

    public int getTrabalhaBolsaSimNao() {
        return trabalhaBolsaSimNao;
    }

    public void setTrabalhaBolsaSimNao(int trabalhaBolsaSimNao) {
        this.trabalhaBolsaSimNao = trabalhaBolsaSimNao;
    }

  

    public String getGrauDependencia() {
        return grauDependencia;
    }

    public void setGrauDependencia(String grauDependencia) {
        this.grauDependencia = grauDependencia;
    }

    public int getEnfermidadeAlze() {
        return enfermidadeAlze;
    }

    public void setEnfermidadeAlze(int enfermidades) {
        this.enfermidadeAlze = enfermidades;
    }

    public String getObservacoesProfissional() {
        return observacoesProfissional;
    }

    public void setObservacoesProfissional(String observacoesProfissional) {
        this.observacoesProfissional = observacoesProfissional;
    }

    public String getObervacoesUltimosEmpregos() {
        return obervacoesUltimosEmpregos;
    }

    public void setObervacoesUltimosEmpregos(String obervacoesUltimosEmpregos) {
        this.obervacoesUltimosEmpregos = obervacoesUltimosEmpregos;
    }

    public String getNomeEmpregador1() {
        return nomeEmpregador1;
    }

    public void setNomeEmpregador1(String nomeEmpregador1) {
        this.nomeEmpregador1 = nomeEmpregador1;
    }

    public String getTelefoneEmpregador1() {
        return telefoneEmpregador1;
    }

    public void setTelefoneEmpregador1(String telefoneEmpregador1) {
        this.telefoneEmpregador1 = telefoneEmpregador1;
    }

    public String getDataEmpregador1() {
        return dataEmpregador1;
    }

    public void setDataEmpregador1(String dataEmpregador1) {
        this.dataEmpregador1 = dataEmpregador1;
    }

    public String getObservacoresEmpregador1() {
        return observacoresEmpregador1;
    }

    public void setObservacoresEmpregador1(String observacoresEmpregador1) {
        this.observacoresEmpregador1 = observacoresEmpregador1;
    }

    public String getNomeEmpregador2() {
        return nomeEmpregador2;
    }

    public void setNomeEmpregador2(String nomeEmpregador2) {
        this.nomeEmpregador2 = nomeEmpregador2;
    }

    public String getTelefoneEmpregador2() {
        return telefoneEmpregador2;
    }

    public void setTelefoneEmpregador2(String telefoneEmpregador2) {
        this.telefoneEmpregador2 = telefoneEmpregador2;
    }

    public String getDataEmpregador2() {
        return dataEmpregador2;
    }

    public void setDataEmpregador2(String dataEmpregador2) {
        this.dataEmpregador2 = dataEmpregador2;
    }

    public String getObservacoresEmpregador2() {
        return observacoresEmpregador2;
    }

    public void setObservacoresEmpregador2(String observacoresEmpregador2) {
        this.observacoresEmpregador2 = observacoresEmpregador2;
    }

    public String getRgArquivo() {
        return rgArquivo;
    }

    public void setRgArquivo(String rgArquivo) {
        this.rgArquivo = rgArquivo;
    }

    public String getCpfArquivo() {
        return cpfArquivo;
    }

    public void setCpfArquivo(String cpfArquivo) {
        this.cpfArquivo = cpfArquivo;
    }

    public String getEnderecoArquivo() {
        return enderecoArquivo;
    }

    public void setEnderecoArquivo(String enderecoArquivo) {
        this.enderecoArquivo = enderecoArquivo;
    }

    public String getConrenArquivo() {
        return conrenArquivo;
    }

    public void setConrenArquivo(String conrenArquivo) {
        this.conrenArquivo = conrenArquivo;
    }

    public String getCertificadoCuidadoraArquivo() {
        return certificadoCuidadoraArquivo;
    }

    public void setCertificadoCuidadoraArquivo(String certificadoCuidadoraArquivo) {
        this.certificadoCuidadoraArquivo = certificadoCuidadoraArquivo;
    }

    public String getCertificadoEnfermagemArquivo() {
        return certificadoEnfermagemArquivo;
    }

    public void setCertificadoEnfermagemArquivo(String certificadoEnfermagemArquivo) {
        this.certificadoEnfermagemArquivo = certificadoEnfermagemArquivo;
    }

    public String getCnhArquivo() {
        return cnhArquivo;
    }

    public void setCnhArquivo(String cnhArquivo) {
        this.cnhArquivo = cnhArquivo;
    }

    public String getCnpjArquivo() {
        return cnpjArquivo;
    }

    public void setCnpjArquivo(String cnpjArquivo) {
        this.cnpjArquivo = cnpjArquivo;
    }

    public String getOutrosArquivo() {
        return outrosArquivo;
    }

    public void setOutrosArquivo(String outrosArquivo) {
        this.outrosArquivo = outrosArquivo;
    }

    public String getConsidecoes() {
        return considecoes;
    }

    public void setConsidecoes(String considecoes) {
        this.considecoes = considecoes;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getEnfermidadeParkin() {
        return enfermidadeParkin;
    }

    public void setEnfermidadeParkin(int enfermidadeParkin) {
        this.enfermidadeParkin = enfermidadeParkin;
    }

    public int getEnfermidadeEsquizo() {
        return enfermidadeEsquizo;
    }

    public void setEnfermidadeEsquizo(int enfermidadeEsquizo) {
        this.enfermidadeEsquizo = enfermidadeEsquizo;
    }

    public int getEnfermidadeDeme() {
        return enfermidadeDeme;
    }

    public void setEnfermidadeDeme(int enfermidadeDeme) {
        this.enfermidadeDeme = enfermidadeDeme;
    }

    public int getEnfermidadeAvc() {
        return enfermidadeAvc;
    }

    public void setEnfermidadeAvc(int enfermidadeAvc) {
        this.enfermidadeAvc = enfermidadeAvc;
    }

    public int getEnfermidadeCancer() {
        return enfermidadeCancer;
    }

    public void setEnfermidadeCancer(int enfermidadeCancer) {
        this.enfermidadeCancer = enfermidadeCancer;
    }

    public String getQualSonda() {
        return qualSonda;
    }

    public void setQualSonda(String qualSonda) {
        this.qualSonda = qualSonda;
    }

    public int getColostomia() {
        return colostomia;
    }

    public void setColostomia(int colostomia) {
        this.colostomia = colostomia;
    }

    public int getCursoEnferTecnico() {
        return cursoEnferTecnico;
    }

    public void setCursoEnferTecnico(int cursoEnferTecnico) {
        this.cursoEnferTecnico = cursoEnferTecnico;
    }

    public int getCursoEnferAux() {
        return cursoEnferAux;
    }

    public void setCursoEnferAux(int cursoEnferAux) {
        this.cursoEnferAux = cursoEnferAux;
    }

    public int getBanhoSimNao() {
        return banhoSimNao;
    }

    public void setBanhoSimNao(int banhoSimNao) {
        this.banhoSimNao = banhoSimNao;
    }

    public int getEscarrasSimNao() {
        return escarrasSimNao;
    }

    public void setEscarrasSimNao(int escarrasSimNao) {
        this.escarrasSimNao = escarrasSimNao;
    }

    public int getCadeiranteSimNao() {
        return cadeiranteSimNao;
    }

    public void setCadeiranteSimNao(int cadeiranteSimNao) {
        this.cadeiranteSimNao = cadeiranteSimNao;
    }

    public String getOutrasDoencas() {
        return outrasDoencas;
    }

    public void setOutrasDoencas(String outrasDoencas) {
        this.outrasDoencas = outrasDoencas;
    }
    
    
}
