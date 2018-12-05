
package Vendas;


public class Cartao {
    private int codigo;
    private String datadevencimento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDatadevencimento() {
        return datadevencimento;
    }

    public void setDatadevencimento(String datadevencimento) {
        this.datadevencimento = datadevencimento;
    }

    @Override
    public String toString() {
        return "Codigo do cartao= " + codigo + "/ data de vencimento= " + datadevencimento ;
    }

  
  
   
   
    
}
