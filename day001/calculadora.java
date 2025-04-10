import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== CALCULADORA ======");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro numero");
                double num1 = scanner.nextDouble();

                System.out.println("Digite o segundo numero");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcao){
                    case 1:
                        resultado = soma(num1, num2);
                        break;

                    case 2:
                        resultado = subtrai(num1, num2);
                        break;

                    case 3:
                        resultado = multiplica(num1, num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = divide(num1, num2);
                        } else {
                            System.out.println("Erro: divisao por 0");
                            continue;
                        }
                        break;
                }

                System.out.println("Resultado = " + resultado);

            } else if (opcao != 0){
                System.out.println("Opcao invalida");
            }
        }
        System.out.println("Calculadora encerrada, até mais!");


        scanner.close();
    }
    public static double soma (double a, double b){
        return a + b;
    }

    public static double subtrai (double a, double b){
        return a - b;
    }

    public static double multiplica (double a, double b){
        return a * b;
    }

    public static double divide (double a, double b){
        return a / b;
    }



}

