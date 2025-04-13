import java.util.Scanner;

public class FiltroPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite até 10 numeros, (digite 0 para parar):");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i + ": ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Numero 0 digitado, encerrando o programa");
                break;
            }

            if (num < 0) {
                System.out.println("Negativo ignorado.");
                continue;
            }

            if (num % 2 == 0) {
                System.out.println("PAR: " + num);
            } else {
                System.out.println("Impar (ignorado)");
            }

        }
        sc.close();
    }
}