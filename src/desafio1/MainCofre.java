package desafio1;

import java.util.Scanner;

import java.util.Scanner;

public class MainCofre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] senha = {"DO", "MI", "SOL", "SI"};
        CofreSonoro cofre = new CofreSonoro(senha);

        int tentativas = 0;
        boolean aberto = false;

        while (tentativas < 3 && !aberto) {
            System.out.println("Digite 4 notas separadas por espaço (DO RE MI FA SOL LA SI):");
            String[] tentativa = scanner.nextLine().trim().toUpperCase().split(" ");

            if (cofre.tentarAbrir(tentativa)) {
                System.out.println("Cofre aberto com sucesso!");
                aberto = true;
            } else {
                System.out.println("Sequência incorreta.");
            }
            tentativas++;
        }

        if (!aberto) {
            System.out.println("Você excedeu o número de tentativas.");
        }

        scanner.close();
    }
}
