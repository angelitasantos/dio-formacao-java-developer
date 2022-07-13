public class ArrayAlunos {
    public static void main(String[] args) throws Exception {
        
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        }

        // maneira abreviada
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
