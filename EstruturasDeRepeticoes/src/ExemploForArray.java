public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno); // A cada iteração de alunos, o indice atual
                                                           // atualiza a variável aluno
        }

        /*
        for (int indiceAluno = 0; indiceAluno < alunos.length; indiceAluno++) {
            System.out.println("O aluno no indice " + indiceAluno + " é " + alunos [indiceAluno]);
        }*/
    }
}
