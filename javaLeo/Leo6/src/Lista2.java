import bibs.Lista22;
import bibs.Lista22teste;


public class Lista2{
    public static void main(String[] args) {

        int[] nums = Lista22teste.Lista22Teste();
        int num1 = nums[0];
        int num2 = nums[1];
        int num3 = nums[2];
        int num4 = nums[3];

        Lista22 cria = new Lista22();

        int produto = cria.calculo(num1, num2, num3, num4);
        System.out.println("|-------------------------------------|");
        System.out.println(" A media entre " + num1 +", " + num2 +", " + num3 +", " + num4 +" é : " + produto);
        System.out.println("|-------------------------------------|");
    }
}
