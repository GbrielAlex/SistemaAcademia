package src.br.com.SistemaAcadema.funcionais;

import java.util.Calendar;

public class PessoaFisica {

    private String cpf;
    private String nome;
    private Calendar dataNascimento;
    private String endereco;
    private String email;
    private int NIVELACESSO ;

    public PessoaFisica(String cpf, String nome, Calendar dataNascimento, String endereco, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.NIVELACESSO = 0;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setNIVELACESSO(int NIVELACESSO) {
        this.NIVELACESSO = NIVELACESSO;
    }
}
