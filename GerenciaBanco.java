import java.util.Scanner;

class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0; // Inicialmente o saldo é zero.
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf);
    }
}

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento bancário!");
        System.out.println("Por favor, informe seus dados.");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, sobrenome, cpf);

        boolean executando = true;

        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Exibir dados do cliente");
            System.out.println("5 - Encerrar aplicação");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o caractere de nova linha

            switch (opcao) {
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: R$ ");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine(); // Consumir o caractere de nova linha
                    cliente.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a sacar: R$ ");
                    double saque = scanner.nextDouble();
                    scanner.nextLine(); // Consumir o caractere de nova linha
                    cliente.sacar(saque);
                    break;
                case 4:
                    cliente.exibirDados();
                    break;
                case 5:
                    executando = false;
                    System.out.println("Obrigado por utilizar o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
