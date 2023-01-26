package src.br.com.SistemaAcadema.objetosBD;


public class PlanoAcademia {

    private double valorMes;
    private int quantidadeMes;
    private double valorTotal;

    private int codigoPlano;

    public PlanoAcademia(double valorMes, int quantidadeMes, double valorTotal, int codigoPlano) {
        this.valorMes = valorMes;
        this.quantidadeMes = quantidadeMes;
        this.valorTotal = valorMes *quantidadeMes;
        this.codigoPlano = codigoPlano;
    }

    public double getValorMes() {
        return valorMes;
    }

    public void setValorMes(double valorMes) {
        this.valorMes = valorMes;
    }

    public int getQuantidadeMes() {
        return quantidadeMes;
    }

    public void setQuantidadeMes(int quantidadeMes) {
        this.quantidadeMes = quantidadeMes;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCodigoPlano() {
        return codigoPlano;
    }

}
