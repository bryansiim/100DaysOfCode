import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas voce deseja nos informar?");
        int quantidadeNotas = sc.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Nota " +  (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }

        double media = soma / quantidadeNotas;

        System.out.println("A media é:" + media);

        sc.close();
    }
}











