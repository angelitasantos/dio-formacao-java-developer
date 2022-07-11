public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume: " + smartTv.volume);
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal: " + smartTv.canal);

        smartTv.mudarCanal(45);
        System.out.println("Novo Canal: " + smartTv.canal);

    }
}
