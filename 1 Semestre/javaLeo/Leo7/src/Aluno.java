import java.util.Scanner;

public class Aluno {
    int matricula = 12923;
    String nome = "Quem";
    double nota1;
    double nota2;

    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double media() {
        return (nota1 + nota2) / 2;
    }
    public boolean aprovado(){
        return media() >= 7;
    }
    public double quantoPrecisa(){
        return (50 - media() * 6) /4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        Aluno aluno = new Aluno(nota1, nota2);
        System.out.println("Média: " + aluno.media());
        if (aluno.aprovado()) {
            System.out.println("Estudante: "+ aluno.nome + " | RA: "+ aluno.matricula+"+ " + " | Status: Aprovado." );
        } else {
            System.out.println("Estudante: "+ aluno.nome + " | RA: "+ aluno.matricula+"+ " + " | Status: Reprovado." );
            System.out.println("Nota minima para passar no exame: " + aluno.quantoPrecisa());
        }
    }
}