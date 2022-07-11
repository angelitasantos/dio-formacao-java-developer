public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Tipos e Variáveis");

        // variáveis
        int mesAtual;
        int anoFabricacao = 2021;
        double salarioMinimo = 1235.45;

        byte idade = 48;
        short ano = 2021;
        int cep = 30150420; 
        long cpf = 12365478944L; 
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short novoNumeroCurto = numeroNormal; declaração com erro
        short numeroCurtoCast = (short) numeroNormal;

        // constantes
        final double VALOR_PI = 3.14;
    }
}
