package carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a marca do carro para instanciar");
        String marca = entrada.nextLine();
        System.out.println("Escolha o modelo do carro");
        String modelo = entrada.nextLine();
        System.out.println("Escolha a quantas portas terá o carro:");
        int portas = entrada.nextInt();

        Carro novoCarro = new Carro();

        novoCarro.mostraCarro();
     //   novoCarro.ligarCarro();

    }
}
