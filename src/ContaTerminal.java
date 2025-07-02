import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e capturar dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        // Exibir mensagem de confirmação
        System.out.println("Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " + 
            agencia + ", conta " + numero + 
            " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}