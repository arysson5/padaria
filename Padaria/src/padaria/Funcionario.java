
package padaria;


public class Funcionario {
    private String nome,funcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario " + " nome= " + nome + "/ funcao= " + funcao ;
    }
    
}
