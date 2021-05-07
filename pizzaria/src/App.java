public class App {
    public static void main(String[] args) throws Exception {
        Pedidos pd = new Pedidos();


        pd.setNome("Gabriel");
        pd.setWhatsapp("97675406");
        pd.setBairro("Residencial Gramado");
        pd.setRua("Travessa José Matheus Ferreira");
        pd.setCep("38706-216");

        pd.setCategoria("pizza e bebida");
        pd.setDescriçao("Quero uma a moda e uma Coca 2l");
        pd.setPreçoDeCusto(50);


        System.out.println("====================================================================");
        System.out.println("😎");
        System.out.println("Data/Hora: " + pd.getData()+" "+pd.getHora());
        System.out.println("====================================================================");
        System.out.println(pd.dadosDoCliente());
        System.out.println("====================================================================");
        System.out.println(pd.dadosDoProduto());
        System.out.println("====================================================================");
        
    }
}
