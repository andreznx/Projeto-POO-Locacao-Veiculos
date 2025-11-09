import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu cpf: ");
        String cpf = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // Limpa buffer

        Cliente cliente = new Cliente(nome, cpf, idade);

        Locadora locadora = new Locadora("IFastCar");

        locadora.adicionarVeiculo(new Carros("Volkswagen", "Jetta", "Sedan", "ABC3421", 250.0, 2022));
        locadora.adicionarVeiculo(new Carros("Chevrolet", "Onix Turbo", "Hatch", "ABC6211", 210.0, 2023));
        locadora.adicionarVeiculo(new Carros("Hyundai", "Creta", "Suv", "GVC1521", 240.0, 2022));
        locadora.adicionarVeiculo(new Motos("Yamaha", "XT-660","Big Trail", "GRE8471", 100.0, 2020));
        locadora.adicionarVeiculo(new Motos("Honda", "ADV","Scooter", "YTR8773", 160.0, 2024));

        locadora.listarVeiculosDisponiveis();

        System.out.println("\nDigite a placa do veiculo que deseja alugar: ");
        String placaEscolhida = entrada.nextLine();

        System.out.println("Por quantos dias deseja alugar?");
        int dias = entrada.nextInt();

        Reserva reserva = locadora.alugarVeiculo(cliente, placaEscolhida, dias);

        if(reserva != null) {
            System.out.println("\n--- Detalhes da Reserva ---");
            System.out.println(reserva);
        }
        entrada.close();
    }
}