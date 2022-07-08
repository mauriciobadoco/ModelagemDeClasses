package contaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Número da Conta:");
        int numero = entrada.nextInt();
        System.out.println("Escolha o nome do Correntista:");
        String nome = entrada.next();
        System.out.println("Escolha o saldo da conta:");
        int saldo = entrada.nextInt();

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositoConta();
        contaCorrente.saqueConta();
    }
}
