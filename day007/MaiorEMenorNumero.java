import java.util.Scanner;

public class MaiorEMenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce quer digitar?");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Numero" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior Numero: " + maior);
        System.out.println("Menor Numero: " + menor);

        sc.close();
    }
}