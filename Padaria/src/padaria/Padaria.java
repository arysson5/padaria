
package padaria;

import Estoque.Estoque;
import Estoque.Fornecedores;
import Vendas.Vendas;


public class Padaria {

  
    public static void main(String[] args) {
        //produtos
        Produtos produto = new Produtos ();
        produto.setNome("pão");
        produto.setTipo("Massas");
        produto.setDatadevalidade("20/12/2018");
        produto.setPreco(0.25);
        produto.setQuantidade(100);
        System.out.println(""+produto.toString());
        
        //FUNCIONARIOS
        Funcionario fun = new Funcionario ();
        fun.setNome("amarildo");
        fun.setFuncao("padeiro");
        System.out.println(""+ fun.toString());
        
      
        //vendas
        Vendas vendas = new Vendas ();
        vendas.setData("05/12/2018");
        vendas.setFormapagamento("cartao de credito");
        vendas.cartao();
        System.out.println(""+vendas.toString());
        vendas.Funcionario();
        vendas.cartao();
        
        //ESTOQUE
        Estoque estoque = new Estoque ();
        estoque.gerenciamentoEstoque();
       
        
        
        //Fornecedores
        Fornecedores fornece = new Fornecedores();
        fornece.setNome("seára");
        fornece.setEndereco("rua das flores , 51 ");
        fornece.setProduto("mortadela ");
        System.out.println(""+fornece.toString());
        
    }
    
}
