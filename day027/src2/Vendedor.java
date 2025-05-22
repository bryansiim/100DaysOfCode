public class Vendedor extends Funcionarioo {

    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Comissao: R$" + comissao);
    }
}
