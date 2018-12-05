
package Estoque;


public class Fornecedores {
    private String nome,endereco,produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedores{" + "nome=" + nome + ", endereco=" + endereco + ", produto=" + produto + '}';
    }
   
    
}
