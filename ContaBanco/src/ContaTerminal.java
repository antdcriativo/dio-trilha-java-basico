import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Mesagens a serem exibidas ao usuário
        //nextLine é usado para capturar entradas que podem conter espaços, como o nome completo.
        
        System.out.println("Para começarmos, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
    
        System.out.println("Estamos quase lá, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Última etapa, informe o saldo para depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
        ", conta " + numeroConta + " e o saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
