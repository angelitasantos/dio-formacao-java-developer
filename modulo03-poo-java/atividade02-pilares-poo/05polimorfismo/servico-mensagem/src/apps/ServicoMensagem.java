package apps;
public abstract class ServicoMensagem {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("    Validando se o usuário está conectado a internet.");
    }
}
