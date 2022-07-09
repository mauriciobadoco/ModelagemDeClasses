package quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        Scanner input = new Scanner(System.in);


        System.out.println("Qual o valor do lado");
        double lado = input.nextDouble();
        quadrado.lado = lado;

        System.out.println("Deseja mudar o lado? S /N");
        String mudarLado = input.next();

        if (mudarLado.equalsIgnoreCase("s")){
            quadrado.mudarValorLado();
        }else{
            System.out.println("OK Obrigado");
        }

        quadrado.calculaArea();

        quadrado.retornarValorLado();
        System.out.println("Valor retornado " +quadrado.retornarValorLado());

    }
}
