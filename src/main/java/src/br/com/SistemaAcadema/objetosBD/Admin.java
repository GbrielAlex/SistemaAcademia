package src.br.com.SistemaAcadema.objetosBD;

public class Admin  {

    private String senha;

    public Admin( String senha) {
        this.senha = senha;
    }

    public boolean confirmar(String senha){
        if(senha.equals(this.senha)){
            return true;
        }
        return false;
    }

    public void realizarPagamento(Funcionario funcionario){
        funcionario.setPagamentoEmDia();
    }

}
