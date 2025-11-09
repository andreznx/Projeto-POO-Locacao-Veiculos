public class Reserva {
    private Cliente cliente;
    private Veiculo veiculo;
    private int dias;
    private double valorTotal;

    public Reserva(Cliente cliente, Veiculo veiculo, int dias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
        this.valorTotal = veiculo.calcularValorAluguel(dias);
        veiculo.setDisponivel(false);
    }

    public void encerrarReserva() {
        veiculo.setDisponivel(true);
        System.out.println("Reserva encerrada. Veiculo devolvido: " + veiculo);
    }

    public double getValorTotal() { return valorTotal; }

    public String toString() {
        return "Cliente: " + cliente +
                "\nVeículo: " + veiculo +
                "\nDias: " + dias +
                "\nValor total: R$" + valorTotal;
    }
}
