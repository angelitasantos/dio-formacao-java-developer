import apps.Facebook;
import apps.Messenger;
import apps.ServicoMensagem;
import apps.Telegram;

public class Computador {
    public static void main(String[] args) {

        ServicoMensagem smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new Messenger();
        else if(appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
