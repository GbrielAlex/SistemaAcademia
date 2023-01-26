package src.br.com.SistemaAcadema.objetosBD;

import src.br.com.SistemaAcadema.TreinoPersonalizado;
import src.br.com.SistemaAcadema.funcionais.PessoaFisica;

import java.util.Calendar;

public class Cliente extends PessoaFisica {

    private float gorduraCorporal;
    private float peso;
    private PlanoAcademia plano;
    private Calendar dataMatricula;
    private String patologias;
    private Funcionario personal;
    private TreinoPersonalizado treino;
    private boolean situacao;

    public Cliente(String cpf, String nome, Calendar dataNascimento, String endereco, float gorduraCorporal, float peso, PlanoAcademia plano, Calendar dataMatricula, String patologias) {
        super(cpf, nome, dataNascimento, endereco);
        this.gorduraCorporal = gorduraCorporal;
        this.peso = peso;
        this.plano = plano;
        this.dataMatricula = dataMatricula;
        this.patologias = patologias;
        this.situacao = false;

    }
    public float getGorduraCorporal() {
        return gorduraCorporal;
    }

    public void setGorduraCorporal(float gorduraCorporal) {
        this.gorduraCorporal = gorduraCorporal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public PlanoAcademia getPlano() {
        return plano;
    }

    public void setPlano(PlanoAcademia plano) {
        this.plano = plano;
    }

    public Calendar getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Calendar dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public Funcionario getPersonal() {
        return personal;
    }

    public void setPersonal(Funcionario personal) {
        this.personal = personal;
    }

    public TreinoPersonalizado getTreino() {
        return treino;
    }

    public void setTreino(TreinoPersonalizado treino) {
        this.treino = treino;
    }

    public boolean Situacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
