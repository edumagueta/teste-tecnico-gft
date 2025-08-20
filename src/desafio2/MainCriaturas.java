package desafio2;

public class MainCriaturas {
    public static void main(String[] args) {
        Criatura dragao = new Dragao("Dragao", "Gelo", 100);
        Criatura fenix = new Fenix("Fenix", "Fogo", 100);
        Criatura grifo = new Grifo("Grifo", "Vento", 100);

        Criatura[] criaturas = {dragao, fenix, grifo};
        Criatura maisPoderosa = criaturas[0];

        for (Criatura c : criaturas) {
            if (c.getForcaTotal() > maisPoderosa.getForcaTotal()) {
                maisPoderosa = c;
            }
        }

        System.out.println("Criatura mais poderosa: " + maisPoderosa.getNome() +
                " (Poder: " + maisPoderosa.getPoder() +
                ", Força Total: " + maisPoderosa.getForcaTotal() + ")");
    }
}