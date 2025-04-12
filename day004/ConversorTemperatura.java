import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====CONVERSOR DE TEMPERATURA====");
        System.out.println("1- Celsius para Fahrenheit");
        System.out.println("2- Fahrenheit para Celsius");
        System.out.println("Escolha uma opção");

        int opcao = sc.nextInt();

        System.out.println("Digite a temperatura");
        double temp = sc.nextDouble();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = (temp * 9/5) + 32;
                System.out.println("Conversao:" + resultado + "°F");
                break;
            case 2:
                resultado = (temp - 32) * 5/9;
                System.out.println("Conversao:" +resultado + "°C");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        sc.close();
    }
}