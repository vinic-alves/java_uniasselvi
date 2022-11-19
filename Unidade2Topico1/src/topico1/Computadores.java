package topico1;

public class Computadores extends Produtos{

    private String processador;
    private int memoria;
    private String sistemaOper;
    private int armazenamento;


    // GETTERS AND SETTERS

    public void setProcessador(String processador){
        this.processador = processador;
    }
    public String getProcessador(){
        return processador;
    }

    public int getMemoria() {
        return memoria;
    }


    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getSistemaOper() {
        return sistemaOper;
    }

    public void setSistemaOper(String sistemaOper) {
        this.sistemaOper = sistemaOper;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    // abaixo é usado o mesmo método da superclasse Produtos, porém com
    // uma pequena alterção
    public void promocao(){
        System.out.println("Este produto está em Promocão com 15% Off");

    }
}
