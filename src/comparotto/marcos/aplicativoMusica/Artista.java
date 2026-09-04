package comparotto.marcos.aplicativoMusica;

public class Artista extends Pessoa {
        private String nomeArtistico;

    public Artista(int id, String nome, int idade) {
        super(id, nome, idade);
    }
    public void exibir() {
        System.out.println("Nome Oficial do artista: "+getNome()+"\n"+"Nome Artístico: ");
    }

    public Artista(int id, String nome, int idade, String nomeArtistico) {
        super(id, nome, idade);
        this.nomeArtistico = nomeArtistico;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }
}
