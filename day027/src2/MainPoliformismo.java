    public class MainPoliformismo {
        public static void main(String[] args) {

            //Criando tipos diferentes de funcionarios

            Funcionarioo funcionario1 = new Funcionarioo("Gervazo", 2500);
            Funcionarioo funcionario2 = new Gerentee("Cleiton", 2500, 1500);
            Funcionarioo funcionario3 = new Vendedor("Miudo", 2500, 500);

            //Poliformismo usando o tipo de funcionario pra todos
            Funcionarioo[] funcionarios = new Funcionarioo[3];
            funcionarios[0] = funcionario1;
            funcionarios[1] = funcionario2;
            funcionarios[2] = funcionario3;

            //ATENCAO
            //TEM OUTRO JEITO DE FAZER ISSO MELHOR, MAS ESSA É UMA MANEIRA ALTERNATIVA

            //Exibindo os dados com poliformismo
            for (Funcionarioo f : funcionarios) {

                f.mostrarDados();// mostra o metodo certo dependendo da classe real
                System.out.println("============");
            }
        }
    }