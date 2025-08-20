package desafio2;

public abstract class Criatura {
    private String nome;
    private String poder;
    private int forcaBase;

    public Criatura(String nome, String poder, int forcaBase) {
        this.nome = nome;
        this.poder = poder;
        this.forcaBase = forcaBase;
    }

    public String getNome() {
        return nome;
    }

    public String getPoder() {
        return poder;
    }

    public int getForcaBase() {
        return forcaBase;
    }

    public abstract int getForcaTotal();
}