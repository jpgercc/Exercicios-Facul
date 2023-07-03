package bibs;
//REFAZER
public class Repeticao11 {
    private final int num;
    private int totalPares;
    private int totalImpares;
    private int somaPares;
    private int somaImpares;

    public Repeticao11(int num) {
        this.num = num;
        this.totalPares = 0;
        this.totalImpares = 0;
        this.somaPares = 0;
        this.somaImpares = 0;
    }

    public void contar() {
        for (int i = 1; i <= this.num; i++) {
            if (i % 2 == 0) {
                this.totalPares++;
                this.somaPares += i;
            } else {
                this.totalImpares++;
                this.somaImpares += i;
            }
        }
    }
    public void exibirResultados() {
        System.out.println("Total de números pares: " + this.totalPares);
        System.out.println("Total de números ímpares: " + this.totalImpares);
        System.out.println("Soma dos números pares: " + this.somaPares);
        System.out.println("Soma dos números ímpares: " + this.somaImpares);
    }
}
