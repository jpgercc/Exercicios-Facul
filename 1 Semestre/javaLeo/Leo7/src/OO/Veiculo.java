package OO;

public class Veiculo {
    private String numPlaca;
    private String cor;
    private String modelo;
    private Proprietario proprietario;

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Placa: " + numPlaca +
                ", Cor: " + cor +
                ", Modelo: " + modelo +
                ", Proprietário: " + proprietario.getNome();
    }
}
