public abstract class Veiculo {
    private String marca;
    private String tipo;
    private String placa;
    private double valorDiaria;
    private boolean disponivel = true;

    public Veiculo(String marca, String tipo, String placa, double valorDiaria) {
        this.marca = marca;
        this.tipo = tipo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
    }

    public abstract double calcularValorAluguel(int dias);

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Getters e Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public double getValorDiaria() { return valorDiaria; }
    public void setValorDiaria(double valorDiaria) { this.valorDiaria = valorDiaria; }

    @Override
    public String toString() {
        return marca + " " + tipo + " (" + placa + ")";
    }
}
