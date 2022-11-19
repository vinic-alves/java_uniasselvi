package topico1;

public class Microondas extends Produtos {
    private int voltagem;
    private int capacidade;
    private boolean autoLimpante;   // é autoLimpante ou não? um dado booleano;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean getAutoLimpante() {
        return autoLimpante;
    }

    public void setAutoLimpante(boolean autoLimpante) {
        this.autoLimpante = autoLimpante;
    }
}
