package metodosestaticos;

public class MetodoEstatico {
    public static int  somar(int n1, int n2){
        return n1 + n2;
    }
    public static void main(String[] args) {
        // como o método static podemos chamar o método direto, sem instanciar um objeto;
        System.out.println(MetodoEstatico.somar(5,5));
    }
}
