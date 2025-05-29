public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();

        if (g.autenticar("admin123")){
            System.out.println("Acesso liberado");
        }else {
            System.out.println("Senha incorreta, tente novamente");
        }
    }
}