package desafio1;

import java.util.Arrays;

public class CofreSonoro {
    private final String[] senha;

    public CofreSonoro(String[] senha) {
        this.senha = senha;
    }

    public boolean tentarAbrir(String[] tentativa) {
        return Arrays.equals(senha, tentativa);
    }
}