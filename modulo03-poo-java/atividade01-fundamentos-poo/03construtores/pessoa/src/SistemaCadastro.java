public class SistemaCadastro {
    public static void main(String[] args) throws Exception {

        Pessoa marcia = new Pessoa("123", "Marcia");
        marcia.setEndereco("Rua das Oliveira, 25");

        System.out.println("A pessoa ".concat(marcia.getNome()).concat(" com CPF numero ") + marcia.getCpf() + " foi cadastrada com sucesso no sistema.");
    }
}
