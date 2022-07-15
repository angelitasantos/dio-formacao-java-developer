package lanchonete.atendimento;

public class Atendente {

    public void servirMesa() {
        pegarLancheCozinha();
        System.out.println("    Servindo mesa.");
    }

    private void pegarLancheCozinha() {
        System.out.println("    Pegando o lanche na cozinha.");
    }

    public void receberPagamento() {
        System.out.println("    Recebendo pagamento.");
    }

    public void pegarPedidoBalcao() {
        System.out.println("    Pegando o pedido no balcão.");
    }

    void trocarGas() {
        System.out.println("    Atendente trocando o gás.");
    }

}