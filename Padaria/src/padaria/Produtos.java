
package padaria;


public class Produtos {
 private String nome,tipo,datadevalidade;
 private int quantidade;
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

    public String getDatadevalidade() {
        return datadevalidade;
    }

    public void setDatadevalidade(String datadevalidade) {
        this.datadevalidade = datadevalidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto " + " nome= " + nome + "/ tipo= " + tipo +"\n"+ " datadevalidade=" + datadevalidade + ", quantidade= " + quantidade + "/ preco= " + preco ;
    }
 
 

    
}
