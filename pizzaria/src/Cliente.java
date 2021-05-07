public class Cliente{
  public String nome;
  public String whatsapp;
  public Endereço endereço;

  public Cliente(){
    this.endereço = new Endereço();
  }
  public String dadosDoCliente(){
    return "Nome: "+nome+"\nWhatsapp: " +whatsapp+"\nEndereço: \n"+endereço.estado+"\n"+ endereço.cidade+"\nBairro: "+endereço.bairro+", Rua: "+endereço.rua+"\nCep: "+endereço.cep  ;
  }
}