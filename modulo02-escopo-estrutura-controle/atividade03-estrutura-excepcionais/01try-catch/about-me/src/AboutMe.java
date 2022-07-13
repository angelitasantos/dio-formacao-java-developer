import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Informações Pessoais");

            System.out.println("Digite seu nome ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade ");
            double idade = scanner.nextInt();

            System.out.println("Digite sua altura ");
            double altura = scanner.nextDouble();

            System.out.println("About Me");
            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("E minha altura é " + altura + " m");
            scanner.close();
        }
        catch (InputMismatchException error) {
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
