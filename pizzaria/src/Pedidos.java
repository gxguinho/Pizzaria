public class Pedidos{
  private String data; 
  private String hora; 
  private Cliente cliente;
  private Produto produto;

 
  public Pedidos(){
    this.data = "06/05/2021";
    this.hora = "15:00";
    this.cliente = new Cliente();
    this.produto = new Produto();
  }

  public void setData(String data){
    this.data = data;
  }
  public String getData(){
    return data;
  }
  public void setHora(String hora){
    this.hora = hora;
  }
  public String getHora(){
    return hora;
  }
  public void setNome(String nome){
    this.cliente.nome = nome;
  }
  public void setWhatsapp(String whatsapp){
    this.cliente.whatsapp = whatsapp;
  }
  public void setBairro(String bairro){
    this.cliente.endereço.bairro = bairro;
  }
  public void setRua(String rua){
    this.cliente.endereço.rua = rua;
  }
  public void setCep(String cep){
    this.cliente.endereço.cep = cep;
  }
  public void setDescriçao(String descriçao){
    this.produto.descriçao = descriçao;
  }
  public void setCategoria(String categoria){
    this.produto.categoria = categoria;
  }
  public void setPreçoDeCusto(double produto){
    this.produto.setPreçoDeCusto(produto);
  }
  public String dadosDoCliente(){
    return cliente.dadosDoCliente();
  }
  public String dadosDoProduto(){
    return produto.dadosDoProduto();
  }
  
}
