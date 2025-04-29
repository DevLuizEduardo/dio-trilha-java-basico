import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo!");
        saldo = scanner.nextDouble();


        System.out.printf("Olá "+nomeCliente+ ",obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" , " +
                "conta "+ numero +" e seu saldo R$"+ saldo + " já está disponível para saque");

    }
}