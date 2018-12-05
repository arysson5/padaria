
package Estoque;

import padaria.Produtos;


public class Estoque {
    private int quantidademinima;

    public int getQuantidademinima() {
        return quantidademinima;
    }

    public void setQuantidademinima(int quantidademinima) {
        this.quantidademinima = quantidademinima;
    }
    public void gerenciamentoEstoque (){
       Produtos pro = new Produtos ();
       
        if (this.getQuantidademinima()<pro.getQuantidade()){
            System.out.println("produto em falta: "+pro.getNome());
        }
                
            
        
    }
    
}
