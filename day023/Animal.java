public class Animal {
    
    private String nome;
    private String especie;
    private int peso;

    //Construtor

    public Animal(String nome, String especie, int peso){

        this.nome = nome;
        this.especie = especie;
        this.peso = peso;

    }

    //getters

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getPeso() {
        return peso;
    }

    //setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    void mostrarDados () {
        System.out.println("Animal: " + nome + " da espécie " + especie + " pesando cerca de " + peso + "kg");
    }
}
