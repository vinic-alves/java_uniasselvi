package lista;

import java.util.ArrayList;
import java.util.List;

public class Lista<P> {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Marcos");
        lista.add("Ana");
        lista.add("Luis");

        // usando a estrutura for each para varrer a lista:

        for (String s : lista){
            System.out.println("Nome: " + s);
        }

        lista.remove("Ana");
        System.out.println("/////////////////////");
        for (String s : lista){
            System.out.println("Nome: " + s);
        }


    }
}
