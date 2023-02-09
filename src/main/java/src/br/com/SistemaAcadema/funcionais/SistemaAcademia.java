package src.br.com.SistemaAcadema.funcionais;

import src.br.com.SistemaAcadema.objetosBD.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SistemaAcademia {

    private HashMap<String, PlanoAcademia> mapaPLanosAcademia;
    private HashMap<String, Cliente> mapaCLienteAcademia;
    private HashMap<String, Maquina> mapaMaquinasAcademia;
    private HashMap<String, Funcionario> mapaFuncionarios;
    private ArrayList<Admin> listaAdmin;

    public void addPlano(PlanoAcademia plano){
        mapaPLanosAcademia.put(plano.getCodigoPlano(),plano);
    }
    public  void addCliente(Cliente cliente){
        mapaCLienteAcademia.put(cliente.getCpf(),cliente);
    }
    public  void addMaquina(Maquina maquina){
        mapaMaquinasAcademia.put(maquina.getId(),maquina);
    }
    public void addFuncionarios(Funcionario funcionario){
        mapaFuncionarios.put(funcionario.getCpf(),funcionario);
    }
    public PlanoAcademia getPLanoAcademia(String id) {
        return mapaPLanosAcademia.get(id);
    }

    public Cliente getClienteAcademia(String id) {
        return mapaCLienteAcademia.get(id);
    }

    public Maquina getMaquina(String id) {
        return mapaMaquinasAcademia.get(id);
    }

    public Funcionario getFuncionario(String id) {
        return mapaFuncionarios.get(id);
    }

    public TreinoPersonalizado gerarTreinoPersonalizado(Cliente cliente, List<Exercicio> exercicios){
        TreinoPersonalizado treino = new TreinoPersonalizado(cliente,cliente.getPersonal(),exercicios);
        cliente.setTreino(treino);
        return treino;

    }
    public List<Cliente> emitirListaDeDevedores(){
        LinkedList<Cliente> devedores = new LinkedList<>();
        for (Cliente cliente:
             mapaCLienteAcademia.values()) {
            if (cliente.Situacao()){
                devedores.add(cliente);
            }
        }
        return devedores;
    }

    public void realizarPagamento(String cpf){
        mapaCLienteAcademia.get(cpf).realizarPagamento();
    }

    public void realizarPagamentoFuncionario(String cpf,Admin admin, String senha ){
        Funcionario funcionario = mapaFuncionarios.get(cpf);
        if (listaAdmin.contains(admin) && admin.confirmar(senha) ){
            admin.realizarPagamento(funcionario);
        }
    }

}
