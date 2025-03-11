import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua Conta: ");
        int conta = scanner.nextInt();
        System.out.print("Digite sua Agencia: ");
        int agencia = scanner.nextInt();
        System.out.print("Digite seu saldo: ");
        int saldo = scanner.nextInt();
        System.out.println("Olá " + nome + ", sua conta é " + conta + " agencia é: " + agencia + " e seu saldo é: " +saldo  );


        scanner.close();
    }
}