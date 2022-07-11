public class Operadores {
    public static void main(String[] args) {
        // Operadores
        String concatencacao = "?";
        concatencacao = 1 + 1 + 1 + "1";
        System.out.println(concatencacao);

        concatencacao = 1 + "1" + 1 + 1;
        System.out.println(concatencacao);

        concatencacao = 1 + "1" + 1 + "1";
        System.out.println(concatencacao);

        concatencacao = "1" + 1 + 1 + 1;
        System.out.println(concatencacao);

        concatencacao = "1" + (1 + 1 + 1);
        System.out.println(concatencacao);
    }
}