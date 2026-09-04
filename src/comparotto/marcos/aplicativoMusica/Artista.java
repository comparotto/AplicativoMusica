package comparotto.marcos.aplicativoMusica;

public class Artista extends Pessoa {
        private String nomeArtistico;
    public void exibir() {
        System.out.println("Nome Oficial do artista: "+super.getNome()+"\n"+"Nome Artístico: "+this.nomeArtistico+"\n"+"Idade do Artista: "+super.getIdade());
    }

    public Artista(int id, String nome, int idade, String nomeArtistico) {
        super(nome, idade);
        this.nomeArtistico = nomeArtistico;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }
}
