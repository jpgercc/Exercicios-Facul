import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldoo = 0.00;
        double num;
        double valorRecebe;
        double valorTransfere;

        while (true) {

            System.out.print("\n *Digite o numero indicado para realizar a operacao* \n");
            System.out.print(" 1 - Consultar Saldo \n 2 - Receber Valor \n 3 - Transferir Valor \n 4 - Sair \n");
            num = scan.nextDouble();

            if (num <= 0 || num >= 5) {
                System.out.println("Voce precisa digitar um numero de 1 a 5!");
            }

            if (num == 1) {
                System.out.printf("\n Seu saldo é de: %.2f \n", saldoo);
            }

            if (num == 2) {
                System.out.println("Insira o valor que deseja receber:");
                valorRecebe = scan.nextDouble();
                if (valorRecebe > 0) {
                    saldoo = saldoo + valorRecebe;
                    System.out.println("Valor de "+ valorRecebe +" recebido, saldo total de: "+saldoo);
                }else {
                    System.out.println("Insira um valor positivo!");
                }
            }

            if (num == 3) {
                while (true) {
                    System.out.println("Insira o valor que deseja transferir:");
                    valorTransfere = scan.nextDouble();
                    if (valorTransfere > 0) {
                        if (valorTransfere > saldoo){
                            System.out.println("O valor da transferencia é maior que o saldo!");
                        } else {
                            saldoo = saldoo - valorTransfere;
                            System.out.println("Valor de "+ valorTransfere +" transferido! ");
                        }
                        break;
                    } else {
                        System.out.println("Insira um valor valido!");
                    }
                }
            }

            if (num == 4){
                System.out.println("ate logo...");
                break;
            }

        }
    }
}
