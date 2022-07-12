public class PlanoOperadora {
    public static void main(String[] args) throws Exception {

        String plano = "T"; // B, M, T

        // if-else

        if (plano == "B") {
            System.out.println("100 minutos de ligação.");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação.");
            System.out.println("Whatsapp e Instagram grátis.");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação.");
            System.out.println("Whatsapp e Instagram grátis.");
            System.out.println("5GB Youtube");
        } else
            System.out.println("Você não escolheu um plano válido.");
    }
}
