public class Carro {
    String cor;
    String marca;
    Motor motor;
    double velocidadeMax;
    double velocidadeAtual;

    public Carro(){
        motor = new Motor();
    }

    void ligar(){
        System.out.println("O carro está ligado!");
    }

    void acelerar(){
        System.out.println("Acelerando o carro!");
    }

    void mostrarInfos(){
        System.out.println("Marca do carro: "+marca);
        System.out.println("Cor do carro: "+cor);
        motor.mostrarInfos();

    }
}
