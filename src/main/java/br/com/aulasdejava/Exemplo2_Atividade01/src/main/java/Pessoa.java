package br.com.aulasdejava.Exemplo2_Atividade01.src.main.java;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    //construtor vazio
    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.endereco = new Endereco("Desconhecida", "Desconhecida", "Desconhecido");
    }

    //construtor com parametros
    // Construtor com dados de endereço
    public Pessoa(String nome, int idade, String rua, String cidade, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = new Endereco(rua, cidade, estado);
    }



    @Override
    public String toString() {
        return "Pessoa:\n" +
                "  Nome: " + nome + "\n" +
                "  Idade: " + idade + "\n" +
                endereco.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
