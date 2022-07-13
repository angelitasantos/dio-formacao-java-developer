import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++)
            nomes[i] = scanner.nextLine();
        System.out.printf("%s\n%s\n%s\n", nomes[2], nomes[6], nomes[8]);
    }
}
/*
 * "USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"
 */
