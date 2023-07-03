import java.util.Random;

public class L3 {
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
            if (numeros[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Existem "+par +" numeros pares e "+ impar +" numeros impares");
    }
}
/*
Faça um algoritmo que armazena em um vetor 15000 numeros inteiros
 e verifique quantos desses numeros são Pares
(Um numero é PAR quando dividido por 2 seu resto é igual a zero).
 Apresente o final essa quantidade.
 */