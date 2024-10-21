public class Lista3 {
    public static void main(String[] args) {
        int [] vetorB = new int[10];

        //for e if para calcular numero primo e somar i nos vetores
        for (int i = 0; i < vetorB.length; i++){
            if (i % 2 == 0){
                vetorB[i] = 20;
            } else {
                vetorB[i] = 10;
            }
        }

        //for para imprimir
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Vetor "+ i +" = "+ vetorB[i]);
        }
    }
}

/*
3. (ExeVetor03) Preencher um vetor B de 10 elementos em tempo de execução com o
número 10 se o índice do elemento for ímpar, e com o número 20 se for par. Escrever o
vetor B após o seu total preenchimento.etorB.length (i % 2 == 0)int if else for
 */