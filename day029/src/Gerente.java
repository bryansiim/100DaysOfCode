public class Gerente implements Autenticavel {

    private String senha = "admin123";

    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }


}
