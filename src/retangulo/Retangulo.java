package retangulo;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo() {
        this.largura = largura;
        this.altura = altura;
    }

    public void alteraValorLados(double largura, double altura){
        System.out.println("valor largura: " + largura);
        System.out.println("Valor altura" +altura);

    }

    public void alteraValorLados(){
        System.out.println("altera");

    }
    public double calculaArea(double largura ,double altura){
        double total = 0;
        total = largura * altura;
        return total;
    }

    public double calculaPerimetro(double largura, double altura){
        double total = 0;
        total =( (largura *2) + (altura * 2));
        return total;
    }
}
