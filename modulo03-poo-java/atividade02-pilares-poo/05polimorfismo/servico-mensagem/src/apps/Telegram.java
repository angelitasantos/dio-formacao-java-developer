package apps;
public class Telegram extends ServicoMensagem {
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("    Enviando mensagem pelo Telegram ...");
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("    Recebendo mensagem pelo Telegram ...");
    }

}
