
package bola;

import java.sql.SQLOutput;

public class Bola {
    String circunferencia = "";
    String cor = "";
    String marca = "";
    double velocidade;
    String material = "";

    public Bola(String circunferencia, String cor, String marca, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }

    public void trocaCor(String novaCor){
        cor = novaCor;
        System.out.println("A cor foi da bola foi mudada para: " + this.cor);
    }

    public void mostraCor(){
        System.out.println("A cor da bola é: " + this.cor);
    }
}
