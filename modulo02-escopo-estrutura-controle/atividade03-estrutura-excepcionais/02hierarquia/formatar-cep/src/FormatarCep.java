public class FormatarCep {
    public static void main(String[] args) throws Exception {

        try {
            String cepFormatado = formatarCep("053164649");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            // e.printStackTrace();
            System.out.println("O cep não contém 8 dígitos.");
        }

    }

    static String formatarCep(String cep) throws CepInvalidException {
        if(cep.length() != 8)
            throw new CepInvalidException();
        return "23.765-064";
    }
}
