package atributosestaticos;

public class Cidades {
    public static String cidade = "Rio de Janeiro";

    public static void main(String[] args) {
        Cidades c1 = new Cidades();
        Cidades c2 = new Cidades();

        System.out.println(c1.cidade);
        System.out.println(c2.cidade);

        //c1.cidade = "Indaial";
        // Sempre que declararmos um atributo como estático ele não poderá ter valores
        // diferentes e o ultimo valor declarado, será o valor pra todos os atributos de mesma
        // instância
        // Exemplo ?

        System.out.println("");

        c1.cidade = "Washinton";
        c2.cidade = "Belo Horizonte";

        System.out.println(c1.cidade);
        System.out.println(c2.cidade);

        // como agora ele é static podemos chamar o atributo direto,
        // já que ele pertence a classe e não ao objeto;

        // exemplo :
        System.out.println("");
        System.out.println(Cidades.cidade);

    }
}
