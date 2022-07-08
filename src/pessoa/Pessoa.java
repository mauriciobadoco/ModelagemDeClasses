package pessoa;

import java.util.Scanner;

public class Pessoa {
    Scanner input = new Scanner(System.in);

    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }

    public void apresentar (){
        System.out.println(" Qual o seu nome");
        nome = input.next();
        System.out.println(" Qual a sua idade");
        idade = input.nextInt();
        System.out.println(" Qual o seu peso");
        peso = input.nextDouble();
        System.out.println(" Qual a sua altura");
        altura = input.nextDouble();
    }

    public void crescer(){
        if(idade < 21){
        double cresceAltura = 0;
        cresceAltura = idade + 0.5;
            System.out.println("Você cresceu: " + cresceAltura);
        }else{
            System.out.println("Você não cresce mais");
        }
    }

    public void envelhecer(){
        System.out.println("Você deseja envelher? S/N");
        String resp = input.next();
        if (resp.equalsIgnoreCase("s")){
            System.out.println("Digite quantos anos");
            int maisIdade = input.nextInt();
            System.out.println("Sua idade atual é" + (this.idade + maisIdade));
        }else{
            System.out.println("Obrigado");
        }

    }

    public void engordar() {
        System.out.println("Você deseja engordar? S/N");
        String resp = input.next();
        if (resp.equalsIgnoreCase("s")) {
            System.out.println("Digite quantos quilos");
            int maisPeso = input.nextInt();
            System.out.println("Seu peso atual é" + (this.peso + maisPeso));
        } else {
            System.out.println("Obrigado");
        }
    }

    public void emagrecer(){
            System.out.println("Você deseja emagrecer? S/N");
            String resp = input.next();
            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Digite quantos quilos");
                int menosPeso = input.nextInt();
                System.out.println("Seu peso atual é" + (this.peso - menosPeso));
            } else {
                System.out.println("Obrigado");
            }
    }

}
