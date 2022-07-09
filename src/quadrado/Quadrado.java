package quadrado;

import java.util.Scanner;

public class Quadrado {
    double lado;

    public Quadrado() {
        this.lado = lado;
    }

    Scanner input = new Scanner(System.in);

    public void mudarValorLado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor");
        double lado = input.nextDouble();
        System.out.println(lado);
   }

   public double retornarValorLado(){
       System.out.println(lado);
       return  lado;
   }

   public void calculaArea(){
        double area = (lado *lado);
       System.out.println(lado);
       System.out.println("A área é:  " + area);
   }


    }

  //  Mudar valor do Lado, Retornar valor do Lado e calcular Área;


