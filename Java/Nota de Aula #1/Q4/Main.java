import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();

        double quantia;

        int opcao;

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        while (true) {

            System.out.printf("""
                    
                    %s, seja bem vindo(a) ao BANCO DOS ENDINHEIRADOS:
                    
                    Qual é a operação desejada?

                    1 - Consulta de saldo
                    2 - Saque
                    3 - Depósito
                    4 - Transferência
                    0 - Sair
                    
                    Informe a sua escolha:\s""", nome);

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\nVocê escolheu CONSULTAR O SALDO");
                    System.out.printf("O saldo é de R$ %.2f.\n", cb.ConsultarSaldo());
                }
                case 2 -> {
                    System.out.println("\nVocê escolheu SAQUE");
                    System.out.print("Informe a quantia a sacar: R$ ");
                    quantia = sc.nextDouble();
                    if (quantia <= cb.ConsultarSaldo()) {
                        cb.Saque(quantia);
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("\nSaldo insuficiente para saque.");
                    }
                }
                case 3 -> {
                    System.out.println("\nVocê escolheu DEPÓSITO");
                    System.out.print("Informe a quantia a depositar: R$ ");
                    quantia = sc.nextDouble();
                    cb.Deposito(quantia);
                    System.out.println("Depósito realizado com sucesso!");
                }
                case 4 -> {
                    System.out.println("\nVocê escolheu TRANSFERÊNCIA");
                    System.out.print("Informe o nome do destinatário: ");
                    sc.nextLine();
                    String destinatario = sc.nextLine();
                    System.out.print("Informe a quantia a transferir: R$ ");
                    quantia = sc.nextDouble();
                    if (quantia <= cb.ConsultarSaldo()) {
                        cb.Transferir(quantia, destinatario);
                        System.out.printf("\nTransferência de R$ %.2f realizada com sucesso para %s!\n", quantia, destinatario);
                    } else {
                        System.out.println("\nSaldo insuficiente para transferência.");
                    }
                }
                case 0 -> {
                    System.out.println("\nVocê optou por sair!");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }

            System.out.print("\nPressione Enter para continuar...");
            sc.nextLine();
            sc.nextLine();

        }

    }

}
