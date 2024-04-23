import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Qual é o Número do Cartão?");
        numero = ler.nextInt();

        System.out.println("Qual é o Número da Agência?");
        agencia = ler.next();

        System.out.println("Qual é o Nome do Cliente?");
        nomeCliente = ler.next();

        System.out.println("Quanto você quer de saldo?");
        saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", Conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");
    }
}
