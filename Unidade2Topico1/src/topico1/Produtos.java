package topico1;

import org.w3c.dom.ls.LSOutput;

public class Produtos {

    private double preco; // encapsulando com o private, para que só possa ser acessado através de um método getter e modificado com um método setter;
    private String marca;
    private String modelo;
    private String cor;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // método na superClasse "Produtos", para ser utilizado pelas classes filhas: Microondas e Computador;
    public void promocao(){
        System.out.println("Este produto não está em Promocão");

    }
}
