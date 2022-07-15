package lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {
        System.out.println("    Controlando a entrada de itens.");
    }

    private void controlarSaída() {
        System.out.println("    Controlando a saída de itens.");
    }

    // atividades default, disponiveis apenas para o pacote
    void entregarIngredientes() {
        controlarEntrada();
        System.out.println("    Entregando ingredientes.");
        controlarSaída();
    }
    
    // atividades default, disponiveis apenas para o pacote
    void trocarGas() {
        System.out.println("    Almoxarife trocando o gás.");
    }
    
}