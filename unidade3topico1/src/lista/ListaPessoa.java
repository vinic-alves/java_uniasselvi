package lista;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoa {

    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<>();
        Pessoa p1 = new Pessoa("Marcos", 17);
        Pessoa p2 = new Pessoa("Ana", 18);
        Pessoa p3 = new Pessoa("Joana", 15);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println("Mostrando os elementos da Lista :");

        // for each pra mostrar a lista:

        for( Pessoa p : lista){
            System.out.println("Nome " + p.getNome() + " - idade: " + p.getIdade());
        }
        Collections.sort(lista);


        System.out.println("");
        for(Pessoa p : lista){
            System.out.println("Nome " + p.getNome() + " - idade: " + p.getIdade());
        }
    }





}
