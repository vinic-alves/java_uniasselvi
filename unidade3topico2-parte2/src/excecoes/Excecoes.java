package excecoes;

public class Excecoes {

    static  int numeros[] = new int[5];     //atributo array static

    // criando método stático

    static void popularVetor(){
        for(int i = 0; i <=  numeros.length; i ++){
            try{
                numeros[i] = i + 1;
            }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Erro neste módulo - popular");
            }


        }
        System.out.println("Terminou o método popularVetor");
    }
    static void mostrarVetor (){
        for (int i = 0; i < numeros.length; i ++){
            try{
                System.out.println(numeros[i]);
            }catch (Exception e){
                System.out.println("Erro neste método - mostrar");
            }

        }
        System.out.println("Terminou o método mostrarVetor");
    }



    public static void main(String[] args) {
        popularVetor();
        System.out.println("");
        mostrarVetor();
        System.out.println("Fim do Programa");
    }
}
