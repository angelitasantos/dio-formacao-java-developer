public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 6;

        // condicional composta
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // condicional encadeada
        String recuperacao = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(recuperacao);
    }
}
