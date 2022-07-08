package contaCorrente;


import java.util.Scanner;

public class ContaCorrente {
    Scanner input = new Scanner(System.in);
    int numConta;
    String correntista;
    double saldo = 0;
    public ContaCorrente() {
        this.numConta = numConta;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public void depositoConta() {
        System.out.println("Qual valor que quer depositar?");
        double valor = input.nextDouble();
        System.out.println(" O saldo autal é:" + (this.saldo + valor));
    }

    public void saqueConta(){
        System.out.println("Qual o valor do saque?: ");
        double saque = input.nextDouble();
        if (saldo < saque){
            System.out.println("Você não tem saldo suficiente para saque.");
        }else{
            saldo = saldo - saque;
            System.out.println("Saquel efetuado com sucesso");
        }
    }
}
