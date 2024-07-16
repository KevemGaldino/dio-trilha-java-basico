import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, leitura);

        System.out.printf("A média da turma é %.1f", media);

    }
    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
