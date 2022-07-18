// herança: incluir extends NomeClasseHeranca após o nome da ClasseAtual
public class Carro extends Veiculo {
    
    public void ligar() {
        verificarCombustivel();
        verificarCambio();
        System.out.println("Carro ligado.");
    }

    // encapsulamento: "escondendo" as ações
    private void verificarCombustivel() {
        System.out.println("Conferir nível de combustível.");
    }

    private void verificarCambio() {
        System.out.println("Conferir se o cambio está em P.");
    }
}
