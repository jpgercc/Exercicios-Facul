import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        int alunos = 3; // numero de alunos
        int n = 3; // numero de notas
        double[] notas = new double[alunos * n]; // vetor de notas

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < alunos; i++) {
            double soma = 0;
            for (int j = 0; j < n; j++) {
                System.out.println("Insira a nota " + (j+1) + " do aluno " + (i+1));
                notas[i * n + j] = scan.nextDouble();
                soma += notas[i * n + j];
            }
            double media = soma / n;
            System.out.println("A media do aluno " + (i+1) + " é " + media);

            if (media >= 6) {
                System.out.println("Aprovado");
            } else if (media >= 4) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }

        double medias = 0;
        for (int i = 0; i < alunos; i++) {
            double somaNotas = 0;
            for (int j = 0; j < n; j++) {
                somaNotas += notas[i * n + j];
            }
            double mediaAluno = somaNotas / n;
            medias += mediaAluno;
        }
        double mediaTotal = medias / alunos;
        System.out.printf("Média total dos alunos: %.2f\n", mediaTotal);
    }
}

/*
Faça um algoritmo que armazena em vetores as 3 notas de 1000 alunos .
Para cada aluno deve ser calculada a média e  =Caso a média seja
maior que 6 informa "Aprovado", entre 4 e 6 em "Recuperação" e menor que 4 "Reprovado".
No final apresente a média das medias dos 1000 alunos.
 */
/*
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        int alunos = 1000; //numero de alunos
        int n = 3; //numero de notas
        double[] notas = new double[alunos * n]; // vetor de notas

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < alunos; i++){
            for (int j = 0; j < n; j++) {
                System.out.printf("Insira a nota %d do aluno %d: ", j+1, i+1);
                notas[i * n + j] = scan.nextDouble();
            }
        }

        double somaMedias = 0;
        for (int i = 0; i < alunos; i++) {
            double somaNotas = 0;
            for (int j = 0; j < n; j++) {
                somaNotas += notas[i * n + j];
            }
            double mediaAluno = somaNotas / n;
            System.out.printf("Média do aluno %d: %.2f\n", i+1, mediaAluno);
            if (mediaAluno >= 6) {
                System.out.println("Aprovado");
            } else if (mediaAluno >= 4) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
            somaMedias += mediaAluno;
        }

        double mediaTotal = somaMedias / alunos;
        System.out.printf("Média total: %.2f\n", mediaTotal);
    }
}
 */