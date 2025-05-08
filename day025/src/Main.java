public class Main {
    public static void main(String[] args) {

        //criando um produto com o const
        Produto produto1 = new Produto("Mouse gamer", 129.9, 5 );

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: R$" + produto1.getPreco());
        System.out.println("Quantidade: " + produto1.getQuantidade());

        //Alterando valores com setters (COM VALIDACAO)

        produto1.setNome("Mouse sem fio");
        produto1.setPreco(159.9);

        //Exibir tudo
        produto1.mostrarDados();
    }
}