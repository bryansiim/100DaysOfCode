public class Gerentee extends Funcionarioo {

    //Valor adicional ao salário
    private double bonus;

    public Gerentee(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;

    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); // mostra nome e salrio
        System.out.println("Bonus: R$" + bonus);
    }
}
