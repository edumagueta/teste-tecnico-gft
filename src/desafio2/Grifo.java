package desafio2;

public class Grifo extends Criatura {
    public Grifo(String nome, String poder, int forcaBase) {
        super(nome, poder, forcaBase);
    }

    @Override
    public int getForcaTotal() {
        return (int)(getForcaBase() * 1.5);
    }
}