package comparotto.marcos.aplicativoMusica;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public void exibir() {
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade  );
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
