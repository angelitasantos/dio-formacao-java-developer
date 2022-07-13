package candidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = { "Felipe", "Márcia", "Júlia", "Paulo", "Augusto" };
            for (String candidato : candidatos) {
                ligarCandidato(candidato);
            }
    }

    static void ligarCandidato(String candidato) {
        
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else 
                System.out.println("Contato realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "° tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + ". Número máximo de tentativas de " + tentativasRealizadas + " realizadas.");


    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "Felipe", "Márcia", "Júlia", "Paulo", "Augusto" };
        System.out.println("Lista de candidatos por índice.");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de lista for each");
        System.out.println("Os candidatos selecionados foram: ");

        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    static void selecionarCandidatos() {
        String [] candidatos = { "Felipe", "Márcia", "Júlia", "Paulo", "Augusto", "Mônica", "Fabrício", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextInt(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else
            System.out.println("Aguardar resultado dos demais candidatos.");

    }

    /*
     * O candidato Felipe solicitou o valor de R$ 2194.0
     * O candidato Márcia solicitou o valor de R$ 2173.0
     * O candidato Júlia solicitou o valor de R$ 2070.0
     * O candidato Paulo solicitou o valor de R$ 2130.0
     * O candidato Augusto solicitou o valor de R$ 1944.0
     * O candidato Augusto foi selecionado para a vaga.
     * O candidato Mônica solicitou o valor de R$ 1887.0
     * O candidato Mônica foi selecionado para a vaga.
     * O candidato Fabrício solicitou o valor de R$ 2163.0
     * O candidato Mirela solicitou o valor de R$ 2172.0
     * O candidato Daniela solicitou o valor de R$ 2062.0
     * O candidato Jorge solicitou o valor de R$ 2066.0
     * 
     * Não conseguimos contato com Felipe. Número máximo de tentativas de 3 realizadas.
     * Contato realizado com sucesso
     * Conseguimos contato com Márcia na 1° tentativa.
     * Contato realizado com sucesso
     * Conseguimos contato com Júlia na 1° tentativa.
     * Contato realizado com sucesso
     * Conseguimos contato com Paulo na 2° tentativa.
     * Não conseguimos contato com Augusto. Número máximo de tentativas de 3 realizadas.
     * 
     */
}
