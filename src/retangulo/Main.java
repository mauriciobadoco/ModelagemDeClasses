package retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        double largura = retangulo.largura;
        double altura = retangulo.altura;

        System.out.println("Qual largura");
        largura = input.nextDouble();
        System.out.println("Qual altura");
        altura = input.nextDouble();

        System.out.println("Largura " + largura);
        System.out.println("Altura " +altura);

        System.out.println("Deseja alterar valor? S/N");
        String usuario = input.next();
        if(usuario.equalsIgnoreCase("s")){
            System.out.println("Qual valor largura");
            largura = input.nextDouble();
            System.out.println("Qual valor altura");
            altura = input.nextDouble();
            retangulo.alteraValorLados( largura, altura);
        }else{

        }

        double calArea = retangulo.calculaArea(largura, altura);
        System.out.println("Area " + calArea);

        double calPerimetro = retangulo.calculaPerimetro(largura, altura);
        System.out.println("Perimetro" +calPerimetro);



    }
}
