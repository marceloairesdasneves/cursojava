package br.com.aulasdejava.Exemplo2_Atividade01.src.main.java;

public class Teste {
    public static void main(String[] args) {
        // Criando pessoa1 com construtor parametrizado
        Pessoa pessoa1 = new Pessoa("Thaize", 41, "rua otalino amado de souza", "Curitiba", "Paraná");

        // Criando pessoa2 com construtor vazio + setters
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Carlos");
        pessoa2.setIdade(35);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");

        pessoa2.setEndereco(endereco);

        // -------- Pessoa 1 --------
        System.out.println("Pessoa 1 - toString:");
        System.out.println(pessoa1);
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 1 - Getters:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Rua: " + pessoa1.getEndereco().getRua());
        System.out.println("Cidade: " + pessoa1.getEndereco().getCidade());
        System.out.println("Estado: " + pessoa1.getEndereco().getEstado());
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 1 - printf:");
        System.out.printf("Pessoa: %s, %d anos, mora em %s, %s - %s%n",
                pessoa1.getNome(),
                pessoa1.getIdade(),
                pessoa1.getEndereco().getRua(),
                pessoa1.getEndereco().getCidade(),
                pessoa1.getEndereco().getEstado());
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 1 - String.format:");
        String info1 = String.format("%s tem %d anos e mora em %s - %s (%s).",
                pessoa1.getNome(),
                pessoa1.getIdade(),
                pessoa1.getEndereco().getRua(),
                pessoa1.getEndereco().getCidade(),
                pessoa1.getEndereco().getEstado());
        System.out.println(info1);
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 1 - StringBuilder:");
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Nome: ").append(pessoa1.getNome()).append("\n")
                .append("Idade: ").append(pessoa1.getIdade()).append("\n")
                .append("Endereço completo: ").append(pessoa1.getEndereco());
        System.out.println(sb1.toString());
        System.out.println("_____________________________________________________________________");

        // -------- Pessoa 2 --------
        System.out.println("Pessoa 2 - toString:");
        System.out.println(pessoa2);
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 2 - Getters:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Rua: " + pessoa2.getEndereco().getRua());
        System.out.println("Cidade: " + pessoa2.getEndereco().getCidade());
        System.out.println("Estado: " + pessoa2.getEndereco().getEstado());
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 2 - printf:");
        System.out.printf("Pessoa: %s, %d anos, mora em %s, %s - %s%n",
                pessoa2.getNome(),
                pessoa2.getIdade(),
                pessoa2.getEndereco().getRua(),
                pessoa2.getEndereco().getCidade(),
                pessoa2.getEndereco().getEstado());
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 2 - String.format:");
        String info2 = String.format("%s tem %d anos e mora em %s - %s (%s).",
                pessoa2.getNome(),
                pessoa2.getIdade(),
                pessoa2.getEndereco().getRua(),
                pessoa2.getEndereco().getCidade(),
                pessoa2.getEndereco().getEstado());
        System.out.println(info2);
        System.out.println("_____________________________________________________________________");

        System.out.println("Pessoa 2 - StringBuilder:");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Nome: ").append(pessoa2.getNome()).append("\n")
                .append("Idade: ").append(pessoa2.getIdade()).append("\n")
                .append("Endereço completo: ").append(pessoa2.getEndereco());
        System.out.println(sb2.toString());
        System.out.println("_____________________________________________________________________");
    }
}
