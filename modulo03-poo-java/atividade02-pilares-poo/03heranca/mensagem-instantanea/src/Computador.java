public class Computador {
    public static void main(String[] args) {

        System.out.println("Messenger");
        Messenger messenger = new Messenger();
        messenger.enviarMensagem();
        messenger.receberMensagem();

        System.out.println("Facebook");
        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}
