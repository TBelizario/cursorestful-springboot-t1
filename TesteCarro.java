package Aula0209;

public class TesteCarro {
    public static void main(final String[] args) {
        final Carro c1 = new Carro();
        c1.codigo = 100;
        
        c1.velocidadeKmH = 100;
        System.out.println(c1.mover(10));
        System.out.println(c1);

        c1.velocidadeKmH = 100;
        System.out.println(c1.mover(10));
        System.out.println(c1);

        c1.velocidadeKmH = 80;
        System.out.println(c1.mover(30));
        System.out.println(c1);   
    }
    
}
