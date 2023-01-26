package src.br.com.SistemaAcadema.objetosBD;

import java.util.Calendar;

public class Maquina {

    private String nome;
    private String id;
    private String marca;
    private Calendar dataAquisicao;
    private boolean estadoMaquino;

    public Maquina(String nome, String id, String marca, Calendar dataAquisicao, boolean estadoMaquino) {
        this.nome = nome;
        this.id = id;
        this.marca = marca;
        this.dataAquisicao = dataAquisicao;
        this.estadoMaquino = estadoMaquino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Calendar getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Calendar dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public boolean isEstadoMaquino() {
        return estadoMaquino;
    }

    public void setEstadoMaquino(boolean estadoMaquino) {
        this.estadoMaquino = estadoMaquino;
    }
}
