public class PlanosOperadora {
    public static void main(String[] args) throws Exception {

        String plano = "B"; // B, M, T

        // switch-case
        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis.");
            }
            case "B": {
                System.out.println("100 minutos de ligação.");
            }
        }
    }
}