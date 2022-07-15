public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + "-" + e.getNomeMaiusculo());
        }
        
        EstadoBrasileiro uf = EstadoBrasileiro.RIO_JANEIRO;
        System.out.println(uf.getSigla());
    }
}
