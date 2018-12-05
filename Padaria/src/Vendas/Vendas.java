
package Vendas;

import padaria.Funcionario;
import padaria.Produtos;


public class Vendas {
    
    private String data,formapagamento;
    private double valortotal;
    private int quantidade;
   public void cartao (){
           Cartao ct = new Cartao ();
           ct.getCodigo();
           ct.getDatadevencimento();
           
   }
   public void produtosVendidos (){
       double compra;
       int produtovendido;
       Produtos pro = new Produtos ();
       pro.getNome();
       pro.getPreco();
       this.getQuantidade();
       produtovendido=pro.getQuantidade()-this.getQuantidade();
       pro.setQuantidade(produtovendido);
      
       compra=pro.getPreco()*pro.getQuantidade();
       
       this.setValortotal(compra);
       
           
       
   }
  

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
 
  public void Funcionario (){
      Funcionario fun = new Funcionario ();
   
      System.out.println(""+  fun.toString());
  }

    @Override
    public String toString() {
        return "Vendas{" + "data=" + data + ", formapagamento=" + formapagamento + ", valortotal=" + valortotal + ", quantidade=" + quantidade + "valor total" + this.getValortotal();
    }
  
    
    
}
