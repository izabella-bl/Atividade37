package CadastroDePratos.Model;

public class Pratos extends BaseId {
    private String nome;
    private String tipo;
    private String descricao;
    private double preco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\n" +
                "Nome do Prato: %s \n" +
                "Tipo: %s \n" +
                "Descrição: %s\n" +
                "Preço: R$ %.2f\n",getId().toString(),this.nome,this.tipo,this.descricao,this.preco);
    }
}
