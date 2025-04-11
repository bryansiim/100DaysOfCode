import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userCorreto = "admin";
        String senhaCorreta = "1234";

        int tentativas = 0;
        boolean acessoPermitido = false;

        while  (tentativas < 3) {
            System.out.println("User: ");
            String userDigitado = sc.nextLine();

            System.out.println("Senha: ");
            String senhaDigitada = sc.nextLine();

            if (userDigitado.equals(userCorreto) && senhaDigitada.equals(senhaCorreta)) {
                acessoPermitido = true;
                break;
            } else {
                tentativas++;
                System.out.println("User ou senha incorretos. Tentativas restantes: " + (3 - tentativas));
            }
        }
        if (acessoPermitido) {
            System.out.println("✅ Login feito com sucesso!");
        }else {
            System.out.println("❌ Acesso bloqueado. Voce exedeu o numero de tentativas");
        }

        sc.close();
    }
}