package lanchonete;

import lanchonete.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;


public class Estabelecimento {
    public static void main(String[] args) {
        System.out.println("Estabelecimento");

        Cozinheiro cozinheiro = new Cozinheiro();
        System.out.println("...");
        System.out.println("Aividades do Cozinheiro:");
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.adicionarVitaminaBalcao();
        cozinheiro.adicionarComboBalcao();
        System.out.println("...");

        Atendente atendente = new Atendente();
        System.out.println("...");
        System.out.println("Aividades do Atendente:");
        atendente.pegarPedidoBalcao();
        atendente.servirMesa();
        atendente.receberPagamento();
        System.out.println("...");

        Cliente cliente = new Cliente();
        System.out.println("...");
        System.out.println("Aividades do Cliente:");
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        System.out.println("...");

    }
}