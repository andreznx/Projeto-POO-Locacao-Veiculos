public class Carros extends Veiculo{
    private String modelo;
    private int ano;

    public Carros(String marca, String modelo, String tipo, String placa, double valorDiaria, int ano) {
        super(marca, tipo, placa, valorDiaria);
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return getValorDiaria() * dias;
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }


    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
}
