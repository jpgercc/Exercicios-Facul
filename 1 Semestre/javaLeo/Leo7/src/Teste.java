import OO.Proprietario;
import OO.Veiculo;

public class Teste {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario();
        proprietario1.setNome("João");
        proprietario1.setEndereco("Rua A, 123");
        proprietario1.setSexo('M');
        proprietario1.setCpf("12345678901");
        proprietario1.setCnh("123456789");

        Proprietario proprietario2 = new Proprietario();
        proprietario2.setNome("Maria");
        proprietario2.setEndereco("Rua B, 456");
        proprietario2.setSexo('F');
        proprietario2.setCpf("98765432109");
        proprietario2.setCnh("987654321");

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setNumPlaca("ABC1234");
        veiculo1.setCor("Azul");
        veiculo1.setModelo("Sedan");
        veiculo1.setProprietario(proprietario1);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setNumPlaca("DEF5678");
        veiculo2.setCor("Preto");
        veiculo2.setModelo("SUV");
        veiculo2.setProprietario(proprietario1);

        Veiculo veiculo3 = new Veiculo();
        veiculo3.setNumPlaca("GHI9012");
        veiculo3.setCor("Vermelho");
        veiculo3.setModelo("Hatch");
        veiculo3.setProprietario(proprietario2);

        Veiculo veiculo4 = new Veiculo();
        veiculo4.setNumPlaca("JKL3456");
        veiculo4.setCor("Prata");
        veiculo4.setModelo("Picape");
        veiculo4.setProprietario(proprietario2);

        Veiculo veiculo5 = new Veiculo();
        veiculo5.setNumPlaca("MNO7890");
        veiculo5.setCor("Branco");
        veiculo5.setModelo("Caminhão");
        veiculo5.setProprietario(proprietario2);

        System.out.println("Dados dos veículos:");
        System.out.println(veiculo1);
        System.out.println(veiculo2);
        System.out.println(veiculo3);
        System.out.println(veiculo4);
        System.out.println(veiculo5);
    }
}
