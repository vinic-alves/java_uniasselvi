package topico1;

public class Testador {
    public static void main(String[] args) {
        Computadores comp = new Computadores();

        // o método set serve para atribuir valor;
        comp.setPreco(1200.0);
        comp.setMemoria(4);

        Microondas micro = new Microondas();
        micro.setMarca("LG");
        micro.setAutoLimpante(true);

        // o método get serve para mostrarmos o valor atual do atributo, enquanto o set pode alterar;
        // o get é muito usado junto com a saida system.out.println();

        //System.out.println(comp.getMemoria() + "gb de RAM");
        //System.out.println("autolimpante? " + micro.getAutoLimpante());

        // testando o polimorfismo no objeto computador
        comp.promocao();
        // testando o polimorfismo no objeto microondas, usando o método de Produtos(promoção)
        micro.promocao();
    }
}
