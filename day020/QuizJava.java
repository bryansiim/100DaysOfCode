import java.util.Scanner;

public class QuizJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variavel pra contar pontos
        int pontos = 0;

        System.out.println("Pergunta 1: Qual palavra  reservada é usada para criar uma estrutura de repetição");
        System.out.println("A) if");
        System.out.println("B) for");
        System.out.println("C) switch");
        System.out.println("D) try");
        String resposta1 = sc.nextLine();

        if (resposta1.equalsIgnoreCase("B")) {
            System.out.println("Correto!");
            pontos++;
        }else {
            System.out.println("Errado. A resposta certa era B) for.");
        }

        System.out.println("Pergunta 2: Qual método converte String pra inteiro?");
        System.out.println("A) parseInt");
        System.out.println("B) toInt");
        System.out.println("C) castInt");
        System.out.println("D) stringToInt");
        String resposta2 = sc.nextLine();

        if (resposta2.equalsIgnoreCase("A")) {
            System.out.println("Correto!");
            pontos++;
        }else {
            System.out.println("Errado. A resposta certa era A) parseInt.");
        }

        System.out.println("Pergunta 3: Qual estrutura é usada para armazenar múltiplos valores do mesmo tipo em Java");
        System.out.println("A) Classe");
        System.out.println("B) Funcao");
        System.out.println("C) Array");
        System.out.println("D) Scanner");
        String resposta3 = sc.nextLine();

        if (resposta3.equalsIgnoreCase("C")) {
            System.out.println("Correto!");
            pontos++;
        }else {
            System.out.println("Errado. A resposta certa era C) Array.");
        }

        System.out.println("Voce fez " + pontos + " ponto(s)!");

        sc.close();
    }
}