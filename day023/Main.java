public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Pantera", "Felino", 55);

        //usando getters pra acessar dados

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Espécie: " + a1.getEspecie());
        System.out.println("Peso: " + a1.getPeso());

        //usando setter para alterar os dados

        a1.setNome("Leopardo");
        a1.setPeso(60);


        a1.mostrarDados();
    }
}