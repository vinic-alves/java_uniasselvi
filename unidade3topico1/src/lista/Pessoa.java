package lista;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;

    // método construtor

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // criando os métodos getters e setters para manipulação

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public int getIdade(){
        return  idade;
    }
    public void setIdade(){
        this.idade = idade;
    }


    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareTo(pessoa.getNome());
    }
}
