import java.util.Scanner;

public class QuadradoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|-------------------------------------|");
        System.out.println("Insira o tamanho do lado do quadrado (Em centimetros)");
        double lado = sc.nextInt();
        System.out.println("|-------------------------------------|");

        Quadrado quadrado = new Quadrado(lado);

        double area = quadrado.area();
        double perimetro = quadrado.perimetro();
        double diagonal = quadrado.diagonal();

        System.out.println("Área do quadrado: " + area + " cm quadrados");
        System.out.println("Perímetro do quadrado: " + perimetro + " cm");
        System.out.println("Diagonal do quadrado: " + diagonal + " cm");

    }
}

class Quadrado{
    private final double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    public double area(){
        return lado * lado;
    }
    public double perimetro() {
        return 4* lado;
    }
    public double diagonal() {
        return lado * Math.sqrt(2);
    }
}



/*
Crie uma classe chamada Quadrado que será um modelo para construção de
objetos que armazenem dados de quadrados. Esta classe conterá um único atributo que armazenará
o tamanho do lado do quadrado em centímetros.

Além deste atributo, a classe conterá três métodos:
• um que calcule e devolva a área do quadrado (dado por LADO2);
• outro que calcule e devolva o perímetro do quadrado (4 * LADO);
• e outro que calcule e devolva o valor da diagonal do quadrado (LADO * √2).

Escreva um programa para simulação que receba o valor do lado de um quadrado, crie um objeto da
classe Quadrado com este valor de lado, e mostre a área, o perímetro e a diagonal deste quadrado,
usando os métodos do objeto criado.
 */