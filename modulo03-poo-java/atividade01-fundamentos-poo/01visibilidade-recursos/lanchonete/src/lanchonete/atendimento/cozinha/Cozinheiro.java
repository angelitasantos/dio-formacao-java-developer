package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    
    // atividades private, disponiveis apenas para a classe
    public void adicionarLancheBalcao() {
        System.out.println("    Adicionando lanche natural no balcão.");
    }

    public void adicionarVitaminaBalcao() {
        System.out.println("    Adicionando suco no balcão.");
    }

    public void adicionarComboBalcao() {
        adicionarLancheBalcao();
        adicionarVitaminaBalcao();
    }

    private void prepararLanche() {
        System.out.println("    Preparando lanche tipo hamburguer.");
        selecionarIngredientesLanche();
        lavarIngredientes();
        fritarIngredientesLanche();
    }

    private void prepararVitamina() {
        System.out.println("    Preparando vitamina.");
        selecionarIngredientesVitamina();
        lavarIngredientes();
        baterVitaminaLiquidificador();
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("    Selecionando pão, salada, ovo, carne.");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("    Selecionando fruta, leite, açucar.");
    }

    private void lavarIngredientes() {
        System.out.println("    Lavando ingredientes.");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("    Batendo Vitamina no liquidificador.");
    }

    private void fritarIngredientesLanche() {
        System.out.println("    Fritando ovo e carne para o lanche.");
    }

    public void pedirIngredientesLanche(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }

    public void pedirTrocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }

}