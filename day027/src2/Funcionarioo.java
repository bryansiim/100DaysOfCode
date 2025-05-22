public class Funcionarioo {

    private String nome;
    private double salario;

    public Funcionarioo(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }else {
            System.out.println("Salário inválido");
        }
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }
}
