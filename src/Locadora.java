import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String nome;
    private int idade;
    private List<Veiculo> frota = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Locadora(String nome) {
        this.nome = nome;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void listarVeiculosDisponiveis() {
        System.out.println("=== Veículos disponíveis ===");
        for (Veiculo v : frota) {
            if (v.isDisponivel()) {
                System.out.println(v);
            }
        }
    }

    public Reserva alugarVeiculo(Cliente cliente, String placa, int dias) {
        if(cliente.getIdade() < 18){
            System.out.println("Você não tem idade minima para alugar um veiculo.");
            return null;
        }
        for (Veiculo v : frota) {
            if (v.getPlaca().equalsIgnoreCase(placa) && v.isDisponivel()) {
                Reserva reserva = new Reserva(cliente, v, dias);
                reservas.add(reserva);
                System.out.println("Reserva criada com sucesso!");
                return reserva;
            }
        }
        System.out.println("Veículo não disponível para aluguel.");
        return null;
    }
}
