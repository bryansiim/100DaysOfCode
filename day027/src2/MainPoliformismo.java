    public class MainPoliformismo {
        public static void main(String[] args) {

            //Crindo tipos diferentes de funcionarios

            Funcionario funcionario1 = new Funcionario("Gervazo", 2500);
            Funcionario funcionario2 = new Gerente("Cleiton", 2500, 1500);
            Funcionario funcionario3 = new Vendedor("Miudo", 2500, 500);

            //Poliformismo usando o tipo de funcionario pra todos
            Funcionario[] funcionarios = new Funcionario[3];
            funcionarios[0] = funcionario1;
            funcionarios[1] = funcionario2;
            funcionarios[2] = funcionario3;

            //ATENCAO
            //TEM OUTRO JEITO DE FAZER ISSO MELHOR, MAS ESSA É UMA MANEIRA ALTERNATIVA

            //Exibindo os dados com poliformismo
            for (Funcionario f : funcionarios) {

                f.mostrarDados();// mostra o metodo certo dependendo da classe real
                System.out.println("============");
            }
        }
    }