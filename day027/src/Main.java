public class Main {
    public static void main(String[] args) {

        //criando um gerente com nome, salario e bonus
        Gerentee gerenteGeral = new Gerentee("Pedrin", 2500, 1500);

        gerenteGeral.mostrarDados();

        System.out.println("==============");

        Funcionarioo funcionario1 = new Funcionarioo("Gervazo", 2500);

        funcionario1.mostrarDados();

    }
}