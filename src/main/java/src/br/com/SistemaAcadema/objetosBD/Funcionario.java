package src.br.com.SistemaAcadema.objetosBD;

import src.br.com.SistemaAcadema.funcionais.PessoaFisica;

import java.util.Calendar;

public class Funcionario extends PessoaFisica {

    private String senhaAcesso;
    private double salario;
    private Calendar dataPagamente;

    private Boolean pagamentoEmDia;

    public Funcionario(String cpf, String nome, Calendar dataNascimento,String email, String endereco, String senhaAcesso, double salario, Calendar dataPagamente) {
        super(cpf, nome, dataNascimento, endereco, email);
        this.senhaAcesso = senhaAcesso;
        this.salario = salario;
        this.dataPagamente = dataPagamente;
        super.setNIVELACESSO(1);
        this.pagamentoEmDia = true;
    }



    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public double getSalario() {
        return salario;
    }

    public Calendar getDataPagamente() {
        return dataPagamente;
    }

    public void setDataPagamente(Calendar dataPagamente) {
        this.dataPagamente = dataPagamente;
    }

    public void setPagamentoEmDia(){
        pagamentoEmDia = true;
    }

}
