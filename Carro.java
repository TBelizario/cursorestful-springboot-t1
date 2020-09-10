package Aula0209;

public class Carro {
    
    double velocidadeKmH;
    int codigo;
    double distPercorridaMetros;
    
    @Override
    public String toString(){
        return "CARRO [codigo " + codigo +", distancia percorrida = " + distPercorridaMetros + " e velocidade = " + velocidadeKmH + "km/h" ;
    }

    public double mover(int segundos)
    {
        double dist = this.velocidadeKmH * segundos / 3600 * 1000;
        this.distPercorridaMetros += dist;
        return dist;
    }
}
