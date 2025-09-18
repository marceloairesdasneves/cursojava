package br.com.exemplo1atividade1;

public class Endereco {

    private String rua;
    private String cidade;
    private String estado;

    //construtor vazio
    public Endereco() {
        this.rua = " ";
        this.cidade = " ";
        this.estado = " ";
    }

    //construtor com parametros
    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereço:\n" +
                "  Rua: " + rua + "\n" +
                "  Cidade: " + cidade + "\n" +
                "  Estado: " + estado;
    }
}
