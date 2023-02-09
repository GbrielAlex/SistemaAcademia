package src.br.com.SistemaAcadema.funcionais;


import src.br.com.SistemaAcadema.objetosBD.*;

import java.util.LinkedList;
import java.util.List;


public class TreinoPersonalizado {

    private Cliente cliente;
    private Funcionario funcionario;
    private LinkedList<Exercicio> listaExecicios;

    public TreinoPersonalizado(Cliente cliente, Funcionario funcionario, List<Exercicio> exercicios) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.listaExecicios = new LinkedList<>(exercicios);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void addExercicio(Exercicio exercicio){
        if (!listaExecicios.contains(exercicio)){
            listaExecicios.add(exercicio);
        }
    }

    public void removerExercicio(Exercicio exercicio){
        listaExecicios.remove(exercicio);
    }

}
