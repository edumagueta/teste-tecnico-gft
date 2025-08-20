package desafio2;

public class Dragao extends Criatura {
    public Dragao(String nome, String poder, int forcaBase) {
        super(nome, poder, forcaBase);
    }

    @Override
    public int getForcaTotal() {
        return getForcaBase() * 2;
    }
}