package carro;

public class Carro {
    int portas;
    double potencia = 2.0;
    String modelo;
    String marca;


    public Carro() {
        this.portas = portas;
        this.potencia = potencia;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void mostraCarro() {
        System.out.println("\n \n Característica da carro:\n \n Marca: " + this.marca +
                "\n Modelo: " + this.modelo + "\n Quantidade de portas: " + this.portas + "\n Potência: " + this.potencia);
    }
}
