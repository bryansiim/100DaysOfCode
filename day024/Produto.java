public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    //construtor

    public Produto (String nome, double preco, int quantidade){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    //setter

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void mostrarDados(){
        System.out.println("Produtos: " + nome + " | Preco " + preco + " | Quantidade: " + quantidade);
    }
}
