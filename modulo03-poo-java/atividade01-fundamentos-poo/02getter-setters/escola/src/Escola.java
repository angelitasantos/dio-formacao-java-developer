public class Escola {
    public static void main(String[] args) throws Exception {

        /*
         * Aluno felipe = new Aluno();
         * felipe.nome = "Felipe";
         * felipe.idade = 8;
         * 
         * System.out.println("O aluno ".concat(felipe.nome).concat(" tem ") + felipe.idade + " anos.");
         */

        // Java Beans
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno ".concat(felipe.getNome()).concat(" tem ") + felipe.getIdade() + " anos.");

    }
}
