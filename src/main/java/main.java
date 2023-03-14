public class main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor = "Vermelho";
        carro1.marca = "Ferrari";
        carro1.velocidadeAtual = 100;
        carro1.velocidadeMax = 300;

        carro2.cor = "Prata";
        carro2.marca = "Porche";
        carro2.velocidadeAtual = 70;
        carro2.velocidadeMax = 200;

        carro1.motor.potencia = 500;
        carro1.motor.tipo = "V8";

        carro2.motor.potencia = 400;
        carro2.motor.tipo = "V9";

        carro1.ligar();
        carro2.ligar();

        carro1.acelerar();
        carro2.acelerar();

        carro1.mostrarInfos();
        carro2.mostrarInfos();


    }
}
