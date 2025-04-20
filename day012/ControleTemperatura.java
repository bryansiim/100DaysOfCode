import java.util.Scanner;

public class ControleTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas temperaturas gostaria de registrar:");
        int numTemperaturas = (sc.nextInt());

        double[] temperaturas = new double[numTemperaturas];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }

        double media = soma / temperaturas.length;
        System.out.printf("Média das temperaturas: %.2f°C\n", media);

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }
        System.out.printf("Maior temperatura: %.2f°C\n", maior);
        System.out.printf("Menor temperatura: %.2f°C\n", menor);

        System.out.println("Dias com temperaturas acima da média: ");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("Dia %d: %.2f°C\n", i+ 1, temperaturas[i]);
            }
        }

        sc.close();
    }
}