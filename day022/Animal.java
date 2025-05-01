public class Animal {

    String nome;
    String especie;
    int peso;

    //Contrutor
    public Animal(String nome, String especie, int peso) {

        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
    }

    void mostrarDados (){
        System.out.println("Animal: " + nome + " da espécie " + especie + " pesando cerca de " + peso + "kg");
    }

}
