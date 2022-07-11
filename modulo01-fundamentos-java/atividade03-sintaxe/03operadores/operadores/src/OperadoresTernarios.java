public class OperadoresTernarios {
    public static void main(String[] args) {
        // ternario
        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

        if (a == b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);

        // ternario
        String ternarioString = a == b ? "Verdadeiro" : "Falso";
        System.out.println(ternarioString);
        int ternarioInteiro = a == b ? 1 : 0;
        System.out.println(ternarioInteiro);

    }
}
