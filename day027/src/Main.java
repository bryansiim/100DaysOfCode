public class Main {
    public static void main(String[] args) {

        //criando um gerente com nome, salario e bonus
        Gerente gerenteGeral = new Gerente("Pedrin", 2500, 1500);

        gerenteGeral.mostrarDados();

        System.out.println("==============");

        Funcionario funcionario1 = new Funcionario("Gervazo", 2500);

        funcionario1.mostrarDados();

    }
}