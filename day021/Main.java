public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Bryan";
        p1.idade = 19;

        //Chamando o metodo do objeto
        p1.apresentar();

        Carro c1 = new Carro();

        c1.marca = "Volkswagen";
        c1.modelo = "Gol G4";
        c1.ano = 2012;

        c1.informacoes();
    }
}