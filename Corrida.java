package Aula0209;

public class Corrida {
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        
        double distPercorridaM = 10000;

        do
        {
        c1.velocidadeKmH = Math.random() * 200;
        c1.mover(1);

        c2.velocidadeKmH = Math.random() * 200;
        c2.mover(1);
        
        }while(c1.distPercorridaMetros <= distPercorridaM && c2.distPercorridaMetros <= distPercorridaM);

        if(c1.distPercorridaMetros > c2.distPercorridaMetros){
            System.out.println("O vencedor foi o carro 1 " + c1);
        }
        else{
            System.out.println("O vencedor foi o carro 2 " + c2);
        }
        System.out.println("--------------------------------------");
        System.out.println(c1);
        System.out.println(c2);

    }
}
