import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[3];
        double[][] notas = new double[3][2];

        for (int i = 0; i <alunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();

            for (int j = 0; j < 2; j++) {
                System.out.println("Nota " + (j + 1) + " de " + alunos[i] + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("\n=====\uD83D\uDCCBBoletim=====");
        for (int i = 0; i < 3; i++){
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.printf("%s → Nota 1: %.1f | Nota 2: %.1f | Média: %.1f\n",
                    alunos[i], notas[i][0], notas[i][1], media);
            }
    }
}