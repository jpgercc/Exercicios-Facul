import java.util.Random;

public class L4 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int tamanho = 15000;
        int[] numeros = new int[tamanho];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < tamanho; i++){
            numeros[i] = gerador.nextInt(100);
        }
        for (int i = 0; i < tamanho; i++){
            if (numeros[i] % 2 == 1){
                impar++;
            } else {
                par++;
            }
            System.out.println("Existem "+impar +" numeros pares e "+ par +" numeros impares");
        }
    }
}
/*
.Faça um algoritmo que armazena em um vetor 1500 numeros inteiros
e verifique quantos desses numeros são Impares
(Um numero é IMPAR quando dividido por 2 seu resto é igual a 1). Apresente o final essa quantidade
 */