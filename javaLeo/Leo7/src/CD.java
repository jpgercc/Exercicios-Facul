public class CD {
    private int numMusicasCD;
    private int faixaAtual;
    private int estado;

    public void setNumeroMusicasCD(int numMusicasCD) {
        this.numMusicasCD = numMusicasCD;
    }


    public void setFaixaAtual(int faixaAtual) {
        this.faixaAtual = faixaAtual;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void tocaCD() {
        System.out.println("CD está tocando.");
    }

    public void interrompeCD() {
        System.out.println("CD foi pausado.");
    }

    public void paraCD() {
        System.out.println("CD foi parado.");
    }

    public void proximaFaixa() {
        System.out.println("Próxima faixa selecionada.");
    }

    public void faixaAnterior() {
        System.out.println("Faixa anterior selecionada.");
    }

    @Override
    public String toString() {
        return "CD [numMusicasCD=" + numMusicasCD + ", faixaAtual=" + faixaAtual + ", estado=" + estado + "]";
    }
}
