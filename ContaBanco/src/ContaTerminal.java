import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do proprietário da conta: ");
        String nomeCliente = leitura.nextLine();

        System.out.println("Digite o número da Agência: ");
        String numeroAgencia = leitura.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = leitura.nextInt();

        System.out.println("Digite seu saldo atual: ");
        double saldoConta = leitura.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.%n", nomeCliente, numeroAgencia, numeroConta, saldoConta);

    }
}
