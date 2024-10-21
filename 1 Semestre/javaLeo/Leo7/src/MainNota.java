import java.text.DecimalFormat;
import java.util.Scanner;

class ItemNotaFiscal {
    private final double icms;
    private final String descricao;
    private final double precoUnitario;
    private final int quantidade;


    public ItemNotaFiscal(String descricao, double precoUnitario, int quantidade, double icms) {
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.icms = icms;
    }

    public double calcularValorTotal() {
        return precoUnitario * quantidade;
    }

    public double calcularValorICMS() {
        return calcularValorTotal() * icms;
    }

    public void mostrarItem(int numeroItem) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("ITEM " + numeroItem);
        System.out.println("  Descricao..: " + descricao);
        System.out.println("  Preco Unit..: R$ " + df.format(precoUnitario));
        System.out.println("  Quantidade..: " + quantidade);
        System.out.println("  Valor Total: R$ " + df.format(calcularValorTotal()));
        System.out.println("  ICMS.............: R$ " + df.format(calcularValorICMS()));
    }
}

class NotaFiscal {
    private final ItemNotaFiscal item1;
    private final ItemNotaFiscal item2;
    private final ItemNotaFiscal item3;

    public NotaFiscal(ItemNotaFiscal item1, ItemNotaFiscal item2, ItemNotaFiscal item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public double calculaTotal() {
        return item1.calcularValorTotal() + item2.calcularValorTotal() + item3.calcularValorTotal();
    }

    public void mostrar() {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("------------------------------");
        System.out.println("\tNOTA FISCAL");
        System.out.println("------------------------------");

        item1.mostrarItem(1);
        item2.mostrarItem(2);
        item3.mostrarItem(3);

        System.out.println("TOTAL = R$ " + df.format(calculaTotal()));
        System.out.println("------------------------------");
    }
}

public class MainNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a descrição do item 1: ");
        String descricao1 = scanner.nextLine();
        System.out.print("Informe o preço unitário do item 1: ");
        double precoUnitario1 = scanner.nextDouble();
        System.out.print("Informe a quantidade do item 1: ");
        int quantidade1 = scanner.nextInt();

        System.out.print("Informe a descrição do item 2: ");
        scanner.nextLine();
        String descricao2 = scanner.nextLine();
        System.out.print("Informe o preço unitário do item 2: ");
        double precoUnitario2 = scanner.nextDouble();
        System.out.print("Informe a quantidade do item 2: ");
        int quantidade2 = scanner.nextInt();

        System.out.print("Informe a descrição do item 3: ");
        scanner.nextLine();
        String descricao3 = scanner.nextLine();
        System.out.print("Informe o preço unitário do item 3: ");
        double precoUnitario3 = scanner.nextDouble();
        System.out.print("Informe a quantidade do item 3: ");
        int quantidade3 = scanner.nextInt();

        System.out.print("Informe a alíquota de ICMS / No caso do RS é 0,17 : ");
        double icms = scanner.nextDouble();

        ItemNotaFiscal item1 = new ItemNotaFiscal(descricao1, precoUnitario1, quantidade1, icms);
        ItemNotaFiscal item2 = new ItemNotaFiscal(descricao2, precoUnitario2, quantidade2, icms);
        ItemNotaFiscal item3 = new ItemNotaFiscal(descricao3, precoUnitario3, quantidade3, icms);

        NotaFiscal notaFiscal = new NotaFiscal(item1, item2, item3);
        notaFiscal.mostrar();

        scanner.close();
    }
}
