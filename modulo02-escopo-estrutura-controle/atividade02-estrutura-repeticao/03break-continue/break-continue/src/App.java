public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("break");
        // para a instrução quando chega no numero 3
        for(int numero = 1; numero <= 5; numero ++) {
            if(numero == 3)
                break;
            System.out.println(numero);
        }

        System.out.println("continue");
        // não imprimi o numero 3 mas imprimi os demais
        for(int numero = 1; numero <= 5; numero ++) {
            if(numero == 3)
                continue;
            System.out.println(numero);
        }
    }
}
