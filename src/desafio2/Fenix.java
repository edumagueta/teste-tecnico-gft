package desafio2;

public class Fenix extends Criatura {
    public Fenix(String nome, String poder, int forcaBase) {
        super(nome, poder, forcaBase);
    }

    @Override
    public int getForcaTotal() {
        return getForcaBase() * 3;
    }
}