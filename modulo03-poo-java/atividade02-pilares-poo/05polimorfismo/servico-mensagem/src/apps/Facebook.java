package apps;
public class Facebook extends ServicoMensagem {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("    Enviando mensagem pelo Facebook ...");
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("    Recebendo mensagem pelo Facebook ...");
    }
}
