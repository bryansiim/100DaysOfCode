import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if (ehPrimo(numero)){
            System.out.println("O numero " + numero + " é primo");

        } else {
            System.out.println("O numero " + numero + " nao é primo");
        }
        sc.close();
    }
    public static boolean ehPrimo(int n) {

        if(n <=1) return false;

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false; //achou divisor -> nao é primo
            }
        }
        return true; // nao achou -> primo
    }
}
