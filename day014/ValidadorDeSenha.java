import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();


        if (senha.length() < 8){
            System.out.println("❌ Senha muito curta. Mínimo 8 caracteres. ");
            return;
        }

        boolean temMaiuscula = false;

        for (int i = 0; i < senha.length(); i++){
            if (Character.isUpperCase(senha.charAt(i))) {
                temMaiuscula = true;
                break;
            }
        }
        if (!temMaiuscula) {
            System.out.println("❌ A senha precisa ter pelo menos 1 letra maiúscula.");
            return;
        }

        boolean temMinuscula = false;

        for (int i = 0; i < senha.length(); i++){
            if (Character.isLowerCase(senha.charAt(i))) {
                temMinuscula = true;
                break;
            }
        }
        if (!temMinuscula) {
            System.out.println("❌ A senha precisa ter pelo menos 1 letra minúscula.");
            return;
        }

        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++){
            if (Character.isDigit(senha.charAt(i))) {
                temNumero = true;
                break;
            }
        }
        if (!temNumero) {
            System.out.println("❌ A senha precisa ter número.");
            return;
        }

        boolean temEspecial = false;
        String especiais = "!@#$%^&*()_+";

        for (int i = 0; i < senha.length(); i++) {
            if (especiais.contains(String.valueOf(senha.charAt(i)))) {
                temEspecial = true;
                break;
            }
        }

        if (!temEspecial){
                System.out.println("❌ A senha precisa ter um caractere especial");
                return;
        }
        System.out.println("Digite novamente a senha");
        String senhaAgain = sc.nextLine();

        if (senha.equals(senhaAgain)){
            System.out.println("✅Senha válida");
        }else {
            System.out.println("❌ As senhas não coincidem");
        }
        sc.close();
    }
}

