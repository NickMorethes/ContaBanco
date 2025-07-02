import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e capturar dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        var agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        var numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Por favor, digite seu nome: ");
        var nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo: ");
        var saldo = scanner.nextDouble();
        
        // Exibir mensagem de confirmação
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nomeCliente, agencia, numero, saldo );
        
        scanner.close();
    }
}