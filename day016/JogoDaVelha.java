import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner sc = new Scanner(System.in);
        char jogadorAtual = 'X'; //Jogador comeca com X

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        while (true) {
            exibirTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogadorAtual + " escolha uma linha 0, 1 ou 2");
            int linha = sc.nextInt();
            System.out.println("Jogador " + jogadorAtual + " escolha uma coluna 0, 1 ou 2");
            int coluna = sc.nextInt();

            if (tabuleiro[linha][coluna] == '-'){
                tabuleiro[linha][coluna] = jogadorAtual;
            }else {
                System.out.println("Essa cedula já esta ocupada. Tente novamente.");
                continue;
            }

            //Alternar entre jogadores
            if (jogadorAtual == 'X') {
                jogadorAtual = 'O';
            }else {
                jogadorAtual = 'X';
            }

        }

    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println(); // Quebra a linha após cada linha do tabuleiro
        }
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i > 3; i++){
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador) {
                return true
            }
        }
    }
}