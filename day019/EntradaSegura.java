import java.util.Scanner;

public class EntradaSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero qualquer: ");
        String input = sc.nextLine();

        try {
            //tenta transformar o input em numero
            int numero = Integer.parseInt(input);
            System.out.println("Voce digitou o numero " + numero);
        } catch (NumberFormatException e) {
            //Caso nao consiga converter, entra no catch
            System.out.println("Erro: Voce deve digitar um numero válido");
        }
        sc.close();
    }
}