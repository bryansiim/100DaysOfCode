import java.util.ArrayList;
import java.util.Scanner;

public class BancoJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> extrato = new ArrayList<>();

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

        boolean continuar = true;

        while (continuar) {

            System.out.println("===Seja Bem-Vindo ao Banco " + titular + "!===");
            System.out.println("1- Ver saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Ver extrato");
            System.out.println("0- Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Seu saldo atual é R$:" + conta.saldo);
                    break;

                case 2:

                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    sc.nextLine();

                    if (valorDeposito > 0) {
                        conta.saldo += valorDeposito;
                        extrato.add("Deposito de R$" + valorDeposito);
                        System.out.println("Deposito realizado com sucesso!");
                    } else {
                        System.out.println("Valor invalido para depósito");
                    }
                    break;

                case 3:

                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = sc.nextDouble();
                    if (saque <= conta.saldo) {
                        conta.saldo -= saque;
                        extrato.add("Saque de R$" + saque);
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:

                    System.out.println("===Extrato===");

                    if (extrato.isEmpty()) {
                        System.out.println("Nenhuma movimentacao iniciada");
                    } else {
                        for (String linha : extrato) {
                            System.out.println(linha);
                        }
                    }
                    break;

                case 0:

                    continuar = false;
                    System.out.println("Saindo... Obrigado por utilizar nossos serviços!");

                    break;

                default:
                    System.out.println("Opcao invalida. tente novamente");
            }


        }

        sc.close();

    }
}
