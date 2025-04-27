import java.util.Scanner;

public class InversorDeFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String frase = sc.nextLine();

        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse(); //Método que inverte o conteudo

        System.out.println("Frase invertida: " + fraseInvertida);

        sc.close();
    }
}