public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("152649");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("463793");
        z400.ligar();

        // polimorfismo
        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
