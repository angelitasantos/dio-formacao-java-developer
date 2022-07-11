public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Angelita";
        String nomeDois = "Angelita";
        System.out.println(nomeUm == nomeDois);

        String conteudoUm = "Angelita";
        String conteudoDois = new String("Angelita");

        System.out.println(conteudoUm.equals(conteudoDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.print("Numero1 é igual ao numero 2?" + simNao);


        simNao = numero1 != numero2;
        System.out.print("Numero1 é diferente do numero 2?" + simNao);


        simNao = numero1 >= numero2;
        System.out.print("Numero1 é maior ou igual ao numero 2?" + simNao);


        if(numero1 > numero2)
            System.out.print("Numero1 maior que o numero 2");
            

        if(numero1 < numero2)
            System.out.print("Numero1 menor que o numero 2");
    }
}
