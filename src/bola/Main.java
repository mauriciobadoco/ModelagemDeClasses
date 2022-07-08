package bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bola volei = new Bola("Média", "Branca", "",  0 );

        System.out.println("Característica da bola de volei:\n \n Circunferência: " + volei.circunferencia +
                "\n Cor: " +volei.cor+ "\n Velocidade: "+ volei.velocidade + "\n Marca: " + volei.marca  );

        Bola jabulani = new Bola("25 cm" , "Vermelha", "Adidas", 30);
            jabulani.material = "Couro";

        System.out.println("\n \n Característica da bola Jabulani:\n \n Circunferência: " + jabulani.circunferencia +
                "\n Cor: " +jabulani.cor+ "\n Material: "+ jabulani.material );


        Scanner entrada = new Scanner(System.in);
        System.out.println(" \n \n");
        System.out.println(" Digite a cor da bola: ");
        String novaCor = entrada.nextLine();

        jabulani.trocaCor(novaCor);

        jabulani.mostraCor();
    }
}
