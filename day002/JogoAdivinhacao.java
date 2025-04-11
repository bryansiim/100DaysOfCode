import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        String jogarNovamente;

        do {

            int numeroSecreto = rdm.nextInt(10) + 1;
            int tentativas = 3;

            while (tentativas > 0) {
                System.out.println("Tente adivinhar o número de 1 a 10");
                int chute = sc.nextInt();

                if (chute == numeroSecreto) {
                    System.out.println("Parabens! Voce acertou");
                    break;

                } else {
                    tentativas--;

                    if (chute < numeroSecreto) {
                        System.out.println("Errou,o numero é maior");
                    } else {
                        System.out.println("Errou, o numero é menor");
                    }
                    System.out.println("Tentativas restantes: " + tentativas);
                }

            }
            if (tentativas == 0) {
                System.out.println("Acabaram suas tentativas, o numero era: " + numeroSecreto);
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            sc.nextLine();
            jogarNovamente = sc.nextLine();
        }while (jogarNovamente.equalsIgnoreCase("s"));

        sc.close();
    }
}
