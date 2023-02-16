package model;

public class Estudante {
    private int estudanteID;
    private String nome;

    public Estudante(int estudanteID, String nome) {
        this.estudanteID = estudanteID;
        this.nome = nome;
    }

    public Estudante() {
    }

    public int getEstudanteID() {
        return estudanteID;
    }

    public void setEstudanteID(int estudanteID) {
        this.estudanteID = estudanteID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estudante [estudanteID = " + estudanteID + ", nome = " + nome + "]";
    }
}
