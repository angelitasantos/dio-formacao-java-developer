public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operadores Unários
        int numero = 5;
        // sem alterar a variavel
        System.out.println(-numero);
        System.out.println(numero);

        // tornar o numero negativo
        numero = -numero;
        System.out.println(numero);

        // voltar o numero a ser positvo
        numero = numero * -1;
        System.out.println(numero);

        // incrementar
        numero = numero + 2;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);

        // decrementar
        System.out.println(numero--);
        System.out.println(--numero);

        // inverter valores booleanos
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }
}
