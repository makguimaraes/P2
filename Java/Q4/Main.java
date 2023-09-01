import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Transacoes tb = new Transacoes();

        double quantia;

        int opcao;

        while (true) {
            System.out.print("""
                    
                    Bem vindo(a) ao BANCO DOS ENDINHEIRADOS:
                    
                    Qual é a operação desejada?

                    1 - Consulta de saldo
                    2 - Saque
                    3 - Depósito
                    4 - Transferência
                    0 - Sair
                    
                    Digite a sua escolha:\s""");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Você escolheu CONSULTAR O SALDO");
                    System.out.printf("O saldo é de R$ %.2f.\n", tb.ConsultarSaldo());
                    break;

                case 2:
                    System.out.println("Você escolheu SAQUE");
                    System.out.print("Digite a quantia a sacar: ");
                    quantia = sc.nextDouble();
                    if (quantia <= tb.ConsultarSaldo()) {
                        tb.Saque(quantia);
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                    break;

                case 3:
                    System.out.println("Você escolheu DEPÓSITO");
                    System.out.print("Digite a quantia a depositar: ");
                    quantia = sc.nextDouble();
                    tb.Deposito(quantia);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 4:
                    System.out.println("Você escolheu TRANSFERÊNCIA");
                    System.out.print("Digite o nome do destinatário: ");
                    sc.nextLine();
                    String destinatario = sc.nextLine();
                    System.out.print("Digite a quantia a transferir: ");
                    quantia = sc.nextDouble();

                    if (quantia <= tb.ConsultarSaldo()) {
                        tb.Transferir(quantia, destinatario);
                        System.out.printf("Transferência de R$ %.2f realizada com sucesso para %s!", quantia, destinatario);
                    } else {
                        System.out.println("Saldo insuficiente para transferência.");
                    }
                    break;

                case 0:
                    System.out.println("Você optou por sair!");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.print("\nPressione Enter para continuar...");
            sc.nextLine();
            sc.nextLine();

        }

    }

}
