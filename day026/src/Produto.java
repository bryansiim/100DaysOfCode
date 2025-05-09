public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    //construtor

    public Produto(String nome, double preco, int quantidade){

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
        if(nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }else{
            System.out.println("Nome inválido");
        }
    }

    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        }else{
            System.out.println("Preco inválido");
        }
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        }else{
            System.out.println("Quantidade inválida");
        }
    }


    public void aumentarEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
        }else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void mostrarDados(){
        System.out.println("Produtos: " + nome + " | Preco " + preco + " | Quantidade: " + quantidade);
    }
}
