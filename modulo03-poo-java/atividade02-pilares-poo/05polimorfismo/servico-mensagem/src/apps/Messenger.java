package apps;
public class Messenger extends ServicoMensagem {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("    Enviando mensagem pelo MSN ...");
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("    Recebendo mensagem pelo MSN ...");
    }

}
