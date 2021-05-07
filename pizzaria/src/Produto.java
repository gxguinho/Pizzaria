public class Produto {
  public String descriçao;
  private double preçoDeCusto;
  private double preçoDeVenda;
  public String categoria;

  public void setPreçoDeCusto(double preçoDeCusto){
    this.preçoDeCusto = preçoDeCusto;
  }
  public double getPreçoDeCusto(){
    return preçoDeCusto;
  }

  public double getPreçoDeVenda(){
    return preçoDeVenda = preçoDeCusto + (30.0/100.0 * preçoDeCusto); 
  }

  
  public String dadosDoProduto(){
    return "categoria: "+categoria+"\ndescriçao: "+descriçao + "\nPreço: $ "+preçoDeCusto+"\nPreço de venda: $ "+getPreçoDeVenda();
  }
}
