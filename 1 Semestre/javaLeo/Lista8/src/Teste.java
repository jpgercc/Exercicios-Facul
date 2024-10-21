import Pacotes.ex1.Funcionario;
import Pacotes.ex1.Gerente;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "123456789", 2000.0);
        Funcionario funcionario2 = new Funcionario("Maria", "987654321", 2000.0);

        Gerente gerente = new Gerente("Carlos", "456789123", 2000.0, "RH");

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("CPF: " + funcionario1.getCpf());
        System.out.println("Salário: " + funcionario1.getSalario());

        System.out.println();

        System.out.println("Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("CPF: " + funcionario2.getCpf());
        System.out.println("Salário: " + funcionario2.getSalario());

        System.out.println();

        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
    }
}
