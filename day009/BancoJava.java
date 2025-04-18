import java.util.Scanner;

public class BancoJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = sc.nextLine();

        System.out.println("Digite digite o numero da conta: ");
        int nConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Deseja fazer um deposito inicial? (s/n) ");
        String resposta = sc.nextLine();

        double saldo = 0.0;

        if (resposta.equalsIgnoreCase("s")) {

            System.out.println("Informe o valor do deposito inicial: ");
            saldo = sc.nextDouble();
            sc.nextLine();
        }

        ContaBancaria conta = new ContaBancaria();
        conta.titular = titular;
        conta.nConta = nConta;
        conta.saldo = saldo;



        System.out.println("===Seja Bem-Vindo ao Banco" + titular + "!===");
        System.out.println("1- Ver saldo");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Ver extrato");
        System.out.println("0- Sair");

        int opcao = sc.nextInt();

        sc.close();


    }
}
