package src.br.com.SistemaAcadema.objetosBD;

import src.br.com.SistemaAcadema.funcionais.Money;

public class PlanoAcademia {

    private Money valorMes;
    private int quantidadeMes;
    private Money valorTotal;

    private int codigoPlano;

    public PlanoAcademia(Money valorMes, int quantidadeMes, double valorTotal, int codigoPlano) {
        this.valorMes = valorMes;
        this.quantidadeMes = quantidadeMes;
        this.valorTotal = valorMes.multi(quantidadeMes);
        this.codigoPlano = codigoPlano;
    }

    public Money getValorMes() {
        return valorMes;
    }

    public void setValorMes(Money valorMes) {
        this.valorMes = valorMes;
    }

    public int getQuantidadeMes() {
        return quantidadeMes;
    }

    public void setQuantidadeMes(int quantidadeMes) {
        this.quantidadeMes = quantidadeMes;
    }

    public Money getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Money valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCodigoPlano() {
        return codigoPlano;
    }

}
